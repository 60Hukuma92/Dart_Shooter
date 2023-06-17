package com.shooter.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class SoundPlayer {
    public static Music theme = Gdx.audio.newMusic(Gdx.files.internal("33 Ladies of the Woods.mp3"));


    public static void play() {
        theme.setVolume(0.2f);
        theme.setLooping(true);
        theme.play();
    }
}
