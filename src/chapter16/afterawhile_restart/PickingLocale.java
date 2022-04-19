package chapter16.afterawhile_restart;

import java.util.Locale;

public class PickingLocale {


    public static void main(String[] args) {
        PickingLocale pl = new PickingLocale();
        pl.commonMethods();


    }


    private void commonMethods(){

        Locale defaultLocale = Locale.getDefault();
        System.out.println(defaultLocale);

        Locale l1 = new Locale.Builder().setLanguage("en").setRegion("US").build();

        Locale l2 = new Locale("fr");

        Locale l3 = new Locale("TR");
        System.out.println(l3.getDisplayLanguage());
        System.out.println(l3.getCountry()); // empty string

        Locale.setDefault(l3);
    }




}
