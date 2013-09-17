package com.diesal11.tetris2013;

import com.diesal11.tetris2013.entities.TetrisBoard;

public class Game {
	public int time;
	public TetrisBoard board;
	
	public Game() {
		board = new TetrisBoard();
	}
	
	public void tick() {
		time++;
		
	}
}
