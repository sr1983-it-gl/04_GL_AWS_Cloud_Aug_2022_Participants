package com.samples.moviemgr.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samples.moviemgr.model.GenreUtils;
import com.samples.moviemgr.model.Movie;

public class ErrorUtils {

	private static final Logger logger = LoggerFactory.getLogger(ErrorUtils.class);
	
	public static void checkForInvalidRating(Movie movie) {		
		
		if (movie.getRating() <0 || movie.getRating() > 10) {
			
			String errorMessage = String.format("Invalid Movie Rating value %f", movie.getRating());			
			
			logger.info(errorMessage);
			logger.error(errorMessage);
			
			throw new InvalidMovieRatingException(errorMessage, movie.getRating());
		}
	}

	public static void checkForInvalidGenre(Movie movie) {		
		
		String genres = movie.getGenres();
		
		String genresArray[] = genres.split(",");
		
		boolean invalidGenrePresent = false;
		String invalidGenre = "";
		
		for (String genreItem : genresArray) {
			
			boolean result = GenreUtils.isAValidGenre(genreItem);
			
			if (!result) {
			
				invalidGenrePresent = true;
				invalidGenre = genreItem.trim();
				break;
			}			
		}
		
		if (invalidGenrePresent) {
									
			String errorMessage = String.format("Invalid Movie Genre - Genre by name %s cannot be recognized", invalidGenre);			
			
			logger.info(errorMessage);
			logger.error(errorMessage);
			
			throw new InvalidGenreException(errorMessage, invalidGenre);
		}
	}

}
