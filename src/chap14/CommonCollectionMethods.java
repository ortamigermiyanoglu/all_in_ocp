package chap14;

import java.util.*;

public class CommonCollectionMethods {
    /*
    * boolean contains(Object o)
    * int size()
    * boolean isEmpty()
    * boolean contains(Object o) -> throws ClassCastException or NPE
    * boolean add(E e)
    *  */


    public static void main(String[] args) {
        List<ComprendesMendes> comprendesMendes = new ArrayList<>();
        /* compile error since ComprendesMendes doesn't implement Comparable
        Collections.sort(comprendesMendes);
        */


        /* compiles without giving compile-runtime error
        Collection stringList = new ArrayList<String>();
        stringList.add(1);
         */

        /* compiles without giving compile-runtime error
        List stringList = new ArrayList<String>();
        stringList.add(1);
         */

        Collection<String> stringListCollection = new ArrayList<>();
        System.out.println(stringListCollection.add("Sparrow")); //prints true
        System.out.println(stringListCollection.remove("Hamza")); //prints false
        System.out.println(stringListCollection.add("Hamza"));
        System.out.println(stringListCollection.isEmpty()); //prints false
        stringListCollection.removeIf(s -> s.startsWith("H")); // thread safe


        Collection<String> stringHashSetCollection = new HashSet<>();
        System.out.println(stringHashSetCollection.add("Sparrow")); //prints true
        System.out.println(stringHashSetCollection.add("Sparrow")); //prints false
        System.out.println(stringHashSetCollection.size()); //prints 1
        stringHashSetCollection.forEach(System.out::println);

    }
}
