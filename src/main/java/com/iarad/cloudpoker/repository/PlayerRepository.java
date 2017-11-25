package com.iarad.cloudpoker.repository;

import com.iarad.cloudpoker.entity.Player;
import org.springframework.stereotype.Component;

/**
 * PlayerRepository
 *
 * @author Stuart MacKenzie
 */
@Component
public interface PlayerRepository {
    Player addPlayer(Player player);

    Player incrementWins(long playerId);

    Player incrementLosses(long playerId);

    Player findOne(long playerId);

    Player findByEmailAddress(String emailAddress);
}
