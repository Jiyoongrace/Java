package workshop06.car;

public class CarTest {
    public static void main(String[] args) {

        Car[] cars = new Car[2];
        cars[0] = new L3("L3", 1500, 50, 25, 0);
        cars[1] = new L5("L5", 2000, 70, 35, 0);

        for (Car car : cars) {
            System.out.println(car.name + " " + car.engine + " " + car.oilTank + " " + car.oilSize + " " + car.distance + " " + car.getTempGage());
        }
        System.out.println("---------------------------------------------------------------");

        for (Car car : cars) {
            car.setOil(25);
        }

        System.out.println("25 주유");
        for (Car car : cars) {
            System.out.println(car.name + " " + car.engine + " " + car.oilTank + " " + car.oilSize + " " + car.distance + " " + car.getTempGage());
        }
        System.out.println("---------------------------------------------------------------");

        for (Car car : cars) {
            car.go(80);
        }

        System.out.println("80 주행");
        System.out.println("80 Drive:");
        System.out.println("vehicleName engineSize oilTank oilSize distance temperature");
        for (Car car : cars) {
            System.out.println(car.name + " " + car.engine + " " + car.oilTank + " " + car.oilSize + " " + car.distance + " " + car.getTempGage());
        }

    }
}
