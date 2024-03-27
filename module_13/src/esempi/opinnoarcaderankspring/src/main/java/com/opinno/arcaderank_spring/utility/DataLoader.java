package com.opinno.arcaderank_spring.utility;

import com.opinno.arcaderank_spring.model.Match;
import com.opinno.arcaderank_spring.model.Player;
import com.opinno.arcaderank_spring.model.Videogame;
import com.opinno.arcaderank_spring.service.BoardService;
import com.opinno.arcaderank_spring.service.MatchService;
import com.opinno.arcaderank_spring.service.PlayerService;
import com.opinno.arcaderank_spring.service.VideogameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
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

    @Autowired
    private BoardService boardService;

    @Override
    public void run(String... args) throws Exception {

        // 1) Inserisco i player
        playerService.saveAll(createPlayerList());

        // 2) Inserisco i videogame
        videogameService.saveAll(createVideoGameList());

        // 3) Inserisco i match
        //matchService.saveAll(createMatchesList());

        System.out.println(boardService.getLeaderboardByVideogameId(1L));

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

    private List<Videogame> createVideoGameList(){
        List<Videogame> videogames = new ArrayList<Videogame>();

        videogames.add(Videogame.builder().name("The Legend of Zelda").difficultyCoeff(3).build());
        videogames.add(Videogame.builder().name("Super Mario Galaxy").difficultyCoeff(2).build());
        videogames.add(Videogame.builder().name("BioShock").difficultyCoeff(5).build());
        videogames.add(Videogame.builder().name("Tekken 3").difficultyCoeff(3).build());
        videogames.add(Videogame.builder().name("Gran Turismo").difficultyCoeff(4).build());

        return videogames;
    }

    private List<Match> createMatchesList(){
        List<Match> matches = new ArrayList<>();
        List<Player> players = new ArrayList<>();
        List<Videogame> videogames = new ArrayList<>();

        players = playerService.getAll();
        videogames = videogameService.getAll();

        for(int i=0; i<20; i++){
            matches.add(Match.builder()
                    .player(players.get(i))
                    .videogame(videogames.get((int) (Math.random() * videogames.size()-1)))
                    .dateTimeGame(LocalDateTime.now()).build());
        }

        return matches;

    }
}
