package com.raylock.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class SpriteSheet {

    private String path;
    public final int SIZE;
    public int pixels[];

    public static SpriteSheet tiles = new SpriteSheet("/textures/sheets/tiles.png", 64);
    public static SpriteSheet ant = new SpriteSheet("/textures/sheets/hero.png", 96);
    //public static SpriteSheet rocks = new SpriteSheet("/textures/sheets/rocks.png", 128);

    public SpriteSheet(String path, int size) {
        this.path = path;
        SIZE = size;
        pixels = new int[SIZE*SIZE];
        load();
    }
    
    private void load() {
        try {
            BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
