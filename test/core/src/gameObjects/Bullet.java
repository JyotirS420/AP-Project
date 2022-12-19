package gameObjects;

public class Bullet {
    protected int damage;
    protected int launchPower;
    protected int angle;
    protected int radiusOfImpact;
    protected Position position;

    public Bullet(int damage, int launchPower, int angle, Position position, int radiusOfImpact) {
        this.damage = damage;
        this.launchPower = launchPower;
        this.angle = angle;
        this.position = position;
        this.radiusOfImpact = radiusOfImpact;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLaunchPower() {
        return launchPower;
    }

    public void setLaunchPower(int launchPower) {
        this.launchPower = launchPower;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public int getRadiusOfImpact() {
        return radiusOfImpact;
    }

    public void setRadiusOfImpact(int radiusOfImpact) {
        this.radiusOfImpact = radiusOfImpact;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    protected int calculateRadiusOfImpact() {
        return 0;
    }
    protected void shoot() {

    }
    protected void explode() {

    }
}
