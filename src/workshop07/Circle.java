//package workshop07;
//
//public class Circle extends Shape implements Movable {
//
//    // field
//    private int radius;
//
//    public Circle() {
//
//    }
//
//    public Circle(int radius, int x, int y) {
//        super(new Point(x, y));
//        this.radius = radius;
//    }
//
//    // getter & setter
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    // method
//    @Override
//    public void move(int x, int y) {
////        int cur_x = getPoint().getX();
//        int cur_y = getPoint().getY();
//
//        setPoint(new Point(cur_x + 1 + x, cur_y + 1 + y));
//    }
//
//    @Override
//    public double getArea() {
//        return Math.round(Math.pow(radius, 2) * Math.PI);
//    }
//
//    @Override
//    public double getCircumreference() {
//        return Math.round(2 * radius * Math.PI);
//    }
//
//    public String printInfo() {
//        return this.getClass().getSimpleName() + "  "		//클래스이름을 알아낼 수 있음
//                + radius + "  "
//                + getPoint().getX() + "  "
//                + getPoint().getY() + "  "
//                + getArea() + "  "
//                + getCircumreference();
//    }
//}
