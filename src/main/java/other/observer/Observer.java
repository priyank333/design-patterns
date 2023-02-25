package other.observer;

public interface Observer<T> {
    void handle(PropertyChangeEventArgs<T> args);
}
