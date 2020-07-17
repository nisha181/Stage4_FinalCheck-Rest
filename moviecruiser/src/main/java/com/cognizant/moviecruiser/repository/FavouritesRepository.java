package com.cognizant.moviecruiser.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.moviecruiser.model.Favourites;
import com.cognizant.moviecruiser.model.Movie;

@Repository
public interface FavouritesRepository extends JpaRepository<Favourites, Long> {

}
