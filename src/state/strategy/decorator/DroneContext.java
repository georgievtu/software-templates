package state.strategy.decorator;

public class DroneContext {
    public DroneContext(boolean goodWeather) {
        // Initial state is Idle
        this.state = new IdleState();
        this.goodWeather = goodWeather;
    }

    public void setState(DroneState state) {
        this.state = state;
    }

    public void setNavigationStrategy(NavigationStrategy strategy) {
        this.strategy = strategy;
    }

    public NavigationStrategy getNavigationStrategy() {
        return strategy;
    }

    public boolean isGoodWeather() {
        return goodWeather;
    }

    public void cycle(double distance) {
        state.handle(this, distance);
    }

    private DroneState state;
    private NavigationStrategy strategy;
    private final boolean goodWeather;
}
