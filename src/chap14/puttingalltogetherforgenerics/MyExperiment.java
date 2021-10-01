package chap14.puttingalltogetherforgenerics;

import chap14.boundinggenerictypes.Flyer;

import java.util.ArrayList;
import java.util.List;

public class MyExperiment {

    @Override
    public String toString() {
        return "MyExperiment{}";
    }

    /*
    unbound is type of upper bound -> ? extends Object
    upper bound -> can't call add
    lower bound -> can call add, even you can add an object that extends lowest bound

     */

    public static void main(String[] args) {
        MyExperiment experiment = new MyExperiment();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);

        experiment.printUnbounded(integerList);
        experiment.printUpperBoundExplicit(integerList);
        experiment.printUpperBoundExtendNumber(integerList);
        //experiment.printLowerBound(integerList);


        List<?> list11 = new ArrayList<A>();

        //extend X yazan yer ve daha altı sağ kısma <> içibe gelebilir
        List<? extends A> list22 = new ArrayList<A>();
        List<? extends A> list22v2 = new ArrayList<C>();
        List<? extends B> list22v3 = new ArrayList<C>();


        List<? super B> lis44 = new ArrayList<A>();
        List<? super B> lis44v2 = new ArrayList<B>();



    }


    private void printUnbounded(List<?> list){list.forEach(System.out::println);}

    private void printUpperBoundExplicit(List<? extends Object> list){list.forEach(System.out::println);}

    private void printUpperBoundExtendNumber(List<? extends Number> list){list.forEach(System.out::println);}

    private void printLowerBound(List<? super Number> list){list.forEach(System.out::println);}

    private void print(List<? super String> list){list.forEach(System.out::println);}

    private <T> T first(List<? extends T> list){
        return list.get(0);
    }

    /*
    public <T> <?extends T> secunda(List<? extends T>){}
     */

    <B extends A> B third(List<B> list){
        return list.get(1);
    }

}
