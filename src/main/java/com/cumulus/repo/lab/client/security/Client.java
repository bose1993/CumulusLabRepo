package com.cumulus.repo.lab.client.security;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
    private final Logger log = LoggerFactory.getLogger(Client.class);
	private String targetURL;
	private String username;
	private String password;
	private String client_id;
	private String client_secret;
	private Token token;

	public Client(String URL,String username, String password,String client_id,String client_secret) throws ConnectionFailedException {
		this.targetURL=URL;
		this.username=username;
		this.password=password;
		this.client_id=client_id;
		this.client_secret=client_secret;
		String t = this.takeToken();
		
		try {
			this.setToken(new Token(t));
		} catch (JSONException e) {
			this.setToken(new Token());
		}
		
	}
	
	public String takeToken() throws ConnectionFailedException{
		 URL url;
		    HttpURLConnection connection = null;
		    String urlParameters = "username="+this.username+"&password="+this.password+"&grant_type=password&scope=read&client_id=cumulusapp&client_secret=mySecretOAuthSecret";
		    try {
		      //Create connection
		      url = new URL(targetURL);
		      connection = (HttpURLConnection)url.openConnection();
		      connection.setRequestMethod("POST");
		      connection.setRequestProperty("Accept", 
		    		  "application/json");
					
		      connection.setRequestProperty("Content-Length", "" + 
		               Integer.toString(urlParameters.getBytes().length));
		      connection.setRequestProperty("Content-Language", "en-US");  
		      String userPassword = this.client_id + ":" + this.client_secret;
		      String encoding = new sun.misc.BASE64Encoder().encode(userPassword.getBytes());
		      connection.setRequestProperty("Authorization", "Basic " + encoding);
					
		      connection.setUseCaches (false);
		      connection.setDoInput(true);
		      connection.setDoOutput(true);

		      //Send request
		      DataOutputStream wr = new DataOutputStream (
		                  connection.getOutputStream ());
		      wr.writeBytes (urlParameters);
		      wr.flush ();
		      wr.close ();
		      
		      //Get Response	
		      int code = connection.getResponseCode();
		      java.io.InputStream is;
		      if (!(code>=200 && code<=299)){
		    	  is = connection.getErrorStream();
		    	  BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			      String line;
			      StringBuffer response = new StringBuffer(); 
			      while((line = rd.readLine()) != null) {
			        response.append(line);
			        response.append('\r');
			      }
			      rd.close();
			      log.debug("TEST: {}",response.toString());
			      throw new ConnectionFailedException("Can not contact the authentication server. Error Code: "+String.valueOf(code)+" Message: "+ response.toString());

		      }else{
		    	  is = connection.getInputStream();
		     
			      BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			      String line;
			      StringBuffer response = new StringBuffer(); 
			      while((line = rd.readLine()) != null) {
			        response.append(line);
			        response.append('\r');
			      }
			      rd.close();
			      log.debug("TEST: {}",response.toString());
			      return response.toString(); 
		      }
		      

		    } catch (Exception e) {
		    	throw new ConnectionFailedException(e.getMessage());
		    } finally {

		      if(connection != null) {
		        connection.disconnect(); 
		      }
		    }
		  }

	public Token getToken() {
		return token;
	}

	private void setToken(Token token) {
		this.token = token;
	}
		
	}

