package com.samples.services.error;

public class InvalidServiceCodeException extends RuntimeException{

	private String serviceCode;
	
	public InvalidServiceCodeException(String message, String serviceCode) {
		
		super(message);
		
		this.serviceCode = serviceCode;
	}
	
	public String getServiceCode() {
		return serviceCode;
	}
}
