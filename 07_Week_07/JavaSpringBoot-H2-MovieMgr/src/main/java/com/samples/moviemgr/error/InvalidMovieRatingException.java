package com.samples.moviemgr.error;

public class InvalidMovieRatingException extends RuntimeException{

	private float rating;
	
	public InvalidMovieRatingException(String message, float rating) {
		
		super(message);
		this.rating = rating;
	}
	
	public float getRating() {
		return rating;
	}
}
