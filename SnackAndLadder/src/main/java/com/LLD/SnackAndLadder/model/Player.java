package com.LLD.SnackAndLadder.model;

import lombok.Data;

@Data
public class Player {
	String id;
	int currentPosition;

	public Player(String id, int currentPosition) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.currentPosition = currentPosition;
	}

}
