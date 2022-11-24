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



public class MainMenuScreen implements Screen {

    private Stage stage;
    int flag = 0;
    private Label outputLabel;
    private Sound bulletSound = Gdx.audio.newSound(Gdx.files.internal("bulletSound.mp3"));
    Texture img, abramImg, groundImg1,groundImg2, getGroundImg3, logoImg, backgroundpurpleImg, backgroundmaroonImg, bulletImg, mainmenuImg,skygradientImg;
    Texture newgamebuttonImg, loadgamebuttonImg, quitgamebuttonImg;
    MyGdxGame game;

    public MainMenuScreen(MyGdxGame game) {
        this.game = game;
    }
    float x=60, y=60;
    float xAbram = 10; float yAbram = 18;
    float xGround1 = 0;float yGround1 = -10;
    float xGround2 = 100;float yGround2 = -10;
    float xGround3 = 200;float yGround3 = -10;
    float xLogo = 70;float yLogo = 275;
    float xPurpleBackground = 0;float yPurpleBackground = 0;
    float xMaroonBackground = 0;float yMaroonBackground = 0;
    float xBullet = 325;float yBullet = 195;
    float xMainmenu = 440;float yMainmenu = 345;
    float xNewgame = 420;float yNewgame = 245;
    float xLoadgame = 420;float yLoadgame = 145;
    float xQuitgame = 420;float yQuitgame = 45;
    float xSkygradient = 237;float ySkygradient =5;


    public void create () {
        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void show() {
//        stage = new Stage(new ScreenViewport());
//        Gdx.input.setInputProcessor(stage);
//        int Help_Guides = 12;
//        int row_height = Gdx.graphics.getWidth() / 12;
//        int col_width = Gdx.graphics.getWidth() / 12;
//
//        //Skin mySkin = new Skin(Gdx.files.internal("glassy-ui.json"));
//        Skin mySkin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
//        Label title = new Label("Buttons with Skins",mySkin,"big-black");
//        title.setSize(Gdx.graphics.getWidth(),row_height*2);
//        title.setPosition(0,Gdx.graphics.getHeight()-row_height*2);
//        title.setAlignment(Align.center);
//        stage.addActor(title);
//
//        // Button
//        Button button1 = new Button(mySkin,"small");
//        button1.setSize(col_width*4,row_height);
//        button1.setPosition(col_width,Gdx.graphics.getHeight()-row_height*3);
//        button1.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Press a Button");
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Pressed Button");
//                return true;
//            }
//        });
//        stage.addActor(button1);
//
//        // Text Button
//        Button button2 = new TextButton("Text Button",mySkin,"small");
//        button2.setSize(col_width*4,row_height);
//        button2.setPosition(col_width*7,Gdx.graphics.getHeight()-row_height*3);
//        button2.addListener(new InputListener(){
//            @Override
//            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Press a Button");
//            }
//            @Override
//            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
//                outputLabel.setText("Pressed Text Button");
//                return true;
//            }
//        });
//        stage.addActor(button2);
//
//        outputLabel = new Label("Press a Button",mySkin,"black");
//        outputLabel.setSize(Gdx.graphics.getWidth(),row_height);
//        outputLabel.setPosition(0,row_height);
//        outputLabel.setAlignment(Align.center);
//        stage.addActor(outputLabel);


        //img = new Texture("badlogic.jpg");
        abramImg = new Texture("Abrams_nobg.png");
        groundImg1 = new Texture("ground.png");
        groundImg2 = new Texture("ground.png");
        getGroundImg3 = new Texture("ground.png");
        logoImg = new Texture("Tank_Stars_Logo_nobg.png");
        backgroundpurpleImg = new Texture("Purplebg1.jpeg");
        //backgroundmaroonImg = new Texture("Maroonbg.jpeg");
        //backgroundmaroonImg = new Texture("Forest2.png");
        backgroundmaroonImg = new Texture("Mountain.png");
        bulletImg = new Texture("bullet.png");
        mainmenuImg = new Texture("MainMenu.png");
        newgamebuttonImg = new Texture("NewGameButton.png");
        loadgamebuttonImg = new Texture("LoadGameButton.png");
        quitgamebuttonImg = new Texture("QuitGameButton.png");
        skygradientImg = new Texture("SkyGradient1.png");
    }

    @Override
    public void render(float delta) {
        //set color of screen to space purple
        //ScreenUtils.clear(66F, 28F, 82F, 1);

//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //ScreenUtils.clear(Color.PURPLE);
        ScreenUtils.clear(0, 0, 0, 1);
        //set screen background as a texture

        //stage.addActor(new Image(backgroundImg));
        game.batch.begin();
        //game.batch.draw(backgroundpurpleImg, xPurpleBackground, yPurpleBackground);
        game.batch.draw(backgroundmaroonImg, xMaroonBackground, yMaroonBackground);
        //game.batch.draw(img, x, y);
        game.batch.draw(abramImg, xAbram, yAbram);
        game.batch.draw(groundImg1, xGround1, yGround1);
        game.batch.draw(groundImg2, xGround2, yGround2);
        game.batch.draw(getGroundImg3, xGround3, yGround3);
        game.batch.draw(logoImg, xLogo, yLogo);

        game.batch.draw(skygradientImg, xSkygradient, ySkygradient);
        game.batch.draw(mainmenuImg, xMainmenu, yMainmenu);
        game.batch.draw(newgamebuttonImg, xNewgame, yNewgame);
        game.batch.draw(loadgamebuttonImg, xLoadgame, yLoadgame);
        game.batch.draw(quitgamebuttonImg, xQuitgame, yQuitgame);
        game.batch.draw(bulletImg, xBullet, yBullet);

        //make the bullet disappear after 1 second

        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            if(xBullet==325){
                flag = 1;
                long id = bulletSound.play(0.3f);
                bulletSound.setPitch(id, 1);
                bulletSound.setLooping(id, false);
            }

            //xBullet = 325;
        }

        if(flag==1) {
            xBullet += 4;
        }
        if (xBullet > 730) {
            xBullet = 325;
            flag = 0;
        }

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
        abramImg.dispose();
        groundImg1.dispose();
        groundImg2.dispose();
        getGroundImg3.dispose();
        logoImg.dispose();
        backgroundpurpleImg.dispose();
        backgroundmaroonImg.dispose();
    }
}
