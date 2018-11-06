package com.sparta.jas.deck.cards;

public enum Suits {
    HEARTS {
        public char getSymbol() {
            return '\u2665';
        }
    },
    DIAMONDS {
        public char getSymbol() {
            return '\u2666';
        }
    },
    CLUBS {
        public char getSymbol() {
            return '\u2663';
        }
    },
    SPADES {
        public char getSymbol() {
            return '\u2660';
        }
    };

    public abstract char getSymbol();
}

