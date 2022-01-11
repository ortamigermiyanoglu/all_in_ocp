package chapter15;

import java.util.Optional;

public class DealingWithEmtyOptional {

    public static void main(String[] args) {
        DealingWithEmtyOptional dealer = new DealingWithEmtyOptional();
        Optional<Double> opt = dealer.average();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
        System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
        System.out.println(opt.orElseThrow());

        /* DNC. orElseGet must return Double so supplier must supply Double not IllegalStateException
        System.out.println(opt.orElseGet(() -> new IllegalStateException()));
        */
    }

    public Optional<Double> average(int... scores){
        if (scores.length==0) return Optional.empty();
        int sum = 0;
        for (int score:
                scores) {
            sum += score;
        }
        return Optional.of((double)sum / scores.length); // *********
    }

}
