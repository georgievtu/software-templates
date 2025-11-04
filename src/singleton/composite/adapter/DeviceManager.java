package singleton.composite.adapter;

import java.util.ArrayList;
import java.util.List;

public class DeviceManager {
    // Singleton
    public static DeviceManager getInstance() {
        // TODO Return the instance
        return null;
    }

    // TODO Make this thread-safe
    public void addDevice(Device d) {
        // TODO Add the device
    }

    // TODO Make this thread-safe
    public void activateAll() {
        // TODO Activate the devices
    }

    // TODO Make this thread-safe
    public void deactivateAll() {
        // TODO Deactivate the devices
    }

    // Private constructor
    // Only called once
    private DeviceManager() {
        devices = new ArrayList<>();
    }

    // Holder idiom
    // Guaranteed thread-safe static initializer
    private static class Holder {
        // TODO Initialize the single instance of DeviceManager
        private static final DeviceManager INSTANCE = null;
    }

    private final List<Device> devices;
}
