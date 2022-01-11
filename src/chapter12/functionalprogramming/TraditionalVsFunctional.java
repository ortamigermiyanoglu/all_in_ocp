package chapter12.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalVsFunctional {
    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true,true));
        animals.add(new Animal("rabbit", true, false));

        TraditionalVsFunctional callPrint = new TraditionalVsFunctional();

        System.out.println("---------------- can hop ----------------");
        callPrint.print(animals, a -> a.canHop());
        System.out.println("---------------- can swim ---------------");
        callPrint.print(animals, (Animal a) -> {return a.canSwim();});

    }

    public void print(List<Animal> animals, Predicate<Animal> checker){
        for (Animal animal : animals) {
            if (checker.test(animal)){
                System.out.println(animal.toString());;
            }
        }
    }
}
