package com.opinno.arcaderank_spring.utility;

import com.opinno.arcaderank_spring.model.Player;
import com.opinno.arcaderank_spring.service.MatchService;
import com.opinno.arcaderank_spring.service.PlayerService;
import com.opinno.arcaderank_spring.service.VideogameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private MatchService matchService;

    @Autowired
    private VideogameService videogameService;

    @Autowired
    private PlayerService playerService;

    @Override
    public void run(String... args) throws Exception {

        // 1) Inserisco i player
        List<Player> players2insert = createPlayerList();
        playerService.saveAll(players2insert);

        // 2) Inserisco i videogame
        // 3) Inserisco i match

    }

    private List<Player> createPlayerList(){
        List<Player> players = new ArrayList<>();

        String[] usernames = {"Lionel", "Cristiano", "Neymar", "Kylian", "Mohamed", "Sadio", "Kevin", "Robert", "Virgil", "Alisson", "Sergio", "Luka", "Eden", "Raheem", "Toni", "Karim", "Gerard", "Thiago", "Jan", "Marc"};

        for (int i = 0; i < 20; i++) {
            Player player = Player.builder().username(usernames[i] + i).build();
            players.add(player);
        }

        return players;
    }
}
