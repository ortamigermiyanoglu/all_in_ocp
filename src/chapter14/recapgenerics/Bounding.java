package chapter14.recapgenerics;

import java.util.ArrayList;
import java.util.List;

public class Bounding {
    public static void main(String[] args) {
        Bounding bounding = new Bounding();

        List<?> list = new ArrayList<String>();
        /*
        * String a = list.get(1);
        */
        Object string = list.get(1);
        String a = (String) list.get(1);


        List<? extends Exception> exceptions = new ArrayList<RuntimeException>();

        List<? super Integer> superNumberList = new ArrayList<Number>();

        List<? extends Bird> birds = new ArrayList<>();


        //upper bound'ta generic parameter alan hicbir metod calismaz
        /*
        birds.add(new Sparrow());
        */

        List<Flyer> geese = new ArrayList<>();


        List<Goose> geese1 = new ArrayList<>();
        geese.add(new Goose());
        geese1.add(new Goose());

        /*
        * bounding.anyFlyer(geese1);
        */
        bounding.anyFlyer(geese);
        /*
        * bounding.anyFlyer(geese1);
        */



        List<FlyerExtender> flyerExtenders = new ArrayList<>();
        flyerExtenders.add(new Ufo());
        /*
        * bounding.anyFlyer(flyerExtenders);
        */
        bounding.groupOfFlyer(flyerExtenders);



        List<? extends Flyer> flyers = new ArrayList<>();
        FlyerExtender flyerExtender =() -> System.out.println("local anon FlyerExtender");
        //upper bound'ta generic parameter alan hicbir metod calismaz
        //flyers.add(flyerExtender);
        // ama yukardaki method parametresi olarak calisirdi


    }

    private void groupOfFlyer(List<? extends Flyer> flyers){flyers.forEach(Flyer::fly);}
    private void anyFlyer(List<Flyer> flyers){flyers.forEach(Flyer::fly);}
}
