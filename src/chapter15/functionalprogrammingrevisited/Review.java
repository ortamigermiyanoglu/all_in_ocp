package chapter15.functionalprogrammingrevisited;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Review {
    {
        LongStream.of(6L, 8L, 10L).mapToInt(x->(int)x)
                .boxed().collect(Collectors.groupingBy(Function.identity()))
                .keySet().stream().collect(Collectors.averagingInt(x->x));




    }

    public static void main(String[] args) {
        new Review();
    }
}
