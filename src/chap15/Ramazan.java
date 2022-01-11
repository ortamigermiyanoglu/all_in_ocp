package chap15;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class Ramazan {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.generate( () -> "a");

        stringStream.findFirst().ifPresent(System.out::println);


        Stream.iterate(1, x->++x).limit(5).map(Function.identity()).forEach(System.out::println);

        Predicate<String> a = String::isEmpty;
        Predicate<String> b = String::isEmpty;
        a.and(b);
        a.negate();
        a.or(b);

        Consumer<String> c = s -> {};
        Consumer<String> d = s -> {};


        BiConsumer<String, Integer> biConsumer = (j, i) -> System.out.println(j+i);



        var str = "Hello";
        String strObj = new String("Hello");

        System.out.println("Hello".intern() == str);
        System.out.println(strObj.intern() == str);
        System.out.println(strObj.intern() == "Hello");
        System.out.println(str == strObj);
        System.out.println(str == "Hello");


        List<String> strings = new ArrayList<>();
        strings.add("s");
        strings.add("e");
        strings.add("m");
        strings.add("i");
        strings.add("r");

        Comparator<Boolean> booleanComparator = Boolean::compareTo;

        System.out.println("booleanComparator.compare(Boolean.TRUE, Boolean.FALSE)");
        System.out.println(booleanComparator.compare(Boolean.TRUE, Boolean.FALSE));


        for (String string : strings)
            System.out.println(string);


        Ramazan ramazan = new Ramazan();

        ramazan.x((x)->{}, (x, y)->0);

        //Supplier<Set<Float>> setSupplier = () -> Set.of(1.23); DNC
        Set<String> stringSet = new HashSet<>();
        //stringSet.sort(...) DNC
        Map<String, String> stringStringMap = new HashMap<>();
        //stringsMap.sort(...) DNC


    }


    public void x(Consumer<String> x, Comparator<Boolean> y){}


}