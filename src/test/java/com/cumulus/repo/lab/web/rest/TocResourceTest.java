package com.cumulus.repo.lab.web.rest;

import com.cumulus.repo.lab.Application;
import com.cumulus.repo.lab.domain.Toc;
import com.cumulus.repo.lab.repository.TocRepository;

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
 * Test class for the TocResource REST controller.
 *
 * @see TocResource
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
public class TocResourceTest {

    private static final String DEFAULT_CLOUDLAYER = "SAMPLE_TEXT";
    private static final String UPDATED_CLOUDLAYER = "UPDATED_TEXT";
    private static final String DEFAULT_CONCRETETOC = "SAMPLE_TEXT";
    private static final String UPDATED_CONCRETETOC = "UPDATED_TEXT";
    private static final String DEFAULT_TOCDESCRIPTION = "SAMPLE_TEXT";
    private static final String UPDATED_TOCDESCRIPTION = "UPDATED_TEXT";
    private static final String DEFAULT_TOCURI = "SAMPLE_TEXT";
    private static final String UPDATED_TOCURI = "UPDATED_TEXT";

    @Inject
    private TocRepository tocRepository;

    private MockMvc restTocMockMvc;

    private Toc toc;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.initMocks(this);
        TocResource tocResource = new TocResource();
        ReflectionTestUtils.setField(tocResource, "tocRepository", tocRepository);
        this.restTocMockMvc = MockMvcBuilders.standaloneSetup(tocResource).build();
    }

    @Before
    public void initTest() {
        toc = new Toc();
        toc.setCloudlayer(DEFAULT_CLOUDLAYER);
        toc.setConcretetoc(DEFAULT_CONCRETETOC);
        toc.setTocdescription(DEFAULT_TOCDESCRIPTION);
        toc.setTocuri(DEFAULT_TOCURI);
    }

    @Test
    @Transactional
    public void createToc() throws Exception {
        // Validate the database is empty
        assertThat(tocRepository.findAll()).hasSize(0);

        // Create the Toc
        restTocMockMvc.perform(post("/api/tocs")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(toc)))
                .andExpect(status().isCreated());

        // Validate the Toc in the database
        List<Toc> tocs = tocRepository.findAll();
        assertThat(tocs).hasSize(1);
        Toc testToc = tocs.iterator().next();
        assertThat(testToc.getCloudlayer()).isEqualTo(DEFAULT_CLOUDLAYER);
        assertThat(testToc.getConcretetoc()).isEqualTo(DEFAULT_CONCRETETOC);
        assertThat(testToc.getTocdescription()).isEqualTo(DEFAULT_TOCDESCRIPTION);
        assertThat(testToc.getTocuri()).isEqualTo(DEFAULT_TOCURI);
    }

    @Test
    @Transactional
    public void getAllTocs() throws Exception {
        // Initialize the database
        tocRepository.saveAndFlush(toc);

        // Get all the tocs
        restTocMockMvc.perform(get("/api/tocs"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.[0].id").value(toc.getId().intValue()))
                .andExpect(jsonPath("$.[0].cloudlayer").value(DEFAULT_CLOUDLAYER.toString()))
                .andExpect(jsonPath("$.[0].concretetoc").value(DEFAULT_CONCRETETOC.toString()))
                .andExpect(jsonPath("$.[0].tocdescription").value(DEFAULT_TOCDESCRIPTION.toString()))
                .andExpect(jsonPath("$.[0].tocuri").value(DEFAULT_TOCURI.toString()));
    }

    @Test
    @Transactional
    public void getToc() throws Exception {
        // Initialize the database
        tocRepository.saveAndFlush(toc);

        // Get the toc
        restTocMockMvc.perform(get("/api/tocs/{id}", toc.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.id").value(toc.getId().intValue()))
            .andExpect(jsonPath("$.cloudlayer").value(DEFAULT_CLOUDLAYER.toString()))
            .andExpect(jsonPath("$.concretetoc").value(DEFAULT_CONCRETETOC.toString()))
            .andExpect(jsonPath("$.tocdescription").value(DEFAULT_TOCDESCRIPTION.toString()))
            .andExpect(jsonPath("$.tocuri").value(DEFAULT_TOCURI.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingToc() throws Exception {
        // Get the toc
        restTocMockMvc.perform(get("/api/tocs/{id}", 1L))
                .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateToc() throws Exception {
        // Initialize the database
        tocRepository.saveAndFlush(toc);

        // Update the toc
        toc.setCloudlayer(UPDATED_CLOUDLAYER);
        toc.setConcretetoc(UPDATED_CONCRETETOC);
        toc.setTocdescription(UPDATED_TOCDESCRIPTION);
        toc.setTocuri(UPDATED_TOCURI);
        restTocMockMvc.perform(put("/api/tocs")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(toc)))
                .andExpect(status().isOk());

        // Validate the Toc in the database
        List<Toc> tocs = tocRepository.findAll();
        assertThat(tocs).hasSize(1);
        Toc testToc = tocs.iterator().next();
        assertThat(testToc.getCloudlayer()).isEqualTo(UPDATED_CLOUDLAYER);
        assertThat(testToc.getConcretetoc()).isEqualTo(UPDATED_CONCRETETOC);
        assertThat(testToc.getTocdescription()).isEqualTo(UPDATED_TOCDESCRIPTION);
        assertThat(testToc.getTocuri()).isEqualTo(UPDATED_TOCURI);
    }

    @Test
    @Transactional
    public void deleteToc() throws Exception {
        // Initialize the database
        tocRepository.saveAndFlush(toc);

        // Get the toc
        restTocMockMvc.perform(delete("/api/tocs/{id}", toc.getId())
                .accept(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

        // Validate the database is empty
        List<Toc> tocs = tocRepository.findAll();
        assertThat(tocs).hasSize(0);
    }
}
