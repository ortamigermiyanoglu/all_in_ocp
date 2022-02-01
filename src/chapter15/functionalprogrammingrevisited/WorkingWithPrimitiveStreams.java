package chapter15.functionalprogrammingrevisited;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WorkingWithPrimitiveStreams {
    {
        System.out.println("----------------------SAMPLE 1----------------------");
        Stream<Integer> s1 = Stream.of(1,2,3);
        IntStream i1 = s1.mapToInt(Integer::valueOf);
        System.out.println(i1.sum());

        System.out.println("\n----------------------SAMPLE 2----------------------");
        IntStream i2 = IntStream.rangeClosed(1,8);
        System.out.println(i2.average().getAsDouble());

        System.out.println("\n----------------------SAMPLE 3----------------------");
        IntStream i3 = IntStream.of(1,2,3);
        Stream<Integer> s2 = i3.boxed();

        System.out.println("\n----------------------SAMPLE 4----------------------");





    }

    public static void main(String[] args) {
        new WorkingWithPrimitiveStreams();
    }
}
