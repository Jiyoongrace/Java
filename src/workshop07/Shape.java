package workshop07;

import java.awt.Point;

public abstract class Shape {

    // field
    protected Point point;

    // constructor
    public Shape() {

    }

    public Shape(Point point) {
        super();
        this.point = point;
    }

    // getter & setter
    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    // method
    public abstract double getArea();

    public abstract double getCircumreference();
}
