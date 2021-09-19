package chap12.reviewquestions;

import java.util.function.Predicate;

public class Hyena {
    private int age = 1;

    public static void main(String[] args) {
        var p  = new Hyena();
        double height = 10;
        int age = 1;
        testLaugh(p, var -> p.age<10);
        age = 2;

    }

    static void testLaugh(Hyena panda, Predicate<Hyena> joke){
        var r =  joke.test(panda) ? "hahaha" : "silence";
        System.out.println(r);
    }

}
