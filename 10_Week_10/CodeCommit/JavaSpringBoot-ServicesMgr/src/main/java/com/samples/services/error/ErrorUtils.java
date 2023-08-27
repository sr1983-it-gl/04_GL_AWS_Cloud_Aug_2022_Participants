package com.samples.services.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samples.services.entity.ServiceEntity;

public class ErrorUtils {


	private static final Logger logger = LoggerFactory.getLogger(ErrorUtils.class);
	
	public static void checkForInvalidServiceCode(ServiceEntity serviceEntity, String serviceCode) {		
		
		if (serviceEntity == null) {
			
			String errorMessage = String.format("Invalid Service Code - Check the Service Code value %s", 
					serviceCode);			
			
			logger.info(errorMessage);
			logger.error(errorMessage);
			
			throw new InvalidServiceCodeException(errorMessage, serviceCode);
		}
	}
	
}
