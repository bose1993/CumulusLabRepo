package com.cumulus.repo.lab.web.rest;

import com.cumulus.repo.lab.Application;
import com.cumulus.repo.lab.domain.Cminstance;
import com.cumulus.repo.lab.repository.CminstanceRepository;

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
 * Test class for the CminstanceResource REST controller.
 *
 * @see CminstanceResource
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
public class CminstanceResourceTest {

    private static final String DEFAULT_MODELID = "SAMPLE_TEXT";
    private static final String UPDATED_MODELID = "UPDATED_TEXT";
    private static final String DEFAULT_TEMPLATEID = "SAMPLE_TEXT";
    private static final String UPDATED_TEMPLATEID = "UPDATED_TEXT";
    private static final String DEFAULT_XML = "SAMPLE_TEXT";
    private static final String UPDATED_XML = "UPDATED_TEXT";

    private static final BigDecimal DEFAULT_VERSION = BigDecimal.ZERO;
    private static final BigDecimal UPDATED_VERSION = BigDecimal.ONE;

    private static final Boolean DEFAULT_MASTER = false;
    private static final Boolean UPDATED_MASTER = true;

    private static final BigDecimal DEFAULT_TEMPLATE_VERSION = BigDecimal.ZERO;
    private static final BigDecimal UPDATED_TEMPLATE_VERSION = BigDecimal.ONE;
    private static final String DEFAULT_STATUS = "SAMPLE_TEXT";
    private static final String UPDATED_STATUS = "UPDATED_TEXT";

    @Inject
    private CminstanceRepository cminstanceRepository;

    private MockMvc restCminstanceMockMvc;

