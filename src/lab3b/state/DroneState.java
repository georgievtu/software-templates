package lab3b.state;

public interface DroneState {
    void handle(DroneContext context, double distance);
}
