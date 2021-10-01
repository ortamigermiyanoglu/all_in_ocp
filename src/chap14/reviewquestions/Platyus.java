package chap14.reviewquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Platyus {
    String name;
    int beakLength;

    public Platyus(String name, int beakLength) {
        this.name = name;
        this.beakLength = beakLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeakLength() {
        return beakLength;
    }

    public void setBeakLength(int beakLength) {
        this.beakLength = beakLength;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", beakLength=" + beakLength +
                "}\n";
    }

    public static void main(String[] args) {
        Platyus p1 = new Platyus("Paula", 3);
        Platyus p2 = new Platyus("Peter", 5);
        Platyus p3 = new Platyus("Peter", 7);

//        List<Platyus> list = List.of(p1, p2,  p3); if we use this it throws unsupportedoperationexception
        List<Platyus> list = Arrays.asList(p1, p2, p3);

        Collections.sort(list, Comparator.comparing(Platyus::getBeakLength).reversed());
        Collections.sort(list, Comparator.comparing(Platyus::getName).thenComparingInt(Platyus::getBeakLength));


        /* Arrays.asList size cannot be changed
        list.add(new Platyus("Semir", 29));
        list.remove(2);
        */
        list.set(2, new Platyus("Semir", 29));
        System.out.println(list);

    }

}
