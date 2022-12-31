package creational.abstractfactory;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class HotDrinkMachine {
    public enum AvailableDrink {
        TEA, COFFEE
    }

    private Map<AvailableDrink, IHotDrinkFactory> factories = new HashMap<>();
    private List<Pair<String, IHotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() {

        // option 1: use an enum
        for (AvailableDrink availableDrink : AvailableDrink.values()) {
            String s = availableDrink.toString();
            String factoryName = "" + Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase() + "Factory";
            try {
                Class<?> factory = Class.forName("creational.abstractfactory." + factoryName);
                factories.put(availableDrink, (IHotDrinkFactory) factory.getDeclaredConstructor().newInstance());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }

        // option 2: find all implementors of IHotDrinkFactory
        Set<Class<? extends IHotDrinkFactory>> types = new Reflections("creational.abstractfactory").getSubTypesOf(IHotDrinkFactory.class);
        for (Class<? extends IHotDrinkFactory> type : types) {
            try {
                namedFactories.add(new ImmutablePair<>(
                        type.getSimpleName().replace("Factory", ""),
                        type.getDeclaredConstructor().newInstance()));
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public IHotDrink makeDrink(AvailableDrink drink, int amount) {
        return factories.get(drink).prepare(amount);
    }

    public IHotDrink makeDrink() {
        System.out.println("Available drinks");
        for (int index = 0; index < namedFactories.size(); ++index) {
            Pair<String, IHotDrinkFactory> item = namedFactories.get(index);
            System.out.println("" + index + ": " + item.getLeft());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i, amount;
            try {
                if ((s = reader.readLine()) != null
                        && (i = Integer.parseInt(s)) >= 0
                        && i < namedFactories.size()) {
                    System.out.println("Specify amount: ");
                    s = reader.readLine();
                    if (s != null
                            && (amount = Integer.parseInt(s)) > 0) {
                        return namedFactories.get(i).getRight().prepare(amount);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Incorrect input, try again.");
        }
    }
}
