package com.mygdx.game;

import Screens.InGameScreen;
import Screens.MainMenuScreen;
import Screens.PauseInGameScreen;
import Screens.TankSelectionScreen;
import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class MyGdxGame extends Game {
	public SpriteBatch batch;
	private Stage stage;
	private Game game;

	//constructor
//	public MyGdxGame(Game game) {
//		this.game = game;
//	}

	public MyGdxGame() {
		game = this;
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void setScreen(Screen screen) {
		super.setScreen(screen);
	}

	@Override
	public Screen getScreen() {
		return super.getScreen();
	}

	@Override
	public void create () {
		batch = new SpriteBatch();
		//stage.addActor(new MainMenuScreen(this));

		setScreen(new MainMenuScreen(game));
		//setScreen(new TankSelectionScreen(this));
		//setScreen(new InGameScreen(this));
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

