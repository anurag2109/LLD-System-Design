package com.LLD.Tic_tac_toe.model;

import java.util.ArrayList;
import java.util.List;
import com.sun.tools.javac.util.Pair;

public class Board {

	public int size;
	public PlayingPiece[][] board;
	public Board(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		board = new PlayingPiece[size][size];
	}
	
	public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
		if(board[row][column] != null) {
			return false;
		}
		board[row][column] = playingPiece;
		return true;
	}
	
	public List<Pair<Integer, Integer>> getFreeCells(){
		List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
		//....
		for(int i = 0; i < )
		return freeCells;
	}
}
