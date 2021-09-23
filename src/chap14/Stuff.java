package chap14;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Stuff {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public static void main(String[] args) {
        Set<Stuff> stuffSet = new TreeSet<>();
        /* throws runtime exception: ClassCastException -> cannot cast to comparable since Stuff doesn't implement Comparable
        stuffSet.add(new Stuff());
         */
        Set<Stuff> stuffSet1 = new TreeSet<>(Comparator.comparing(Stuff::getAge)); // now we can add some Stuff

    }


}
