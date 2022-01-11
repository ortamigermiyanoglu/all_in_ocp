package chapter14.boundinggenerictypes;

import java.util.ArrayList;
import java.util.List;

public class Unbounded {

    /*
    * look at BeCareful class print method
    * to understand unbounded print method better
    * */


    void printList(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("queue");

        Unbounded unbounded = new Unbounded();
        unbounded.printList(keywords);

        List<?> x1 = new ArrayList<>();
        /* DNC
        x1.add((Object) "abc");
         */

        var x2 = new ArrayList<>();
        x2.add("semir");
        x2.add(2);

        /*
        * x1 type of List
        * x2 type of ArrayList
        * both returns Object to get() method
        * */

        var x3 = new ArrayList<String>();
        /*
        x3.add(1);
        */
    }

}
