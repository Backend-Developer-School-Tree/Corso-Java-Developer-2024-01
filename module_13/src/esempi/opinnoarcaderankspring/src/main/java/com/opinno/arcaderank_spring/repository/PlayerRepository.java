package com.opinno.arcaderank_spring.repository;

import com.opinno.arcaderank_spring.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
