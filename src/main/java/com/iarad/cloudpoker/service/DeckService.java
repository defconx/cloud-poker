package com.iarad.cloudpoker.service;

import com.iarad.cloudpoker.entity.Deck;

/**
 * DeckBuilder
 *
 * @author Stuart MacKenzie
 */
public interface DeckService {

    Deck newDeck();

    Deck shuffleDeck();

}
