package workshop06.shape;

public abstract class Shape {

    // field
    public int width;
    public int height;
    public String colors;

    // constructor

    public Shape() {
    }

    public Shape(int width, int height, String colors) {
        this.width = width;
        this.height = height;
        this.colors = colors;
    }

    // method
    public abstract double getArea();
}
