package lab1.observer;

import java.util.List;

public class ObservableInt implements Observable {
    public ObservableInt(int value) {
        // TODO Initialize the value and the list
    }

    @Override
    public void addObserver(Observer o) {
        // TODO Add the observer to the list
    }

    @Override
    public void removeObserver(Observer o) {
        // TODO Remove the observer from the list
    }

    @Override
    public void notifyObservers() {
        // TODO Update all observers
    }

    public void setValue(int value) {
        // TODO Set the value and notify the observers
    }

    private int value;
    private List<Observer> observers;
}
