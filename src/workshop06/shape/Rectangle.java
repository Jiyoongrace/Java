package workshop06.shape;

public class Rectangle extends Shape implements Resize {

    // constructor
    public Rectangle() {
    }

    public Rectangle(int width, int height, String colors) {
        super(width, height, colors);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void setSize(int size) {
        width += size;
    }
}
