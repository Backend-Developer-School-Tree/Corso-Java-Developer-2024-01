package com.opinno.arcaderank_spring.service;

import com.opinno.arcaderank_spring.model.Match;
import com.opinno.arcaderank_spring.model.Videogame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    VideogameService videogameService;

    @Autowired
    MatchService matchService;

    // Classifica di un videogioco
    public List<Match> getLeaderboardByVideogameId(Long videogameId) {
        Videogame videogame = videogameService.findById(videogameId).orElse(null);
        if (videogame == null) {
            return null;
        }

        List<Match> matches = matchService.findAllByVideogame(videogame);

        return matches;
    }
}
