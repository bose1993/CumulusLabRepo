package com.cumulus.repo.lab.client.security;

import org.json.JSONException;
import org.json.JSONObject;

public class Token {
	private String access_token;
	private String refresh_token;
	private String token_type;
	private String expire_in;
	private String scope;
	

	public Token(String Json) throws JSONException {
		JSONObject obj = new JSONObject(Json);
		this.setAccess_token(obj.getString("access_token"));
		this.setToken_type(obj.getString("token_type"));
		this.setRefresh_token(obj.getString("refresh_token"));
		this.setExpire_in(obj.getString("expires_in"));
		this.setScope(obj.getString("scope"));
	}


	public Token() {
		
	}


	public String getAccess_token() {
		return access_token;
	}


	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}


	public String getRefresh_token() {
		return refresh_token;
	}


	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}


	public String getToken_type() {
		return token_type;
	}


	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}


	public String getExpire_in() {
		return expire_in;
	}


	public void setExpire_in(String expire_in) {
		this.expire_in = expire_in;
	}


	public String getScope() {
		return scope;
	}


	public void setScope(String scope) {
		this.scope = scope;
	}

}
