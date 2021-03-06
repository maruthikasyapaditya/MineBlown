package com.raylock.tile;

import com.raylock.graphics.Screen;
import com.raylock.graphics.Sprite;

public class RockTile extends Tile {

    public RockTile(Sprite rock) {
        super(rock);
    }

    public void render(int x, int y, Screen screen) {
        screen.renderTile(x << 4, y << 4, this);
    }

    public boolean solid() {
        return true;
    }
}
