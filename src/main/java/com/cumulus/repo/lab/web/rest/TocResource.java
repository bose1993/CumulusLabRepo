package com.cumulus.repo.lab.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.cumulus.repo.lab.domain.Toc;
import com.cumulus.repo.lab.repository.TocRepository;
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
 * REST controller for managing Toc.
 */
@RestController
@RequestMapping("/crud")
public class TocResource {

    private final Logger log = LoggerFactory.getLogger(TocResource.class);

    @Inject
    private TocRepository tocRepository;

    /**
     * POST  /tocs -> Create a new toc.
     */
    @RequestMapping(value = "/tocs",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> create(@RequestBody Toc toc) throws URISyntaxException {
        log.debug("REST request to save Toc : {}", toc);
        if (toc.getId() != null) {
            return ResponseEntity.badRequest().header("Failure", "A new toc cannot already have an ID").build();
        }
        tocRepository.save(toc);
        return ResponseEntity.created(new URI("/api/tocs/" + toc.getId())).build();
    }

    /**
     * PUT  /tocs -> Updates an existing toc.
     */
    @RequestMapping(value = "/tocs",
        method = RequestMethod.PUT,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Void> update(@RequestBody Toc toc) throws URISyntaxException {
        log.debug("REST request to update Toc : {}", toc);
        if (toc.getId() == null) {
            return create(toc);
        }
        tocRepository.save(toc);
        return ResponseEntity.ok().build();
    }

    /**
     * GET  /tocs -> get all the tocs.
     */
    @RequestMapping(value = "/tocs",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<List<Toc>> getAll(@RequestParam(value = "page" , required = false) Integer offset,
                                  @RequestParam(value = "per_page", required = false) Integer limit)
        throws URISyntaxException {
        Page<Toc> page = tocRepository.findAll(PaginationUtil.generatePageRequest(offset, limit));
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/tocs", offset, limit);
        return new ResponseEntity<List<Toc>>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /tocs/:id -> get the "id" toc.
     */
    @RequestMapping(value = "/tocs/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public ResponseEntity<Toc> get(@PathVariable Long id, HttpServletResponse response) {
        log.debug("REST request to get Toc : {}", id);
        Toc toc = tocRepository.findOne(id);
        if (toc == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(toc, HttpStatus.OK);
    }

    /**
     * DELETE  /tocs/:id -> delete the "id" toc.
     */
    @RequestMapping(value = "/tocs/{id}",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    public void delete(@PathVariable Long id) {
        log.debug("REST request to delete Toc : {}", id);
        tocRepository.delete(id);
    }
}
