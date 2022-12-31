package structural.adapter;

import structural.adapter.classadapter.SocketClassAdapterImpl;
import structural.adapter.objectadapter.SocketObjectAdapterImpl;

/**
 * Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can
 * work together. The object that joins these unrelated interface is called an Adapter.
 * <p>
 * One of the great real life example of Adapter design pattern is mobile charger. Mobile battery
 * needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India). So the mobile charger
 * works as an adapter between mobile charging socket and the wall socket. We will try to implement multi-adapter
 * using adapter design pattern in this tutorial. So first of all we will have two classes - Volt (to measure volts)
 * and Socket (producing constant volts of 120V).
 * </p>
 */

public class App {
    public static void main(String[] args) {
        testObjectAdapter();
        testClassAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();
        System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();
        System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
    }
}
