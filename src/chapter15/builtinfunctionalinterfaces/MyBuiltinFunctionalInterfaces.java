package chapter15.builtinfunctionalinterfaces;

import java.time.LocalDate;
import java.util.*;
import java.util.function.*;

public class MyBuiltinFunctionalInterfaces {


    public static void main(String[] args) {
        Supplier<LocalDate> methodReferenceLocalDateSupplier = LocalDate::now;
        Supplier<LocalDate> lambdaExpressionLocalDateSupplier = () -> LocalDate.now();

        LocalDate localDate = methodReferenceLocalDateSupplier.get() == null ? lambdaExpressionLocalDateSupplier.get() : LocalDate.MAX;

        Supplier<List<String>> listSupplier = ArrayList::new; //ArrayList<String>::new works too
        var a = listSupplier.get();
        a.add("Semir");


        Consumer<List> listConsumer = (List list) -> list.clear();
        List<String> names = Arrays.asList("Semir", "Ahmet", "Ali");
        /* throws UnspoortedOperationException
        listConsumer.accept(names);
         */
        Consumer<List<String>> stringListConsumer = Collections::sort;
        stringListConsumer.accept(names);
        System.out.println(names);

        var map = new HashMap<String, Integer>();
        BiConsumer<String,Integer> stringIntegerBiConsumer = map::put;
        stringIntegerBiConsumer.accept("Sadi", 23);

        BiPredicate<Integer, Integer> integerIntegerBiPredicate = (x,y) -> x>y;

        System.out.println(integerIntegerBiPredicate.test(109,109));

        Function<String, Integer> stringIntegerFunction = String::length;
        System.out.println(stringIntegerFunction.apply("Semir"));

        BiFunction<String, String, String> stringStringStringBiFunction = String::concat;
        System.out.println(stringStringStringBiFunction.apply("Semir ", "Kurt"));


        UnaryOperator<String> stringUnaryOperator = String::toUpperCase;
        BinaryOperator<String> stringBinaryOperator =(m,n)->m.concat(n);


    }
}
