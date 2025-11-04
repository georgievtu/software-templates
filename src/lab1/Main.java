package lab1;

import lab1.observer.IntObserver;
import lab1.observer.ObservableInt;
import lab1.observer.Observer;

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
