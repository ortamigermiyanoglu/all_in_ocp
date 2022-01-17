package chapter15.v1_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntroductionToIntermediateOperations {
    /*
    * Stream<T> filter(Predicate<? super T> predicate)
    * */

    /*
    * Stream<T> distinct()
    * java calls equals() method to determine whether the objects are the same
    * */


    /*
    * Stream<T> limit(long maxSize)
    * Stream<T> skip(int n)
    * */

    /*
    * <R> Stream<R> map(Function<? super T, ? extends R> mapper)
    * */

    /*
    * <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
    * */

    /*
    * Stream<T> sorted()
    * Stream<T> sorted(Comparator<? super T> comparator)
    * */


    /*
    * Stream<T> peek(Consumer<? super T> action)
    * */

    public static void main(String[] args) {
        List<String> family = Arrays.asList("Azize","Semir", "Ahmet", "Ali", "Cabir", "Yasemin", "Zeynep");
        Stream<String> animals = Stream.of("monkey","gorilla", "bonobo");

        System.out.print("filter: ");
        family.stream().filter(s -> !s.startsWith("a")).forEach(s -> System.out.print(s+" "));

        Stream<Integer> integerStream = family.stream().map(String::length);

        List<String> friends = List.of("Eren", "Sezer", "Sevban", "Oguz", "Ugur", "Ramazan", "Ege");

        List<String> colleagues = List.of("Ramazan", "Oguz");

        Stream<List<String>> streamOfCollections = Stream.of(family,friends,colleagues);

        System.out.print("\nflatMap: ");
        Stream<String> stringStream = streamOfCollections.flatMap(m->m.stream());
//        List<Integer> integerList = stringStream.map(String::length).collect(Collectors.toList());
        stringStream.forEach(s -> System.out.print(s+" "));


        Person p1 = new Person(11, "Ali");
        Person p2 = new Person(13, "Ahmet");
        Person p3 = new Person(14, "Oguz");
        Person p4 = new Person(15, "Sami");
        Person p5 = new Person(18, "Gewrim");

        List<Person> personList = Arrays.asList(p1, p2, p3, p4,p5);

        System.out.println();
        // if person class doesn't implement comparable then run time exception will be thrown
        System.out.println(personList.stream().sorted().collect(Collectors.toList()));

//        personList.sort(Comparator.comparing(p-> p.name));
//        System.out.println(personList);
        family.sort(Comparator.comparing(String::length));

        family.stream().sorted(Comparator.reverseOrder());
        System.out.println(family);

        Stream.iterate(1, n-> n<100, n->n+30).peek(System.out::println).forEach(System.out::println);




    }


}
