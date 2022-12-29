package abstractfactory;

import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {

    private List<Pair> namedFactories;

    public HotDrinkMachine() {
        namedFactories = new ArrayList<>();
        Set<Class<? extends IHotDrinkFactory>> types = new Reflections("abstractfactory")
                .getSubTypesOf(IHotDrinkFactory.class);
        types.forEach(type -> {
            try {
                namedFactories.add(new Pair(type.getSimpleName().replace("Factory", ""),
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
        });
    }

    public IHotDrink makeDrink() throws IOException {
        System.out.println("Available drinks");
        int count = 1;
        for (Pair pair : namedFactories) {
            System.out.println(count++ + ". " + pair.name);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i, amount;
            if ((s = reader.readLine()) != null
                    && (i = Integer.parseInt(s)) >= 0
                    && i < namedFactories.size()) {
                System.out.println("Specify amount: ");
                s = reader.readLine();
                if (s != null
                        && (amount = Integer.parseInt(s)) > 0) {
                    return namedFactories.get(i).iHotDrinkFactory.prepare(amount);
                }
            }
            System.out.println("Incorrect input, try again.");
        }
    }
}

