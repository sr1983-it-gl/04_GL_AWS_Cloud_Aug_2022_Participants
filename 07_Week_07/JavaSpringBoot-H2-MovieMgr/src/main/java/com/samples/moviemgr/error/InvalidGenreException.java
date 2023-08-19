package com.samples.moviemgr.error;

public class InvalidGenreException extends RuntimeException{

	private String genre;
	
	public InvalidGenreException(String message, String genre) {
		
		super(message);
		
		this.genre = genre;
	}
	
	public String getGenre() {
		return genre;
	}
}
