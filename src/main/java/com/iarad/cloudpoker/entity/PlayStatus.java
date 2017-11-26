package com.iarad.cloudpoker.entity;

/**
 * Denotes the status of a player game play.
 *
 * Normal flow will be:
 * {@code NONE} -> {@code WAITING} -> {@code PLAYING} -> {@code NONE}
 */
public enum PlayStatus {
    NONE,       // user may be logged in, but has not requested to play a game
    WAITING,    // player is waiting for another player to request game play
    PLAYING     // user is currently playing a game
}
