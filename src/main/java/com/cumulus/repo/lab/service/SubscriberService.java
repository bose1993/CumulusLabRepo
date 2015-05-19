package com.cumulus.repo.lab.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;
import com.cumulus.repo.lab.client.security.Client;
import com.cumulus.repo.lab.client.security.ConnectionFailedException;
import com.cumulus.repo.lab.domain.Authority;
import com.cumulus.repo.lab.domain.Ca;
import com.cumulus.repo.lab.domain.Cminstance;
import com.cumulus.repo.lab.domain.User;
import com.cumulus.repo.lab.repository.AuthorityRepository;
import com.cumulus.repo.lab.repository.CaRepository;
import com.cumulus.repo.lab.repository.CminstanceRepository;
import com.cumulus.repo.lab.repository.UserRepository;
import com.cumulus.repo.lab.service.util.RandomUtil;
import com.cumulus.repo.lab.service.util.SendCmService;
import com.cumulus.repo.lab.service.util.oAuthClientException;

/**
 * REST controller for managing Cminstance.
 */

@Configuration
@RestController
@RequestMapping("/service")
public class SubscriberService {

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

	@Inject
	private CminstanceRepository cminstanceRepository;

	@Inject
	private SendCmService csends;
    
  /**
   * GET  /cminstances/getModelId/:ModelId/ -> get the "ModelId" cminstance.
 * @return 
   */
  @RequestMapping(value = "/subscribe/{CAName}",
          method = RequestMethod.GET)
  @Timed
  public ResponseEntity<String> SubscribeService(@PathVariable String CAName) {
      log.debug("REST request to subscribe service : {}", CAName);
      Ca ca = this.carepo.findOneByName(CAName);
      
      String RepoName = env.getProperty("ALRepo.name");

      if(RepoName==null){
    	    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).header("Failure",
    				"Repo Name not configured, configure repo name in application.yaml first")
    		.body("");      
      }
      if(ca==null){
    	  return ResponseEntity.status(HttpStatus.BAD_REQUEST).header("Failure",
  				"Repo not exist ")
  		.body("");        
      }
      User u = new User();
		u.setFirstName(ca.getName());
		u.setLastName(ca.getName());
		u.setLogin(RandomUtil.generateActivationKey());
		u.setActivated(true);
		String clearPass = RandomUtil.generateActivationKey();
		String encryptedPassword = passwordEncoder.encode(clearPass);
		u.setPassword(encryptedPassword);
		Authority authority = authorityRepository.findOne("ROLE_CA");
		Set<Authority> authorities = new HashSet<>();
		authorities.add(authority);
		u.setAuthorities(authorities);
		this.userRepository.save(u);
		ca.setuser(u);
		this.carepo.save(ca);
		String ret = "";
      log.debug("CA NAME {}",ca);
      try {
		Client c = new Client(ca);
		Map<String,Object> map = new HashMap<String,Object>();
        map.put("name", RepoName);
        map.put("alsecret", clearPass);
        map.put("aluser",u.getLogin());         
        log.debug("Try connection to {} ...",ca.getUri()+"/service/subscribe");
        JSONObject ob = new JSONObject(map);
        String objectStr = ob.toString();
        log.debug("PUT PARAM: {}",objectStr);
        ret = c.doPUTConnection(ca.getUri()+"/service/subscribe", objectStr);
	} catch (ConnectionFailedException e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).header("Failure",
  				"CA Close connection or not respond").body(e.getMessage());
	}
      
      return ResponseEntity.status(HttpStatus.OK)
    			.body(ret); 
  
  }
  
  @RequestMapping(value = "/sendcm/{id}",
          method = RequestMethod.GET)
  @Timed
  public ResponseEntity<String> SendService(@PathVariable Long id) {
	
	  String ret = "";
	  
      Cminstance cminstance = cminstanceRepository.findOne(id);
      if(cminstance== null){
    	  return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.body("CM not found"); 
      }
	  try {
		csends.SendCm(cminstance, cminstance.getCa().getName());
	} catch (oAuthClientException e) {
		 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(e.getMessage()); 
	}
	  return ResponseEntity.status(HttpStatus.OK)
				.body(ret); 
	  
  
  }
   

}
