package chapter15.v1_2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingByGroupingOrPartitioning {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> groupBy = ohMy.collect(Collectors.groupingBy(String::length));

        Map<Integer, List<String>> group = ohMy.collect(Collectors.groupingBy(String::length));



        var ohYour = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> groupByInsideReturnSet = ohYour.collect(Collectors.groupingBy(String::length, Collectors.toSet()));

        var ohTheirs = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> groupByReturnTreeMap = ohTheirs.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));

        var ohOurs = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> groupByReturnTreeMapInsideList = ohOurs.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));

        var ohMine = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> partitioningBy = ohMine.collect(Collectors.partitioningBy(s->s.length()<=7));

        var ohNine = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> partitioningByReturnInsideSet = ohNine.collect(Collectors.partitioningBy(s->s.length()<=7, Collectors.toSet()));

        var ohFine = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map = ohFine.collect(Collectors.groupingBy(String::length, Collectors.counting()));


        var buHavadaGidilmez = Stream.of("lions", "tigers", "bears");
        Map<Integer,Optional<Character>> map1 = buHavadaGidilmez.collect(Collectors.groupingBy(String::length, Collectors.mapping((
                s->s.charAt(0)), Collectors.minBy((a,b)->a-b)
                )));


    }

}
