package chapter15;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Review {
    public static void main(String[] args) {
        var stream = Stream.iterate("", s->s+"1");
        stream.limit(2).peek(System.out::println).map(x->x+2).collect(Collectors.toList());

        Predicate<String> stringPredicate = s -> s.startsWith("g");

        var stream1 = Stream.generate(()->"growl!");
//        var b1 = stream1.allMatch(stringPredicate);

//        while (true){
//            System.out.println(1);
//        }


        Map<Integer, String> aMap = IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toMap(Function.identity(), s->s+ " ", (s1, s2)-> s1 + " "+ s2));
        System.out.println(aMap);
        IntStream.of(1,2,3,4,5).boxed().collect(Collectors.toList());

//        IntStream.of(1,2,3,4,5).collect(Collectors.toList()); DNC

/*
        LongStream.of(6l, 8l,10l).mapToInt(l->(int)l).collect(Collectors.groupingBy(x->x))
                .keySet().stream().collect(Collectors.averagingInt(x->x));
*/
        LongStream.of(6l,8l,10l).mapToInt(l->(int)l).boxed().collect(Collectors.groupingBy(Function.identity()))
                .keySet().stream().collect(Collectors.averagingInt(Integer::valueOf));

        LongStream.of(6l,8l,10l).mapToInt(x->(int)x).boxed().collect(Collectors.groupingBy(Function.identity()))
                .keySet().stream().collect(Collectors.averagingInt(x->x));

/*        LongStream.of(6l,8l,10l).mapToInt(x->(int)x).collect(Collectors.groupingBy(x->x, Collectors.toSet()))
                .keySet().stream().collect(Collectors.averagingInt(x-> (int) x));
*/
        LongStream.of(6l,8l,10l).mapToInt(x->(int)x).boxed().collect(Collectors.groupingBy(x->x,Collectors.toSet()))
                .keySet().stream().collect(Collectors.averagingInt(x->x));


        var siblings = Arrays.asList("Zeynep", "Ahmet" ,"Yasemin", "Semir");
        System.out.println(siblings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        System.out.println(siblings.stream().sorted());

        Stream<Integer> singleIntegerElementStream = Stream.of(1);
        singleIntegerElementStream.mapToInt(x->x);

        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result



                = Stream.generate(()->"").limit(10)
                .filter(notEmpty).collect(Collectors.groupingBy(k->k))
                .entrySet().stream().map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty));


        Function<Integer, Integer> s =  a -> a+4;
        Function<Integer, Integer> t = a -> a*3;
        Function<Integer,Integer> c = s.compose(t);


    }
}
