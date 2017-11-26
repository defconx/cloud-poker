package com.iarad.cloudpoker.service;

import com.iarad.cloudpoker.entity.Player;

import java.util.List;

/**
 * PlayerService
 *
 * @author Stuart MacKenzie
 */
public interface PlayerService {

    Player getPlayer(long playerId);

    List<Player> getPlayers();

    Player createPlayer(Player player);

    Player incrementWin(Player player);

    Player incrementLoss(Player player);

    Player getPlayerByEmailAddress(String email);
}
