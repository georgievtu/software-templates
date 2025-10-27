package singleton.composite.adapter;

public class LegacyHeaterAdapter implements Device {
    public LegacyHeaterAdapter(LegacyHeater legacyHeater) {
        // TODO Initialize the field
    }

    @Override
    public void turnOn() {
        // TODO Call the corresponding method from legacyHeater
    }

    @Override
    public void turnOff() {
        // TODO Call the corresponding method from legacyHeater
    }

    @Override
    public String getName() {
        // TODO Call the corresponding method from legacyHeater
        return null;
    }

    // TODO Create a LegacyHeater field
    // TODO Use LegacyHeater internally but provide interface methods from Device
}
