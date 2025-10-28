package state.strategy.decorator;

public interface DroneState {
    void handle(DroneContext context, double distance);
}
