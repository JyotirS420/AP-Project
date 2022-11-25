package Screens;
//package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.*;
import com.mygdx.game.MyGdxGame;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;


public class InGameScreen implements Screen {

    private Stage stage;
    private Label outputLabel;
    Texture img, abramImg, spectreImg;
    Texture groundImg1,groundImg2, groundImg3, groundImg4, groundImg5, groundImg6;
    Texture logoImg, backgroundpurpleImg, backgroundmaroonImg;
    Texture player1healthbarImg, player2healthbarImg, player1fuelbarImg, player2fuelbarImg, player1aimarrowImg, player2aimarrowImg;
    Texture player1healthtextImg, player2healthtextImg, player1fueltextImg, player2fueltextImg,pausebuttonImg, translucentbgImg;;
    MyGdxGame game;

    SpriteBatch batch;
    //make sprites for the images
    Sprite abramSprite, spectreSprite, groundSprite1, groundSprite2, groundSprite3, groundSprite4, groundSprite5, groundSprite6;
    Sprite logoSprite, backgroundpurpleSprite, backgroundmaroonSprite;
    Sprite player1healthbarSprite, player2healthbarSprite, player1fuelbarSprite, player2fuelbarSprite, player1aimarrowSprite, player2aimarrowSprite;
    Sprite player1healthtextSprite, player2healthtextSprite, player1fueltextSprite, player2fueltextSprite, pausebuttonSprite, translucentbgSprite;
    //make a camera
    OrthographicCamera camera;
    //make a viewport
    Viewport viewport;
    //make a font
    BitmapFont font;


    public InGameScreen(MyGdxGame game) {
        this.game = game;
    }
    float x=60, y=60;
    float xAbram = 20; float yAbram = 100;
    float xSpectre = 550; float ySpectre = 115;
    float xGround1 = 0;float yGround1 = -10;
    float xGround2 = 100;float yGround2 = -10;
    float xGround3 = 200;float yGround3 = -10;
    float xGround4 = 300;float yGround4 = -10;
    float xGround5 = 400;float yGround5 = -10;
    float xGround6 = 500;float yGround6 = -10;
    float xLogo = 273;float yLogo = 375;
    float xPurpleBackground = 0;float yPurpleBackground = 0;
    float xMaroonBackground = 0;float yMaroonBackground = 0;
    float xPlayer1HealthBar = -35;float yPlayer1HealthBar = 410;
    float xPlayer2HealthBar =352;float yPlayer2HealthBar = 410;
    float xPlayer1FuelBar = -7;float yPlayer1FuelBar = 350;
    float xPlayer2FuelBar = 538;float yPlayer2FuelBar = 350;
    float xPlayer1AimArrow = 130;float yPlayer1AimArrow = 155;

    float xPlayer1HealthText = 5;float yPlayer1HealthText = 430;
    float xPlayer2HealthText =535;float yPlayer2HealthText = 430;
    float xPlayer1FuelText = 5;float yPlayer1FuelText = 380;
    float xPlayer2FuelText = 580;float yPlayer2FuelText = 380;
    float xPauseButton = 580;float yPauseButton = 20;
    float xTranslucentBG = 0;float yTranslucentBG = 0;

