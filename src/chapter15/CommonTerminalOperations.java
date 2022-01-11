package chapter15;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class CommonTerminalOperations {
    /* --------------------------------------------------------------------------------------------------------
    * Method                     |behaviour in  infinite stream        |  return value        |  Reduction     |
    * ---------------------------------------------------------------------------------------------------------|
    * count()                      doesn't terminate                       long                     yes        |
    * min(), max()                 doesn't terminate                       Optional<T>              yes        |
    * findAny(), findFirst()       terminates                              Optional<T>              no         |
    * allMatch(P), anyMatch(P),    sometimes terminate                     boolean                  No         |
    *       noneMatch(P)                                                                                        |
    * forEach(C)                   doesn't terminate                        void                    no         |
    * reduce(*)                     doesn't terminate                        varies                  yes        |
    * collect()                    doesn't terminate                        varies                  yes        |
    *  P -> Predicate parameter
    *  C -> Consumer parameter
    *  * -> overloaded method
    * */

    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("Bobo", "thinks", "it's", "scary");
        System.out.println(s1.count());
        Stream<String> s2 = Stream.of("That's", "the", "thermals.", "They", "make", "a proof","and", "the","thermals!");
        System.out.println(s2.min(Comparator.comparingInt(String::length))); // below does the same
        //System.out.println(s2.min((w1,w2) -> w1.length()-w2.length()));
        //prints Optional[the]

        Stream<String> empty = Stream.empty();
        empty.min((w1,w2) -> w1.length()-w2.length()).ifPresent(System.out::println); //stream returns optional.empty


        Stream<String> streamForFindAny = Stream.of("Jesus", "is", "a", "lie", "Hebrew-jeebies");
        Stream<String> infinteStringStream = Stream.generate(()->"Jewpacabra");

        streamForFindAny.findAny().ifPresent(System.out::println);
        infinteStringStream.findFirst().ifPresent(System.out::println);

        var list = List.of("Cartman's","Passover", "Special.", "Starring...", "The Jewpacabra!!!");

        System.out.println(list.stream().anyMatch(s -> s.startsWith("s")));
        System.out.println(list.stream().noneMatch(s -> s.length()<5));
        System.out.println(list.stream().allMatch(s -> s.charAt(0)=='S'));

        list.stream().forEach(System.out::println);


        Stream<String> stringStreamForReduce1 = Stream.of("w","o","l","f");

        String wolf = stringStreamForReduce1.reduce("", (s,c)->s.concat(c));

        System.out.println("stringStreamForReduce1 reduction: " + wolf);

        Stream<Integer> integerStreamForReduce2 = Stream.of(1,2,3,4,5,6);
        Optional<Integer> sixFactorial = integerStreamForReduce2.reduce((a, b)->a*b);
        System.out.println("integerStreamForReduce2 withoud identity: " + sixFactorial);




        Stream<Integer> integerStreamForReduce3 = Stream.empty();
        Integer integer = integerStreamForReduce3.reduce(5, Integer::sum); // returns 5

        BiFunction<Integer, String, Integer> biFunction = (i,s) -> i+s.length();


        Stream<String> stringStreamForReduce4 = Stream.of("Cartman's","Passover", "Special.", "Starring...", "The Jewpacabra!!!");
//        String notLengthOfSentence = stringStreamForReduce4.reduce("", (i,s)->i+s.length());
//        System.out.println(notLengthOfSentence);
        int lengthOfSentence = stringStreamForReduce4.reduce(0, (i,s)->i+s.length(), (a,b)->a*b);
        System.out.println("stringStreamForReduce4 identity, biFuntion, binaryOperator: " + lengthOfSentence);




    }

}
