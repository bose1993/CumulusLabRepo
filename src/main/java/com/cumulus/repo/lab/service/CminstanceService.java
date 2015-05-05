package com.cumulus.repo.lab.service;

import com.codahale.metrics.annotation.Timed;

import com.cumulus.repo.lab.domain.Ca;
import com.cumulus.repo.lab.domain.Property;
import com.cumulus.repo.lab.domain.Propertyattribute;
import com.cumulus.repo.lab.domain.Cminstance;
import com.cumulus.repo.lab.domain.Toc;
import com.cumulus.repo.lab.domain.User;
import com.cumulus.repo.lab.repository.CaRepository;
import com.cumulus.repo.lab.repository.CminstanceRepository;
import com.cumulus.repo.lab.repository.PropertyRepository;
import com.cumulus.repo.lab.repository.PropertyattributeRepository;
import com.cumulus.repo.lab.repository.TocRepository;
import com.cumulus.repo.lab.web.rest.util.PaginationUtil;
import com.cumulus.repo.lab.xml.utils.JaxbUnmarshal;
import com.cumulus.repo.lab.xml.utils.PropertyAttributeException;
import com.cumulus.repo.lab.xml.utils.PropertyNotFoundException;
import com.cumulus.repo.lab.xml.utils.caNotFoundException;
import com.cumulus.repo.lab.xml.utils.templateVersionNotFoundException;


import org.cumulus.certificate.model.PropertyType.PropertyPerformance;
import org.cumulus.certificate.model.PropertyType.PropertyPerformance.PropertyPerformanceRow;
import org.cumulus.certificate.model.PropertyType.PropertyPerformance.PropertyPerformanceRow.PropertyPerformanceCell;
import org.cumulus.certificate.model.test.TestCertificationModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;


import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/**
 * REST controller for managing Cminstance.
 */
@RestController
@RequestMapping("/service")
public class CminstanceService {

    private final Logger log = LoggerFactory.getLogger(CminstanceService.class);

    @Inject
    private CminstanceRepository cminstanceRepository;
    
    @Inject
	private TocRepository tocRepository;
    
    @Inject
	private PropertyRepository propertyRepository;
    
    @Inject
	private PropertyattributeRepository propertyattributesRepository;
    
    @Inject
	private UserService userService;
    
    @Inject
   	private CaRepository caRepository;

    private Cminstance parseXMLTemplate(String XML) throws JAXBException, PropertyNotFoundException, PropertyAttributeException, caNotFoundException, templateVersionNotFoundException{
		JaxbUnmarshal jx = new JaxbUnmarshal(XML,
				"org.cumulus.certificate.model");
		Cminstance c = new Cminstance();
		Object result = jx.getUnmarshalledObject();

		if (result instanceof JAXBElement) {
			@SuppressWarnings("unchecked")
			JAXBElement<TestCertificationModel> obj = (JAXBElement<TestCertificationModel>) result;
			TestCertificationModel t = obj.getValue();
			c.setXml(XML);
			c.setModelid(t.getCertificationModelID().getValue());
			
			if (t.getCertificationModelID().getVersion() != null) {
				c.setVersion(t.getCertificationModelID()
						.getVersion());
			}
			c.setTemplateid(t.getCertificationModelTemplateID().getValue());
			BigDecimal tv= t.getCertificationModelTemplateID().getVersion();
			if(tv!=null){
				c.setTemplateersion(tv.setScale(3));
			}else{
				throw new templateVersionNotFoundException();
			}
			c.setCa(this.findCa(t.getCertificationModelTemplateID().getCA()));
			
			log.debug(t.getToC().getId());
			Toc toc = this.tocRepository.findOneByTocid(t.getToC().getId());
			log.debug("TOC {}",toc);
			if (toc == null) {
				log.debug("CREO IL TOC");
				toc = new Toc();
				toc.setConcretetoc(t.getToC().getConcreteToc());
				log.debug("SETTO CONCRATE TOC");
				toc.setCloudlayer(t.getToC().getCloudLayer().toString());
				log.debug("SETTO CLOUD LAYER");
				Set<Cminstance> set = new HashSet<Cminstance>();
				toc.setCminstances(set);
				log.debug("SETTO CM INSTANCE");
				toc.setTocdescription(t.getToC().getTocDescription());
				log.debug("SETTO TOC DESCRIPTION");
				toc.setTocId(t.getToC().getId());
				log.debug("SETTO TOC ID");
				toc.setTocuri(t.getToC().getTocURI());
				log.debug("SETTO TOC URI");
				this.tocRepository.save(toc);
			}
			c.setToc(toc);
			Property property = this.propertyRepository.findOneByRules(t.getSecurityProperty().getSProperty().getClazz());
			
			if (property == null) {
				throw new PropertyNotFoundException("Property "
						+ t.getSecurityProperty()
								.getSecurityPropertyDefinition() + " Not found");
			}
			c.setProperty(property);
			c.setTemplateid(t.getCertificationModelTemplateID().getValue());
			
			PropertyPerformance prop = t.getSecurityProperty().getSProperty()
					.getPropertyPerformance();
			if (!this.checkPropertyAttribute(prop, property.getId())) {
				throw new PropertyAttributeException(
						"Proprety Attribute not found");
			}
			return c;
		
		} else {
			throw new JAXBException("Error during Marshaling");
		}

}

private boolean checkPropertyAttribute(PropertyPerformance pp, long id) {
for (int i = 0; i < pp.getPropertyPerformanceRow().size(); i++) {
	log.debug("ENTRO ROW");
	PropertyPerformanceRow ppr = pp.getPropertyPerformanceRow().get(i);
	for (int j = 0; j < ppr.getPropertyPerformanceCell().size(); j++) {
		log.debug("ENTRO CEL");
		PropertyPerformanceCell ppc = ppr.getPropertyPerformanceCell()
				.get(j);
		String name = ppc.getName();
		List<Propertyattribute> pa = this.propertyattributesRepository.findByParamAtt(id, name);
		if(pa.isEmpty()){
			return false;
		}
		
	}
}
return true;

}

private Ca findCa(String name) throws caNotFoundException{
	Ca c = this.caRepository.findOneByName(name);
	if(c!=null){
		return c;
	}else {
		throw new caNotFoundException();
	}
}


