package com.shooter.game;


import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.shooter.game.Screens.PlayScreen;

public class Game extends com.badlogic.gdx.Game {
    public SpriteBatch batch;

    @Override
    public void create() {
        batch = new SpriteBatch();
        setScreen(new PlayScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
