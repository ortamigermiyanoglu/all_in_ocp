package chapter15.v1_2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class CollectingResults {
    /*          EXAMPLES OF GROUPING / PARTITIONING COLLECTORS              */
    /* Collector                                        Return value when passed to collect
    * averagingDouble(ToDoubleFunction f)                       Double
    * averagingInt(ToIntFunction f)                             Double
    * averagingLong(ToLongFunction f)                           Double
    *
    * counting()                                                Long
    *
    * groupingBy(Function f)                                    Map<K, List<T>>
    * groupingBy(Function, Collector dc)                        Map<K, List<T>>
    * groupingBy(Function f, Supplier s, Collector dc)          Map<K, List<T>>
    *
    * joining(Charsequence cs)                                  String
    *
    * maxBy(Comparator c)                                       Optional<T>
    * minBy(Comparator c)                                       Optional<T>
    *
    * mapping(Function f, Collector dc)                         Collector
    *
    * partitioningBy(Predicate p)                               Map<K, List<T>>
    * partitioningBy(Predicate p, Collector dc)
    *
    *
    * toCollection                                             Collection
    *
    * toList()                                                  List
    * toSet()                                                   Set
    *
    * toMap(Function k, Function v)
    * toMap(Function k, Function v, BinaryOperator m)
    * toMap(Function k, Function v, BinaryOperator m, Supplier s)
    *
    * */


    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));

        var onono = Stream.of(new StringBuilder("lions"), new StringBuilder("tigers"), new StringBuilder("bears"));
//        StringBuilder sb = onono.collect(Collectors.joining()); DNC

        var ohYour = Stream.of("lions", "tigers", "bears");
        ohYour.collect(Collectors.averagingDouble(String::length));


//        DoubleStream doubleStream = DoubleStream.generate(Math::random).limit(20).map(d->d*10);
//        OptionalDouble average = doubleStream.average();

        Stream<Double> doubleStream1 = Stream.generate(Math::random).limit(20).map(d->d*10);
        Double average = doubleStream1.collect(Collectors.averagingDouble(d -> d));


        var oLaLa = Stream.of("lions", "tigers", "bears");
        TreeSet<String> stringTreeSet = oLaLa.filter(s -> s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));

        var ohNo = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> stringIntegerMap = ohNo.collect(Collectors.toMap(Function.identity(), String::length));

        var noNoNo = Stream.of("lions", "tigers", "bears");
//        Map<Integer,String> integerStringMap1 = noNoNo.collect(Collectors.toMap(String::length, Function.identity())); throws RuntimeException


        var ohYes = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> integerStringMap = ohYes.collect(Collectors.toMap(String::length, Function.identity(), (s1, s2)->s1+", "+s2));

        var helloo = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> integerStringTreeMap = helloo.collect(Collectors.toMap(String::length, Function.identity(), (s1, s2)->s1+", "+s2, TreeMap::new));



    }


}
