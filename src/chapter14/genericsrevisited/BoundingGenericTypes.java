package chapter14.genericsrevisited;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BoundingGenericTypes {

    static void printList(List<Object> list){
        for (Object o :list){
            System.out.println(o);
        }
    }

    static void printList2(List<? extends Object> list){
        for (Object o :list){
            System.out.println(o);
        }
    }

    static void sum(List<? extends Number> list){
        double sum = 0;
        for (Number o :list){
            sum +=o.doubleValue();
        }

        System.out.println("sum is " + sum);
    }


    static void sum2(List<Number> list){
        double sum = 0;
        for (Number o :list){
            sum +=o.doubleValue();
        }

        System.out.println("sum is " + sum);
    }

    public static void main(String[] args) {
        /* Integer direkt olarak Object classini degil de Number classini extend ettigi icin calismaz DNC
        List<Integer> integerList = new ArrayList<>(Arrays.asList(3,4,5));
        BoundingGenericTypes.printList(integerList);
        */

        List<String> stringList = new ArrayList<>();
        BoundingGenericTypes.printList(Arrays.asList("samir", "nasri"));


        //printList2'de dolayli yoldan da extends etse okey
        List<Integer> integerList = new ArrayList<>(Arrays.asList(3,4,5));
        BoundingGenericTypes.printList2(integerList);

        List<?> unbounded1 = new ArrayList<String>();
        //unbounded1.get(0); compiles without issue
        List<? extends Object> unbounded2 = new ArrayList<String>();
        //unbounded2.remove(0); compiles without issue


        List<? super String> lowerBound = new ArrayList<String>();
        lowerBound.add("samir");


        List<? extends Number> doubleNumbers = new ArrayList<Double>();
        List<Double> doubleList = new ArrayList<>(Arrays.asList(3.3,4.20,5.6));

        List<Number> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6.7);

        BoundingGenericTypes.sum(integerList);
        BoundingGenericTypes.sum(doubleList);
        BoundingGenericTypes.sum(numbers);



        /* DNC
        BoundingGenericTypes.sum2(integerList);
        BoundingGenericTypes.sum2(doubleList);
        */
        BoundingGenericTypes.sum2(numbers);











    }

}
