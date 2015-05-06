package com.cumulus.repo.lab.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.cumulus.repo.lab.domain.Property;
import com.cumulus.repo.lab.repository.PropertyRepository;
import com.cumulus.repo.lab.web.rest.util.PaginationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.net.URI;
import java.net.URISyntaxException;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * REST controller for managing Property.
 */
@RestController
@RequestMapping("/crud")
public class PropertyResource {

    private final Logger log = LoggerFactory.getLogger(PropertyResource.class);

    @Inject
    private PropertyRepository propertyRepository;

    /**
     * POST  /propertys -> Create a new property.
     */
    @RequestMapping(value = "/propertys",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> create(@RequestBody Property property) throws URISyntaxException {
        log.debug("REST request to save Property : {}", property);
        if (property.getId() != null) {
            return ResponseEntity.badRequest().header("Failure", "A new property cannot already have an ID").build();
        }
        propertyRepository.save(property);
        return ResponseEntity.created(new URI("/api/propertys/" + property.getId())).build();
    }

    /**
     * PUT  /propertys -> Updates an existing property.
     */
    @RequestMapping(value = "/propertys",
        method = RequestMethod.PUT,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> update(@RequestBody Property property) throws URISyntaxException {
        log.debug("REST request to update Property : {}", property);
        if (property.getId() == null) {
            return create(property);
        }
        propertyRepository.save(property);
        return ResponseEntity.ok().build();
    }

    /**
     * GET  /propertys -> get all the propertys.
     */
    @RequestMapping(value = "/propertys",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<List<Property>> getAll(@RequestParam(value = "page" , required = false) Integer offset,
                                  @RequestParam(value = "per_page", required = false) Integer limit)
        throws URISyntaxException {
        Page<Property> page = propertyRepository.findAll(PaginationUtil.generatePageRequest(offset, limit));
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/propertys", offset, limit);
        return new ResponseEntity<List<Property>>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /propertys/:id -> get the "id" property.
     */
    @RequestMapping(value = "/propertys/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Property> get(@PathVariable Long id, HttpServletResponse response) {
        log.debug("REST request to get Property : {}", id);
        Property property = propertyRepository.findOneWithEagerRelationships(id);
        if (property == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(property, HttpStatus.OK);
    }

    /**
     * DELETE  /propertys/:id -> delete the "id" property.
     */
    @RequestMapping(value = "/propertys/{id}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public void delete(@PathVariable Long id) {
        log.debug("REST request to delete Property : {}", id);
        propertyRepository.delete(id);
    }
}
