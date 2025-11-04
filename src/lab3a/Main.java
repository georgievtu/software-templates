package lab3a;

import lab3a.adapter.LegacyHeater;
import lab3a.adapter.LegacyHeaterAdapter;
import lab3a.composite.AirConditioner;
import lab3a.composite.Device;
import lab3a.composite.DeviceGroup;
import lab3a.composite.Light;
import lab3a.singleton.DeviceManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            final String threadName = Thread.currentThread().getName();

            DeviceManager deviceManager = DeviceManager.getInstance();

            // Composite usage
            DeviceGroup group = new DeviceGroup("Group " + threadName);
            group.addDevice(new Light("Light " + threadName));
            group.addDevice(new AirConditioner("AC " + threadName));

            // Adapter usage
            Device legacyHeater = new LegacyHeaterAdapter(new LegacyHeater("Heater " + threadName));

            // Add device group
            deviceManager.addDevice(group);
            // Add single device
            deviceManager.addDevice(legacyHeater);

            deviceManager.activateAll();
            deviceManager.deactivateAll();
        };

        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executor.submit(task);
        }
        executor.shutdown();
    }
}