	@RequestMapping(value = "/cminstances", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@Transactional
	@Timed
	public ResponseEntity<Void> create(@RequestBody String XML)
			throws URISyntaxException {
		log.debug("REST request to create Template by XML : {}", XML);
		Cminstance cm = null;

		try {
			cm = this.parseXMLTemplate(XML);
			User user = userService.getUserWithAuthorities();
			
			if (cm.getVersion() == null) {
				cm.setVersion(new BigDecimal(1.0).setScale(3));
			}
			cm.setMaster(true);
			Sort s = new Sort(Sort.Direction.DESC, "version");
			List<Cminstance> l = this.cminstanceRepository.findByModelid(cm.getModelid(), s);
			if (!l.isEmpty()) {
				return ResponseEntity
						.badRequest()
						.header("Failure",
								"A new template cannot already have an ID")
						.build();
			}
			
			if (user == null) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			} else {
				cm.setUser(user);
			}
		} catch (JAXBException e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (PropertyNotFoundException e) {
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"Property not found").build();
		} catch (PropertyAttributeException e) {
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"Property Attribute not found").build();
		} catch (caNotFoundException e) {
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"Template Ca not found").build();
		} catch (templateVersionNotFoundException e) {
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"Template Version not found").build();
		}
		if (cm.getId() != null) {
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"NEW CM CAN'T HAVE ID").build();
		}
		this.cminstanceRepository.resetAllMaster(cm.getModelid());
		cminstanceRepository.save(cm);
		return ResponseEntity.created(
				new URI("/service/templates/" + cm.getId())).build();
	
	}


    /**
     * PUT  /cminstances -> Updates an existing cminstance.
     */
    @RequestMapping(value = "/cminstances",
        method = RequestMethod.PUT,
        produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    @Transactional
    public ResponseEntity<Void> update(@RequestBody String XML) throws URISyntaxException {
    	log.debug("REST request to create Template by XML : {}", XML);
		Cminstance cm = null;

		try {
			cm = this.parseXMLTemplate(XML);
			User user = userService.getUserWithAuthorities();
			
			if (cm.getVersion() == null) {
				Sort s = new Sort(Sort.Direction.DESC, "version");
				List<Cminstance> l = this.cminstanceRepository.findByModelid(cm.getModelid(), s);
				cm.setVersion(l.get(0).getVersion().add(new BigDecimal(0.1)));
			}
			cm.setMaster(true);
			Sort s = new Sort(Sort.Direction.DESC, "version");
			List<Cminstance> l = this.cminstanceRepository.findByModelid(cm.getModelid(), s);
			if (l.isEmpty()) {
				return ResponseEntity
						.badRequest()
						.header("Failure",
								"A new template must already have an ID")
						.build();
			}
			
			if (user == null) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			} else {
				cm.setUser(user);
			}
		} catch (JAXBException e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (PropertyNotFoundException e) {
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"Property not found").build();
		} catch (PropertyAttributeException e) {
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"Property Attribute not found").build();
		} catch (caNotFoundException e) {
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"Template Ca not found").build();
		} catch (templateVersionNotFoundException e) {
			// TODO Auto-generated catch block
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"Template Version not found").build();
		}
		if (cm.getId() != null) {
			return ResponseEntity
					.badRequest()
					.header("Failure",
							"NEW CM CAN'T HAVE ID").build();
		}
		this.cminstanceRepository.resetAllMaster(cm.getModelid());
        cminstanceRepository.save(cm);
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
    @Transactional
    public void delete(@PathVariable Long id) {
        log.debug("REST request to delete Cminstance : {}", id);
        Cminstance cm = this.cminstanceRepository.findOne(id);
        if(cm!=null){
	        if(cm.getMaster()==true){
	            cminstanceRepository.delete(id);
	        	Sort s = new Sort(Sort.Direction.DESC, "version");
				List<Cminstance> l = this.cminstanceRepository.findByModelid(cm.getModelid(), s);
				Cminstance newMaster = l.get(0);
				newMaster.setMaster(true);
		        log.debug("NewMaster cminstance Id : {}", newMaster.getId());
				this.cminstanceRepository.save(newMaster);
	        }else{
	        	cminstanceRepository.delete(id);
	        }
        }
    }
}
