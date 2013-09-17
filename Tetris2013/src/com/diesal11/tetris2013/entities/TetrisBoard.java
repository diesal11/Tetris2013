package com.diesal11.tetris2013.entities;

import com.diesal11.tetris2013.Art;
import com.diesal11.tetris2013.gui.Bitmap;

public class TetrisBoard {
	public static final int WIDTH = 10;
	public static final int HEIGHT = 20;
	public static final int TILE_SIZE = 19;
	public static final int LINE_SIZE = 2;
	
	public int[] tiles;
	
	public TetrisBoard() {
		tiles = new int[HEIGHT * WIDTH];
		for(int i = 0; i < tiles.length; i++) {
			tiles[i] = 0;
		}
	}
	
	public void tick() {
		
	}
	
	public Bitmap render() {
		int boardWidth = (WIDTH * TILE_SIZE + (WIDTH * LINE_SIZE) + LINE_SIZE);
		int boardHeight = (HEIGHT * TILE_SIZE + (HEIGHT * LINE_SIZE) + LINE_SIZE);
		Bitmap pixels = new Bitmap(boardWidth, boardHeight);
		
		pixels.fill(0x000000);
		
		Bitmap blank = Tetros.RED.getNormalBitmap();
		
		int xOffs = LINE_SIZE;
		int yOffs = LINE_SIZE;
		//Draw Blocks
		for(int y = 0; y < HEIGHT; y++) {
			for(int x = 0; x < WIDTH; x++) {
				pixels.draw(blank, xOffs, yOffs);
				xOffs += TILE_SIZE + LINE_SIZE;
			}
			yOffs += TILE_SIZE + LINE_SIZE;
			xOffs = LINE_SIZE;
		}
		
		return pixels;
	}
}
