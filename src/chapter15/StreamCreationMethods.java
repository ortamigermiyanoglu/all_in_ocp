package chapter15;

import java.util.List;
import java.util.stream.Stream;

public class StreamCreationMethods {
    /* Stream Creation Methods
    *
    * Stream.empty()
    * Stream.of(T... t)
    * collection.stream()
    * collection.parallelStream()
    * Stream.generate(Supplier<T> supplier)
    * Stream.iterate(T seed, UnaryOperator<T> next)
    * Stream.iterate(T seed, Predicate<T> hasNext, UnaryOperator<T> next)
    *
    * */





    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3);
        var stringList = List.of("semir", "ahmet", "ali");
        Stream<String> fromList = stringList.stream();
        Stream<String> fromListParallel = stringList.stream().parallel();
        Stream<Double> randoms = Stream.generate(() -> Math.random()).limit(100);
        Stream<Integer> oddNumbers = Stream.iterate(1, n->n+2).limit(100); // this iterates 100 times
        Stream<Integer> oddNumbersWithoutLimitMethod = Stream.iterate(1,n-> n<200, n->n+2); // this iterates whenever n less than 200

        //oddNumbers.forEach(System.out::println);
        oddNumbersWithoutLimitMethod.forEach(System.out::println);
        System.out.println("printing collection reference: " + stringList);
        System.out.println("printing stream reference: " + fromArray);
        Stream<String> emptyNull = Stream.generate(null);

    }
}
