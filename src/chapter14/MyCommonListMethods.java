package chapter14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MyCommonListMethods {
    /*
    *  boolean add(E element)
    *  void add(int index, E element) -> moves index either -1 or +1
    *  E get(int index)
    *  E remove(int index)
    *  void replaceAll(UnaryOperator<E> op)
    *  E set(int indexI, E element) -> replace E at index i, throws runtime exception
    * */


    @SuppressWarnings("all")
    public static void main(String[] args) {

        Random random = new Random();

        int five = 5;

        List<Integer> numbers = new ArrayList<>();

        while (five-->0){
            numbers.add(random.nextInt(90) + 10);
        }
        System.out.println(numbers);

        numbers.replaceAll(n -> 2*n);

        System.out.println("After replaceAll");
        System.out.println(numbers);

        Iterator<Integer> integerIterator = numbers.listIterator();

        // don't know why can't use removeIf and iterator on same list int the same method
         numbers.removeIf(num -> num < 51); //removeIf is thread safe



        /* thread safe
        while (integerIterator.hasNext()){
            System.out.println("b: " + integerIterator.next());
            if (integerIterator.next()<51) {
                System.out.println("i: " + integerIterator.next());
                integerIterator.remove();
            }
            System.out.println("a: " + integerIterator.next());
        }
        */

        System.out.println("After removing numbers with value less than 51");
        System.out.println(numbers);



    }

}
