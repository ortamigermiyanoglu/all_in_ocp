package chapter16;

import java.util.Locale;
import java.util.ResourceBundle;

public class LoadingPropertiesWithResourceBundles {

    public void printWelcomeMessage(Locale locale){

        /* below uses default locale
        * ResourceBundle.getBundle("ResourceBundleName");
        * */
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello") + " " + rb.getString("open"));
    }

    public void printResourceKeyPairs(Locale locale){
        var rb = ResourceBundle.getBundle("Zoo", locale);
        rb.keySet().forEach(k-> System.out.println(k + "=" + rb.getString(k)));
    }

    public static void main(String[] args) {
        var enUS = new Locale("en", "US");
        var frFR = new Locale("fr", "FR");
        var enCa = new Locale("en", "CA");
        var frCA = new Locale("fr", "FR");

        var lpwr = new LoadingPropertiesWithResourceBundles();

        System.out.println("------------Welcoming in different locales------------");
        lpwr.printWelcomeMessage(enUS);
        lpwr.printWelcomeMessage(frFR);
        System.out.println("------------Printing key-values in different resource bundles------------");
        lpwr.printResourceKeyPairs(enUS);
        lpwr.printResourceKeyPairs(frFR);




    }
}
