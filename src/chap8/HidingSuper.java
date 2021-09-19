package chap8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HidingSuper {
    protected boolean isSuper = true;
    public void covariantWider(List<Integer> integerList){
        System.out.println("in hidingSup");
    }

    public void changeParam(long l){}
    public void changeParam(int ll){
        System.out.println("hiding sup");

    }
    public static List<Integer> giveMeMyList(){
        List<Integer> integerList = new LinkedList<>();
        return integerList;
    }
    public static void  eat(){
        System.out.println("super is eating");
    }
}
