package tasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fifth {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list1 = first.toList();
        List<T> list2 = second.toList();
        List<T> result = new ArrayList<>();

        int maxLength = Math.max(list1.size(), list2.size());

        Stream.iterate(0, n -> n + 1)
                .limit(maxLength)
                .forEach(n -> {
                    if (n < list1.size()) result.add(list1.get(n));
                    if (n < list2.size()) result.add(list2.get(n));
                });

        return result.stream();
    }
}
