package com.cumulus.repo.lab.client.security;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cumulus.repo.lab.domain.Ca;
import com.cumulus.repo.lab.repository.CaRepository;

public class Client {
	private ClientAuthenticator auth;
    private final Logger log = LoggerFactory.getLogger(Client.class);
    private int failureCounter;
	private CaRepository caRepository;
	
	public Client(Ca actCa) throws ConnectionFailedException {
		
		if(actCa==null){
			throw new ConnectionFailedException("CA not found");
		}
		this.auth = new ClientAuthenticator(actCa.getUri()+"/oauth/token",actCa.getLabUser(),actCa.getLabSecret(),"cumulusapp","mySecretOAuthSecret");
	}
	
	
	public String doGETConnection(String URLtoGet) throws ConnectionFailedException{
		 URL url;
	      HttpURLConnection conn = null;
	      BufferedReader rd;
	      String line;
	      try {
	         url = new URL(URLtoGet);
	         conn = (HttpURLConnection) url.openConnection();
	         conn.setRequestProperty ("Authorization", "Bearer " + this.auth.getToken().getAccess_token());
	         conn.setRequestMethod("GET");
	         int code = conn.getResponseCode();
		      java.io.InputStream is;
		      if (!(code>=200 && code<=299)){
		    	  if(code==401){
						throw new UnauthorizedAccessException();
		    	  }
		    	  is = conn.getErrorStream();
		    	  rd = new BufferedReader(new InputStreamReader(is));
			      StringBuffer response = new StringBuffer(); 
			      while((line = rd.readLine()) != null) {
			        response.append(line);
			        response.append('\r');
			      }
			      rd.close();
			      log.debug("Connection Manager: {}",response.toString());
			      throw new ConnectionFailedException("Can not contact the authentication server. Error Code: "+String.valueOf(code)+" Message: "+ response.toString());

		      }else{
		    	  this.failureCounter=0;
		    	  is = conn.getInputStream();
			      rd = new BufferedReader(new InputStreamReader(is));
			      StringBuffer response = new StringBuffer(); 
			      while((line = rd.readLine()) != null) {
			        response.append(line);
			        response.append('\r');
			      }
			      rd.close();
			      log.debug("TEST: {}",response.toString());
			      return response.toString(); 
		      }
	   
	      } catch(UnauthorizedAccessException ue){
	    	  this.auth.takeToken();
	    	  this.failureCounter++;
	    	  if(this.failureCounter<5){
	    		  return this.doGETConnection(URLtoGet);
	    	  }else{
	    		  throw new ConnectionFailedException(ue.getMessage());
	    	  }
	      }
	      catch (Exception e) {
		    	throw new ConnectionFailedException(e.getMessage());
		  } finally {

		      if(conn != null) {
		        conn.disconnect(); 
		      }
		    }
	}

}
