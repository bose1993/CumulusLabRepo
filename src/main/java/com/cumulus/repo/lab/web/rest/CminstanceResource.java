package com.cumulus.repo.lab.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.cumulus.repo.lab.domain.Cminstance;
import com.cumulus.repo.lab.repository.CminstanceRepository;
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
 * REST controller for managing Cminstance.
 */
@RestController
@RequestMapping("/crud")
public class CminstanceResource {

    private final Logger log = LoggerFactory.getLogger(CminstanceResource.class);

    @Inject
    private CminstanceRepository cminstanceRepository;

    /**
     * POST  /cminstances -> Create a new cminstance.
     */
    @RequestMapping(value = "/cminstances",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> create(@RequestBody Cminstance cminstance) throws URISyntaxException {
        log.debug("REST request to save Cminstance : {}", cminstance);
        if (cminstance.getId() != null) {
            return ResponseEntity.badRequest().header("Failure", "A new cminstance cannot already have an ID").build();
        }
        cminstanceRepository.save(cminstance);
        return ResponseEntity.created(new URI("/api/cminstances/" + cminstance.getId())).build();
    }

    /**
     * PUT  /cminstances -> Updates an existing cminstance.
     */
    @RequestMapping(value = "/cminstances",
        method = RequestMethod.PUT,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> update(@RequestBody Cminstance cminstance) throws URISyntaxException {
        log.debug("REST request to update Cminstance : {}", cminstance);
        if (cminstance.getId() == null) {
            return create(cminstance);
        }
        cminstanceRepository.save(cminstance);
        return ResponseEntity.ok().build();
    }

    /**
     * GET  /cminstances -> get all the cminstances.
     */
    @RequestMapping(value = "/cminstances",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<List<Cminstance>> getAll(@RequestParam(value = "page" , required = false) Integer offset,
                                  @RequestParam(value = "per_page", required = false) Integer limit)
        throws URISyntaxException {
        Page<Cminstance> page = cminstanceRepository.findAll(PaginationUtil.generatePageRequest(offset, limit));
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/cminstances", offset, limit);
        return new ResponseEntity<List<Cminstance>>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /cminstances/:id -> get the "id" cminstance.
     */
    @RequestMapping(value = "/cminstances/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Cminstance> get(@PathVariable Long id, HttpServletResponse response) {
        log.debug("REST request to get Cminstance : {}", id);
        Cminstance cminstance = cminstanceRepository.findOne(id);
        if (cminstance == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cminstance, HttpStatus.OK);
    }

    /**
     * DELETE  /cminstances/:id -> delete the "id" cminstance.
     */
    @RequestMapping(value = "/cminstances/{id}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public void delete(@PathVariable Long id) {
        log.debug("REST request to delete Cminstance : {}", id);
        cminstanceRepository.delete(id);
    }
}
