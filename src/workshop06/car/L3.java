package workshop06.car;

public class L3 extends Car implements Temp{
    public L3() {
    }

    public L3(String name, int engine, int oilTank, int oilSize, int distance) {
        super(name, engine, oilTank, oilSize, distance);
    }

    @Override
    public void go(int distance) {
        this.distance += distance;
        this.oilSize -= distance;
        if (distance == 10)
            getTempGage();
    }

    @Override
    public void setOil(int distance) {
        this.oilSize += oilSize;
    }

    @Override
    public int getTempGage() {
        return distance / 10;
    }
}
