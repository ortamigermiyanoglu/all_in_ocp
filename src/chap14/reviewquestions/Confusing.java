package chap14.reviewquestions;

public class Confusing {
    public static <T> boolean compare(T t1, T t2) {
        return t1.equals(t2);
    }

    public static void main(String[] args) {
        System.out.println(Confusing.<String>compare("a", "a"));
        System.out.println(Confusing.<Sorted>compare(new Sorted(4,"Samir"), new Sorted(4, "Nasri")));
        System.out.println(Confusing.compare("Earling", 123)); // this is a bit confusing
    }
}
