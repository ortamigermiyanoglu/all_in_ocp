package chap6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyLambdas {
    final String nationality;
    //final static int hamza;
    final int sami;
    {
        sami = 33;
        // hamza = 5; compile error
    }
    //    MyLambdas(){} bu olsa compile error verir
    MyLambdas(final String nationality){
        this.nationality = nationality;
    }

    private String color;
    public static void main(String[] args) {
        MyLambdas myLambdas = new MyLambdas("abc");
        myLambdas.color = "orange";
        myLambdas.color = "green";
        myLambdas.caw("Samir");



    }

    public void caw(String name){
        String volume  ="loudly";
        Consumer<String> stringConsumer = s -> System.out.println( name + " says " + volume + " that she is " + color );
        consumeConsumer(stringConsumer);
        //volume = "safsaf"; compile error
        //name = "safasf"; compile error
    }

    public void consumeConsumer(Consumer<String> stringConsumer){
        List<String> myList = new ArrayList<>();
        myList.add("1");

        myList.forEach(stringConsumer);
    }
}
