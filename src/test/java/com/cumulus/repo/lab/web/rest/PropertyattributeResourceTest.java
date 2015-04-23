package com.cumulus.repo.lab.web.rest;

import com.cumulus.repo.lab.Application;
import com.cumulus.repo.lab.domain.Propertyattribute;
import com.cumulus.repo.lab.repository.PropertyattributeRepository;

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
 * Test class for the PropertyattributeResource REST controller.
 *
 * @see PropertyattributeResource
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
public class PropertyattributeResourceTest {

    private static final String DEFAULT_NAME = "SAMPLE_TEXT";
    private static final String UPDATED_NAME = "UPDATED_TEXT";
    private static final String DEFAULT_VALUE = "SAMPLE_TEXT";
    private static final String UPDATED_VALUE = "UPDATED_TEXT";

    @Inject
    private PropertyattributeRepository propertyattributeRepository;

    private MockMvc restPropertyattributeMockMvc;

    private Propertyattribute propertyattribute;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.initMocks(this);
        PropertyattributeResource propertyattributeResource = new PropertyattributeResource();
        ReflectionTestUtils.setField(propertyattributeResource, "propertyattributeRepository", propertyattributeRepository);
        this.restPropertyattributeMockMvc = MockMvcBuilders.standaloneSetup(propertyattributeResource).build();
    }

    @Before
    public void initTest() {
        propertyattribute = new Propertyattribute();
        propertyattribute.setName(DEFAULT_NAME);
        propertyattribute.setValue(DEFAULT_VALUE);
    }

    @Test
    @Transactional
    public void createPropertyattribute() throws Exception {
        // Validate the database is empty
        assertThat(propertyattributeRepository.findAll()).hasSize(0);

        // Create the Propertyattribute
        restPropertyattributeMockMvc.perform(post("/api/propertyattributes")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(propertyattribute)))
                .andExpect(status().isCreated());

        // Validate the Propertyattribute in the database
        List<Propertyattribute> propertyattributes = propertyattributeRepository.findAll();
        assertThat(propertyattributes).hasSize(1);
        Propertyattribute testPropertyattribute = propertyattributes.iterator().next();
        assertThat(testPropertyattribute.getName()).isEqualTo(DEFAULT_NAME);
        assertThat(testPropertyattribute.getValue()).isEqualTo(DEFAULT_VALUE);
    }

    @Test
    @Transactional
    public void getAllPropertyattributes() throws Exception {
        // Initialize the database
        propertyattributeRepository.saveAndFlush(propertyattribute);

        // Get all the propertyattributes
        restPropertyattributeMockMvc.perform(get("/api/propertyattributes"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.[0].id").value(propertyattribute.getId().intValue()))
                .andExpect(jsonPath("$.[0].name").value(DEFAULT_NAME.toString()))
                .andExpect(jsonPath("$.[0].value").value(DEFAULT_VALUE.toString()));
    }

    @Test
    @Transactional
    public void getPropertyattribute() throws Exception {
        // Initialize the database
        propertyattributeRepository.saveAndFlush(propertyattribute);

        // Get the propertyattribute
        restPropertyattributeMockMvc.perform(get("/api/propertyattributes/{id}", propertyattribute.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.id").value(propertyattribute.getId().intValue()))
            .andExpect(jsonPath("$.name").value(DEFAULT_NAME.toString()))
            .andExpect(jsonPath("$.value").value(DEFAULT_VALUE.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingPropertyattribute() throws Exception {
        // Get the propertyattribute
        restPropertyattributeMockMvc.perform(get("/api/propertyattributes/{id}", 1L))
                .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updatePropertyattribute() throws Exception {
        // Initialize the database
        propertyattributeRepository.saveAndFlush(propertyattribute);

        // Update the propertyattribute
        propertyattribute.setName(UPDATED_NAME);
        propertyattribute.setValue(UPDATED_VALUE);
        restPropertyattributeMockMvc.perform(put("/api/propertyattributes")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(propertyattribute)))
                .andExpect(status().isOk());

        // Validate the Propertyattribute in the database
        List<Propertyattribute> propertyattributes = propertyattributeRepository.findAll();
        assertThat(propertyattributes).hasSize(1);
        Propertyattribute testPropertyattribute = propertyattributes.iterator().next();
        assertThat(testPropertyattribute.getName()).isEqualTo(UPDATED_NAME);
        assertThat(testPropertyattribute.getValue()).isEqualTo(UPDATED_VALUE);
    }

    @Test
    @Transactional
    public void deletePropertyattribute() throws Exception {
        // Initialize the database
        propertyattributeRepository.saveAndFlush(propertyattribute);

        // Get the propertyattribute
        restPropertyattributeMockMvc.perform(delete("/api/propertyattributes/{id}", propertyattribute.getId())
                .accept(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

        // Validate the database is empty
        List<Propertyattribute> propertyattributes = propertyattributeRepository.findAll();
        assertThat(propertyattributes).hasSize(0);
    }
}
