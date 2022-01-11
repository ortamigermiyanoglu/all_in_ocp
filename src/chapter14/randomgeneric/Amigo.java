package chapter14.randomgeneric;

import chapter14.genericmethods.Crate;

import java.util.ArrayList;
import java.util.List;

public class Amigo<T>{
    /*
    * Amigo<T> and <T> T tricky doesn't have to be same
    *
    */

    public <T> T tricky(T t){
        System.out.println("inside tricky");
        return t;
    }

    public Amigo(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Amigo<String> stringAmigo = new Amigo<>("depremler oluyor beynimde");

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3));
        Crate<List<Integer>> listCrate = new Crate<>(integerList);

        stringAmigo.tricky(listCrate);
    }

}
