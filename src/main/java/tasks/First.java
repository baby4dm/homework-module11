package tasks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class First {
    public static String printName(List<String> names){
        return names.stream()
                .filter(s -> names.indexOf(s) % 2 != 0)
                .map(s -> names.indexOf(s) + "." + s)
                .collect(Collectors.joining(", "));

    }
}
