package com.cumulus.repo.lab.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.cumulus.repo.lab.domain.Propertyattribute;
import com.cumulus.repo.lab.repository.PropertyattributeRepository;
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
 * REST controller for managing Propertyattribute.
 */
@RestController
@RequestMapping("/api")
public class PropertyattributeResource {

    private final Logger log = LoggerFactory.getLogger(PropertyattributeResource.class);

    @Inject
    private PropertyattributeRepository propertyattributeRepository;

    /**
     * POST  /propertyattributes -> Create a new propertyattribute.
     */
    @RequestMapping(value = "/propertyattributes",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> create(@RequestBody Propertyattribute propertyattribute) throws URISyntaxException {
        log.debug("REST request to save Propertyattribute : {}", propertyattribute);
        if (propertyattribute.getId() != null) {
            return ResponseEntity.badRequest().header("Failure", "A new propertyattribute cannot already have an ID").build();
        }
        propertyattributeRepository.save(propertyattribute);
        return ResponseEntity.created(new URI("/api/propertyattributes/" + propertyattribute.getId())).build();
    }

    /**
     * PUT  /propertyattributes -> Updates an existing propertyattribute.
     */
    @RequestMapping(value = "/propertyattributes",
        method = RequestMethod.PUT,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> update(@RequestBody Propertyattribute propertyattribute) throws URISyntaxException {
        log.debug("REST request to update Propertyattribute : {}", propertyattribute);
        if (propertyattribute.getId() == null) {
            return create(propertyattribute);
        }
        propertyattributeRepository.save(propertyattribute);
        return ResponseEntity.ok().build();
    }

    /**
     * GET  /propertyattributes -> get all the propertyattributes.
     */
    @RequestMapping(value = "/propertyattributes",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<List<Propertyattribute>> getAll(@RequestParam(value = "page" , required = false) Integer offset,
                                  @RequestParam(value = "per_page", required = false) Integer limit)
        throws URISyntaxException {
        Page<Propertyattribute> page = propertyattributeRepository.findAll(PaginationUtil.generatePageRequest(offset, limit));
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/propertyattributes", offset, limit);
        return new ResponseEntity<List<Propertyattribute>>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /propertyattributes/:id -> get the "id" propertyattribute.
     */
    @RequestMapping(value = "/propertyattributes/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Propertyattribute> get(@PathVariable Long id, HttpServletResponse response) {
        log.debug("REST request to get Propertyattribute : {}", id);
        Propertyattribute propertyattribute = propertyattributeRepository.findOne(id);
        if (propertyattribute == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(propertyattribute, HttpStatus.OK);
    }

    /**
     * DELETE  /propertyattributes/:id -> delete the "id" propertyattribute.
     */
    @RequestMapping(value = "/propertyattributes/{id}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public void delete(@PathVariable Long id) {
        log.debug("REST request to delete Propertyattribute : {}", id);
        propertyattributeRepository.delete(id);
    }
}
