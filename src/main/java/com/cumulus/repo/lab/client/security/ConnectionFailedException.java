package com.cumulus.repo.lab.client.security;

public class ConnectionFailedException extends Exception {
	
	private String response;

	public ConnectionFailedException() {
		// TODO Auto-generated constructor stub
	}

	public ConnectionFailedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ConnectionFailedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ConnectionFailedException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ConnectionFailedException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	

}
