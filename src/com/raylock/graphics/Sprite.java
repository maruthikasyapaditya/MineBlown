package com.raylock.graphics;

public class Sprite {

    public final int SIZE;
    private int x, y;
    public int pixels[];
    private SpriteSheet sheet;

    public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
    public static Sprite rock = new Sprite(16, 1, 0, SpriteSheet.tiles);
    public static Sprite flower = new Sprite(16, 2, 0, SpriteSheet.tiles);
    public static Sprite voidSprite = new Sprite(16, 0x1B87E0);

    public static Sprite playerU = new Sprite(32, 0, 4, SpriteSheet.tiles);
    public static Sprite playerL = new Sprite(32, 0, 5, SpriteSheet.tiles);
    public static Sprite playerD = new Sprite(32, 0, 6, SpriteSheet.tiles);
    public static Sprite playerR = new Sprite(32, 0, 7, SpriteSheet.tiles);

    public static Sprite playerU1 = new Sprite(32, 3, 4, SpriteSheet.tiles);
    public static Sprite playerU2 = new Sprite(32, 7, 4, SpriteSheet.tiles);

    public static Sprite playerL1 = new Sprite(32, 1, 5, SpriteSheet.tiles);
    public static Sprite playerL2 = new Sprite(32, 5, 5, SpriteSheet.tiles);

    public static Sprite playerD1 = new Sprite(32, 2, 6, SpriteSheet.tiles);
    public static Sprite playerD2 = new Sprite(32, 6, 6, SpriteSheet.tiles);

    public static Sprite playerR1 = new Sprite(32, 1, 7, SpriteSheet.tiles);
    public static Sprite playerR2 = new Sprite(32, 5, 7, SpriteSheet.tiles);

    public Sprite(int size, int x, int y, SpriteSheet sheet) {
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        this.x = x * size;
        this.y = y * size;
        this.sheet = sheet;
        load();
    }

    public Sprite(int size, int color) {
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        setColor(color);
    }

    private void setColor(int color) {
        for (int i = 0; i < SIZE * SIZE; i++) {
            pixels[i] = color;
        }
    }

    private void load() {
        for (int y = 0; y < SIZE; y++) {
            for (int x = 0; x < SIZE; x++) {
                pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
            }
        }
    }
}
