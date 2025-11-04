package lab3b.decorator;

import lab3b.state.DroneContext;

public class BasicDrone implements Drone {
    public BasicDrone(boolean goodWeather) {
        this.context = new DroneContext(goodWeather);
    }

    @Override
    public void operate(double distance) {
        // Cycle the states
        context.cycle(distance); // Idle > Flying
        context.cycle(distance); // Flying > Idle
    }

    private final DroneContext context;
}
