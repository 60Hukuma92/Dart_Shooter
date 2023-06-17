package com.shooter.game.Screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.shooter.game.Game;
import com.shooter.game.Map;
import com.shooter.game.SoundPlayer;
import com.shooter.game.Sprites.Dart;
import com.shooter.game.Sprites.DartThrower;

import java.awt.Rectangle;
import java.util.ArrayList;

public class PlayScreen implements Screen {
    private Viewport gameViewport;

    private Game game;

    private DartThrower player;
    private Dart dart;

    public static final int SCALE = 4;

    public PlayScreen(Game game) {
        this.game = game;

        SoundPlayer.play();

        player = new DartThrower(new Vector2(6 * 16 * SCALE, 16 * SCALE), game);
    }

    @Override
    public void show() {

    }

    public void handleInput() {
//        System.out.println(player.getPosition().x / 16 / SCALE);
//        System.out.println(player.getPosition().y / 16 / SCALE);
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            player.setUpColl(Map.checkUpCollusion((int) (player.getPosition().x / 16 / SCALE), (int) (player.getPosition().y / 16 / SCALE)));
            player.setDirection("UP");
            System.out.println("UP-----" + player.isUpColl());
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            player.setDownColl(Map.checkDownCollusion(((int) (player.getPosition().x / 16 / SCALE)), (int) (player.getPosition().y / 16 / SCALE)));
            player.setDirection("DOWN");
            System.out.println("DOWN-----" + player.isDownColl());
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            player.setRightColl(Map.checkRightCollusion(((int) (player.getPosition().x / 16 / SCALE)), (int) (player.getPosition().y / 16 / SCALE)));
            player.setDirection("RIGHT");
            System.out.println("RIGHT-----" + player.isRightColl());
        }

         if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            player.setLeftColl(Map.checkLeftCollusion(((int) (player.getPosition().x / 16 / SCALE)), (int) (player.getPosition().y / 16 / SCALE)));
            player.setDirection("LEFT");
            System.out.println("LEFT-----" + player.isLeftColl());
        }

         if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
             dart = new Dart(new Vector2(player.getPosition().x, player.getPosition().y), player.getDirection(), game);
             //dart.setShot(true);
         }
    }


    @Override
    public void render(float delta) {
        handleInput();
        //Clear the game screen with Black
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //render our game map
        game.batch.begin();
        game.batch.draw(Map.MAP_PICTURE, 0, 0, 208 * 4, 208 * 4);

        game.batch.end();
        player.render();
        player.update();
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE))
            dart.render();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
