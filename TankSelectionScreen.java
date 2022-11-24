package Screens;
//package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.*;
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
    Texture img, coalitionImg, groundImg1,groundImg2, getGroundImg3, logoImg, backgroundpurpleImg, backgroundmaroonImg, chooseyourtankImg, coalitiontextImg, skygradientImg;
    Texture gobuttonImg, backbuttonImg, leftarrowImg, rightarrowImg;
    MyGdxGame game;

    public TankSelectionScreen(MyGdxGame game) {
        this.game = game;
    }
    float x=60, y=60;
    float xCoalition = 15; float yCoalition = 18;
    //float xCoaltionText = 40; float yCoalitionText = 300;
    float xCoaltionText = -10; float yCoalitionText = 175;
    float xGround1 = 0;float yGround1 = -10;
    float xGround2 = 100;float yGround2 = -10;
    float xGround3 = 200;float yGround3 = -10;
    float xLogo = 5;float yLogo = 365;
    float xPurpleBackground = 0;float yPurpleBackground = 0;
    float xMaroonBackground = 0;float yMaroonBackground = 0;
    float xchooseyourtank = 400;float ychooseyourtank = 320;
    float xGo = 420;float yGo = 190;
    float xBack = 420;float yBack = 90;
    float xLeftArrow = 5;float yLeftArrow = 200;
    float xRightArrow = 357;float yRightArrow = 200;
    float xSkygradient = 237;float ySkygradient =5;

    public void create () {
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void show() {

        //img = new Texture("badlogic.jpg");
        coalitionImg = new Texture("Coalition_nobg.png");
        groundImg1 = new Texture("ground.png");
        groundImg2 = new Texture("ground.png");
        getGroundImg3 = new Texture("ground.png");
        logoImg = new Texture("Tank_Stars_Logo_nobg_ingame.png");
        backgroundpurpleImg = new Texture("Purplebg1.jpeg");
        //backgroundmaroonImg = new Texture("Maroonbg.jpeg");
        backgroundmaroonImg = new Texture("Mountain.png");
        chooseyourtankImg = new Texture("SelectYourTank.png");
        coalitiontextImg = new Texture("Coalition_Text3.png");
        gobuttonImg = new Texture("GoButton.png");
        backbuttonImg = new Texture("BackButton.png");
        leftarrowImg = new Texture("LeftArrow.png");
        rightarrowImg = new Texture("RightArrow.png");
        skygradientImg = new Texture("SkyGradient1.png");
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
        game.batch.begin();
        //game.batch.draw(backgroundpurpleImg, xPurpleBackground, yPurpleBackground);
        game.batch.draw(backgroundmaroonImg, xMaroonBackground, yMaroonBackground);
        //game.batch.draw(img, x, y);
        game.batch.draw(coalitionImg, xCoalition, yCoalition);
        game.batch.draw(groundImg1, xGround1, yGround1);
        game.batch.draw(groundImg2, xGround2, yGround2);
        game.batch.draw(getGroundImg3, xGround3, yGround3);
        game.batch.draw(logoImg, xLogo, yLogo);
        game.batch.draw(skygradientImg, xSkygradient, ySkygradient);
        game.batch.draw(chooseyourtankImg, xchooseyourtank, ychooseyourtank);
        game.batch.draw(coalitiontextImg, xCoaltionText, yCoalitionText);

        game.batch.draw(gobuttonImg, xGo, yGo);
        game.batch.draw(backbuttonImg, xBack, yBack);
        game.batch.draw(leftarrowImg, xLeftArrow, yLeftArrow);
        game.batch.draw(rightarrowImg, xRightArrow, yRightArrow);

        game.batch.end();

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
