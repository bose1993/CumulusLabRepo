package com.cumulus.repo.lab.client.security;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

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
			      throw new ConnectionFailedException("Can not contact the server. Error Code: "+String.valueOf(code)+" Message: "+ response.toString());

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
	
	public String doPUTConnection(String URLtoGet,Map<?,?> map) throws ConnectionFailedException{
		 URL url;
	      HttpURLConnection conn = null;
	      BufferedReader rd;
	      String line;
	      String urlParameters = urlEncodeUTF8(map);
	      try {
	         url = new URL(URLtoGet);
	         conn = (HttpURLConnection) url.openConnection();
	         conn.setRequestProperty ("Authorization", "Bearer " + this.auth.getToken().getAccess_token());
	         conn= (HttpURLConnection)url.openConnection();
		     conn.setRequestMethod("PUT");
		     conn.setRequestProperty("Accept", 
		    	  "application/json");
					
		     conn.setRequestProperty("Content-Length", "" + 
		               Integer.toString(urlParameters.getBytes().length));
		     conn.setRequestProperty("Content-Language", "en-US"); 
					
		     conn.setUseCaches (false);
		     conn.setDoInput(true);
		     conn.setDoOutput(true);
	
		     //Send request
		     DataOutputStream wr = new DataOutputStream (
		                  conn.getOutputStream ());
		     wr.writeBytes (urlParameters);
		     wr.flush ();
		     wr.close ();
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
	
	public String doPUTConnection(String URLtoGet,String json) throws ConnectionFailedException{
		 URL url;
	      HttpURLConnection conn = null;
	      BufferedReader rd;
	      String line;
	      String urlParameters = json;
	      try {
	         url = new URL(URLtoGet);
	         conn = (HttpURLConnection) url.openConnection();
	         conn.setRequestProperty ("Authorization", "Bearer " + this.auth.getToken().getAccess_token());
	         conn= (HttpURLConnection)url.openConnection();
		     conn.setRequestMethod("PUT");
		     conn.setRequestProperty("Accept", 
		    	  "application/json");
		     conn.setRequestProperty("Content-Type", "application/json");
					
		     conn.setRequestProperty("Content-Length", "" + 
		               Integer.toString(urlParameters.getBytes().length));
		     conn.setRequestProperty("Content-Language", "en-US"); 
					
		     conn.setUseCaches (false);
		     conn.setDoInput(true);
		     conn.setDoOutput(true);
	
		     //Send request
		     DataOutputStream wr = new DataOutputStream (
		                  conn.getOutputStream ());
		     wr.writeBytes (urlParameters);
		     wr.flush ();
		     wr.close ();
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
	
	static String urlEncodeUTF8(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException(e);
        }
    }
    static String urlEncodeUTF8(Map<?,?> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<?,?> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(String.format("%s=%s",
                urlEncodeUTF8(entry.getKey().toString()),
                urlEncodeUTF8(entry.getValue().toString())
            ));
        }
        return sb.toString();       
    }

}
