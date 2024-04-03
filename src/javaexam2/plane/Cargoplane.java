package javaexam2.plane;

public class Cargoplane extends Plane {

    // constructor
    public Cargoplane() {
    }

    public Cargoplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    public void flight(int distance) {
        fuelSize -= (distance * 5);
    }
}