    private Cminstance cminstance;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.initMocks(this);
        CminstanceResource cminstanceResource = new CminstanceResource();
        ReflectionTestUtils.setField(cminstanceResource, "cminstanceRepository", cminstanceRepository);
        this.restCminstanceMockMvc = MockMvcBuilders.standaloneSetup(cminstanceResource).build();
    }

    @Before
    public void initTest() {
        cminstance = new Cminstance();
        cminstance.setModelid(DEFAULT_MODELID);
        cminstance.setTemplateid(DEFAULT_TEMPLATEID);
        cminstance.setXml(DEFAULT_XML);
        cminstance.setVersion(DEFAULT_VERSION);
        cminstance.setMaster(DEFAULT_MASTER);
        cminstance.setTemplateersion(DEFAULT_TEMPLATE_VERSION);
        cminstance.setStatus(DEFAULT_STATUS);
    }

    @Test
    @Transactional
    public void createCminstance() throws Exception {
        // Validate the database is empty
        assertThat(cminstanceRepository.findAll()).hasSize(0);

        // Create the Cminstance
        restCminstanceMockMvc.perform(post("/api/cminstances")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(cminstance)))
                .andExpect(status().isCreated());

        // Validate the Cminstance in the database
        List<Cminstance> cminstances = cminstanceRepository.findAll();
        assertThat(cminstances).hasSize(1);
        Cminstance testCminstance = cminstances.iterator().next();
        assertThat(testCminstance.getModelid()).isEqualTo(DEFAULT_MODELID);
        assertThat(testCminstance.getTemplateid()).isEqualTo(DEFAULT_TEMPLATEID);
        assertThat(testCminstance.getXml()).isEqualTo(DEFAULT_XML);
        assertThat(testCminstance.getVersion()).isEqualTo(DEFAULT_VERSION);
        assertThat(testCminstance.getMaster()).isEqualTo(DEFAULT_MASTER);
        assertThat(testCminstance.getTemplateersion()).isEqualTo(DEFAULT_TEMPLATE_VERSION);
        assertThat(testCminstance.getStatus()).isEqualTo(DEFAULT_STATUS);
    }

    @Test
    @Transactional
    public void getAllCminstances() throws Exception {
        // Initialize the database
        cminstanceRepository.saveAndFlush(cminstance);

        // Get all the cminstances
        restCminstanceMockMvc.perform(get("/api/cminstances"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.[0].id").value(cminstance.getId().intValue()))
                .andExpect(jsonPath("$.[0].modelid").value(DEFAULT_MODELID.toString()))
                .andExpect(jsonPath("$.[0].templateid").value(DEFAULT_TEMPLATEID.toString()))
                .andExpect(jsonPath("$.[0].xml").value(DEFAULT_XML.toString()))
                .andExpect(jsonPath("$.[0].version").value(DEFAULT_VERSION.intValue()))
                .andExpect(jsonPath("$.[0].master").value(DEFAULT_MASTER.booleanValue()))
                .andExpect(jsonPath("$.[0].templateversion").value(DEFAULT_TEMPLATE_VERSION.intValue()))
                .andExpect(jsonPath("$.[0].status").value(DEFAULT_STATUS.toString()));
    }

    @Test
    @Transactional
    public void getCminstance() throws Exception {
        // Initialize the database
        cminstanceRepository.saveAndFlush(cminstance);

        // Get the cminstance
        restCminstanceMockMvc.perform(get("/api/cminstances/{id}", cminstance.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.id").value(cminstance.getId().intValue()))
            .andExpect(jsonPath("$.modelid").value(DEFAULT_MODELID.toString()))
            .andExpect(jsonPath("$.templateid").value(DEFAULT_TEMPLATEID.toString()))
            .andExpect(jsonPath("$.xml").value(DEFAULT_XML.toString()))
            .andExpect(jsonPath("$.version").value(DEFAULT_VERSION.intValue()))
            .andExpect(jsonPath("$.master").value(DEFAULT_MASTER.booleanValue()))
            .andExpect(jsonPath("$.templateversion").value(DEFAULT_TEMPLATE_VERSION.intValue()))
            .andExpect(jsonPath("$.status").value(DEFAULT_STATUS.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingCminstance() throws Exception {
        // Get the cminstance
        restCminstanceMockMvc.perform(get("/api/cminstances/{id}", 1L))
                .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateCminstance() throws Exception {
        // Initialize the database
        cminstanceRepository.saveAndFlush(cminstance);

        // Update the cminstance
        cminstance.setModelid(UPDATED_MODELID);
        cminstance.setTemplateid(UPDATED_TEMPLATEID);
        cminstance.setXml(UPDATED_XML);
        cminstance.setVersion(UPDATED_VERSION);
        cminstance.setMaster(UPDATED_MASTER);
        cminstance.setTemplateersion(UPDATED_TEMPLATE_VERSION);
        cminstance.setStatus(UPDATED_STATUS);
        restCminstanceMockMvc.perform(put("/api/cminstances")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(cminstance)))
                .andExpect(status().isOk());

        // Validate the Cminstance in the database
        List<Cminstance> cminstances = cminstanceRepository.findAll();
        assertThat(cminstances).hasSize(1);
        Cminstance testCminstance = cminstances.iterator().next();
        assertThat(testCminstance.getModelid()).isEqualTo(UPDATED_MODELID);
        assertThat(testCminstance.getTemplateid()).isEqualTo(UPDATED_TEMPLATEID);
        assertThat(testCminstance.getXml()).isEqualTo(UPDATED_XML);
        assertThat(testCminstance.getVersion()).isEqualTo(UPDATED_VERSION);
        assertThat(testCminstance.getMaster()).isEqualTo(UPDATED_MASTER);
        assertThat(testCminstance.getTemplateersion()).isEqualTo(UPDATED_TEMPLATE_VERSION);
        assertThat(testCminstance.getStatus()).isEqualTo(UPDATED_STATUS);
    }

    @Test
    @Transactional
    public void deleteCminstance() throws Exception {
        // Initialize the database
        cminstanceRepository.saveAndFlush(cminstance);

        // Get the cminstance
        restCminstanceMockMvc.perform(delete("/api/cminstances/{id}", cminstance.getId())
                .accept(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

        // Validate the database is empty
        List<Cminstance> cminstances = cminstanceRepository.findAll();
        assertThat(cminstances).hasSize(0);
    }
}
