package week08d01;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void increaseX(){
        x++;
    }
    void decreaseX(){
        x--;
    }
    void increaseY(){
        y++;
    }
    void decreaseY(){
        y--;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
