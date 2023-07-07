package com.LLD.Tic_tac_toe.model;

public class Player {

	String name;
	PlayingPiece piece;
	
	public Player(String name, PlayingPiece piece) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.piece = piece;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlayingPiece getPiece() {
		return piece;
	}

	public void setPiece(PlayingPiece piece) {
		this.piece = piece;
	}
	
	

}
