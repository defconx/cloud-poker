package com.iarad.cloudpoker.repository;

import com.iarad.cloudpoker.entity.Player;

import java.util.List;

/**
 * PlayerRepository
 *
 * @author Stuart MacKenzie
 */
public interface PlayerRepository {
    Player addPlayer(Player player);

    Player incrementWins(long playerId);

    Player incrementLosses(long playerId);

    Player findOne(long playerId);

    List<Player> getAll();

    Player findByEmailAddress(String emailAddress);

    int getPlayerCount();
}
