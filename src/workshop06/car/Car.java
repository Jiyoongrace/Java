package workshop06.car;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public abstract class Car {

    // field
    public String name;
    public int engine;
    public int oilTank;
    public int oilSize;
    public int distance;

    // constructor
    public Car() {
    }

    public Car(String name, int engine, int oilTank, int oilSize, int distance) {
        this.name = name;
        this.engine = engine;
        this.oilTank = oilTank;
        this.oilSize = oilSize;
        this.distance = distance;
    }

    // method
    public abstract void go(int distance);
    public abstract void setOil(int distance);
    public abstract int getTempGage();
}
