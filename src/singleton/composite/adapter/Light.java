package singleton.composite.adapter;

public class Light implements Device {
    public Light(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        // TODO Print that the light is on
    }

    @Override
    public void turnOff() {
        // TODO Print that the light is off
    }

    @Override
    public String getName() {
        return name;
    }

    private final String name;
}
