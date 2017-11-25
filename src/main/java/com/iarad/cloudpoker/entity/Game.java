package com.iarad.cloudpoker.entity;

import org.springframework.stereotype.Component;

import java.time.Instant;

/**
 * Game
 *
 * @author Stuart MacKenzie
 */
@Component
public class Game {

    long id;

    Instant startTime;

    Player playerOne;

    Player playerTwo;

}
