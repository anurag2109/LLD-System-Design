package com.LLD.SnackAndLadder.model;

import java.util.Deque;
import java.util.LinkedList;

public class Game {

	Board board;
	Dice dice;
	Player winner;
	Deque<Player> playerList = new LinkedList<>();
	
	public Game(int boardSize, int numberOfPlayer, int numberOfDice) {
		// TODO Auto-generated constructor stub
		board = new Board(boardSize, 5, 4);
		dice = new Dice(numberOfDice);
		winner = null;
		addPlayers(numberOfPlayer);
	}
	public void addPlayers(int numberOfPlayer) {
		int i = 1;
		while(numberOfPlayer > 0) {
			Player player = new Player("p"+i, 0);
			playerList.add(player);
			numberOfPlayer--;
		}
		
	}
	
	public void startGame() {
		while(winner == null) {
			// check whose turn now
			Player playerTurn = findPlayerTurn();
			System.out.println("player turn is: "+playerTurn.id+" current position is: "+playerTurn.currentPosition);
			
			// roll the dice
			int diceNumber = dice.rollDice();
			
			// get the new position
			int playerNewPosition = playerTurn.currentPosition + diceNumber;
			playerNewPosition = jumpCheck(playerNewPosition);
			playerTurn.currentPosition = playerNewPosition;
			System.out.println("player turn is: "+playerTurn.id+" new Position is: "+ playerNewPosition);
			
			if(playerNewPosition >= board.cells.length * board.cells.length) {
				winner = playerTurn;
			}
		}
		System.out.println("WINNER IS: "+ winner.id);
	}
	
	
	public Player findPlayerTurn() {
		Player playerTurns = playerList.removeFirst();
		playerList.addLast(playerTurns);
		return playerTurns;
	}

	private int jumpCheck(int playerNewPosition) {
		if(playerNewPosition >= board.cells.length * board.cells.length) {
			return playerNewPosition;
		}
		
		Cell cell = board.getCell(playerNewPosition);
		if(cell.jump != null && cell.jump.start == playerNewPosition) {
			String jumpBy = (cell.jump.start < cell.jump.end) ? "ladder" : "snack";
			System.out.println("Jump done by: "+jumpBy);
			return cell.jump.end;
		}
		return playerNewPosition;
	}
	
}
