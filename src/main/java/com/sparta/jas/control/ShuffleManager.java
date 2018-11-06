package com.sparta.jas.control;

import com.sparta.jas.deck.Deck;
import com.sparta.jas.display.CardDisplay;

import java.util.Collections;

public class ShuffleManager {
    private Deck deck = new Deck();

    public Deck getDeck() {
        return deck;
    }

    public void shuffleDeck(){
        Collections.shuffle(deck.getCardsInDeck());
        CardDisplay cardDisplay = new CardDisplay();
        cardDisplay.printCards(deck);
    }
}
