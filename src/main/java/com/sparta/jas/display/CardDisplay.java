package com.sparta.jas.display;

import com.sparta.jas.deck.Deck;
import com.sparta.jas.deck.cards.Card;

public class CardDisplay {

    public void printCards(Deck deck){
        for (Card card :deck.getCardsInDeck()) {
            System.out.println(card.getSuit().getSymbol() + " " + card.getCardValue() + "\u0009\u0009(" + card.getCardValue().getValue() + ")");
        }
    }
}
