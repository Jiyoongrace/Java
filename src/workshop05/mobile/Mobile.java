package workshop05.mobile;

public abstract class Mobile {

    // field
    public String mobileName;
    public int batterySize;
    public String osType;

    // constructor
    public Mobile() {
    }

    public Mobile(String mobileName, int batterySize, String osType) {
        this.mobileName = mobileName;
        this.batterySize = batterySize;
        this.osType = osType;
    }

    // getter & setter
    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    // method
    public abstract int operate(int time);

    public abstract int charge(int time);
}
