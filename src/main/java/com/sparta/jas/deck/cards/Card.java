package com.sparta.jas.deck.cards;

public class Card {
    private final Suits suit;
    private final CardValues cardValue;

    public Card(Suits suit, CardValues cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Suits getSuit() {
        return suit;
    }

    public CardValues getCardValue() {
        return cardValue;
    }
}
