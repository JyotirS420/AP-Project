package Screens;
//package com.mygdx.game;

import com.badlogic.gdx.*;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.scenes.scene2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.*;
import com.mygdx.game.MyGdxGame;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.game.SimpleButton;


public class MainMenuScreen implements Screen {

    private Stage stage;
    private Texture myTexture;
    private TextureRegion myTextureRegion;
    private TextureRegionDrawable myTexRegionDrawable;
    private ImageButton button;
    int flag = 0;
    private Label outputLabel;
    private Sound bulletSound = Gdx.audio.newSound(Gdx.files.internal("bulletSound.mp3"));
    Texture img, abramImg, groundImg1,groundImg2, getGroundImg3, logoImg, backgroundpurpleImg, backgroundmaroonImg, bulletImg, mainmenuImg,skygradientImg;
    Texture newgamebuttonImg, loadgamebuttonImg, quitgamebuttonImg;


    Sprite abramSprite, groundSprite1, groundSprite2, groundSprite3, logoSprite, backgroundpurpleSprite, backgroundmaroonSprite, bulletSprite, mainmenuSprite,skygradientSprite;
    Sprite newgamebuttonSprite, loadgamebuttonSprite, quitgamebuttonSprite;
    SpriteBatch batch = new SpriteBatch();

    //add a button
    //private Button button;
    private Skin skin;
    private TextureAtlas buttonAtlas;
    private TextButton.TextButtonStyle textButtonStyle;
    private BitmapFont font;

    private Game game;
    public MainMenuScreen(Game game) {
        this.game = game;
    }
    float x=60, y=60;
    float xAbram = 10; float yAbram = 18;
    float xGround1 = 0;float yGround1 = -10;
    float xGround2 = 100;float yGround2 = -10;
    float xGround3 = 200;float yGround3 = -10;
    float xLogo = 70;float yLogo = 275;
    float xPurpleBackground = 0;float yPurpleBackground = 0;
    float xMaroonBackground = -100;float yMaroonBackground = 0;
    float xBullet = 325;float yBullet = 195;
    float xMainmenu = 450;float yMainmenu = 335;
    float xNewgame = 460;float yNewgame = 245;
    float xLoadgame = 460;float yLoadgame = 145;
    float xQuitgame = 460;float yQuitgame = 45;
    float xSkygradient = 400;float ySkygradient =0;


