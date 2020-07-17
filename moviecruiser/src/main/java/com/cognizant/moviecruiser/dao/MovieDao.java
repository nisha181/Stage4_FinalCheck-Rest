package com.cognizant.moviecruiser.dao;

import java.util.List;

import com.cognizant.moviecruiser.model.Movie;

public interface MovieDao {

	public List<Movie> modifyMovie(Movie movie);

	public List<Movie> CustomerMovieList();
}
