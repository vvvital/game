package com.game.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {

    //Get players list
    @RequestMapping(value = "/rest/players", method = RequestMethod.GET)
    public String getPlayersList() {
        return "users";
    }

    //Create new player
    @RequestMapping(value = "/rest/players", method = RequestMethod.POST)
    public String createPlayer() {
        return "newPlayer";
    }

    //Get players count
    @RequestMapping(value = "/rest/players/count", method = RequestMethod.GET)
    public String getPlayerCount() {
        return "index";
    }


    //Get Player
    @RequestMapping(value = "/rest/players/{id}", method = RequestMethod.GET)
    public String getPlayer(@PathVariable Integer id) {
        return "index";
    }

    //Update Player
    @RequestMapping(value = "/rest/players/{id}",method = RequestMethod.POST)
    public String updatePlayer(@PathVariable Integer id){
        return "index";
    }

    @RequestMapping(value = "/rest/players/{id}",method = RequestMethod.DELETE)
    public String deletePlayer(@PathVariable Integer id){
        return "index";
    }
}


