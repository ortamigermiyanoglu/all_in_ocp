package chapter16.afterawhile_restart;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocalizingNumbers {

    /*
    * formatting or parsing currency and number values can change
    * depending on your locale for example
    * $ 2.15
    * 2.15 €
    * */

    /*
    * once we have the NumberFormat instance you can call format () to turn a number into a String,
    * or you can use parse() to turn a String into a number
    * */

    public static void main(String[] args) {
        var ln = new LocalizingNumbers();
        ln.formatCountingNumbers();
        ln.formattingCurrency();
        ln.parsingNumbers();
        ln.parsingCurrency();
    }

    public void formatCountingNumbers(){
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        System.out.println(NumberFormat.getInstance(Locale.US).format(attendeesPerMonth)); //266,666
        System.out.println(NumberFormat.getNumberInstance(Locale.GERMANY).format(attendeesPerMonth)); //266.666
        System.out.println(NumberFormat.getIntegerInstance(Locale.CANADA_FRENCH).format(attendeesPerMonth)); //266 666
    }


    public void formattingCurrency(){
        double price = 48;

        var myCurrencyFormatter = NumberFormat.getCurrencyInstance(new Locale("tr_TR"));
        System.out.println(myCurrencyFormatter.format(price));

        var myCurrencyFormatter2 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(myCurrencyFormatter2.format(price));
    }


    public void parsingNumbers(){
        var frenchLocaleParser = NumberFormat.getInstance(Locale.FRENCH);
        var usLocaleParser = NumberFormat.getInstance(Locale.US);
        String s1 = "40.45";
        String s2 = "40,45";

        try {
            System.out.println(frenchLocaleParser.parse(s1));
            System.out.println(frenchLocaleParser.parse(s2));

            System.out.println(usLocaleParser.parse(s1));
            System.out.println(usLocaleParser.parse(s2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void parsingCurrency(){
        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance();
        try {
            double value = (Double) cf.parse(income);
            System.out.println(income);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }






}
