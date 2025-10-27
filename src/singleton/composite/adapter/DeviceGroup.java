package singleton.composite.adapter;

import java.util.ArrayList;
import java.util.List;

// Devices can be grouped as part of the composite pattern
public class DeviceGroup implements Device {
    public DeviceGroup(String name) {
        this.devices = new ArrayList<>();
        this.name = name;
    }

    public void addDevice(Device d) {
        // TODO Add the device to the group
    }

    public void removeDevice(Device d) {
        // TODO Remove the device from the group
    }

    @Override
    public void turnOn() {
        // TODO Print that the group is on
        // TODO Then turn on the devices
    }

    @Override
    public void turnOff() {
        // TODO Print that the group is off
        // TODO Then turn off the devices
    }

    @Override
    public String getName() {
        return name;
    }

    private final String name;
    private final List<Device> devices;
}
