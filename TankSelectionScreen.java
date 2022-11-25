package Screens;
//package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.MyGdxGame;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.utils.viewport.ScreenViewport;


public class TankSelectionScreen implements Screen {

    private Stage stage;
    private Label outputLabel;
    private Sound bulletSound = Gdx.audio.newSound(Gdx.files.internal("bulletSound.mp3"));
    Texture img, coalitionImg, groundImg1,groundImg2, getGroundImg3, groundImg4, logoImg, backgroundpurpleImg, backgroundmaroonImg, chooseyourtankImg, coalitiontextImg, skygradientImg;
    Texture gobuttonImg, backbuttonImg, leftarrowImg, rightarrowImg;
    private Game game;

    //create a batch
    SpriteBatch batch = new SpriteBatch();

    Sprite coalitionSprite, groundSprite1, groundSprite2, groundSprite3, groundSprite4, logoSprite, backgroundpurpleSprite, backgroundmaroonSprite, chooseyourtankSprite, coalitiontextSprite, skygradientSprite;
    Sprite gobuttonSprite, backbuttonSprite, leftarrowSprite, rightarrowSprite;

    public TankSelectionScreen(Game game) {
        this.game = game;
    }
    float x=60, y=60;
    float xCoalition = 15; float yCoalition = 10;
    //float xCoaltionText = 40; float yCoalitionText = 300;
    float xCoaltionText = -15; float yCoalitionText = 202;
    float xGround1 = 0;float yGround1 = -10;
    float xGround2 = 100;float yGround2 = -10;
    float xGround3 = 200;float yGround3 = -10;
    float xGround4 = 300;float yGround4 = -10;
    float xLogo = 120;float yLogo = 343;
    float xPurpleBackground = 0;float yPurpleBackground = 0;
    float xMaroonBackground = -100;float yMaroonBackground = 0;
    float xchooseyourtank = 442;float ychooseyourtank = 295;
    float xGo = 457;float yGo = 185;
    float xBack = 457;float yBack = 85;
    float xLeftArrow = 5;float yLeftArrow = 205;
    float xRightArrow = 375;float yRightArrow = 205;
    float xSkygradient = 400;float ySkygradient =0;

