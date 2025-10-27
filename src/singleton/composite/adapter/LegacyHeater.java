package singleton.composite.adapter;

// This class does not implement Device
// Adapter is required
public class LegacyHeater {
    public LegacyHeater(String name) {
        this.name = name;
    }

    public void enable() {
        // TODO Print that the heater is on
    }

    public void disable() {
        // TODO Print that the heater is off
    }

    public String getName() {
        return name;
    }

    private final String name;
}
