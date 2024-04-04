package workshop06.shape;

public class Triangle extends Shape implements Resize {

    // constructor
    public Triangle() {
    }

    public Triangle(int width, int height, String colors) {
        super(width, height, colors);
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public void setSize(int size) {
        height += size;
    }
}
