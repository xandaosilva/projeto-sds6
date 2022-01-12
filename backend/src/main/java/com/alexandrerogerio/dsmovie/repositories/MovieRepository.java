package com.alexandrerogerio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrerogerio.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
