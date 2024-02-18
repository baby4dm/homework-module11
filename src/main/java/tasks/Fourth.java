package tasks;

import java.util.stream.Stream;

public class Fourth {

    public static Stream<Long> generator(long a, long c, long m){
        return Stream.iterate(0L,  x -> (a * x + c) % m);
    }
}
