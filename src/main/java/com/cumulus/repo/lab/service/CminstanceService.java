package com.cumulus.repo.lab.service;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.cumulus.certificate.model.PropertyType.PropertyPerformance;
import org.cumulus.certificate.model.PropertyType.PropertyPerformance.PropertyPerformanceRow;
import org.cumulus.certificate.model.PropertyType.PropertyPerformance.PropertyPerformanceRow.PropertyPerformanceCell;
import org.cumulus.certificate.model.test.TestCertificationModel;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import sun.misc.BASE64Decoder;

import com.codahale.metrics.annotation.Timed;
import com.cumulus.repo.lab.domain.Ca;
import com.cumulus.repo.lab.domain.Cminstance;
import com.cumulus.repo.lab.domain.Property;
import com.cumulus.repo.lab.domain.Propertyattribute;
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
import com.sun.org.apache.xml.internal.security.c14n.CanonicalizationException;
import com.sun.org.apache.xml.internal.security.c14n.Canonicalizer;
import com.sun.org.apache.xml.internal.security.c14n.InvalidCanonicalizerException;


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

public boolean signatureValidation(String XML,User u) throws Exception{

	DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
	dbf.setNamespaceAware(true);
	 DocumentBuilder db=dbf.newDocumentBuilder();
    InputSource is = new InputSource();
    is.setCharacterStream(new StringReader(XML));

    Document doc = db.parse(is);
	// Find Signature element.
	NodeList nl =
	    doc.getElementsByTagName("Signature");
	if (nl.getLength() == 0) {
	    throw new Exception("Cannot find Signature element");
	}
	String pk = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqsuy6brI1R5Jz3vTF33n"+
			"AvfzdKLSoict44VauSL53ynqASXn2Znxq65ZdeCxfuxF9lRqYnkgR2g7MqFM+7hZ"+
			"GhMQW38AoNLf5EW8w32j/BRkfs2IowhoroF8GTkZTkxMoYyDg9kb4MvT+yDq/ufZ"+
			"sGk18odoNKpOHiS7/uk+pmR06DyL0vpJ633j7vZ6to+YYLkIAS1mTwIQHRlO2r0C"+
			"27drtS6INnQy70h9o9IblQfEj4Kvr+QDB6k99hUuWOlYjlZINqLh+tpoJtU2G/Co"+
			"vaE6POmTnidHOPEsXSzVlDtVU8y9BxuwPMg0uLuAddlZUt7+EWi1BrEJgt3PLPv8"+
			"4wIDAQAB";


	
	BASE64Decoder decoder = new BASE64Decoder();
    byte[] b = decoder.decodeBuffer(pk); 
	X509EncodedKeySpec spec =
		      new X509EncodedKeySpec(b);
		    KeyFactory kf = KeyFactory.getInstance("RSA");
		    PublicKey p =  kf.generatePublic(spec);
	// Create a DOMValidateContext and specify a KeySelector
	// and document context.
	DOMValidateContext valContext = new DOMValidateContext
	   (p, nl.item(0));

	// Unmarshal the XMLSignature.
	XMLSignatureFactory factory = 
			  XMLSignatureFactory.getInstance("DOM"); 

	XMLSignature signature = factory.unmarshalXMLSignature(valContext);

	// Validate the XMLSignature.
	boolean coreValidity = signature.validate(valContext);
	log.debug("Validità XML:{}",coreValidity);
	if (coreValidity == false) {
	    System.err.println("Signature failed core validation");
	    boolean sv = signature.getSignatureValue().validate(valContext);
	    System.out.println("signature validation status: " + sv);
	}
	Iterator<Reference>  i= signature.getSignedInfo().getReferences().iterator();
    for (int j=0; i.hasNext(); j++) {
        boolean refValid = (i.next()).validate(valContext);
        System.out.println("ref["+j+"] validity status: " + refValid);
    }
	return false;
	
}

