package com.opinno.arcaderank_spring.service;

import com.opinno.arcaderank_spring.model.Player;
import com.opinno.arcaderank_spring.model.Videogame;
import com.opinno.arcaderank_spring.repository.PlayerRepository;
import com.opinno.arcaderank_spring.repository.VideogameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideogameService {

    @Autowired
    private VideogameRepository videogameRepository;

    public List<Videogame> getAll(){
        return videogameRepository.findAll();
    }

    public Optional<Videogame> findById(Long videogameID){ return videogameRepository.findById(videogameID); }

    public Videogame save(Videogame videogame){
        return videogameRepository.save(videogame);
    }

    public List<Videogame> saveAll(List<Videogame> videogames){
        return videogameRepository.saveAll(videogames);
    }

}
