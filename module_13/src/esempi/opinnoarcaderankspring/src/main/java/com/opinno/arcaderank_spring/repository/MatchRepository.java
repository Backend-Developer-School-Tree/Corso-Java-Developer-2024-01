package com.opinno.arcaderank_spring.repository;

import com.opinno.arcaderank_spring.model.Match;
import com.opinno.arcaderank_spring.model.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long> {

    List<Match> findAllByVideogame(Videogame videogame);
}
