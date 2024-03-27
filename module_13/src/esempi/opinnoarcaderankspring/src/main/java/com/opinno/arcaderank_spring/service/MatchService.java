package com.opinno.arcaderank_spring.service;

import com.opinno.arcaderank_spring.model.Match;
import com.opinno.arcaderank_spring.model.Videogame;
import com.opinno.arcaderank_spring.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public List<Match> getAll(){
        return matchRepository.findAll();
    }

    public Optional<Match> findById(Long mathID){
        return matchRepository.findById(mathID);
    }

    public Match save(Match match){
        return matchRepository.save(match);
    }

    public List<Match> saveAll(List<Match> matches){
        return matchRepository.saveAll(matches);
    }

    public List<Match> findAllByVideogame(Videogame videogame){
        return matchRepository.findAllByVideogame(videogame);
    }
}
