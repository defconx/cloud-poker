package com.iarad.cloudpoker.entity;

import javax.annotation.Nonnull;

/**
 * An immutable class representing a "French playing card".
 *
 * @author Stuart MacKenzie
 */
public class PlayingCard {

    /**
     * Represents the Rank of a {@code Playing Card}.
     *
     */
    public enum Rank {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        final int numberValue;

        Rank(int numberValue) {
            this.numberValue = numberValue;
        }
    }

    /**
     * Represents the Suite of a {@code Playing Card}.
     */
    public enum Suite {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }

    public final Rank rank;

    public final Suite suite;

    public PlayingCard(@Nonnull Rank rank, @Nonnull Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }
}
