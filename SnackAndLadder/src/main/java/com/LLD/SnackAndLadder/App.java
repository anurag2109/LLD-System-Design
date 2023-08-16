package com.LLD.SnackAndLadder;

import com.LLD.SnackAndLadder.model.Game;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Game obj = new Game(10, 2, 1);
        obj.startGame();
    }
}
