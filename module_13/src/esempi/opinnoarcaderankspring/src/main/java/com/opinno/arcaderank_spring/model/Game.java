package com.opinno.arcaderank_spring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
* Questa classe rappresenta la singola partita giocata dall'utente per lo specifico videogioco
* */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTimeGame;

    @OneToOne
    private UserRank userRank;

    @OneToOne
    private Videogame videogame;
}
