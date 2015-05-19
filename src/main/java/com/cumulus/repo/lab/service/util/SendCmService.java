package com.cumulus.repo.lab.service.util;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.cumulus.repo.lab.client.security.Client;
import com.cumulus.repo.lab.client.security.ConnectionFailedException;
import com.cumulus.repo.lab.domain.Ca;
import com.cumulus.repo.lab.domain.Cminstance;
import com.cumulus.repo.lab.repository.AuthorityRepository;
import com.cumulus.repo.lab.repository.CaRepository;
import com.cumulus.repo.lab.repository.UserRepository;
import com.cumulus.repo.lab.service.SubscriberService;
@Configuration

public class SendCmService {
    
    private final Logger log = LoggerFactory.getLogger(SubscriberService.class);
    
    @Inject
    CaRepository carepo;

    @Autowired
	private Environment env;
    
    @Inject
	private UserRepository userRepository;

	@Inject
	private AuthorityRepository authorityRepository;

	@Inject
	private PasswordEncoder passwordEncoder;

	public SendCmService() {
		// TODO Auto-generated constructor stub
	}
	
	public String SendCm(Cminstance cm,String CAName) throws oAuthClientException {
		 log.debug("Send CM to CA : {} ca name {}", cm,CAName);
	     Ca ca = this.carepo.findOneByName(CAName);
	     if(ca==null){
	    	 throw new oAuthClientException("Ca not found");

	     }
	     String RepoName = env.getProperty("ALRepo.name");
	
	     if(RepoName==null){
	    	 
	    	 throw new oAuthClientException("Repo Name not configured, configure repo name in application.yaml first");
	   	      
	     }
	     String ret = "";
	     log.debug("CA NAME {}",ca);
	     try {
	    	 Client c = new Client(ca);
	    	 Map<String,Object> map = new HashMap<String,Object>();
	    	 map.put("cmid", cm.getId());
	    	 map.put("id", null);
	    	 map.put("status", "pending");
	    	 map.put("version", cm.getVersion());
	    	 map.put("xml", cm.getXml());
	    	 map.put("xmlid", cm.getModelid());
	    	 Map<String,Object> template = new HashMap<String,Object>();
	    	 template.put("templateid", cm.getTemplateid());
	    	 template.put("version", cm.getTemplateersion());
	    	 map.put("template",template);
	    	 log.debug("Try connection to {} ...",ca.getUri()+"/service/insertcm");
		     JSONObject ob = new JSONObject(map);
		     String objectStr = ob.toString();
		     log.debug("PUT PARAM: {}",objectStr);
		     ret = c.doPOSTConnection(ca.getUri()+"/service/insertcm", objectStr);
		} catch (ConnectionFailedException e) {
			throw new oAuthClientException("CA Close connection or not respond "+e.getMessage());
			//return ResponseEntity.status(HttpStatus.BAD_REQUEST).header("Failure",
	 		//		"CA Close connection or not respond").body(e.getMessage());
			
		}
	     
	   return ret;
	 
	}

}
