package com.iarad.cloudpoker.service;

import com.iarad.cloudpoker.entity.Player;
import com.iarad.cloudpoker.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * PlayerServiceImpl
 *
 * @author Stuart MacKenzie
 */
public class PlayerServiceImpl implements PlayerService {

    // We're auto-injecting this through the public constructor. Spring take care of it for us.
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(final PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Player getPlayer(long playerId) {
        return playerRepository.findOne(playerId);
    }

    @Override
    public Player createPlayer(Player player) {
        return playerRepository.addPlayer(player);
    }

    @Override
    public Player incrementWin(Player player) {
        return playerRepository.incrementWins(player.getId());
    }

    @Override
    public Player incrementLoss(Player player) {
        return playerRepository.incrementLosses(player.getId());
    }


    @Override
    public Player getPlayerByEmailAddress(String email) {
        return playerRepository.findByEmailAddress(email);
    }
}
