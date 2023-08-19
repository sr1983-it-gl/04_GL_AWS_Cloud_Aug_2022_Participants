package com.samples.moviemgr.model;

import java.util.HashSet;
import java.util.Set;

public class GenreUtils {

	private static Set<String> genres = new HashSet<String>();
	
	static {
		genres.add("Action");
		genres.add("Adventure");
		genres.add("Animation");
		genres.add("Biography");
		genres.add("Comedy");
		genres.add("Crime");
		genres.add("Documentary");
		genres.add("Drama");
		genres.add("Family");
		genres.add("Fantasy");
		
		genres.add("History");
		genres.add("Horror");
		genres.add("Music");
		genres.add("Musical");
		genres.add("Mystery");
		genres.add("Romance");
		genres.add("Sci-Fic");
		genres.add("Sport");
		genres.add("Thriller");
		genres.add("War");
		genres.add("Western");
	}
	
	public static boolean isAValidGenre(String genre) {
		
		if (genres.contains(genre.trim())) {
			return true;
		}else {
			return false;
		}
	}
}
