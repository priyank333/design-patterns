package structural.chainforresp.demo2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<TArg> {
	private int index = 0;
	private Map<Integer, Consumer<TArg>> handlers = new HashMap<>();
	
	public int subscribe(Consumer<TArg> handler) {
		int i = index;
		handlers.put(index++, handler);
		return i;
	}
	
	public void unsubscribe(int key) {
		handlers.remove(key);
	}
	
	public void fire(TArg args) {
		for (Consumer<TArg> handler : handlers.values()) {
			handler.accept(args);
		}
	}
}
