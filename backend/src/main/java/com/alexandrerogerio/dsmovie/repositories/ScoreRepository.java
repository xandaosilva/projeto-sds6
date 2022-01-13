package com.alexandrerogerio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrerogerio.dsmovie.entities.Score;
import com.alexandrerogerio.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
