package chapter14;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Console;
import java.util.Objects;

public class EqualsHashCodeToString {

    public static void main(String[] args) {
        Console console = System.console();
//        Objects.requireNonNull(console);

        EqualsHashCodeToString instance = new EqualsHashCodeToString();

        String s1 = new String("Lion");
        String s2 = new String("Lion");
//        console.writer().println(s1.equals(s2)); // prints true
        System.out.println(s1.equals(s2));


        StringBuilder sb1 = new StringBuilder("Lion");
        StringBuilder sb2 = new StringBuilder("Lion");
//        console.writer().println(sb1.equals(sb2)); //prints false
        System.out.println(sb1.equals(sb2));

        Lion lion = instance.new Lion();
        lion.idNumber = 5;
        lion.name = "Leo";
        lion.weight = 55.6;


        System.out.println(lion);


    }

    class Lion{
        private Integer idNumber;
        private String name;
        private Double weight;
        private int sadi;

        @Override
        public String toString() {
            return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                    .append("idNumber", idNumber)
                    .append("name", name)
                    .append("weight",weight)
                    .toString();
//            return "Lion{" +
//                    "idNumber=" + idNumber +
//                    ", name='" + name + '\'' +
//                    ", weight=" + weight +
//                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Lion)) return false;
            Lion lion = (Lion) o;
//            return Objects.equals(idNumber, lion.idNumber);
            return new EqualsBuilder().append(idNumber,lion.idNumber).isEquals();
        }

        /*
        * if equals() returns true when called with two objects, calling hashCode()
        * on each of those objects must return the same result. This means hashCode()
        * can use a subset of variables that equals() uses
        *
        * if equals() returns false when called with two objects, callings hashCode() on each of those
        * objects doesn't have to return a different result. This means hashCode() results do not need to be
        * unique when called on unequeal objects
        *
        * */
        @Override
        public int hashCode() {
            return Objects.hash(idNumber, name, weight);
//            return sadi.hashCode(); DNC
        }


    }
}
