package com.raylock.tile;

import com.raylock.graphics.Screen;
import com.raylock.graphics.Sprite;

public class WaterTile extends Tile{
    
    public WaterTile(Sprite sprite) {
        super(sprite);
    }
    
    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }
    
    public boolean breakable() {
        return true;
    }
    
    public boolean solid() {
        return true;
    }
}
