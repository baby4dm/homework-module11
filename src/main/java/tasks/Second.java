package tasks;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Second {
    public static List<String> changeList(List<String> list){
        return list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .toList();
    }
}
