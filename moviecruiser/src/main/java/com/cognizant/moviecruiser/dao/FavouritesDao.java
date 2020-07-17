package com.cognizant.moviecruiser.dao;

import java.util.List;

import com.cognizant.moviecruiser.model.Movie;

public interface FavouritesDao {

	public String addToFavourites(long customerId, long movieId);

	public String addCustomer(long id);

	public String deleteFromFavourites(long customerId, long movieId);

	public List<Movie> showFavourites(long customerId);
}
