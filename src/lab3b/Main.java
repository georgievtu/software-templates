package lab3b;

import lab3b.decorator.BasicDrone;
import lab3b.decorator.Drone;
import lab3b.decorator.LoggingDrone;

public class Main {
    public static void main(String[] args) {
        // Good weather - should use Visual strategy
        Drone drone = new BasicDrone(true);
        drone.operate(100);

        // Bad weather - should use GPS strategy
        // This drone should log timestamps
        LoggingDrone loggingDrone = new LoggingDrone(new BasicDrone(false));
        loggingDrone.operate(100);
    }
}
