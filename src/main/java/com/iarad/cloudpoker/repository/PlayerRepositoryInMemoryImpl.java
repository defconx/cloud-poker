package com.iarad.cloudpoker.repository;

import com.iarad.cloudpoker.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * PlayerRepositoryInMemoryImpl
 *
 * @author Stuart MacKenzie
 */
public class PlayerRepositoryInMemoryImpl implements PlayerRepository {

    private static final Map<Long, Player> playerRepository = new HashMap<>();

    private AtomicLong playerIdIndex = new AtomicLong(0);

    @Override
    public Player addPlayer(Player player) {
        player.setId(playerIdIndex.incrementAndGet());

        playerRepository.put(player.getId(), player);
        return player;
    }

    @Override
    public Player incrementWins(long playerId) {
        // We really only have a reference to a player here so this works fine. In a persistent DB,
        // we'd have to persist this update we made to the player.
        Player player = playerRepository.get(playerId);
        player.setWinCount(player.getWinCount() +1);
        return player;
    }

    @Override
    public Player incrementLosses(long playerId) {
        Player player = playerRepository.get(playerId);
        player.setLossCount(player.getLossCount() +1);
        return player;
    }

    @Override
    public Player findOne(long playerId) {
        if (!playerRepository.containsKey(playerId)) {
            return null;
        }

        return playerRepository.get(playerId);
    }

    /**
     * Returns player with the email address passed in else null.
     */
    @Override
    public Player findByEmailAddress(String emailAddress) {
        return playerRepository.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(p -> p.getEmailAddress().equalsIgnoreCase(emailAddress))
                .findAny()
                .orElse(null);
    }
}
