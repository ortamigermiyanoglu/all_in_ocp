package chapter15.functionalprogrammingrevisited;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingCommonTerminalOperations {

    {
        Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
        long caunt = s1.count();

        Stream<String> s2 = Stream.of("monkey", "gorilla", "bonobo");
        Optional<String> minS2 = s2.min((w1,w2)-> w1.length() - w2.length());

        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        Optional<String> maxS3 = s3.max(Comparator.comparing(String::length));


        Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
        Optional<String> s4FindAny = s4.findAny();

        Stream<String> s5 = Stream.of("monkey", "gorilla", "bonobo");
        boolean s5noneMatch = s5.noneMatch(s->s.length()==8);

        Stream<String> s6 = Stream.of("monkey", "gorilla", "bonobo");
        boolean s6AnyMatch = s6.anyMatch(s->s.startsWith("bo"));

        Stream<String> s7 = Stream.of("monkey", "gorilla", "bonobo");
        s7.forEach(System.out::println);

        /*
        * T reduce(T identity, BinaryOperator<T> accumulator)
        * Optional<T> reduce(BinaryOperator<T> accumulator)
        * <U> U reduce(U identiy, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
        * */

        var s8 = Stream.of("w", "o", "l", "f");
        var result1 = " ";
        String word1 = s8.reduce(result1, (a,b)->a+b);
        System.out.println("word1: " + word1);


        var s9 = Stream.of("w", "o", "l", "f");
        var result2 = " ";
        String word2 = s9.reduce(result2, String::concat);
        System.out.println("word2: " + word2);

        var s10 = Stream.of("w", "o", "l", "f");
        Optional<String> word3 = s10.reduce(String::concat);
        System.out.println("word3: " + word3.get());

        var s11 = Stream.of("w", "o", "l", "f");
        int length = s11.reduce(0, (i,s)->i+s.length(), Integer::sum);
        System.out.println("length: " + length);


        /*
        * <R> R collect(Supplier<R> supplier,
        *                   BiConsumer<R, ? super T> accumulator,
        *                   BiConsumer<R,R> combiner)
        *
        * <R,A> R collect(Collector<? super T, A, R> collector)
        *
        * */

        Stream<String> s12 = Stream.of("w", "o", "l", "f");
        StringBuilder sb1 = s12.collect(StringBuilder::new,StringBuilder::append, StringBuilder::append);


        Stream<String> s13 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set1 = s13.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);


        Stream<String> s14 = Stream.of("w", "o", "l", "f");
        Set<String> set2 = s14.collect(Collectors.toCollection(HashSet::new));

        Stream<String> s15 = Stream.of("w", "o", "l", "f");
        Set<String>  set3 = s15.collect(Collectors.toSet());


    }

    public static void main(String[] args) {
        new UsingCommonTerminalOperations();
    }







}
