package com.shooter.game.Sprites;

import static com.shooter.game.Screens.PlayScreen.SCALE;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.shooter.game.Game;

import java.awt.Rectangle;

public class DartThrower {

    private Vector2 position;
    private String direction = "UP";

    private Texture texture;

    private Game game;

    public static final int VELOCITY = 2;

    private boolean upColl,downColl,leftColl,rightColl;

    public DartThrower(Vector2 position, Game game) {
        this.position = position;
        this.texture = new Texture("DartShooter.png");
        this.game = game;
    }

    public void update() {
        if (Gdx.input.isKeyPressed(Input.Keys.W) || Gdx.input.isKeyPressed(Input.Keys.S)
        || Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.D)) {
            if (direction.equals("UP") && !upColl) {
                position.add(0, VELOCITY);
                texture = new Texture("DartShooter.png");
            }
            if (direction.equals("DOWN") && !downColl) {
                position.add(0, -VELOCITY);
                texture = new Texture("DartShooter_Down.png");
            }
            if (direction.equals("RIGHT") && !rightColl) {
                position.add(VELOCITY, 0);
                texture = new Texture("DartShooter_Right.png");
            }
            if (direction.equals("LEFT") && !leftColl) {
                position.add(-VELOCITY, 0);
                texture = new Texture("DartShooter_Left.png");
            }
        }
    }

    public void render() {
        game.batch.begin();
        game.batch.draw(texture, position.x, position.y, texture.getWidth() * SCALE, texture.getHeight() * SCALE);
        game.batch.end();
    }

    public Vector2 getPosition() {
        return position;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    public boolean isUpColl() {
        return upColl;
    }

    public void setUpColl(boolean upColl) {
        this.upColl = upColl;
    }

    public boolean isDownColl() {
        return downColl;
    }

    public void setDownColl(boolean downColl) {
        this.downColl = downColl;
    }

    public boolean isLeftColl() {
        return leftColl;
    }

    public void setLeftColl(boolean leftColl) {
        this.leftColl = leftColl;
    }

    public boolean isRightColl() {
        return rightColl;
    }

    public void setRightColl(boolean rightColl) {
        this.rightColl = rightColl;
    }
}
