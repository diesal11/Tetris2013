package com.diesal11.tetris2013;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.diesal11.tetris2013.gui.Bitmap;

public class Art {
	public static Bitmap[] normal = cut("/tex/normal.png", 19);
	
    private static Bitmap[] cut(String string, int w) {
        try {
            BufferedImage bi = ImageIO.read(Art.class.getResource(string));

            int h = bi.getHeight();
            int xTiles = bi.getWidth() / w;

            Bitmap[] result = new Bitmap[xTiles];

            for (int x = 0; x < xTiles; x++) {
                result[x] = new Bitmap(w, h);
                bi.getRGB(x * w, 0, w, h, result[x].pixels, 0, w);
            }

            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    
	public static Bitmap loadBitmap(String fileName) {
		try {
			BufferedImage img = ImageIO.read(Art.class.getResource(fileName));
			
			int w = img.getWidth();
			int h = img.getHeight();
			
			Bitmap result = new Bitmap(w, h);
			
			return result;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
