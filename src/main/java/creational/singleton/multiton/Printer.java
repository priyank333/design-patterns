package creational.singleton.multiton;

import java.util.HashMap;
import java.util.Map;

public class Printer {
    private static final Map<Subsystem, Printer> multitonObjects = new HashMap<>();
    private static int instanceCount = 0;

    private Printer() {
        instanceCount++;
        System.out.println("Total objects is created : " + instanceCount);
    }

    public static Printer getInstance(Subsystem subsystem) {
        if (!multitonObjects.containsKey(subsystem)) {
            multitonObjects.put(subsystem, new Printer());
        }
        return multitonObjects.get(subsystem);
    }
}
