package com.opinno.arcaderank_spring.repository;

import com.opinno.arcaderank_spring.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
