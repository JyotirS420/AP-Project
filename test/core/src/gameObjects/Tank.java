package gameObjects;

public class Tank {
    protected int health;
    protected float fuel;
    protected static int speed;
    protected Position position;
    protected boolean isDead;
    protected static int maxLaunchPower;
    protected int whichSurpriseBox;

    public Tank(Position position) {
        this.health = 100;
        this.fuel = 100;
        this.position = position;
        this.isDead = false;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        Tank.speed = speed;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public static int getMaxLaunchPower() {
        return maxLaunchPower;
    }

    public static void setMaxLaunchPower(int maxLaunchPower) {
        Tank.maxLaunchPower = maxLaunchPower;
    }

    protected int getWhichSurpriseBox() {
        return whichSurpriseBox;
    }

    public void setWhichSurpriseBox(int SurpriseBox) {
        this.whichSurpriseBox = SurpriseBox;
    }
    protected void moveLeft() {

    }
    protected void moveRight() {

    }
    protected void aimUp(){

    }
    protected void aimDown(){

    }
    protected void powerIncrease(){

    }
    protected void powerDecrease(){

    }
    protected boolean isOutOfFuel(){
        return fuel == 0;
    }
    protected void shootBullet(){

    }
}
