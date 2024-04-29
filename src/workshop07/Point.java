package workshop07;

public class Point {

    // field
    private int x;
    private int y;

    // constructor
    public Point() {

    }

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    // field가 private 이므로 getter & setter가 필요하다.
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