private Ca findCa(String name) throws caNotFoundException{
	Ca c = this.caRepository.findOneByName(name);
	if(c!=null){
		return c;
	}else {
		throw new caNotFoundException();
	}
}


	/**
	 * POST create a Cminstance from XML
	 * @param XML
	 * @return
	 * @throws URISyntaxException
	 */

	@RequestMapping(value = "/cminstances", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@Transactional
	@Timed
	public ResponseEntity<Void> create(@RequestBody String XML)
			throws URISyntaxException {
		log.debug("REST request to create Template by XML : {}", XML);
		Cminstance cm = null;
		try {
			this.signatureValidation(XML, new User());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return ResponseEntity
					.badRequest()
					.header("Failure",
							e1.getMessage()).build();
		}
		try {
			cm = this.parseXMLTemplate(XML);
			cm.setStatus("pending");
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
			cm.setStatus("pending");

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
     * PUT change cminstance Master
     * @param id
     * @return
     */
    @RequestMapping(value = "/cminstances/changeMaster/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	@Transactional
	@Timed
	public ResponseEntity<Void> changeMaster(@PathVariable Long id) {
		Cminstance c = this.cminstanceRepository.findOne(id);
		if (c.getMaster()) {
			return ResponseEntity.badRequest()
					.header("Failure", "Selected template is alredy master")
					.build();
		} else {
			this.cminstanceRepository.resetAllMaster(c.getModelid());
			c.setMaster(true);
			this.cminstanceRepository.save(c);
		}
		return null;

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
    * GET  /cminstances/:id/xml -> get the "id" cminstance xml.
    */
   @RequestMapping(value = "/cminstances/{id}/xml",
           method = RequestMethod.GET,
           produces = MediaType.APPLICATION_XML_VALUE)
   @Timed
   public ResponseEntity<String> getXml(@PathVariable Long id, HttpServletResponse response) {
       log.debug("REST request to get Cminstance XML : {}", id);
       Cminstance cminstance = cminstanceRepository.findOne(id);
       if (cminstance == null) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity<>(cminstance.getXml(), HttpStatus.OK);
   }
   
  /**
   * GET  /cminstances/:id/xml -> get the "id" cminstance xml.
   */
  @RequestMapping(value = "/cminstances/getMaster/{ModelId}/xml",
          method = RequestMethod.GET,
          produces = MediaType.APPLICATION_XML_VALUE)
  @Timed
  public ResponseEntity<String> getMasterXml(@PathVariable String ModelId, HttpServletResponse response) {
      log.debug("REST request to get Maser Cminstance XML : {}", ModelId);
      Cminstance cminstance = cminstanceRepository.findOneByModelidAndMaster(ModelId, true);
      if (cminstance == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
      return new ResponseEntity<>(cminstance.getXml(), HttpStatus.OK);
  }
  
  /**
   * GET  /cminstances/getMaster/:ModelId/ -> get the "id" cminstance xml.
   */
  @RequestMapping(value = "/cminstances/getMaster/{ModelId}",
          method = RequestMethod.GET,
          produces = MediaType.APPLICATION_JSON_VALUE)
  @Timed
  public ResponseEntity<Cminstance> getMaster(@PathVariable String ModelId, HttpServletResponse response) {
      log.debug("REST request to get Maser Cminstance XML : {}", ModelId);
      Cminstance cminstance = cminstanceRepository.findOneByModelidAndMaster(ModelId, true);
      if (cminstance == null) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
      return new ResponseEntity<>(cminstance, HttpStatus.OK);
  }
   
  /**
   * GET  /cminstances/getModelId/:ModelId/ -> get the "ModelId" cminstance.
   */
  @RequestMapping(value = "/cminstances/getAllByModelId/{ModelId}",
          method = RequestMethod.GET,
          produces = MediaType.APPLICATION_JSON_VALUE)
  @Timed
  public ResponseEntity<List<Cminstance>> getModelId(@PathVariable String ModelId) {
      log.debug("REST request to get Maser Cminstance XML : {}", ModelId);
      List<Cminstance> l = this.cminstanceRepository.findByModelid(ModelId, new Sort(Sort.Direction.DESC, "version"));
      if (l.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
      return new ResponseEntity<>(l, HttpStatus.OK);
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
    /**
     * POST Canonicalize XML
     */
    @RequestMapping(value = "/cminstances/canonicalize", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE )
    @Transactional
    @Timed
    public ResponseEntity<String> canonicalize(@RequestBody String XML)
    		throws URISyntaxException {
    	log.debug("REST request to canonicalize XML : {}", XML);
		//return ResponseEntity.ok().body(XML);
		
    	//XML = this.unPrettyPrint(XML);
    	//log.debug(XML);
    	/*
    	com.sun.org.apache.xml.internal.security.Init.init();
    	byte canonXmlBytes[];
		try {
			
			Canonicalizer canon = Canonicalizer.getInstance(Canonicalizer.ALGO_ID_C14N_EXCL_OMIT_COMMENTS);
			canonXmlBytes = canon.canonicalize(XML.getBytes());
			String canonXmlString = new String(canonXmlBytes);
			return ResponseEntity.ok().body(canonXmlString);
		} catch (CanonicalizationException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		} catch (SAXException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		} catch (InvalidCanonicalizerException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		*/
    	byte[] result=null;
    	  try {
    	    com.sun.org.apache.xml.internal.security.Init.init();
    	    Canonicalizer c14n=Canonicalizer.getInstance("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
    	    result=c14n.canonicalize(XML.getBytes());
    	  }
    	 catch (  Exception e) {
    	    throw new RuntimeException(e);
    	  }
    	  return ResponseEntity.ok().body(new String(result));    	
    	
		

    }
    
    /**
     * POST Canonicalize XML
     */
    @RequestMapping(value = "/cminstances/canonicalize/signatureinfo", method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE )
    @Transactional
    @Timed
    public ResponseEntity<String> canonicalizeSignatureInfo(@RequestBody String XML){
    	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    	factory.setNamespaceAware(true);
    	DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
    	Document document = null;
		try {
			document = builder.parse(new InputSource(new StringReader(XML)));
		} catch (SAXException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	Element rootElement = document.getDocumentElement();
    	NodeList list = rootElement.getElementsByTagName("SignedInfo");
    	Node n = list.item(0);
    	
    	
    	
    	byte[] result=null;
  	  try {
  	    com.sun.org.apache.xml.internal.security.Init.init();
  	    Canonicalizer c14n=Canonicalizer.getInstance("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
  	    result=c14n.canonicalizeSubtree(n);
  	  }
  	 catch (  Exception e) {
  	    throw new RuntimeException(e);
  	  }
  	  return ResponseEntity.ok().body(new String(result));
    }
    
    
    private String unPrettyPrint(final String xml){  

        

        final StringWriter sw;

        try {
            final OutputFormat format = OutputFormat.createCompactFormat();
            final org.dom4j.Document document = DocumentHelper.parseText(xml);
            sw = new StringWriter();
            final XMLWriter writer = new XMLWriter(sw, format);
            writer.write(document);
        }
        catch (Exception e) {
            throw new RuntimeException("Error un-pretty printing xml:\n" + xml, e);
        }
        return sw.toString();
    }
    
}



