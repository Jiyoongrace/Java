package workshop06.car;

public class L5 extends Car implements Temp{

    public L5() {
    }

    public L5(String name, int engine, int oilTank, int oilSize, int distance) {
        super(name, engine, oilTank, oilSize, distance);
    }

    @Override
    public void go(int distance) {
        this.distance += distance;
        this.oilSize -= distance;
        if (distance == 8)
            getTempGage();
    }

    @Override
    public void setOil(int distance) {
        this.oilSize += oilSize;
    }

    @Override
    public int getTempGage() {
        return distance / 10 * 2;
    }
}
