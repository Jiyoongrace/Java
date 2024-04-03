package javaexam2.plane;

public class Airplane extends Plane{

    // constructor
    public Airplane() {
    }

    public Airplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    public void flight(int distance) {
        fuelSize -= (distance * 3);
    }
}
