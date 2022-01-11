package chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    final int intIste;
    MyArrayList(){
        this.intIste = 5;
    }
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); // initialCapacity default
        ArrayList list2 = new ArrayList(10); // initialCapacity
        ArrayList list3 = new ArrayList(list2);
        //list1.remove(0); //index out bound exception
        list1.remove("semir");
        String[] namesArray = {"Semir", "Ahmet", "Ibrahim", "Suleyman"};
        List<String> names = new ArrayList<>();
        names.add("Semir");
        names.add("Ahmet");
        var myVarList = new ArrayList<>();
        myVarList.add(1);
        myVarList.add("semir");
        myVarList.add(names);
        myVarList.add(namesArray);

        for (Object object : myVarList){
            System.out.println(object);
        }

        // parsing -> primitive
        // valueOf -> wrapper class
        int primitive = Integer.parseInt("123");
        Integer referenceTypeInt = Integer.valueOf(123);
        //Double aDouble = Double.valueOf("");  //NumberFormatException
        System.out.println(referenceTypeInt.equals(primitive));

        System.out.println(myVarList.contains("semir"));
        System.out.println(myVarList.contains(new String("semir")));
        System.out.println(myVarList.remove(new String("donk"))); //returns false donk doesn't exist


        // boolean remove(Object object)
        // E remove(int index)


        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");

        Object[] objects = list.toArray();
        String[] strings = list.toArray(new String[0]);
        list.clear();
        System.out.println(objects.length);
        System.out.println(strings.length);

        String[] names2 = new String[]{"semir", "ahmet"};
        List<String> nameList = Arrays.asList(names2);

//        nameList.remove(2);

        System.out.println(Math.min(5, 8.7));

        ArrayList l = new ArrayList();
        var myList = new ArrayList<String>();
        //myList.add(4); compile error

    }

}


