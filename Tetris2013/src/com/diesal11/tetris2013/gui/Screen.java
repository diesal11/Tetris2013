package com.diesal11.tetris2013.gui;

import javax.swing.UIManager;

import com.diesal11.tetris2013.Game;
import com.diesal11.tetris2013.entities.TetrisBoard;

public class Screen extends Bitmap {
	private final int BACKGROUND_COLOR = UIManager.getColor( "Panel.background" ).getRGB();
	
	public Screen(int width, int height) {
		super(width, height);
	}

	public void render(Game game) {
		fill(BACKGROUND_COLOR);
		Bitmap gameBoard = game.board.render();
		draw(gameBoard, (width - gameBoard.width) / 2, (height - gameBoard.height) / 2);
	}
}