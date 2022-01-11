package chapter14.reviewquestions;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sorted implements Comparable<Sorted>, Comparator<Sorted> {
    private int num;
    private String text;

    public Sorted(int num, String text) {
        this.num = num;
        this.text = text;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int compareTo(Sorted o) {
        return text.compareTo(o.text);
    }

    @Override
    public int compare(Sorted o1, Sorted o2) {
        return o1.num-o2.num;
    }

    public static void main(String[] args) {
        var s1 = new Sorted(88,"a");
        var s2 = new Sorted(55,"b");

        var t1 = new TreeSet<Sorted>();
        t1.add(s1); t1.add(s2);
        var t2 = new TreeSet<Sorted>(s1);
        var t3 = new TreeMap<String, String>(Comparator.comparing(String::length));
        t2.add(s1); t2.add(s2);
        System.out.println(t1);
        System.out.println(t2);

    }

    @Override
    public String toString() {
        return "{" +
                "num=" + num +
                ", text='" + text + '\'' +
                '}';
    }
}
