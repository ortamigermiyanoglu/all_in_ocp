package chapter14;

import java.util.*;

public class MyUsingWrapperClasasesAndDiamondOperator{


    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        var heights = new ArrayList<Integer>();
        heights.add(2);
        heights.add(null);

        /* diamond icine Integer yazmasam asagidaki satir calisirdi
        heights.add(new String());
         */

        // diamond icine integer yazmasam assignment'a cast islemi gerekirdi
        Integer anInteger = heights.get(1);

        /*
        int anInt = (int) heights.get(1); // throws run time exception
        */


        /*
        *Eger liste asagidaki gibi olsaydi int ve Integer da compile error alirdim. cast object to integer
        *var heights = new ArrayList<>();
        Integer anInteger = heights.get(1);
        int anInt = heights.get(1);
        *
         */

        List<Integer> integerList = new ArrayList<>();

        /* below DNC
         * List<> integerList = new ArrayList<Integer>();
         *
         *
         * */


        List numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(Integer.valueOf(3));
        numbers.add(Integer.valueOf(5));
        numbers.add(new StringBuilder("Hacı"));

        numbers.remove(1);
        numbers.remove(Integer.valueOf(5));

        System.out.println(numbers);

    }
}
