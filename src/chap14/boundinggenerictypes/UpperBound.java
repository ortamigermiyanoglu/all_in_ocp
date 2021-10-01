package chap14.boundinggenerictypes;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {
    /*
    * java bu upper bound olayini  kendi yazdigin class'lar icin yapmana izin vermiyor
    * ama interface'ler icin yapmana izin veriyor
    * */

    public <T> int sum (List<? extends Number> list){
      int sum = 0;
        for ( Number num: list) {
            sum +=num.longValue();
        }
      return sum;
    };

    public static void main(String[] args) {
        UpperBound upperBound = new UpperBound();

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(5.3);
        doubleList.add(3.6);

        System.out.println(upperBound.sum(doubleList));

        Flyer myFlyer = new Flyer() {
            @Override
            public void fly() {
                System.out.println("Anon Flyer");
            }
        };

        Goose goose = new Goose();

        System.out.println("calling groupOfFlyers(List<? extends Flyer> flyers)");
        System.out.println("given parameter type to method call List<Flyer>");
        List<Flyer> flyers = new ArrayList<>();
        flyers.add(myFlyer);
        flyers.add(goose);
        upperBound.groupOfFlyers(flyers);
        upperBound.anyFlyer(flyers);

        System.out.println("calling anyFlyer(List<Flyer> flyers)");
        System.out.println("given parameter type to method call List<Goose>");
        List<Goose> gooseList = new ArrayList<>();
        gooseList.add(goose);
        /* DNC if that was possible different types of flyers, Geese, Seagulls etc.  would go into same method
        upperBound.anyFlyer(gooseList);
         */


    }

    private void anyFlyer(List<Flyer> flyers){
        for (Flyer flyer: flyers) {
            flyer.fly();
        }
    }

    private void groupOfFlyers(List<? extends Flyer> flyers){
        for (Flyer flyer: flyers) {
            flyer.fly();
        }
    }


}
