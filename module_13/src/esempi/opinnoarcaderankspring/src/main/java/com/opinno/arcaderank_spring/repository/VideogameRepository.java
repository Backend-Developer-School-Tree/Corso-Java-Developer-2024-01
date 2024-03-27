package com.opinno.arcaderank_spring.repository;

import com.opinno.arcaderank_spring.model.Videogame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideogameRepository extends JpaRepository<Videogame, Long> {
}
