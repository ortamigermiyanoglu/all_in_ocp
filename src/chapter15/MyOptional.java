package chapter15;

import java.util.Optional;

public class MyOptional {
    public Optional<Double> average(int... scores){
        if (scores.length==0) return Optional.empty();
        int sum = 0;
        for (int score:
             scores) {
            sum += score;
        }
        return Optional.of((double)sum / scores.length); // *********
    }

    public static void main(String[] args) {
        MyOptional myOptional = new MyOptional();

        Optional<Double> average1 = myOptional.average(90,100);
        Optional<Double> average2 = myOptional.average();

        System.out.println(average1);
        System.out.println(average2);

        /* throws NoSuchElementException
        System.out.println("average is: " + average2.get());
        */

        if (average1.isPresent()) System.out.println("average is: " + average1.get()); // below performs the same
        average1.ifPresent(aDouble -> System.out.println("average is: " + aDouble)); // ifPresent(Consumer<T> c)

        String value = "Semirella";
        Optional<String> optionalS = value == null ? Optional.empty() : Optional.of(value); // below is the same
        Optional<String> optionalS1 = Optional.ofNullable(value);

        /* throws NoSuchElementException
        optionalS1.get();
        */

        /*
        * get() if empty then throws NSEE
        * ifPresent(Consumer<T> c)
        * isPresent()
        * orElse(T other)
        * orElseGet(Supplier s)
        * orElseThrow() if empty then throws NSEE otherwise return value
        * orElseThrow(Supplier) if empty then throws supplier's return exception
        * */

    }

}
