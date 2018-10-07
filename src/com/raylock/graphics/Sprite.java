package com.raylock.graphics;

public class Sprite {

    public final int SIZE;
    private int x, y;
    public int pixels[];
    private SpriteSheet sheet;

    public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
    public static Sprite water = new Sprite(16, 1, 0, SpriteSheet.tiles);
    public static Sprite water1 = new Sprite(16, 1, 1, SpriteSheet.tiles);
    public static Sprite stone = new Sprite(16, 2, 0, SpriteSheet.tiles);
    public static Sprite stone1 = new Sprite(16, 2, 1, SpriteSheet.tiles);
    public static Sprite gravel = new Sprite(16, 3, 0, SpriteSheet.tiles);
    public static Sprite peat = new Sprite(16, 0, 2, SpriteSheet.tiles);
    public static Sprite peat1 = new Sprite(16, 0, 3, SpriteSheet.tiles);
    public static Sprite silt = new Sprite(16, 1, 2, SpriteSheet.tiles);
    public static Sprite silt1 = new Sprite(16, 1, 3, SpriteSheet.tiles);
    public static Sprite clay = new Sprite(16, 2, 2, SpriteSheet.tiles);
    public static Sprite clay1 = new Sprite(16, 2, 3, SpriteSheet.tiles);
    public static Sprite sand = new Sprite(16, 3, 2, SpriteSheet.tiles);
    public static Sprite sand1 = new Sprite(16, 3, 3, SpriteSheet.tiles);
    public static Sprite voidSprite = new Sprite(16, 0x1B87E0);
    
    //public static Sprite rocks = new Sprite(128, 0, 0, SpriteSheet.rocks);
    
    public static Sprite ant= new Sprite(32,0,0,SpriteSheet.ant);
    public static Sprite ant1= new Sprite(32,1,0,SpriteSheet.ant);
    public static Sprite ant2= new Sprite(32,2,0,SpriteSheet.ant);
    public static Sprite ant3= new Sprite(32,0,1,SpriteSheet.ant);
    public static Sprite ant4= new Sprite(32,1,1,SpriteSheet.ant);
    public static Sprite ant5= new Sprite(32,2,1,SpriteSheet.ant);
    public static Sprite ant6= new Sprite(32,0,2,SpriteSheet.ant);
    public static Sprite ant7= new Sprite(32,1,2,SpriteSheet.ant);
    
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
