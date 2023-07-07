package com.LLD.Tic_tac_toe.model;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
	Deque<Player> players;
	Board gameBoard;
	
	
	public Game() {
		// TODO Auto-generated constructor stub
	}

	public void initializeGame() {
		players = new LinkedList<>();
		PlayingPieceX crossPiece = new PlayingPieceX();
		Player player1 = new Player("Player1", crossPiece);
		
		PlayingPieceO noughtsPiece = new PlayingPieceO();
		Player player2 = new Player("Player2", noughtsPiece);
		
		players.add(player1);
		players.add(player2);
		
		
		// initialize Board
		gameBoard = new Board(3);
	}
	
	
	
}
