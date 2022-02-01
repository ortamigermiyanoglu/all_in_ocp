package chapter15.functionalprogrammingrevisited;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class UsingCommonIntermediateOperations {
    {
        Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println("----------------------FILTER----------------------");
        Stream<String> s1Filtered = s1.filter(x->x.startsWith("m"));

        System.out.println("----------------------SKIP & LIMIT----------------------");
        Stream<Integer> s2 = Stream.iterate(1, n-> n+1);
        Stream<Integer> s2SkippedLimited = s2.skip(5).limit(2);

        System.out.println("----------------------MAP----------------------");
        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<Integer> integerStream = s3.map(String::length);

        System.out.println("----------------------FLATMAP----------------------");
        List<String> empty = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> s4 = Stream.of(empty, one, two);
        Stream<String> a = s4.flatMap(Collection::stream);

        System.out.println("----------------------SORTED----------------------");
        Stream<String> s5 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> s5Sorted = s5.sorted();

        Stream<String> s6 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> s6Sorted = s6.sorted(Comparator.reverseOrder());

        System.out.println("----------------------PEEK----------------------");
        Stream<String> s7 = Stream.of("black bear", "brown bear", "grizzly");
        Stream<String> s7filtered = s7.filter(s -> s.startsWith("b")).peek(System.out::println);

    }

    public static void main(String[] args) {
        new UsingCommonIntermediateOperations();
    }
}
