package chap5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Review {

    int a;
    static int b;


    public void isteOyle(){
        int a = 9;
    }
    public static void main(String[] args) {
        int b = 0;

        var s = "Hello";
        String m = "m";
        String anotherM = new String(m);
        String aStr = new String(s);

        System.out.println(m==anotherM);

        System.out.println(s==aStr);

        Object[][][] objects = new Object[3][0][3];


        int a[] = new int[5];


        List<Integer> list = Arrays.asList(10,4,0-1,5);
        list.add(8);


        Collections.sort(list);

        System.out.println(list);

        Integer.valueOf("7");
        Integer.parseInt("42");


    }
}
