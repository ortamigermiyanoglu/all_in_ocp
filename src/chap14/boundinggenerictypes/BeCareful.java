package chap14.boundinggenerictypes;

import java.util.ArrayList;
import java.util.List;

public class BeCareful {
    void printList(List<Object> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("queue");


        List<Integer> integers = new ArrayList<>();
        /* DNC
        List<Object> objects = integers;
        */

        BeCareful careful = new BeCareful();
        /* DNC
        * careful.printList(keywords);
        * careful.printList((List<Object>)keywords);
        */

        // works as a charm
        List integerList = new ArrayList<Integer>();
        integerList.add("sfsdf");

    }
}
