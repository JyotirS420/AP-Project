package Screens;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.MyGdxGame;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import Classes.*;


public class InGameScene implements Screen {
    private boolean DEBUG = false;
    private final float SCALE = 2.0f;
    private final float PPM = 32.0f;
    private Box2DDebugRenderer debugRenderer;


    private Stage stage;
    private MyGdxGame game;
    private SpriteBatch batch;
    private Texture tank1Texture,tank2Texture,bullet1Texture,bullet2Texture;
    private Texture backgroundTexture, groundTexture1,groundTexture2;
    private Image tank1Image, tank2Image,bullet1Image, bullet2Image;
    private Image backgroundImage, groundImage1,groundImage2;

    private OrthographicCamera camera;

    private World world;
    private Body player1,player2, bullet1, bullet2;
    private Body ground,leftWall,rightWall;
    private Tank tank1,tank2;
    private BulletMine bulletMine1,bulletMine2;


    public InGameScene(MyGdxGame game, String typetank1, String typetank2) {
        this.game = game;
        //world and debugRenderer
        world = new World(new Vector2(0, -98.1f), false);
        debugRenderer = new Box2DDebugRenderer();
        this.world.setContactListener(new MyContactListener());
        stage = new Stage(new ScreenViewport());
        float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();


        //camera
        camera = new OrthographicCamera();
        camera.setToOrtho(false,  w/SCALE, h/SCALE);



        //players and tanks
        //player1 = createBox(-400,-100,54,28,false);
        tank1 = new Tank(world,-400,-100,54,28);

        //player2 = createBox(400,100,54,28,false);
        tank2 = new Tank(world,400,100,54,28);
        bulletMine1 = new BulletMine(world,-400,-400,10,10);
//        bullet1 = createBox(-400,-400,10,10,false);


        //create ground
        ground = createBox(0, -202, 1280, 100, true);
        //add friction to ground
        ground.getFixtureList().get(0).setFriction(0.5f);

        //create left wall and right wall
        leftWall = createBox(-470, 0, 32, 720, true);
        rightWall = createBox(470, 0, 32, 720, true);



        batch = new SpriteBatch();

        //depending on the type of tank, the texture is loaded
        if(typetank1.equals("Abrams")){
            tank1Texture = new Texture("Tanks/Abrams_nobg.png");
        }
        else if(typetank1.equals("Coalition")){
            tank1Texture = new Texture("Tanks/Coalition_nobg.png");
        }
        else{
            tank1Texture = new Texture("Tanks/Spectre_nobg.png");
        }
        if(typetank2.equals("Abrams")){
            tank2Texture = new Texture("Tanks/Abrams_nobg_rev.png");
        }
        else if(typetank2.equals("Coalition")){
            tank2Texture = new Texture("Tanks/Coalition_nobg_rev.png");
        }
        else{
            tank2Texture = new Texture("Tanks/Spectre_rev_nobg.png");
        }

//        tank1Texture = new Texture("Tanks/Abrams_nobg.png");
//        tank2Texture = new Texture("Tanks/Coalition_nobg_rev.png");
        bullet1Texture = new Texture("Bullets/bullet1.png");
//        bullet2Texture = new Texture("Tanks/bullet.png");


        tank1Texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        tank2Texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        tank1Image = new Image(tank1Texture);
        tank2Image = new Image(tank2Texture);
        bullet1Image = new Image(bullet1Texture);
//        bullet2Image = new Image(bullet2Texture);
        tank1Image.setSize(60,60);
        tank2Image.setSize(60,60);
        bullet1Image.setSize(10,10);
//        bullet2Image.setSize(20,20);

        backgroundTexture = new Texture("Backgrounds/NiceForest1.png");
        backgroundImage = new Image(backgroundTexture);
        backgroundImage.setSize(4500, 1050);
        backgroundImage.setPosition(0, 0);
        stage.addActor(backgroundImage);

        groundTexture1 = new Texture("Ground.jpg");
        groundImage1 = new Image(groundTexture1);
        groundImage1.setSize(900, 200);
        groundImage1.setPosition(0, 0);
        stage.addActor(groundImage1);
        groundTexture2 = new Texture("Ground.jpg");
        groundImage2 = new Image(groundTexture2);
        groundImage2.setSize(900, 200);
        groundImage2.setPosition(900, 0);
        stage.addActor(groundImage2);




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

        //stage for static images
        stage.act(delta);
        stage.draw();

        //batch for dynamic images
        batch.begin();
//        batch.draw(tank1Texture, player1.getPosition().x * PPM - 28, player1.getPosition().y * PPM - 28);
//        batch.draw(tank2Texture, player2.getPosition().x * PPM - 28, player2.getPosition().y * PPM - 28);


        //draw tank1Image
        tank1Image.setPosition(tank1.getBody().getPosition().x * PPM - 28, tank1.getBody().getPosition().y * PPM - 28);
        tank1Image.draw(batch, 1);
        //draw tank2Image
        tank2Image.setPosition(tank2.getBody().getPosition().x * PPM - 28, tank2.getBody().getPosition().y * PPM - 28);
        tank2Image.draw(batch, 1);

        //draw bullet1Image
        bullet1Image.setPosition(bulletMine1.getBody().getPosition().x * PPM - 5, bulletMine1.getBody().getPosition().y * PPM - 5);
        bullet1Image.draw(batch, 1);

//        //if bullet1 hits the ground, destroy it
//        if(bullet1.getPosition().y < -180|| bullet1.getPosition().x < -450 ||bullet1.getPosition().x > 450){
//            world.destroyBody(bullet1);
//        }

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
        float horizontalForce = 0F;
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            horizontalForce -= 1;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            horizontalForce += 1;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            //change bullet1's position to corner of tank1's turret
            bulletMine1.getBody().setTransform(tank1.getBody().getPosition().x + 1, tank1.getBody().getPosition().y + 1, 0);
            //shoot bullet1 in the direction of tank1's turret along a parabola
            bulletMine1.getBody().applyLinearImpulse(20F, 20F, bulletMine1.getBody().getPosition().x, bulletMine1.getBody().getPosition().y, true);

        }
        //apply force to player1
        tank1.getBody().applyForceToCenter(horizontalForce * 100, 0, true);

        //if bullet hits the ground, destroy it
        if(bulletMine1.getBody().getPosition().y < -180|| bulletMine1.getBody().getPosition().x < -450 ||bulletMine1.getBody().getPosition().x > 450){
            world.destroyBody(bulletMine1.getBody());
        }

    }

    public void cameraUpdate(float delta) {
        //fixing the camera
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
