package behavioral.observer.demo1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<TArgs> {
    private int count = 0;
    private Map<Integer, Consumer<TArgs>> handlers = new HashMap<>();

    public void fire(TArgs tArgs) {
        for (Consumer<TArgs> handler : handlers.values()) {
            handler.accept(tArgs);
        }
    }

    public Subscription addHandler(Consumer<TArgs> consumer) {
        int i = count++;
        handlers.put(i, consumer);
        return new Subscription(this, i);
    }

    public class Subscription implements AutoCloseable {

        private Event<TArgs> event;
        private int id;

        public Subscription(Event<TArgs> event, int id) {
            this.event = event;
            this.id = id;
        }

        @Override
        public void close() throws Exception {
            event.handlers.remove(id);
        }
    }
}
