package com.iarad.cloudpoker.service;

import com.iarad.cloudpoker.entity.Player;
import org.springframework.stereotype.Service;

/**
 * PlayerService
 *
 * @author Stuart MacKenzie
 */
@Service
public interface PlayerService {

    Player getPlayer(long playerId);

    Player createPlayer(Player player);

    Player incrementWin(Player player);

    Player incrementLoss(Player player);

    Player getPlayerByEmailAddress(String email);
}
