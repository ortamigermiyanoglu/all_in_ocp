package chapter15.functionalprogrammingrevisited;

import java.util.List;
import java.util.stream.Stream;

public class PuttingTogetherThePipeline {

    {
        System.out.println("----------------------SAMPLE 1----------------------");
        var list1 = List.of("Toby", "Anna", "Leroy", "Alex");
        list1.stream().filter(n->n.length()>4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\n----------------------SAMPLE 2----------------------");
        Stream.generate(()->"Elsa")
                .filter(n-> n.length() == 4)
                .limit(3)
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n----------------------SAMPLE 3----------------------");
        long count1 = Stream.of("goldfish", "finch")
                .filter(s -> s.length() > 5)
                .count();
        System.out.println(count1);
        System.out.println("\n----------------------SAMPLE 4----------------------");
        Stream.iterate(1,x->x+1)
                .limit(5)
                .filter(x-> x%2==1)
                .forEach(System.out::println);



        System.out.println("\n----------------------SAMPLE 5----------------------");
        Stream.iterate(1, x->x+1).peek(System.out::println)
                .limit(5)
                .filter(x-> x%2==1)
                .forEach(System.out::print);


    }

    public static void main(String[] args) {
        new PuttingTogetherThePipeline();
    }


}
