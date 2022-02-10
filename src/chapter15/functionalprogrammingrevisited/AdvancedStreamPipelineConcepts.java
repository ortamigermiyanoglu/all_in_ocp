package chapter15.functionalprogrammingrevisited;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AdvancedStreamPipelineConcepts {
    {
        System.out.println("----------------------SAMPLE 1: lazy evaluation----------------------");
        var l1 = new ArrayList<String>();
        l1.add("Annie"); l1.add("Rippley");
        var s1 = l1.stream();
        l1.add("KC");
        System.out.print(s1.count());


        System.out.println("\n----------------------SAMPLE 2: optional chaining----------------------");
        Optional.of(3).map(i -> ""+i).filter(s-> s.length() == 3).ifPresent(System.out::println);


        System.out.println("\n----------------------SAMPLE 3: exceptions in method reference----------------------");
        /*  unhandled exception compile error
        Supplier<List<String>> sup1 = AdvancedStreamPipelineConcepts::nothingButJustThrowhingException;
        */

        System.out.println("\n----------------------COLLECTING RESULTS----------------------");
        System.out.println("\n----------------------BASIC COLLECTORS----------------------");
        System.out.println("----------------------SAMPLE 4: Collectors.joining----------------------");
        var s2 = Stream.of("lions", "tigers", "bears");
        System.out.print(s2.collect(Collectors.joining(", ")));

        System.out.println("\n----------------------SAMPLE 5: Collectors.averagingInt----------------------");
        var s3 = Stream.of("lions", "tigers", "bears");
        System.out.println(s3.collect(Collectors.averagingInt(String::length)));

        System.out.println("----------------------COLLECTING INTO MAP----------------------");
        System.out.println("----------------------SAMPLE 6: Collectors.toMap(Function f1, Function f2)----------------------");
        var s4 = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> m1 = s4.collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(m1);

        System.out.println("\n----------------------SAMPLE 7: Collectors.toMap(Function f1, Function f2, BinaryOperator merge)----------------------");
        var s5 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> m2 = s5.collect(Collectors.toMap(String::length, s->s, (w1,w2)-> w1+ ", "+w2));
        System.out.println(m2);


        System.out.println("\n----------------------SAMPLE 8: Collectors.toMap(Function f1, Function f2, BinaryOperator merge, Supplier s)----------------------");
        TreeMap<Integer, String> tm1 = Stream.of("lions", "tigers", "bears", "snakes")
                .collect(Collectors.toMap(String::length, s->s, (w1,w2)-> w1+ ", "+w2, TreeMap::new));
        System.out.println(tm1);

        System.out.println("----------------------COLLECTING USING GROUPING PARTITIONING AND MAPPING----------------------");
        System.out.println("\n----------------------SAMPLE 9: Collectors.groupingBy(Function f)----------------------");

        var s6 = Stream.of("lions", "tigers", "bears");
        Map<String, List<String>> m3 = s6.collect(Collectors.groupingBy(Function.identity()));
        System.out.println(m3);

        System.out.println("\n----------------------SAMPLE 11: Collectors.groupingBy(Function f, Collector c)----------------------");
        var s7 = Stream.of("lions", "tigers", "bears", "snakes");
        Map<Integer, Set<String>> m4 = s7.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(m4);

        System.out.println("\n----------------------SAMPLE 12: Collectors.groupingBy(Function f,Supplier s, Collector c)----------------------");

        TreeMap<Integer, Set<String>> tm2 = Stream.of("lions", "tigers", "bears", "snakes")
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));

        System.out.println(tm2);

        System.out.println("\n----------------------SAMPLE 13: Collectors.groupingBy(Function f,Supplier s, Collector c)----------------------");
        TreeMap<Integer, List<String>> tm3 = Stream.of("lions", "tigers", "bears", "snakes")
                .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(tm3);

        System.out.println("\n----------------------SAMPLE 14: Collectors.partitioningBy(Predicate p)----------------------");
        Map<Boolean, List<String>> m5 = Stream.of("lions", "tigers", "bears", "snakes")
                .collect(Collectors.partitioningBy(s -> s.length()==7));
        System.out.println(m5);

        System.out.println("\n----------------------SAMPLE 15: Collectors.partitioningBy(Predicate p, Collector c)----------------------");
        Map<Boolean, Set<String>> m6 = Stream.of("lions", "tigers", "bears", "snakes")
                .collect(Collectors.partitioningBy(s -> s.length()==5, Collectors.toSet()));


        System.out.println("\n----------------------SAMPLE 16: Collectors.counting----------------------");
        Map<Integer, Long> m7 = Stream.of("lions", "tigers", "bears", "snakes")
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(m7);


        System.out.println("\n----------------------SAMPLE 17: Collectors.counting----------------------");

        Map<String, Long> m9 = Stream.of("lions", "tigers", "bears", "lions").collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(m9);









    }


    public static List<String> nothingButJustThrowhingException() throws Exception{
        throw new Exception();
    }

    public static void main(String[] args) {
        new AdvancedStreamPipelineConcepts();
    }
}
