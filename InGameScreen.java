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

    public InGameScreen(MyGdxGame game) {
        this.game = game;
    }
    float x=60, y=60;
    float xAbram = 40; float yAbram = 100;
    float xSpectre = 530; float ySpectre = 117;
    float xGround1 = 0;float yGround1 = -10;
    float xGround2 = 100;float yGround2 = -10;
    float xGround3 = 200;float yGround3 = -10;
    float xGround4 = 300;float yGround4 = -10;
    float xGround5 = 400;float yGround5 = -10;
    float xGround6 = 500;float yGround6 = -10;
    float xLogo = 270;float yLogo = 370;
    float xPurpleBackground = 0;float yPurpleBackground = 0;
    float xMaroonBackground = 0;float yMaroonBackground = 0;
    float xPlayer1HealthBar = 0;float yPlayer1HealthBar = 400;
    float xPlayer2HealthBar =420;float yPlayer2HealthBar = 400;
    float xPlayer1FuelBar = 10;float yPlayer1FuelBar = 365;
    float xPlayer2FuelBar = 490;float yPlayer2FuelBar = 365;
    float xPlayer1AimArrow = 130;float yPlayer1AimArrow = 155;

    float xPlayer1HealthText = 28;float yPlayer1HealthText = 435;
    float xPlayer2HealthText =512;float yPlayer2HealthText = 435;
    float xPlayer1FuelText = 35;float yPlayer1FuelText = 385;
    float xPlayer2FuelText = 565;float yPlayer2FuelText = 385;
    float xPauseButton = 580;float yPauseButton = 20;
    float xTranslucentBG = 0;float yTranslucentBG = 0;

    public void create () {
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void show() {


        //img = new Texture("badlogic.jpg");
        abramImg = new Texture("Abrams_nobg_ingame.png");
        spectreImg = new Texture("Spectre_rev_nobg_ingame.png");
        groundImg1 = new Texture("ground.png");
        groundImg2 = new Texture("ground.png");
        groundImg3 = new Texture("ground.png");
        groundImg4 = new Texture("ground.png");
        groundImg5 = new Texture("ground.png");
        groundImg6 = new Texture("ground.png");
        logoImg = new Texture("Tank_Stars_Logo_nobg_ingame.png");
        backgroundpurpleImg = new Texture("Purplebg1.jpeg");
        //backgroundmaroonImg = new Texture("Maroonbg_ingame.jpeg");
        //backgroundmaroonImg = new Texture("Mountain.png");
        backgroundmaroonImg = new Texture("NiceForest.png");
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
        game.batch.draw(abramImg, xAbram, yAbram);
        game.batch.draw(spectreImg, xSpectre, ySpectre);
        game.batch.draw(groundImg1, xGround1, yGround1);
        game.batch.draw(groundImg2, xGround2, yGround2);
        game.batch.draw(groundImg3, xGround3, yGround3);
        game.batch.draw(groundImg4, xGround4, yGround4);
        game.batch.draw(groundImg5, xGround5, yGround5);
        game.batch.draw(groundImg6, xGround6, yGround6);
        game.batch.draw(logoImg, xLogo, yLogo);
        game.batch.draw(player1healthbarImg, xPlayer1HealthBar, yPlayer1HealthBar);
        game.batch.draw(player2healthbarImg, xPlayer2HealthBar, yPlayer2HealthBar);
        game.batch.draw(player1fuelbarImg, xPlayer1FuelBar, yPlayer1FuelBar);
        game.batch.draw(player2fuelbarImg, xPlayer2FuelBar, yPlayer2FuelBar);
        game.batch.draw(player1healthtextImg, xPlayer1HealthText, yPlayer1HealthText);
        game.batch.draw(player2healthtextImg, xPlayer2HealthText, yPlayer2HealthText);
        game.batch.draw(player1fueltextImg, xPlayer1FuelText, yPlayer1FuelText);
        game.batch.draw(player2fueltextImg, xPlayer2FuelText, yPlayer2FuelText);
        //game.batch.draw(player1aimarrowImg, xPlayer1AimArrow, yPlayer1AimArrow);
        //game.batch.draw(translucentbgImg, xTranslucentBG, yTranslucentBG);
        game.batch.draw(pausebuttonImg, xPauseButton, yPauseButton);

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

    }
}
