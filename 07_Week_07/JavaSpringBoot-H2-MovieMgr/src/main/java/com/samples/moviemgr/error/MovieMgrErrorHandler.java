package com.samples.moviemgr.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MovieMgrErrorHandler {

	@ExceptionHandler(value = InvalidMovieRatingException.class)
	public ResponseEntity invalidMovieRatingException(InvalidMovieRatingException exception) {
		
		ResponseEntity responseEntity = new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
		return responseEntity;
	}

	@ExceptionHandler(value = InvalidGenreException.class)
	public ResponseEntity invalidGenreException(InvalidGenreException exception) {
		
		ResponseEntity responseEntity = new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
		return responseEntity;
	}

}
