package singleton.composite.adapter;

public class AirConditioner implements Device {
    public AirConditioner(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        // TODO Print that the AC is on
    }

    @Override
    public void turnOff() {
        // TODO Print that the AC is off
    }

    @Override
    public String getName() {
        return name;
    }

    private final String name;
}
