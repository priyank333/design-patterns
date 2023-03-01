package behavioral.observer.demo2;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

	private List<Observer> observers;
	private String message;
	private Boolean isChanged;
	private final Object MUTEX = new Object();
	
	
	
	public MyTopic() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		synchronized (MUTEX) {
			if (!observers.contains(observer)) {
				observers.add(observer);
			}
		}
		
	}

	@Override
	public void unregister(Observer observer) {
		// TODO Auto-generated method stub
		synchronized (MUTEX) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		List<Observer> observersLocal = null;
		synchronized (MUTEX) {
			if (!isChanged) return;
			observersLocal = new ArrayList<>(observers);
			this.isChanged = false;
		}
		if (observersLocal != null) {
			for(Observer observer : observersLocal) {
				observer.update();
			}
		}
	}

	@Override
	public Object getUpdates(Observer observer) {
		// TODO Auto-generated method stub
		return this.message;
	}

	public void postMessage(String message) {
		System.out.println("Message posted to topic : " + message);
		this.message = message;
		this.isChanged = true;
		notifyObservers();
	}
}
