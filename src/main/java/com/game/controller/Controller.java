package com.game.controller;


import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

    //Get players list
    @GetMapping("/rest/players")
    public String getPlayersList() {
        return "users";
    }

    //Create new player
    @PostMapping("/rest/players")
    public String createPlayer() {
        return "newPlayer";
    }

    //Get players count
    @GetMapping("/rest/players/count")
    public String getPlayerCount() {
        return "index";
    }


    //Get Player
    @GetMapping("/rest/players/{id}")
    public String getPlayer(@PathVariable Integer id) {
        return "index";
    }

    //Update Player
    @PostMapping("/rest/players/{id}")
    public String updatePlayer(@PathVariable Integer id){
        return "index";
    }

    @DeleteMapping("/rest/players/{id}")
    public String deletePlayer(@PathVariable Integer id){
        return "index";
    }
}


