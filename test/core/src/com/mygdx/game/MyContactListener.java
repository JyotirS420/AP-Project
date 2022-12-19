package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
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

public class MyContactListener implements ContactListener {
    @Override
    public void beginContact(Contact contact) {
        Fixture fixA = contact.getFixtureA();
        Fixture fixB = contact.getFixtureB();
        if(fixA == null || fixB == null) return;
        if (fixA.getUserData() == "tank" && fixB.getUserData() == "bullet") {
            System.out.println("Tank hit");
            destroyBullet(fixB);
        }
        if(fixA.getUserData() == "bullet" && fixB.getUserData() == "tank") {
            System.out.println("Tank hit");
            destroyBullet(fixA);
        }
        if(fixA.getUserData() == "ground" && fixB.getUserData() == "bullet") {
            System.out.println("Bullet hit ground");
            destroyBullet(fixB);
        }
        if(fixA.getUserData() == "bullet" && fixB.getUserData() == "ground") {
            System.out.println("Bullet hit ground");
            destroyBullet(fixA);
        }
    }

    @Override
    public void endContact(Contact contact) {

    }

    @Override
    public void preSolve(Contact contact, Manifold oldManifold) {
    }

    @Override
    public void postSolve(Contact contact, ContactImpulse impulse) {
    }
    public void destroyBullet(Fixture fixture){
        fixture.getBody().destroyFixture(fixture);
    }
}