    public void create () {
        myTexture = new Texture(Gdx.files.internal("NewGameButton1.png"));
        myTextureRegion = new TextureRegion(myTexture);
        myTexRegionDrawable = new TextureRegionDrawable(myTextureRegion);
        button = new ImageButton(myTexRegionDrawable); //Set the button up

        stage = new Stage(new ScreenViewport()); //Set up a stage for the ui
        stage.addActor(button); //Add the button to the stage to perform rendering and take input.
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

//        Gdx.input.setInputProcessor(new InputAdapter() {
//            @Override
//            public boolean keyDown(int keyCode) {
//                if (keyCode == Input.Keys.SPACE) {
//                    game.setScreen(new TankSelectionScreen(game));
//                }
//                return true;
//            }
//        });


        abramImg = new Texture("Abrams_nobg.png");
        groundImg1 = new Texture("Ground.jpg");
        groundImg2 = new Texture("Ground.jpg");
        getGroundImg3 = new Texture("Ground.jpg");
        logoImg = new Texture("Tank_Stars_Logo_nobg.png");
        backgroundpurpleImg = new Texture("Purplebg1.jpeg");
        //backgroundmaroonImg = new Texture("Maroonbg.jpeg");
        //backgroundmaroonImg = new Texture("Forest2.png");
        //backgroundmaroonImg = new Texture("Mountain.png");
        backgroundmaroonImg = new Texture("M1.jpeg");
        bulletImg = new Texture("bullet.png");
        mainmenuImg = new Texture("MainMenu.png");
        newgamebuttonImg = new Texture("NewGameButton1.png");
        loadgamebuttonImg = new Texture("LoadGameButton1.png");
        quitgamebuttonImg = new Texture("QuitGameButton1.png");
        //skygradientImg = new Texture("ForestPath1.png");
        skygradientImg = new Texture("2.png");

        abramSprite = new Sprite(abramImg);
        abramSprite.setSize(340,340);
        abramSprite.setPosition(xAbram,yAbram);

        groundSprite1 = new Sprite(groundImg1);
        groundSprite1.setSize(200,120);
        groundSprite1.setPosition(xGround1,yGround1);

        groundSprite2 = new Sprite(groundImg2);
        groundSprite2.setSize(200,120);
        groundSprite2.setPosition(xGround2,yGround2);

        groundSprite3 = new Sprite(getGroundImg3);
        groundSprite3.setSize(200,120);
        groundSprite3.setPosition(xGround3,yGround3);

        logoSprite = new Sprite(logoImg);
        logoSprite.setSize(200,200);
        logoSprite.setPosition(xLogo,yLogo);

        backgroundpurpleSprite = new Sprite(backgroundpurpleImg);
        backgroundpurpleSprite.setSize(800,600);
        backgroundpurpleSprite.setPosition(xPurpleBackground,yPurpleBackground);

        backgroundmaroonSprite = new Sprite(backgroundmaroonImg);
        backgroundmaroonSprite.setSize(800,600);
        backgroundmaroonSprite.setPosition(xMaroonBackground,yMaroonBackground);

        bulletSprite = new Sprite(bulletImg);
        bulletSprite.setSize(50,35);


        mainmenuSprite = new Sprite(mainmenuImg);
        mainmenuSprite.setSize(150,125);
        mainmenuSprite.setPosition(xMainmenu,yMainmenu);

        newgamebuttonSprite = new Sprite(newgamebuttonImg);
        newgamebuttonSprite.setSize(135,60);
        newgamebuttonSprite.setPosition(xNewgame,yNewgame);

        loadgamebuttonSprite = new Sprite(loadgamebuttonImg);
        loadgamebuttonSprite.setSize(135,60);
        loadgamebuttonSprite.setPosition(xLoadgame,yLoadgame);

        quitgamebuttonSprite = new Sprite(quitgamebuttonImg);
        quitgamebuttonSprite.setSize(135,55);
        quitgamebuttonSprite.setPosition(xQuitgame,yQuitgame);

        skygradientSprite = new Sprite(skygradientImg);
        skygradientSprite.setSize(250,600);
        //skygradientSprite.setSize(250,600);
        skygradientSprite.setPosition(xSkygradient,ySkygradient);


        //if (Gdx.input.isTouched())  then change to TankSelectScreen
        //if (Gdx.input.isTouched())  then change to LoadGameScreen

//        if(Gdx.input.isKeyPressed(Input.Keys.E)){
//            game.setScreen(new TankSelectionScreen(game));
//            dispose();
//        }
//
//        SimpleButton newgamebutton = new SimpleButton(newgamebuttonImg, xNewgame, yNewgame, 135, 60) {
//            //@Override
//            public void action() {
//                game.setScreen(new TankSelectionScreen(game));
//                dispose();
//            }
//        };
//        boolean a = newgamebutton.checkIfClicked(Gdx.input.getX(), Gdx.input.getY());
//        if(a){
//            //set screen to TankSelectionScreen
//            game.setScreen(new TankSelectionScreen(game));
//            dispose();
//        }


        //stage.act(Gdx.graphics.getDeltaTime());
        //stage.draw();

//        loadgamebuttonSprite = new Sprite(loadgamebuttonImg);
//        loadgamebuttonSprite.setPosition(xLoadgame, yLoadgame);
//        loadgamebuttonSprite.setSize(200, 50);


//        Music menuMusic = Gdx.audio.newMusic(Gdx.files.internal("Storm - AShamaluevMusic.mp3"));
//        menuMusic.setLooping(true);
//        menuMusic.play();
//        menuMusic.setVolume(0.3f);


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
        batch.begin();
        //game.batch.draw(backgroundpurpleImg, xPurpleBackground, yPurpleBackground);

        backgroundpurpleSprite.draw(batch);
        backgroundmaroonSprite.draw(batch);
        skygradientSprite.draw(batch);
        abramSprite.draw(batch);
        groundSprite1.draw(batch);
        groundSprite2.draw(batch);
        groundSprite3.draw(batch);
        logoSprite.draw(batch);

        bulletSprite.draw(batch);
        mainmenuSprite.draw(batch);
        newgamebuttonSprite.draw(batch);
        loadgamebuttonSprite.draw(batch);
        quitgamebuttonSprite.draw(batch);




//        game.batch.draw(backgroundmaroonImg, xMaroonBackground, yMaroonBackground);
//
//        game.batch.draw(abramImg, xAbram, yAbram);
//        game.batch.draw(groundImg1, xGround1, yGround1);
//        game.batch.draw(groundImg2, xGround2, yGround2);
//        game.batch.draw(getGroundImg3, xGround3, yGround3);
//        game.batch.draw(logoImg, xLogo, yLogo);
//
//        game.batch.draw(skygradientImg, xSkygradient, ySkygradient);
//        game.batch.draw(mainmenuImg, xMainmenu, yMainmenu);
//        game.batch.draw(newgamebuttonImg, xNewgame, yNewgame);
//        game.batch.draw(loadgamebuttonImg, xLoadgame, yLoadgame);
//        game.batch.draw(quitgamebuttonImg, xQuitgame, yQuitgame);
//        game.batch.draw(bulletImg, xBullet, yBullet);

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

        bulletSprite.setPosition(xBullet,yBullet);

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
        abramImg.dispose();
        groundImg1.dispose();
        groundImg2.dispose();
        getGroundImg3.dispose();
        logoImg.dispose();
        backgroundpurpleImg.dispose();
        backgroundmaroonImg.dispose();
        bulletImg.dispose();
        mainmenuImg.dispose();
        newgamebuttonImg.dispose();
        loadgamebuttonImg.dispose();
        quitgamebuttonImg.dispose();
        skygradientImg.dispose();
        bulletSound.dispose();
        //stage.dispose();
        batch.dispose();
    }
}
