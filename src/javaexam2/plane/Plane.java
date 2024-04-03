package javaexam2.plane;

public abstract class Plane {

    // field
    public String planeName;
    public int fuelSize;

    // constructor

    public Plane() {
    }

    public Plane(String planeName, int fuelSize) {
        this.planeName = planeName;
        this.fuelSize = fuelSize;
    }

    // getter & setter

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public int getFuelSize() {
        return fuelSize;
    }

    public void setFuelSize(int fuelSize) {
        this.fuelSize = fuelSize;
    }

    // method
    public void refuel(int fuel) { // 주유
        fuelSize += fuel;
    }

    public abstract void flight(int distance); // 운항
}
