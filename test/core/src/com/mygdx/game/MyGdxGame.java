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


public class InGameScene implements Screen {
	private boolean DEBUG = false;
	private final float SCALE = 2.0f;
	private final float PPM = 32.0f;
	private Box2DDebugRenderer debugRenderer;


	private Stage stage;
	private MyGdxGame game;
	private SpriteBatch batch;
	private Texture tank1Texture,tank2Texture, backgroundTexture, groundTexture1,groundTexture2,groundTexture3,groundTexture4,groundTexture5,groundTexture6 ;
	private Image tank1Image, tank2Image, backgroundImage, groundImage1,groundImage2,groundImage3,groundImage4,groundImage5,groundImage6;
	private OrthographicCamera camera;

	private World world;
	private Body player,ground;
	private Tank tank1,tank2;
	private Body platform;


	public InGameScene(MyGdxGame game) {
		this.game = game;
		stage = new Stage(new ScreenViewport());
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		camera = new OrthographicCamera();
		camera.setToOrtho(false,  w/SCALE, h/SCALE);

		world = new World(new Vector2(0, -9.81f), false);
		debugRenderer = new Box2DDebugRenderer();

		player = createBox(-100,-100,54,28,false);
		tank1 = new Tank(player);
//        platform = createBox(50,50,64,32,false);
		//create ground
		ground = createBox(0, -167, 1280, 32, true);





		batch = new SpriteBatch();
		tank1Texture = new Texture("Tanks/Abrams_nobg_ingame.png");

		backgroundTexture = new Texture("Backgrounds/NiceForest1.png");
		backgroundImage = new Image(backgroundTexture);
		backgroundImage.setSize(4500, 1050);
		backgroundImage.setPosition(0, 0);
		stage.addActor(backgroundImage);

		groundTexture1 = new Texture("Ground.jpg");
		groundImage1 = new Image(groundTexture1);
		groundImage1.setSize(300, 200);
		groundImage1.setPosition(0, 0);
		stage.addActor(groundImage1);
		groundTexture2 = new Texture("Ground.jpg");
		groundImage2 = new Image(groundTexture2);
		groundImage2.setSize(300, 200);
		groundImage2.setPosition(300, 0);
		stage.addActor(groundImage2);
		groundTexture3 = new Texture("Ground.jpg");
		groundImage3 = new Image(groundTexture3);
		groundImage3.setSize(300, 200);
		groundImage3.setPosition(600, 0);
		stage.addActor(groundImage3);
		groundTexture4 = new Texture("Ground.jpg");
		groundImage4 = new Image(groundTexture4);
		groundImage4.setSize(300, 200);
		groundImage4.setPosition(900, 0);
		stage.addActor(groundImage4);
		groundTexture5 = new Texture("Ground.jpg");
		groundImage5 = new Image(groundTexture5);
		groundImage5.setSize(300, 200);
		groundImage5.setPosition(1200, 0);
		stage.addActor(groundImage5);
		groundTexture6 = new Texture("Ground.jpg");
		groundImage6 = new Image(groundTexture6);
		groundImage6.setSize(300, 200);
		groundImage6.setPosition(1500, 0);
		stage.addActor(groundImage6);
	}

	private Body createBody(ChainShape groundShape, int i, int i1, boolean b) {
		BodyDef bodyDef = new BodyDef();
		bodyDef.type = BodyDef.BodyType.StaticBody;
		bodyDef.position.set(i, i1);
		Body body = world.createBody(bodyDef);
		body.createFixture(groundShape, 0.0f);
		groundShape.dispose();
		return body;
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		update(Gdx.graphics.getDeltaTime());
		ScreenUtils.clear(0, 0, 0.2f, 1);
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(delta);
		stage.draw();
		batch.begin();
		batch.draw(tank1Texture, player.getPosition().x * PPM - 28, player.getPosition().y * PPM - 28);
		batch.end();
		debugRenderer.render(world, camera.combined.scl(PPM));
	}

	@Override
	public void resize(int width, int height) {
		camera.setToOrtho(false, width/SCALE, height/SCALE);

	}

	public void update(float delta) {
		world.step(1/60f, 6, 2);
		inputUpdate(delta);
		cameraUpdate(delta);
		batch.setProjectionMatrix(camera.combined);
	}

	public void inputUpdate(float delta) {
		int horizontalForce = 0;
		int verticalForce = 0;
		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
			horizontalForce -= 1;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
			horizontalForce += 1;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
			verticalForce -= 1;
		}
		if(Gdx.input.isKeyPressed(Input.Keys.UP)) {
			verticalForce += 1;
			player.applyForceToCenter(0, -300, false);
		}
		player.setLinearVelocity(horizontalForce * 5, verticalForce * 5);
	}

	public void cameraUpdate(float delta) {
		Vector2 position = ground.getPosition();
		camera.position.set(0, 0, 0);
		camera.update();
	}

	public Body createBox(int x, int y, int width, int height, boolean isStatic) {
		Body body;
		BodyDef bodyDef = new BodyDef();
		if(isStatic) {
			bodyDef.type = BodyDef.BodyType.StaticBody;
		}
		else {
			bodyDef.type = BodyDef.BodyType.DynamicBody;
		}
		bodyDef.position.set(x/PPM, y/PPM);
		bodyDef.fixedRotation = true;
		body = world.createBody(bodyDef);

		PolygonShape shape = new PolygonShape();
		shape.setAsBox(width/2/PPM, height/2/PPM);

		body.createFixture(shape, 1.0f);
		shape.dispose();

		return body;
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
		world.dispose();
		debugRenderer.dispose();
		batch.dispose();
	}

}
