package com.samples.moviemgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.samples.moviemgr.error.ErrorUtils;
import com.samples.moviemgr.model.Movie;
import com.samples.moviemgr.repository.MovieRepository;

@RestController
public class MovieController {

	@Autowired
	MovieRepository repository;
	

	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public List<Movie> getAllMovies() {
		
		return repository.findAll();
	}

	@RequestMapping(value = "/movies/{movieId}", method = RequestMethod.GET)
	public Movie getMovie(@PathVariable("movieId") int movieId) {
		
		return repository.findById(movieId).get();
	}
	
	
	@PostMapping(value = "/movies")
	public int addMovie(@RequestBody Movie movie) {

		ErrorUtils.checkForInvalidRating(movie);
		ErrorUtils.checkForInvalidGenre(movie);
		
		repository.save(movie);
		return movie.getId();
	}

	@PutMapping(value = "/movies/{movieId}")
	public int updateMovie(@RequestBody Movie movie, @PathVariable("movieId") int movieId) {

		Movie  existingMovieObj 
			= repository.findById(movieId).get();
		
		existingMovieObj.setName(movie.getName());
		existingMovieObj.setYearOfRelease(movie.getYearOfRelease());
		existingMovieObj.setRating(movie.getRating());
		existingMovieObj.setGenres(movie.getGenres());
		
		repository.save(existingMovieObj);
		return existingMovieObj.getId();
	}	
}
