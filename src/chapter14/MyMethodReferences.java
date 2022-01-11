package chapter14;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyMethodReferences {
    MyMethodReferences(){}

    private void myConsumerStaticReference(Consumer consumer, String s){
        consumer.accept(s);
    }


    public static void main(String[] args) {
        String s = "Hello World";

        Supplier<MyMethodReferences> myMethodReferences = MyMethodReferences::new; // constructor method reference
        Consumer<String> stringConsumer = System.out::println;
        Predicate<String> stringPredicate = s::startsWith; // instance method reference on a particular instance
        Predicate<String> stringPredicate1 = String::isEmpty; // instance method reference on a parameter
        Consumer<List<Integer>> listConsumer = Collections::sort; // static method reference

        myMethodReferences.get().myConsumerStaticReference(stringConsumer, s);


        Byte myByte = Byte.valueOf((byte)1);
        Short myShort = Short.valueOf((short) 1.0);
        Float f = Float.valueOf((float) 1.0);
    }


}
