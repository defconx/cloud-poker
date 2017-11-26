package com.iarad.cloudpoker.controller;

import com.iarad.cloudpoker.entity.Player;
import com.iarad.cloudpoker.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * PlayerController
 *
 * @author Stuart MacKenzie
 */
@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(final PlayerService playerService) {
        this.playerService = playerService;
    }

    @RequestMapping(value = "/{id}", produces="application/json", method = RequestMethod.GET)
    public Player getPlayer(@PathVariable long id) {
        return playerService.getPlayer(id);
    }

    @RequestMapping(value = "/", produces="application/json", method = RequestMethod.GET)
    public List<Player> getPlayers() {
        return playerService.getPlayers();
    }
}
