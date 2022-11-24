package com.mygdx.game;

import Screens.InGameScreen;
import Screens.MainMenuScreen;
import Screens.PauseInGameScreen;
import Screens.TankSelectionScreen;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends Game {
	public SpriteBatch batch;



	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MainMenuScreen(this));
		//setScreen(new InGameScreen(this));
		//setScreen(new TankSelectionScreen(this));
		//setScreen(new PauseInGameScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose () {
		batch.dispose();
	}
}
