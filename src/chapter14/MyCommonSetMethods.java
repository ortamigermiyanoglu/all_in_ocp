package chapter14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyCommonSetMethods {
    public static void main(String[] args) {
        Set<Character> letters = Set.of('a', 'b', 'c');
        Set<Character> copy = Set.copyOf(letters);

        System.out.println(copy.equals(letters)); // returns true

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(2);
        integerSet.add(34);
        integerSet.add(63);
        integerSet.add(34);

        System.out.println("HashSet doesn't preserve order, only unique elements");
        integerSet.forEach(System.out::println) ; //prints 3 elements with random order

        Set<Integer> otherIntegerSet = new TreeSet<>();
        otherIntegerSet.add(2);
        otherIntegerSet.add(34);
        otherIntegerSet.add(63);
        otherIntegerSet.add(34); // returns false

        System.out.println("TreeSet sorts in order but insert operations takes longer");
        otherIntegerSet.forEach(System.out::println); //prints 3 elements in a sorted way


    }
}
