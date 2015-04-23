package com.cumulus.repo.lab.web.rest;

import com.cumulus.repo.lab.Application;
import com.cumulus.repo.lab.domain.Property;
import com.cumulus.repo.lab.repository.PropertyRepository;

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
 * Test class for the PropertyResource REST controller.
 *
 * @see PropertyResource
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
public class PropertyResourceTest {

    private static final String DEFAULT_RULES = "SAMPLE_TEXT";
    private static final String UPDATED_RULES = "UPDATED_TEXT";

    @Inject
    private PropertyRepository propertyRepository;

    private MockMvc restPropertyMockMvc;

    private Property property;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.initMocks(this);
        PropertyResource propertyResource = new PropertyResource();
        ReflectionTestUtils.setField(propertyResource, "propertyRepository", propertyRepository);
        this.restPropertyMockMvc = MockMvcBuilders.standaloneSetup(propertyResource).build();
    }

    @Before
    public void initTest() {
        property = new Property();
        property.setRules(DEFAULT_RULES);
    }

    @Test
    @Transactional
    public void createProperty() throws Exception {
        // Validate the database is empty
        assertThat(propertyRepository.findAll()).hasSize(0);

        // Create the Property
        restPropertyMockMvc.perform(post("/api/propertys")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(property)))
                .andExpect(status().isCreated());

        // Validate the Property in the database
        List<Property> propertys = propertyRepository.findAll();
        assertThat(propertys).hasSize(1);
        Property testProperty = propertys.iterator().next();
        assertThat(testProperty.getRules()).isEqualTo(DEFAULT_RULES);
    }

    @Test
    @Transactional
    public void getAllPropertys() throws Exception {
        // Initialize the database
        propertyRepository.saveAndFlush(property);

        // Get all the propertys
        restPropertyMockMvc.perform(get("/api/propertys"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.[0].id").value(property.getId().intValue()))
                .andExpect(jsonPath("$.[0].rules").value(DEFAULT_RULES.toString()));
    }

    @Test
    @Transactional
    public void getProperty() throws Exception {
        // Initialize the database
        propertyRepository.saveAndFlush(property);

        // Get the property
        restPropertyMockMvc.perform(get("/api/propertys/{id}", property.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.id").value(property.getId().intValue()))
            .andExpect(jsonPath("$.rules").value(DEFAULT_RULES.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingProperty() throws Exception {
        // Get the property
        restPropertyMockMvc.perform(get("/api/propertys/{id}", 1L))
                .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateProperty() throws Exception {
        // Initialize the database
        propertyRepository.saveAndFlush(property);

        // Update the property
        property.setRules(UPDATED_RULES);
        restPropertyMockMvc.perform(put("/api/propertys")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(property)))
                .andExpect(status().isOk());

        // Validate the Property in the database
        List<Property> propertys = propertyRepository.findAll();
        assertThat(propertys).hasSize(1);
        Property testProperty = propertys.iterator().next();
        assertThat(testProperty.getRules()).isEqualTo(UPDATED_RULES);
    }

    @Test
    @Transactional
    public void deleteProperty() throws Exception {
        // Initialize the database
        propertyRepository.saveAndFlush(property);

        // Get the property
        restPropertyMockMvc.perform(delete("/api/propertys/{id}", property.getId())
                .accept(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

        // Validate the database is empty
        List<Property> propertys = propertyRepository.findAll();
        assertThat(propertys).hasSize(0);
    }
}
