package com.shooter.game.Sprites;

import static com.shooter.game.Screens.PlayScreen.SCALE;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.shooter.game.Game;

public class Dart {

    private Texture dartPic;

    private Vector2 position;
    private String direction;

    private boolean shot;

    public static final int VELOCITY = 8;

    private Game game;

    public Dart(Vector2 position, String direction, Game game) {
        this.position = position;
        this.game = game;
        this.direction = direction;
    }

    private void shoot() {
        if (shot && direction.equals("UP")) {
            position.add(0, VELOCITY);
        }
    }

    public void render() {
        game.batch.begin();
        if (direction.equals("UP")) {
            dartPic = new Texture("Dart.png");
            game.batch.draw(dartPic, position.x + 8*SCALE - dartPic.getWidth() * 2, position.y + 16*SCALE,
                    dartPic.getWidth() * SCALE, dartPic.getHeight() * SCALE);
            //shoot();
        }
        if (direction.equals("DOWN")) {
            dartPic = new Texture("Dart_Down.png");
            game.batch.draw(dartPic, position.x + 8*SCALE - dartPic.getWidth() * 2, position.y - 8*SCALE,
                    dartPic.getWidth() * SCALE, dartPic.getHeight() * SCALE);
        }
        if (direction.equals("LEFT")) {
            dartPic = new Texture("Dart_Left.png");
            game.batch.draw(dartPic, position.x  - 4 * SCALE - dartPic.getWidth() * 2, position.y + 6*SCALE,
                    dartPic.getWidth() * SCALE, dartPic.getHeight() * SCALE);
        }
        if (direction.equals("RIGHT")) {
            dartPic = new Texture("Dart_Right.png");
            game.batch.draw(dartPic, position.x  + 20 * SCALE - dartPic.getWidth() * 2, position.y + 6*SCALE,
                    dartPic.getWidth() * SCALE, dartPic.getHeight() * SCALE);
        }
        game.batch.end();
    }

    public boolean isShot() {
        return shot;
    }

    public void setShot(boolean shot) {
        this.shot = shot;
    }

    public Vector2 getPosition() {
        return position;
    }
}
