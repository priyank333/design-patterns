package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public void subscribe(Observer<T> observer) {
        observers.add(observer);
    }

    protected void propertyChange(T source, String propertyName, Object newValue) {
        for (Observer observer : observers) {
            observer.handle(new PropertyChangeEventArgs(source, propertyName, newValue));
        }
    }
}
