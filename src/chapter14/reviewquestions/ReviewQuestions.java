package chapter14.reviewquestions;

import java.io.IOException;
import java.util.*;

public class ReviewQuestions {
    public static void main(String[] args) {
        ReviewQuestions review = new ReviewQuestions();
        List<?> q = List.of("Semir", "Ahmet");
        var v = List.of("Semir", "Ahmet");
        var y = Arrays.asList(q);

        //q.removeIf(String::isEmpty); DNC, it takes generic parameter
        //v.removeIf(s -> s.length()==4); // throws UnsupportedOperationException immutable list


        var nums = new HashSet<Number>();
        nums.add(Integer.valueOf(86));
        nums.add(75);
        nums.add(Integer.valueOf(86));
        nums.add(null);
        nums.add(309L);

        Iterator iterator = nums.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------------------");
        String[] values = {"123","Abc", "abc"};
        Arrays.sort(values);

        for (String value : values) {
            System.out.println(value);
        }

        System.out.println("-----------------------------");
        Arrays.sort(values, new MyComparator());
        for (String value : values) {
            System.out.println(value);
        }


        ArrayList<? super Date> dateLowerBound = new ArrayList<Date>();
        review.showSize(dateLowerBound);

        List<?> unboundedList = new ArrayList<Integer>();
        review.showSize(unboundedList);

        List<? extends Exception> exceptionListU = new LinkedList<IOException>();
        //List<Exception> exceptionList = new LinkedList<IOException>(); // DNC
        //List<? super Exception> exceptionListL = new LinkedList<IOException>(); // DNC

        ArrayList<? extends Number> numberUpperBound = new ArrayList<Integer>();
        review.showSize(numberUpperBound);

        List<Number> numberList = new ArrayList<>();
        numberList.add(Integer.valueOf(3));

        ArrayList<Number> numberArrayList = new ArrayList<>();
        numberArrayList.add(Integer.valueOf(3));

        review.justNothing(numberList);
        review.justNothing(numberArrayList);

        Comparator<Integer> comparator1 = Integer::compareTo;
        Comparator<Integer> comparator2 = Comparator.naturalOrder();
        Comparator<Integer> comparator3 = Comparator.reverseOrder();

        var list = Arrays.asList(5,4,7,2);
        Collections.sort(list, comparator1);
        System.out.println(list);

        //UnsupportedOperationException
        //list.add(99);

        var map = Map.of(1,2,3,6);
        var listt = List.copyOf(map.entrySet());

//        listt.replaceAll(x -> Map.entry(x.getKey(), x.getValue()*2));


        Set<?> set = Set.of("lion", "tiger", "bear");

        var s = Set.copyOf(set);

        s.forEach(System.out::println);

        var listIntegerComparator = Arrays.asList(5,4,7,2);
        System.out.println("---------liste----------");
        System.out.println(listIntegerComparator);
        System.out.println("--- sorting: o1-o2 ------");
        Collections.sort(listIntegerComparator, (o1,o2)->o1-o2);
        System.out.println(listIntegerComparator);
        System.out.println("---------compareint method---");
        Collections.sort(listIntegerComparator, Comparator.naturalOrder());
        System.out.println(listIntegerComparator);

    }

    private void showSize(List<?> list){
        System.out.println(list.size());
    }

    private void justNothing(List<Number> numberList){
        System.out.println(numberList);
    }

}
