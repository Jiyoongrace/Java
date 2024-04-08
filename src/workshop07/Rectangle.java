package workshop07;

import java.awt.Point;

public class Rectangle extends Shape implements Movable {

    // field
    private int width;

    // constructor
    Rectangle() {

    }

    public Rectangle(int width, int x, int y) {
        super(new Point(x, y));
        this.width = width;
    }

    // method
    @Override
    public void move(int x, int y) {

    }

    @Override
    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public double getCircumreference() {
        return 4 * this.width;
    }

    public String printInfo() {
        return "Rectangle\t" + this.width + '\t' + getPoint().getX() + '\t' + getPoint().getY();
    }
}
