package com.sparta.jas.deck;

import com.sparta.jas.deck.cards.Card;
import com.sparta.jas.deck.cards.CardValues;
import com.sparta.jas.deck.cards.Suits;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cardsInDeck = new ArrayList<>();

    public Deck() {
        for (Suits suit: Suits.values()) {
            for (CardValues cardValue: CardValues.values()){
                Card card = new Card(suit,cardValue);
                cardsInDeck.add(card);
            }
        }
    }

    public List<Card> getCardsInDeck() {
        return cardsInDeck;
    }
}
