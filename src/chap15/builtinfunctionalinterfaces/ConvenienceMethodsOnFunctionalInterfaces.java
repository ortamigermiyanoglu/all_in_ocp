package chap15.builtinfunctionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvenienceMethodsOnFunctionalInterfaces {

    public static void main(String[] args) {
        Predicate<String> egg = s -> "egg".contains(s);
        Predicate<String> brown = b -> "brown".contains(b);

        Predicate<String> stringPredicate = egg.and(brown); //predicate default method: and(Predicate<T> predicate);
        Predicate<String> stringPredicate1 = stringPredicate.negate(); //predicate default method: negate();
        Predicate<String> stringPredicate2 = egg.or(brown); //predicate default method: or(Predicate<T> predicate)

        System.out.println(stringPredicate.test("Semir likes brown traveller chicken's egg"));
        System.out.println(stringPredicate1.test("Semir likes brown traveller chicken's egg"));

        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = b -> System.out.println(", 2: " +b);
        Consumer<String> stringConsumer = c1.andThen(c2); //consumer default method: andThen(Consumer<T> c)

        stringConsumer.accept("semir");

        Function<String, Integer> f1 = s -> s.length()+1;
        Function<Integer, Integer> f2 = s -> s*2;

        Function<String,Integer> function = f1.andThen(f2);

        /* F1 takes String parameter hence first parameter type of combined function must be String
        Function<Integer, Integer> combineF1F2 = f1.andThen(f2);
        */

        //difference between compose andThen is the order they execute functions
        Function<String, Integer> composeFunction = f2.compose(f1);


        System.out.println(function.apply("Semir"));






    }



}
