package com.opinno.arcaderank_spring.controller;

import com.opinno.arcaderank_spring.model.Player;
import com.opinno.arcaderank_spring.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @GetMapping("/players")
    public ResponseEntity<List<Player>> getPlayers(){
        return new ResponseEntity<>(playerService.getAll(), HttpStatus.OK);
    }

    // http://localhost:8080/api/v1/playerbyid?playerID=2
    @GetMapping("/playerbyid")
    public ResponseEntity<Optional<Player>> getPlayerByID(@RequestParam long playerID){

        return new ResponseEntity<>(playerService.findById(playerID), HttpStatus.OK);
    }

    // http://localhost:8080/api/v1/player/1
    //Path variable
    @DeleteMapping("/player/{playerID}")
    public ResponseEntity<String> delete(@PathVariable long playerID ){
        playerService.deleteByID(playerID);

        return new ResponseEntity<>("Player eliminato", HttpStatus.OK);
    }

    @PostMapping("/player")
    public ResponseEntity<String> savePlayer(@RequestBody Player player){
        playerService.save(player);

        return new ResponseEntity<>("Player salvato", HttpStatus.CREATED);
    }
}
