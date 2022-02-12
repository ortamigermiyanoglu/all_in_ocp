package chapter16;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class SupportintInternalizationAndLocalization {
    class PickingLocale{
        /* Two different formats of Locale
         * 1. lowercase(must) language code(must). For instance: fr
         * 2. lowercase(must) language code, uppercase country code(optional). For instance: en_US
         *
         * RULES:
         *
         * cannot have country code without language
         * language and country code are seperated by an underscore
         * language code must be lowercase
         * the order cannot be reversed, first language code and then country code
         * */

        {
            var locale = Locale.getDefault();
            System.out.println(locale);


            System.out.println(Locale.GERMAN); //de
            System.out.println(Locale.GERMANY); //de_DE

            System.out.println(new Locale("fr"));
            System.out.println(new Locale("hi", "IN"));

            System.out.println(new Locale.Builder().setRegion("TR").setLanguage("tr").build());

            var nonsenseLocale = new Locale("sf98");

            Locale.setDefault(nonsenseLocale);
            System.out.println(Locale.getDefault());

        }
    }


    class LocalizingNumbers{
        /* Factory methods to get a NumberFormat
        * NumberFormant.getInstance(), NumberFormat.getInstance(locale)
        * NumberFormant.getNumberInstance(), NumberFormat.getNumberInstance(locale)
        * last two lines are the same
        *
        * NumberFormat.getCurrencyInstance(), NumberFormat.getCurrencyInstance(locale)
        * NumberFormat.getPercentInstance(), NumberFormat.getPercentInstance(locale)
        * NumberFormant.getIntegerInstance(), NumberFormat.getIntegerInstance(locale)
        *
        * Once you have the NumberFormat instance, you can call format() to turn a number into
        * a String, or you can use parse() to turn a String into a number
        * */


        {

            var attendeesPerYear = 3_200_000;
            var attendeesPerMonth = attendeesPerYear / 12;

            var usNF = NumberFormat.getInstance(Locale.US);
            var grNF = NumberFormat.getInstance(Locale.GERMANY);
            var caNF = NumberFormat.getInstance(Locale.CANADA_FRENCH);
            System.out.println(usNF.format(attendeesPerMonth));
            System.out.println(grNF.format(attendeesPerMonth));
            System.out.println(caNF.format(attendeesPerMonth));


            /*
            * In real life projects use BigDecimal or int for money not double/float
            * */
            double price = 48;
            var myPriceLocale1 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
            var myPriceLocale2 = NumberFormat.getCurrencyInstance(Locale.CANADA);
            var myPriceLocale3 = NumberFormat.getCurrencyInstance(Locale.UK);
            System.out.println(myPriceLocale1.format(price));
            System.out.println(myPriceLocale2.format(price));
            System.out.println(myPriceLocale3.format(price));


        }

    }


    class ParsingNumbers{
        /*
        * when we parse data, we convert it from a String to a structured Object or primitive value
        * */

        {
            String s = "40.45";
            String income = "$92,807.99";
            var en = NumberFormat.getInstance(Locale.US);
            var fr = NumberFormat.getInstance(Locale.FRANCE);
            var enCurrency = NumberFormat.getCurrencyInstance(Locale.US);
            try {
                System.out.println(en.parse(s));
                System.out.println(fr.parse(s));
                System.out.println(enCurrency.parse(income));
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
    }

    class WritingCustomNumberFormatter{
        /* Symbol       Meaning                                                 Example
        *    #          omit the position if no digit exists for it             $2.2
        *    0          Put a 0 in the position if no digit exists for it       $002.20
        * */

        {
            double d = 1234567.891;
            var f1 = new DecimalFormat("###,###,###.0");
            var f2 = new DecimalFormat("000,000,000.00000");
            var f3 = new DecimalFormat("$#,###,###.##");

            System.out.println("----------------Custom Number Formatter----------------");
            System.out.println(f1.format(d));
            System.out.println(f2.format(d));
            System.out.println(f3.format(d));

        }
    }


    class LocalizingDates{
        /*      Description                     Using default locale
        * For formatting dates                  DateTimeFormatter.ofLocalizedDate(dateStyle)
        * For formatting times                  DateTimeFormatter.ofLocalizedTime(timeStyle)
        * For formatting dates and times        DateTimeFormatter.ofLocalizedDateTime(dateStyle,timeStyle)
        *                                       DateTimeFormatter.ofLocalizedDateTime(dateTime)
        * */

        {
            System.out.println("----------------Localizing Dates----------------");
            var localDateTime = LocalDateTime.of(2020, Month.OCTOBER, 20, 15,12,34);
            var locale1 = Locale.ITALY;
            var locale2 = Locale.US;
            var dtf1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale1);
            var dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(locale2);

            System.out.println(localDateTime.format(dtf1));
            System.out.println(dtf2.format(localDateTime));
            /*
            * throws UnsupportedTemporalTypeException
            *
            * System.out.println(LocalDate.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
            *
            * */
        }
    }

    /* Locale.Category
    *   VALUE               Description
    *   DISPLAY             Category used for displaying data about the locale
    *   FORMAT              Category used for formatting dates,numbers, or currencies
    * */

    public void printCurrency(Locale locale, double money){
        System.out.println(NumberFormat.getCurrencyInstance().format(money)
        +" , "+ locale.getDisplayLanguage());
    }

    public static void main(String[] args) {
        var main = new SupportintInternalizationAndLocalization();
        main.new PickingLocale();
        main.new LocalizingNumbers();
        main.new ParsingNumbers();
        main.new WritingCustomNumberFormatter();
        main.new LocalizingDates();


        var spain = new Locale("ES", "ES");
        var money = 1.23;

        /*
        *Language codes are case insensitive, but the Locale class always use lowercase versions
        * of the language codes.
        */
        Locale.setDefault(new Locale("en", "US"));
        main.printCurrency(spain,money);

        Locale.setDefault(Locale.Category.DISPLAY, spain);
        main.printCurrency(spain,money);

        Locale.setDefault(Locale.Category.FORMAT, spain);
        main.printCurrency(spain,money);

    }


}
