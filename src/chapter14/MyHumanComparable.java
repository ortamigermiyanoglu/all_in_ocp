package chapter14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyHumanComparable implements Comparable<MyHumanComparable> {
    private String humanName;
    private Integer humanAge;

    public MyHumanComparable(String humanName, Integer humanAge) {
        this.humanName = humanName;
        this.humanAge = humanAge;
    }

    @Override
    public String toString() {
        return "{" +
                "humanName='" + humanName + '\'' +
                ", humanAge=" + humanAge +
                '}';
    }

    @Override
    public int compareTo(MyHumanComparable o) {
//        if (humanAge==null || humanName == null){
//            throw  new IllegalArgumentException("missing human values");
//        }
        if (humanName.compareTo(o.humanName)==0) return humanAge.compareTo(o.humanAge);
        return humanName.compareTo(o.humanName);
    }

    public static void main(String[] args) {
        MyHumanComparable human1 = new MyHumanComparable("Foo", 25);
        MyHumanComparable human2 = new MyHumanComparable("Buzz", 31);
        MyHumanComparable human3 = new MyHumanComparable("Bar", 28);
        MyHumanComparable human4 = new MyHumanComparable("Foo", 17);
        MyHumanComparable human5 = new MyHumanComparable("Brian", null);

        /*ImmutableList.sort throws exception
        var humanList = List.of(human1, human2, human3, human4);
        */
        List<MyHumanComparable> humanList = new ArrayList<>();
        humanList.addAll(List.of(human1, human2, human3, human4, human5));

        Collections.sort(humanList);
        System.out.println(humanList);

        humanList.sort( (o1, o2) -> {
            if (o2.humanName.compareTo(o1.humanName)==0) return o2.humanAge.compareTo(o1.humanAge);
            return o2.humanName.compareTo(o1.humanName);
        });

        System.out.println(humanList);

//        humanList.sort((o1, o2) -> o2.humanAge-o1.humanAge);
//
//        System.out.println(humanList);

    }


}
