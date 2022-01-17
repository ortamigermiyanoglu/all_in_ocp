package chapter15.v1_2;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntroductionToPrimitiveStreams {
    /*
    * IntStream: used for the primitive types, int, short, byte, char
    * LongStream: used for the primitive type long
    * DoubleStream: used for the primitive types double and float
    * */

    public static void main(String[] args) {

//        DoubleStream doubleStream = Stream.of(3.14f); DNC
//        List<Double> doubleList = List.of(3.14f); DNC

        double aDouble = 3.14f;

        IntStream intStream = IntStream.rangeClosed(1,15);

        StringBuilder stringBuilder = intStream.mapToObj(String::valueOf).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);

        System.out.println(stringBuilder);


    }
}
