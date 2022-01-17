package chapter15.v1_2;

import java.util.List;
import java.util.stream.Stream;

public class IntroductionToIntermediateOperations {
    /*
    * Stream<T> filter(Predicate<? super T> predicate)
    * */

    /*
    * Stream<T> distinct()
    * java calls equals() method to determine whether the objects are the same
    * */


    /*
    * Stream<T> limit(long maxSize)
    * Stream<T> skip(int n)
    * */


    public static void main(String[] args) {
        List<String> names = List.of("azize","semir", "ahmet", "ali", "cabir");
        Stream<String> animals = Stream.of("monkey","gorilla", "bonobo");

        names.stream().filter(s -> !s.startsWith("a")).forEach(System.out::println);
    }


}
