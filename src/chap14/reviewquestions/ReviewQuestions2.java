package chap14.reviewquestions;

import java.util.*;

public class ReviewQuestions2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,4,7,2);
        /* throws UnsupportedOperationException
        list.add(22);
         */

        // descending order
        System.out.println("descending order  (o1, o2) -> o2-o1");
        Comparator<Integer> integerComparator = (o1, o2) -> o2-o1;
        System.out.println(list);

        //ascending order
        System.out.println("ascending order Comparator.naturalOder()");
        Collections.sort(list,Comparator.naturalOrder());
        System.out.println(list);


        List<Integer> integers = List.of(8,16,2);
        //integers.replaceAll(x->2*x); ImmutableList throws UnsupportedOperationException

        List<Integer> integerList = Arrays.asList(18,16,2);
        //integers.replaceAll(x->2*x); ImmutableList throws UnsupportedOperationException

        var map = new HashMap<Integer, Integer>();
        map.put(1,10);
        map.put(2,20);
        map.put(3, null);

        System.out.println("map");
        System.out.println(map);

        map.merge(1,3,Integer::sum);
        System.out.println("after merge:         map.merge(1,3,Integer::sum);");
        System.out.println(map);
    }
}
