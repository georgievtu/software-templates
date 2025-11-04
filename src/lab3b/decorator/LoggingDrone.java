package lab3b.decorator;

// TODO This can be used to log the time
import java.time.LocalDateTime;

public class LoggingDrone implements Drone {
    public LoggingDrone(Drone wrappedDrone) {
        this.wrappedDrone = wrappedDrone;
    }

    @Override
    public void operate(double distance) {
        // TODO This drone should log the operation with a timestamp
    }

    private final Drone wrappedDrone;
}
