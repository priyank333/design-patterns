package structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Flyweight design pattern is a Structural design pattern like Facade pattern, Adapter Pattern and Decorator pattern.
 * Flyweight design pattern is used when we need to create a lot of Objects of a class.
 * Since every object consumes memory space that can be crucial for low memory devices,
 * such as mobile devices or embedded systems, flyweight design pattern can be applied to reduce the load on memory by
 * sharing objects. Before we apply flyweight design pattern, we need to consider following factors:
 * 1. The number of Objects to be created by application should be huge.
 * 2. The object creation is heavy on memory, and it can be time-consuming too.
 * 3. The object properties can be divided into intrinsic and extrinsic properties, extrinsic properties of an Object
 * should be defined by the client program.
 */
public class User {
    private static List<String> nameList = new ArrayList<>();
    private int[] names;

    public User(String fullName) {
        Function<String, Integer> getOrAdd = (String s) -> {
            int idx = nameList.indexOf(s);
            if (idx != -1) {
                return idx;
            } else {
                nameList.add(s);
                return nameList.size() - 1;
            }
        };
        names = Arrays.stream(fullName.split(" ")).mapToInt(
                (s) -> getOrAdd.apply(s)).toArray();
    }

    public String getFullName() {
        return Arrays.stream(names).mapToObj(i -> nameList.get(i))
                .collect(Collectors.joining(","));
    }
}
