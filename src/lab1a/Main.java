package lab1a;

import lab1a.observer.IntObserver;
import lab1a.observer.ObservableInt;
import lab1a.observer.Observer;

public class Main {
    public static void main(String[] args) {
        Observer observer = new IntObserver();
        ObservableInt subject = new ObservableInt(10);

        subject.addObserver(observer);

        // This line should update the value in the "user interface"
        subject.setValue(15);

        subject.removeObserver(observer);
    }
}
