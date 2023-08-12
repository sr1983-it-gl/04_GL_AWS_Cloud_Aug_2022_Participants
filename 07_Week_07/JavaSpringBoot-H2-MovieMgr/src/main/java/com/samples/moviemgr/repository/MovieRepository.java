package com.samples.moviemgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samples.moviemgr.model.Movie;

public interface MovieRepository 
	extends JpaRepository<Movie, Integer>{

}
