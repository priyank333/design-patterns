package structural.flyweight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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
