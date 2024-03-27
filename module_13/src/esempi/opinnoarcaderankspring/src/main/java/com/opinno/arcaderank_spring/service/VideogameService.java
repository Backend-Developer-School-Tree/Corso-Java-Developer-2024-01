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

    public Optional<Videogame> findById(Long videoGameID){ return videogameRepository.findById(videoGameID); }

    public Videogame save(Videogame player){
        return videogameRepository.save(player);
    }
}
