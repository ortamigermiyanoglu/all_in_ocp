package chapter15.v1_2;

import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        /*
        * Creating Finite Streams
        * */

        Stream<String> stringStream = Stream.empty();
        Stream<Integer> integerStream = Stream.of(1);
        Stream<? extends Number> doubleStream = Stream.of(1.23, 1.25f);

        var list = List.of(1,2,3);
        Stream<Integer> integerStream1 = list.stream();

        /*
         * Creating Infinite Streams
         * */

        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n->n+2);
        Stream<Integer> oddNumbersUnder100 = Stream.iterate(1, n->n<100, n->n+2);


    }
}
