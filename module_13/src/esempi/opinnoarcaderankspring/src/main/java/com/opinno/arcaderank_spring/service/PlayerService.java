package com.opinno.arcaderank_spring.service;

import com.opinno.arcaderank_spring.model.Player;
import com.opinno.arcaderank_spring.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    /*
    * Se per qualche ragione mi serve di caricare i dati da un altro repo, uso il
    * service, non vado direttamente su repo di altri model!
    * @Autowired
    * private MatchService matchService;
    */

    public List<Player> getAll(){
        return playerRepository.findAll();
    }

    public Optional<Player> findById(Long playerID){ return playerRepository.findById(playerID); }

    public Player save(Player player){

        return playerRepository.save(player);
    }

    public void saveAll(List<Player> players){

        playerRepository.saveAll(players);
    }

    public void deleteByID(long pID){

        playerRepository.deleteById(pID);
    }
}
