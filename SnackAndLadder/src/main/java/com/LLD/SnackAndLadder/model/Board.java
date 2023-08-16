package com.LLD.SnackAndLadder.model;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
	Cell[][] cells;
	public Board(int boardSize, int numberOfSnacks, int numberOfLadder) {
		// TODO Auto-generated constructor stub
		initializeCells(boardSize);
//		addSnackesAndLadder();
	}
	
	public void initializeCells(int boardSize) {
		cells = new Cell[boardSize][boardSize];
		for(int i = 0; i < boardSize; i++) {
			for(int j = 0; j < boardSize; j++) {
				cells[i][j] = new Cell();
			}
		}
	}
	
	public void addSnackesAndLadder(Cell[][] cells, int numberOfSnacks, int numberOfLadder) {
		while(numberOfSnacks > 0) {
			int snackHead = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length - 1);
			int snackTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length - 1);
			if(snackTail >= snackHead) {
				continue;
			}
			Jump snackObj = new Jump();
			snackObj.start = snackHead;
			snackObj.end = snackTail;
			Cell cell = getCell(snackHead);
			cell.jump = snackObj;
			numberOfSnacks--;
		}
		
		while(numberOfLadder > 0) {
			int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
			int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
			if(ladderTail >= ladderHead) {
				continue;
			}
			Jump ladderObj = new Jump();
			ladderObj.start = ladderTail;
			ladderObj.end = ladderHead;
			
			Cell cell = getCell(ladderTail);
			cell.jump = ladderObj;
			numberOfLadder--;
		}
	}
	
	public Cell getCell(int playerPosition) {
		int row = playerPosition / cells.length;
		int col = playerPosition % cells.length;
		return cells[row][col];
	}
}
