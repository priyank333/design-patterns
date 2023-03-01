package behavioral.observer.demo2;

public interface Subject {
	public void register(Observer observer);
	public void unregister(Observer observer);
	public void notifyObservers();
	public Object getUpdates(Observer observer);
}
