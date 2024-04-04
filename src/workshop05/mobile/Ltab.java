package workshop05.mobile;

public class Ltab extends Mobile {

    // constructor
    public Ltab() {
    }

    public Ltab(String mobileName, int batterySize, String osType) {
        super(mobileName, batterySize, osType);
    }

    @Override
    public int operate(int time) {
        batterySize -= 10 * time;
        return batterySize;
    }

    @Override
    public int charge(int time) {
        batterySize += 10 * time;
        return batterySize;
    }
}
