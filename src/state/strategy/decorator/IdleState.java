package state.strategy.decorator;

public class IdleState implements DroneState {
    @Override
    public void handle(DroneContext context, double distance) {
        // TODO Set the navigation strategy based on the weather
        // TODO Good weather -> Use Visual navigation
        // TODO Bad weather -> Use GPS navigation
        // TODO Then set the state to flying
    }
}
