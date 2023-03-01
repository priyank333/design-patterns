package behavioral.observer;

public interface Observer<T> {
    void handle(PropertyChangeEventArgs<T> args);
}
