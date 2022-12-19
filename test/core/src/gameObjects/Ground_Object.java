package gameObjects;

public class Ground_Object {
    private Position position;
    private int size;

    public Ground_Object(Position position, int size) {
        this.position = position;
        this.size = size;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
