package com.cumulus.repo.lab.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.cumulus.repo.lab.domain.Ca;
import com.cumulus.repo.lab.repository.CaRepository;
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
 * REST controller for managing Ca.
 */
@RestController
@RequestMapping("/crud")
public class CaResource {

    private final Logger log = LoggerFactory.getLogger(CaResource.class);

    @Inject
    private CaRepository caRepository;

    /**
     * POST  /cas -> Create a new ca.
     */
    @RequestMapping(value = "/cas",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> create(@RequestBody Ca ca) throws URISyntaxException {
        log.debug("REST request to save Ca : {}", ca);
        if (ca.getId() != null) {
            return ResponseEntity.badRequest().header("Failure", "A new ca cannot already have an ID").build();
        }
        caRepository.save(ca);
        return ResponseEntity.created(new URI("/api/cas/" + ca.getId())).build();
    }

    /**
     * PUT  /cas -> Updates an existing ca.
     */
    @RequestMapping(value = "/cas",
        method = RequestMethod.PUT,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> update(@RequestBody Ca ca) throws URISyntaxException {
        log.debug("REST request to update Ca : {}", ca);
        if (ca.getId() == null) {
            return create(ca);
        }
        caRepository.save(ca);
        return ResponseEntity.ok().build();
    }

    /**
     * GET  /cas -> get all the cas.
     */
    @RequestMapping(value = "/cas",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<List<Ca>> getAll(@RequestParam(value = "page" , required = false) Integer offset,
                                  @RequestParam(value = "per_page", required = false) Integer limit)
        throws URISyntaxException {
        Page<Ca> page = caRepository.findAll(PaginationUtil.generatePageRequest(offset, limit));
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/cas", offset, limit);
        return new ResponseEntity<List<Ca>>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /cas/:id -> get the "id" ca.
     */
    @RequestMapping(value = "/cas/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Ca> get(@PathVariable Long id, HttpServletResponse response) {
        log.debug("REST request to get Ca : {}", id);
        Ca ca = caRepository.findOne(id);
        if (ca == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(ca, HttpStatus.OK);
    }

    /**
     * DELETE  /cas/:id -> delete the "id" ca.
     */
    @RequestMapping(value = "/cas/{id}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public void delete(@PathVariable Long id) {
        log.debug("REST request to delete Ca : {}", id);
        caRepository.delete(id);
    }
}
