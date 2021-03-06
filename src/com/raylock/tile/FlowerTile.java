package com.raylock.tile;

import com.raylock.graphics.Screen;
import com.raylock.graphics.Sprite;

public class FlowerTile extends Tile {

    public FlowerTile(Sprite flower) {
        super(flower);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }
}
