package chapter15.functionalprogrammingrevisited;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvenienceMethods {

    //and(predicate)
    //negate()
    //or
    Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
    Predicate<String> brown = s-> s.contains("brown");
    Predicate<String> egg = (s) -> s.contains("egg");
    Predicate<String> brownEggs2 = brown.and(egg);
    Predicate<String> otherEggs = egg.and(brown.negate());


    //andThen(consumer)
    Consumer<String> c1 = x -> System.out.println("1: " + x);
    Consumer<String> c2 = x -> System.out.println(",2: " + x);
    Consumer<String> combinedConsumer = c1.andThen(c2);

    {
        combinedConsumer.accept("Samir"); // 1: Samir, 2: Samir
    }


    //compose(function)
    //andThen(function)
    Function<Integer, Integer> before = x -> x+1;
    Function<Integer, Integer> after = x -> x*2;
    Function<Integer,Integer> combinedFunction = after.compose(before);





}
