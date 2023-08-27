package com.samples.services.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ServiceMgrErrorHandler {

	@ExceptionHandler(value = InvalidServiceCodeException.class)
	public ResponseEntity invalidServiceCodeException(InvalidServiceCodeException exception) {
		
		ResponseEntity responseEntity = new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
		return responseEntity;
	}

}