    public void create () {
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void show() {


        //img = new Texture("badlogic.jpg");
        abramImg = new Texture("Abrams_nobg.png");
        spectreImg = new Texture("Spectre_rev_nobg.png");
        groundImg1 = new Texture("Ground.jpg");
        groundImg2 = new Texture("Ground.jpg");
        groundImg3 = new Texture("Ground.jpg");
        groundImg4 = new Texture("Ground.jpg");
        groundImg5 = new Texture("Ground.jpg");
        groundImg6 = new Texture("Ground.jpg");
        logoImg = new Texture("Tank_Stars_Logo_nobg.png");
        backgroundpurpleImg = new Texture("Purplebg1.jpeg");
        //backgroundmaroonImg = new Texture("Maroonbg_ingame.jpeg");
        //backgroundmaroonImg = new Texture("Mountain.png");
        backgroundmaroonImg = new Texture("NiceForest1.png");
        player1healthbarImg = new Texture("HealthBar.png");
        player2healthbarImg = new Texture("HealthBar.png");
        player1fuelbarImg = new Texture("FuelBar.png");
        player2fuelbarImg = new Texture("FuelBar.png");
        player1aimarrowImg = new Texture("AimArrow.png");
        player1healthtextImg = new Texture("HealthText.png");
        player2healthtextImg = new Texture("HealthText.png");
        player1fueltextImg = new Texture("FuelText.png");
        player2fueltextImg = new Texture("FuelText.png");
        pausebuttonImg = new Texture("PauseButton.png");
        translucentbgImg = new Texture("TranslucentBG.png");

        //make sprites for the images
        abramSprite = new Sprite(abramImg);
        abramSprite.setSize(50,50);

        spectreSprite = new Sprite(spectreImg);
        spectreSprite.setSize(50,30);

        groundSprite1 = new Sprite(groundImg1);
        groundSprite1.setSize(10,10);
        groundSprite1.setPosition(xGround1,yGround1);

        groundSprite2 = new Sprite(groundImg2);
        groundSprite2.setSize(100,10);
        groundSprite2.setPosition(xGround2,yGround2);

        groundSprite3 = new Sprite(groundImg3);
        groundSprite3.setSize(100,10);
        groundSprite3.setPosition(xGround3,yGround3);

        groundSprite4 = new Sprite(groundImg4);
        groundSprite4.setSize(100,10);
        groundSprite4.setPosition(xGround4,yGround4);

        groundSprite5 = new Sprite(groundImg5);
        groundSprite5.setSize(100,10);
        groundSprite5.setPosition(xGround5,yGround5);

        groundSprite6 = new Sprite(groundImg6);
        groundSprite6.setSize(100,10);
        groundSprite6.setPosition(xGround6,yGround6);

        logoSprite = new Sprite(logoImg);
        logoSprite.setSize(100,100);
        logoSprite.setPosition(xLogo,yLogo);

        backgroundpurpleSprite = new Sprite(backgroundpurpleImg);
        backgroundpurpleSprite.setSize(3000,1000);
        backgroundpurpleSprite.setPosition(xPurpleBackground,yPurpleBackground);

        backgroundmaroonSprite = new Sprite(backgroundmaroonImg);
        backgroundmaroonSprite.setSize(600,400);
        backgroundmaroonSprite.setPosition(xMaroonBackground,yMaroonBackground);

        player1healthbarSprite = new Sprite(player1healthbarImg);
        player1healthbarSprite.setSize(300,30);
        player1healthbarSprite.setPosition(xPlayer1HealthBar,yPlayer1HealthBar);

        player2healthbarSprite = new Sprite(player2healthbarImg);
        player2healthbarSprite.setSize(300,30);
        player2healthbarSprite.setPosition(xPlayer2HealthBar,yPlayer2HealthBar);

        player1fuelbarSprite = new Sprite(player1fuelbarImg);
        player1fuelbarSprite.setSize(120,40);
        player1fuelbarSprite.setPosition(xPlayer1FuelBar,yPlayer1FuelBar);

        player2fuelbarSprite = new Sprite(player2fuelbarImg);
        player2fuelbarSprite.setSize(120,40);
        player2fuelbarSprite.setPosition(xPlayer2FuelBar,yPlayer2FuelBar);

        player1healthtextSprite = new Sprite(player1healthtextImg);
        player1healthtextSprite.setSize(110,45);
        player1healthtextSprite.setPosition(xPlayer1HealthText,yPlayer1HealthText);

        player2healthtextSprite = new Sprite(player2healthtextImg);
        player2healthtextSprite.setSize(100,45);
        player2healthtextSprite.setPosition(xPlayer2HealthText,yPlayer2HealthText);

        player1fueltextSprite = new Sprite(player1fueltextImg);
        player1fueltextSprite.setSize(50,35);
        player1fueltextSprite.setPosition(xPlayer1FuelText,yPlayer1FuelText);

        player2fueltextSprite = new Sprite(player2fueltextImg);
        player2fueltextSprite.setSize(50,35);
        player2fueltextSprite.setPosition(xPlayer2FuelText,yPlayer2FuelText);

        pausebuttonSprite = new Sprite(pausebuttonImg);
        pausebuttonSprite.setSize(40,40);
        pausebuttonSprite.setPosition(xPauseButton,yPauseButton);

    }

    @Override
    public void render(float delta) {
        //set color of screen to space purple
        //ScreenUtils.clear(66F, 28F, 82F, 1);
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        ScreenUtils.clear(Color.PURPLE);
        //set screen background as a texture


        //stage.addActor(new Image(backgroundImg));
        game.batch.begin();
        //game.batch.draw(backgroundpurpleImg, xPurpleBackground, yPurpleBackground);
        game.batch.draw(backgroundmaroonImg, xMaroonBackground, yMaroonBackground);
        //game.batch.draw(img, x, y);

        //game.batch.draw(abramImg, xAbram, yAbram);
        //game.batch.draw(spectreImg, xSpectre, ySpectre);
        //backgroundmaroonSprite.draw(game.batch);
        abramSprite.draw(game.batch);
        spectreSprite.draw(game.batch);

//        groundSprite1.draw(game.batch);
//        groundSprite2.draw(game.batch);
//        groundSprite3.draw(game.batch);
//        groundSprite4.draw(game.batch);
//        groundSprite5.draw(game.batch);
//        groundSprite6.draw(game.batch);

        logoSprite.draw(game.batch);
        player1healthbarSprite.draw(game.batch);
        player2healthbarSprite.draw(game.batch);
        player1fuelbarSprite.draw(game.batch);
        player2fuelbarSprite.draw(game.batch);
        player1healthtextSprite.draw(game.batch);
        player2healthtextSprite.draw(game.batch);
        player1fueltextSprite.draw(game.batch);
        player2fueltextSprite.draw(game.batch);
        pausebuttonSprite.draw(game.batch);


        game.batch.draw(groundImg1, xGround1, yGround1);
        game.batch.draw(groundImg2, xGround2, yGround2);
        game.batch.draw(groundImg3, xGround3, yGround3);
        game.batch.draw(groundImg4, xGround4, yGround4);
        game.batch.draw(groundImg5, xGround5, yGround5);
        game.batch.draw(groundImg6, xGround6, yGround6);


//        game.batch.draw(groundImg1, xGround1, yGround1);
//        game.batch.draw(groundImg2, xGround2, yGround2);
//        game.batch.draw(groundImg3, xGround3, yGround3);
//        game.batch.draw(groundImg4, xGround4, yGround4);
//        game.batch.draw(groundImg5, xGround5, yGround5);
//        game.batch.draw(groundImg6, xGround6, yGround6);
//        game.batch.draw(logoImg, xLogo, yLogo);
//        game.batch.draw(player1healthbarImg, xPlayer1HealthBar, yPlayer1HealthBar);
//        game.batch.draw(player2healthbarImg, xPlayer2HealthBar, yPlayer2HealthBar);
//        game.batch.draw(player1fuelbarImg, xPlayer1FuelBar, yPlayer1FuelBar);
//        game.batch.draw(player2fuelbarImg, xPlayer2FuelBar, yPlayer2FuelBar);
//        game.batch.draw(player1healthtextImg, xPlayer1HealthText, yPlayer1HealthText);
//        game.batch.draw(player2healthtextImg, xPlayer2HealthText, yPlayer2HealthText);
//        game.batch.draw(player1fueltextImg, xPlayer1FuelText, yPlayer1FuelText);
//        game.batch.draw(player2fueltextImg, xPlayer2FuelText, yPlayer2FuelText);
        //game.batch.draw(pausebuttonImg, xPauseButton, yPauseButton);

        //game.batch.draw(player1aimarrowImg, xPlayer1AimArrow, yPlayer1AimArrow);
        //game.batch.draw(translucentbgImg, xTranslucentBG, yTranslucentBG);


        //roatate the aim arrow
        //player1aimarrowImg.

        //if key is pressed then move the tank abrams
        if(Gdx.input.isKeyPressed(Input.Keys.D)) {
            xAbram += 1;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.A)) {
            xAbram -= 1;
        }

        //if key is pressed then move the tank spectre
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            xSpectre -= 1;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            xSpectre += 1;
        }
        abramSprite.setPosition(xAbram,yAbram);
        spectreSprite.setPosition(xSpectre,ySpectre);

        game.batch.end();


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
        img.dispose();
        abramImg.dispose();
        spectreImg.dispose();
        groundImg1.dispose();
        groundImg2.dispose();
        groundImg3.dispose();
        groundImg4.dispose();
        groundImg5.dispose();
        groundImg6.dispose();
        logoImg.dispose();
        backgroundpurpleImg.dispose();
        backgroundmaroonImg.dispose();
        player1healthbarImg.dispose();
        player2healthbarImg.dispose();
        player1fuelbarImg.dispose();
        player2fuelbarImg.dispose();
        player1healthtextImg.dispose();
        player2healthtextImg.dispose();
        player1fueltextImg.dispose();
        player2fueltextImg.dispose();
        player1aimarrowImg.dispose();
        translucentbgImg.dispose();
        pausebuttonImg.dispose();
        batch.dispose();

    }
}
