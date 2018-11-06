package com.sparta.jas;

import com.sparta.jas.control.ShuffleManager;

/**
 * Hello world!
 *
 */
public class Starter
{
    public static void main( String[] args )
    {
        ShuffleManager shuffleManager = new ShuffleManager();
        shuffleManager.shuffleDeck();
    }
}
