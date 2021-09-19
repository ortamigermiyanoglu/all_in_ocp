package chap8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HidingSub extends HidingSuper {
    protected boolean isSuper = false;

    public void changeParam(int ll){
        System.out.println("hiding sub");

    }

    public void covariantWider(ArrayList<Integer> integerList){
        System.out.println("in hidingSub");
    }


    public void sulu(){
        System.out.println("sülü");
    }
    public static void  eat(){
        System.out.println("sub is eating");
    }

    public static ArrayList<Integer> giveMeMyList(){
        ArrayList<Integer> integerList = new ArrayList<>();
        return integerList;
    }

    public static void main(String[] args) {
        HidingSuper sup = new HidingSub();
        HidingSub sub = new HidingSub();
//        HidingSub hidingSub = (HidingSub) new HidingSuper();
        HidingSuper hidingSuper = new HidingSub();
        hidingSuper.eat();
        sub.eat();

        sub.sulu();

        sub.changeParam((byte) 5);

        System.out.println(sub.isSuper);
        System.out.println(sup.isSuper);

        System.out.println("------------------------------");
        System.out.println("polymorhipsm");
        System.out.println("------------------------------");


        HidingSuper superPoli = new HidingSub();
        HidingSub subPoli = new HidingSub();
//        HidingSub subPoli2 = (HidingSub) new HidingSuper();

        System.out.println("superPoli");
        superPoli.changeParam(4);
        System.out.println("subPoli");
        superPoli.changeParam(4);
        System.out.println("subPoli2");
//        subPoli2.changeParam(4);




    }
}
