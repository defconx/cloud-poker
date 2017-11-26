package com.iarad.cloudpoker.repository;

import com.iarad.cloudpoker.entity.AccountStatus;
import com.iarad.cloudpoker.entity.Player;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.Instant;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Component
public class PlayerRepositoryInMemoryImpl implements PlayerRepository {

    private static final Map<Long, Player> PLAYER_REPOSITORY = new HashMap<>();

    private static final AtomicLong PLAYER_ID = new AtomicLong(0);
    @Override
    public Player addPlayer(Player player) {
        player.setId(PLAYER_ID.incrementAndGet());

        PLAYER_REPOSITORY.put(player.getId(), player);
        return player;
    }

    @Override
    public Player incrementWins(long playerId) {
        // We really only have a reference to a player here so this works fine. In a persistent DB,
        // we'd have to persist this update we made to the player.
        Player player = PLAYER_REPOSITORY.get(playerId);
        player.setWinCount(player.getWinCount() +1);
        return player;
    }

    @Override
    public Player incrementLosses(long playerId) {
        Player player = PLAYER_REPOSITORY.get(playerId);
        player.setLossCount(player.getLossCount() +1);
        return player;
    }

    @Override
    public Player findOne(long playerId) {
        if (!PLAYER_REPOSITORY.containsKey(playerId)) {
            return null;
        }

        return PLAYER_REPOSITORY.get(playerId);
    }

    @Override
    public List<Player> getAll() {
        return PLAYER_REPOSITORY.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }


    /**
     * Returns player with the email address passed in else null.
     */
    @Override
    public Player findByEmailAddress(String emailAddress) {
        return PLAYER_REPOSITORY.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .filter(p -> p.getEmailAddress().equalsIgnoreCase(emailAddress))
                .findAny()
                .orElse(null);
    }

    @Override
    public int getPlayerCount() {
        return PLAYER_REPOSITORY.size();
    }

    @PostConstruct
    public void initDB() throws Exception {
        Player p1 = new Player();
        p1.setFirstName("Johnny");
        p1.setLastName("Kid");
        p1.setUsername("JohnnyTheKid");
        p1.setDateOfBirth(LocalDate.of(1990, 12, 1));
        p1.setLastLogin(Instant.now());
        p1.setEmailAddress("billy@theplayerscircle.org");
        p1.setWinCount(10);
        p1.setLossCount(0);
        p1.setAccountStatus(AccountStatus.ACTIVE);

        addPlayer(p1);

        Player p2 = new Player();
        p2.setFirstName("James");
        p2.setLastName("Hickok");
        p2.setUsername("WildBillHickok");
        p2.setDateOfBirth(LocalDate.of(1837, 5, 27));
        p2.setLastLogin(Instant.now());
        p2.setEmailAddress("wildbillhickok@theplayerscircle.org");
        p2.setWinCount(23);
        p2.setLossCount(2);
        p2.setAccountStatus(AccountStatus.ACTIVE);

        addPlayer(p2);
    }
}
