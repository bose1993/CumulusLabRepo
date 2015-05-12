package com.cumulus.repo.lab.web.rest;

import com.cumulus.repo.lab.Application;
import com.cumulus.repo.lab.domain.Ca;
import com.cumulus.repo.lab.repository.CaRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the CaResource REST controller.
 *
 * @see CaResource
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
public class CaResourceTest {

    private static final String DEFAULT_NAME = "SAMPLE_TEXT";
    private static final String UPDATED_NAME = "UPDATED_TEXT";
    private static final String DEFAULT_URI = "SAMPLE_TEXT";
    private static final String UPDATED_URI = "UPDATED_TEXT";
    private static final String DEFAULT_LAB_USER = "SAMPLE_TEXT";
    private static final String UPDATED_LAB_USER = "UPDATED_TEXT";
    private static final String DEFAULT_LAB_SECRET = "SAMPLE_TEXT";
    private static final String UPDATED_LAB_SECRET = "UPDATED_TEXT";

    @Inject
    private CaRepository caRepository;

    private MockMvc restCaMockMvc;

    private Ca ca;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.initMocks(this);
        CaResource caResource = new CaResource();
        ReflectionTestUtils.setField(caResource, "caRepository", caRepository);
        this.restCaMockMvc = MockMvcBuilders.standaloneSetup(caResource).build();
    }

    @Before
    public void initTest() {
        ca = new Ca();
        ca.setName(DEFAULT_NAME);
        ca.setUri(DEFAULT_URI);
        ca.setLabUser(DEFAULT_LAB_USER);
        ca.setLabSecret(DEFAULT_LAB_SECRET);
    }

    @Test
    @Transactional
    public void createCa() throws Exception {
        // Validate the database is empty
        assertThat(caRepository.findAll()).hasSize(0);

        // Create the Ca
        restCaMockMvc.perform(post("/api/cas")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(ca)))
                .andExpect(status().isCreated());

        // Validate the Ca in the database
        List<Ca> cas = caRepository.findAll();
        assertThat(cas).hasSize(1);
        Ca testCa = cas.iterator().next();
        assertThat(testCa.getName()).isEqualTo(DEFAULT_NAME);
        assertThat(testCa.getUri()).isEqualTo(DEFAULT_URI);
        assertThat(testCa.getLabUser()).isEqualTo(DEFAULT_LAB_USER);
        assertThat(testCa.getLabSecret()).isEqualTo(DEFAULT_LAB_SECRET);
    }

    @Test
    @Transactional
    public void getAllCas() throws Exception {
        // Initialize the database
        caRepository.saveAndFlush(ca);

        // Get all the cas
        restCaMockMvc.perform(get("/api/cas"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.[0].id").value(ca.getId().intValue()))
                .andExpect(jsonPath("$.[0].name").value(DEFAULT_NAME.toString()))
                .andExpect(jsonPath("$.[0].uri").value(DEFAULT_URI.toString()))
                .andExpect(jsonPath("$.[0].labuser").value(DEFAULT_LAB_USER.toString()))
                .andExpect(jsonPath("$.[0].labsecret").value(DEFAULT_LAB_SECRET.toString()));
    }

    @Test
    @Transactional
    public void getCa() throws Exception {
        // Initialize the database
        caRepository.saveAndFlush(ca);

        // Get the ca
        restCaMockMvc.perform(get("/api/cas/{id}", ca.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.id").value(ca.getId().intValue()))
            .andExpect(jsonPath("$.name").value(DEFAULT_NAME.toString()))
            .andExpect(jsonPath("$.uri").value(DEFAULT_URI.toString()))
            .andExpect(jsonPath("$.labuser").value(DEFAULT_LAB_USER.toString()))
            .andExpect(jsonPath("$.labsecret").value(DEFAULT_LAB_SECRET.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingCa() throws Exception {
        // Get the ca
        restCaMockMvc.perform(get("/api/cas/{id}", 1L))
                .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateCa() throws Exception {
        // Initialize the database
        caRepository.saveAndFlush(ca);

        // Update the ca
        ca.setName(UPDATED_NAME);
        ca.setUri(UPDATED_URI);
        ca.setLabUser(UPDATED_LAB_USER);
        ca.setLabSecret(UPDATED_LAB_SECRET);
        restCaMockMvc.perform(put("/api/cas")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(ca)))
                .andExpect(status().isOk());

        // Validate the Ca in the database
        List<Ca> cas = caRepository.findAll();
        assertThat(cas).hasSize(1);
        Ca testCa = cas.iterator().next();
        assertThat(testCa.getName()).isEqualTo(UPDATED_NAME);
        assertThat(testCa.getUri()).isEqualTo(UPDATED_URI);
        assertThat(testCa.getLabUser()).isEqualTo(UPDATED_LAB_USER);
        assertThat(testCa.getLabSecret()).isEqualTo(UPDATED_LAB_SECRET);
    }

    @Test
    @Transactional
    public void deleteCa() throws Exception {
        // Initialize the database
        caRepository.saveAndFlush(ca);

        // Get the ca
        restCaMockMvc.perform(delete("/api/cas/{id}", ca.getId())
                .accept(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

        // Validate the database is empty
        List<Ca> cas = caRepository.findAll();
        assertThat(cas).hasSize(0);
    }
}
