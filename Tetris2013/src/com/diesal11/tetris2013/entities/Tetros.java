package com.diesal11.tetris2013.entities;

import com.diesal11.tetris2013.Art;
import com.diesal11.tetris2013.gui.Bitmap;

public enum Tetros {
	NONE,
	RED,
	ORANGE,
	YELLOW,
	CYAN,
	BLUE,
	GREEN,
	PURPLE;
	
	public Bitmap getNormalBitmap() {
		return Art.normal[this.ordinal()];
	}
}