    public void create () {
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void show() {

        //img = new Texture("badlogic.jpg");
        coalitionImg = new Texture("CoalitionNew.png");
        groundImg1 = new Texture("Ground.jpg");
        groundImg2 = new Texture("Ground.jpg");
        getGroundImg3 = new Texture("Ground.jpg");
        groundImg4 = new Texture("Ground.jpg");
        logoImg = new Texture("Tank_Stars_Logo_nobg.png");
        backgroundpurpleImg = new Texture("Purplebg1.jpeg");
        //backgroundmaroonImg = new Texture("Maroonbg.jpeg");
        //backgroundmaroonImg = new Texture("Mountain.png");
        backgroundmaroonImg = new Texture("M1.jpeg");
        chooseyourtankImg = new Texture("SelectYourTankText.png");
        coalitiontextImg = new Texture("CoalitionText1.png");
        gobuttonImg = new Texture("GoButton1.png");
        backbuttonImg = new Texture("BackButton1.png");
        leftarrowImg = new Texture("LArrow.png");
        rightarrowImg = new Texture("RArrow.png");
        //skygradientImg = new Texture("SkyGradient1.png");
        skygradientImg = new Texture("2.png");

        coalitionSprite = new Sprite(coalitionImg);
        coalitionSprite.setSize(350, 350);
        coalitionSprite.setPosition(xCoalition, yCoalition);

        groundSprite1 = new Sprite(groundImg1);
        groundSprite1.setSize(100, 120);
        groundSprite1.setPosition(xGround1, yGround1);

        groundSprite2 = new Sprite(groundImg2);
        groundSprite2.setSize(100, 120);
        groundSprite2.setPosition(xGround2, yGround2);

        groundSprite3 = new Sprite(getGroundImg3);
        groundSprite3.setSize(100, 120);
        groundSprite3.setPosition(xGround3, yGround3);

        groundSprite4 = new Sprite(groundImg4);
        groundSprite4.setSize(100, 120);
        groundSprite4.setPosition(xGround4, yGround4);

        logoSprite = new Sprite(logoImg);
        logoSprite.setSize(140, 140);
        logoSprite.setPosition(xLogo, yLogo);

        backgroundpurpleSprite = new Sprite(backgroundpurpleImg);
        backgroundpurpleSprite.setSize(800, 600);
        backgroundpurpleSprite.setPosition(xPurpleBackground, yPurpleBackground);

        backgroundmaroonSprite = new Sprite(backgroundmaroonImg);
        backgroundmaroonSprite.setSize(800, 600);
        backgroundmaroonSprite.setPosition(xMaroonBackground, yMaroonBackground);

        chooseyourtankSprite = new Sprite(chooseyourtankImg);
        chooseyourtankSprite.setSize(175, 150);
        chooseyourtankSprite.setPosition(xchooseyourtank, ychooseyourtank);

        coalitiontextSprite = new Sprite(coalitiontextImg);
        coalitiontextSprite.setSize(400, 200);
        coalitiontextSprite.setPosition(xCoaltionText, yCoalitionText);

        gobuttonSprite = new Sprite(gobuttonImg);
        gobuttonSprite.setSize(135, 60);
        gobuttonSprite.setPosition(xGo, yGo);

        backbuttonSprite = new Sprite(backbuttonImg);
        backbuttonSprite.setSize(135, 60);
        backbuttonSprite.setPosition(xBack, yBack);

        leftarrowSprite = new Sprite(leftarrowImg);
        leftarrowSprite.setSize(25, 25);
        leftarrowSprite.setPosition(xLeftArrow, yLeftArrow);

        rightarrowSprite = new Sprite(rightarrowImg);
        rightarrowSprite.setSize(25, 25);
        rightarrowSprite.setPosition(xRightArrow, yRightArrow);

        skygradientSprite = new Sprite(skygradientImg);
        skygradientSprite.setSize(250, 600);
        skygradientSprite.setPosition(xSkygradient, ySkygradient);

    }

    @Override
    public void render(float delta) {
        //set color of screen to space purple
        //ScreenUtils.clear(66F, 28F, 82F, 1);

//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //ScreenUtils.clear(Color.BLUE);
        //set color of screen to dark blue
        ScreenUtils.clear(0F, 0F, 0F, 1);
        //set screen background as a texture


        //stage.addActor(new Image(backgroundImg));
        batch.begin();

        backgroundpurpleSprite.draw(batch);
        backgroundmaroonSprite.draw(batch);
        skygradientSprite.draw(batch);
        groundSprite1.draw(batch);
        groundSprite2.draw(batch);
        groundSprite3.draw(batch);
        groundSprite4.draw(batch);
        coalitionSprite.draw(batch);
        logoSprite.draw(batch);
        chooseyourtankSprite.draw(batch);
        coalitiontextSprite.draw(batch);
        gobuttonSprite.draw(batch);
        backbuttonSprite.draw(batch);
        leftarrowSprite.draw(batch);
        rightarrowSprite.draw(batch);



//        //game.batch.draw(backgroundpurpleImg, xPurpleBackground, yPurpleBackground);
//        batch.draw(backgroundmaroonImg, xMaroonBackground, yMaroonBackground);
//        //game.batch.draw(img, x, y);
//        batch.draw(coalitionImg, xCoalition, yCoalition);
//        batch.draw(groundImg1, xGround1, yGround1);
//        batch.draw(groundImg2, xGround2, yGround2);
//        batch.draw(getGroundImg3, xGround3, yGround3);
//        batch.draw(logoImg, xLogo, yLogo);
//        batch.draw(skygradientImg, xSkygradient, ySkygradient);
//        batch.draw(chooseyourtankImg, xchooseyourtank, ychooseyourtank);
//        batch.draw(coalitiontextImg, xCoaltionText, yCoalitionText);
//
//        batch.draw(gobuttonImg, xGo, yGo);
//        batch.draw(backbuttonImg, xBack, yBack);
//        batch.draw(leftarrowImg, xLeftArrow, yLeftArrow);
//        batch.draw(rightarrowImg, xRightArrow, yRightArrow);

        batch.end();

//        stage.act();
//        stage.draw();
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
        coalitionImg.dispose();
        groundImg1.dispose();
        groundImg2.dispose();
        getGroundImg3.dispose();
        logoImg.dispose();
        backgroundpurpleImg.dispose();
        backgroundmaroonImg.dispose();
    }
}
