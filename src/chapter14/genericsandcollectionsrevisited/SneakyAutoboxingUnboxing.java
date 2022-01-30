package chapter14.genericsandcollectionsrevisited;

import java.util.ArrayList;

public class SneakyAutoboxingUnboxing {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(null);

        int npe = list.get(0); // THROWS NPE
    }
}
