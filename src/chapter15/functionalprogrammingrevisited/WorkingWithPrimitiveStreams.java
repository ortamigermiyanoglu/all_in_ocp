package chapter15.functionalprogrammingrevisited;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;
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
        DoubleStream.iterate(.5, d->d/2).limit(3).forEach(System.out::println);

        System.out.println("\n----------------------SAMPLE 5----------------------");
        BooleanSupplier booleanSupplier = ()->true;
        System.out.print(booleanSupplier.getAsBoolean());


        System.out.println("\n----------------------SAMPLE 6----------------------");
        DoubleConsumer doubleConsumer = (a) -> {} ;
        doubleConsumer.accept(5.3);

        System.out.println("\n----------------------SAMPLE 7----------------------");
        DoublePredicate doublePredicate = (d) -> d<83;
        doublePredicate.test(14);

        System.out.println("\n----------------------SAMPLE 8----------------------");

    }

    public static void main(String[] args) {
        new WorkingWithPrimitiveStreams();
    }
}
