package com.shooter.game;

import static com.shooter.game.Screens.PlayScreen.SCALE;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.shooter.game.Game;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {

	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setWindowedMode(208*SCALE, 208*SCALE);
		config.setWindowIcon("Icon.png");
		config.setTitle("Shooter");
		new Lwjgl3Application(new Game(), config);
	}
}
