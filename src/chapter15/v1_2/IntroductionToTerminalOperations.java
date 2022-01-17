package chapter15.v1_2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntroductionToTerminalOperations {
    /*      Method              What happens for infinite stream?       Return value            Reduction
    *
    *       count()             does not terminate                          long                    yes
    *       min()/max()         does not terminate                      Optional<T>                 yes
    * findAny()/findFirst()         terminates                          Optional<T>                 no
    *allMatch()/anyMatch()/noneMatch()  sometimes terminates            boolean                     no
    * forEach()                 does not terminate                      void                        no
    * reduce()                  does not terminate                      varies                      yes
    * collect()                 does not terminate                       varies                     yes
    *
    *
    * */

    /*
    * Optional<T> min(Comparator<? superT> comparator)
    * Optional<T> max(Comparator<? superT> comparator)
    * */

    /*
    *  Optional<T> findAny()
    *  Optional<T> findFirst()
    * */

    /*
    *
    *   boolean allMatch(Predicate<? super T> predicate)
    *   boolean noneMatch(Predicate<? super T> predicate)
    *   boolean anyMatch(Predicate<? super T> predicate)
    *
    * */

    /*
    *  void forEach(Consumer<? super T> action)
    * */

    /*
    * T reduce(T identity, BinaryOperator<T> accumulator)
    * Optional<T> reduce(BinaryOperator<T> accumulator)
    * <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
    * */


    /*
    * <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super ?> accumulator, combiner)
    * <R,A> R collect(Collector<? super T, A, R> collector)
    * */

    public static void main(String[] args) {
        List<String> names = List.of("azize","semir", "ahmet", "ali", "cabir");
        List<String> lettersAsString = List.of("s","e","m","i","r");

        System.out.print("count: ");
        Stream<String> animals = Stream.of("monkey","gorilla", "bonobo");
        System.out.println(animals.count());


        System.out.print("min: ");
        Stream<Integer> grades = Stream.of(87,23,91,48,63,67,41);
        System.out.println(grades.min(Comparator.naturalOrder()).get());

        System.out.print("findAny: ");
        System.out.print(names.parallelStream().findAny());

        System.out.print("noneMatch: ");
        System.out.println(names.stream().noneMatch(s -> s.startsWith("h")));

        System.out.print("reduce: ");
        System.out.print(lettersAsString.stream().reduce(String::concat).get() + "/");
        System.out.print(lettersAsString.stream().reduce("", String::concat) + "/");
        System.out.println(lettersAsString.parallelStream().reduce("", String::concat, String::concat) + "/");

        System.out.print("collect: ");
        System.out.println(lettersAsString.stream().collect(Collectors.joining()));


        /*
         * <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R,R> combiner)
         * <R,A> R collect(Collector<? super T, A, R> collector)
         * */

        List<String> letters = List.of("w","o","l","f");

        letters.stream().reduce("", String::concat, String::concat);

    }

}
