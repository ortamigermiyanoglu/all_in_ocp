package chapter14;

import java.util.LinkedList;
import java.util.Queue;

public class MyCommonQueueMethods {
    /*
    * boolean add(E e) -> adds an element to the back of the queue and returns true or throws an exception
    * boolean offer(E e) -> adds an element to the back of the queue and returns whether successful
    *
    * E element() -> returns next element or throws an exception if empty queue
    * E peek() -> returns next element or returns null if empty queue
    *
    *
    * E remove() -> removes and return next element or throws an exception if empty queue
    * E poll() -> removes and return next element or returns null if empty queue
    *
    */

    public static void main(String[] args) {

        Queue<Integer> integerQueue = new LinkedList<>();
        System.out.println(integerQueue.offer(10));
        System.out.println(integerQueue.offer(4));
        System.out.println(integerQueue.add(5));

        System.out.println("Printing LinkedList");
        integerQueue.forEach(a -> System.out.print(a +" "));
        System.out.println("\nLinkedList Printed");

        System.out.println("peek " + integerQueue.peek());
        System.out.println("poll " + integerQueue.poll()); //removes and returns head element
        System.out.println("peek " + integerQueue.peek());
        System.out.println("poll " + integerQueue.poll());
        System.out.println("remove " + integerQueue.remove());
        System.out.println("peek " + integerQueue.peek());
        /* throws no such element exception
        System.out.println(integerQueue.element());
        */


    }
}
