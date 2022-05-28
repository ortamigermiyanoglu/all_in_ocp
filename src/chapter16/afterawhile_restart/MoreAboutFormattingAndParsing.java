package chapter16.afterawhile_restart;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class MoreAboutFormattingAndParsing {

    public static void main(String[] args) {
        var mafap = new MoreAboutFormattingAndParsing();
        mafap.formattingNumbers();
        mafap.customNumberFormatter();
        mafap.specifyingLocaleCategory();

        LocalDate localDate = LocalDate.parse("2020-04-30T11:15", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        LocalDate localDate1 =  LocalDate.parse("2020-04-30",DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(localDate.getYear() + " " + localDate.getMonth() + " " + localDate.getDayOfMonth());

    }

    public void workingWithDatesAndTimes(){

    }


    public void customNumberFormatter(){
        double d = 1234567.467;
        long l = 1234567467l;

        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d));
        System.out.println(f1.format(l));

        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println(f2.format(d));
        System.out.println(f2.format(l));
    }


    public void formattingNumbers(){
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear/12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));

        var de = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(de.format(attendeesPerMonth));

        var ca = NumberFormat.getNumberInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));

        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));
    }

    public void specifyingLocaleCategory(){
        var spain = new Locale("es", "ES");
        var money = 1.23;

        Locale.setDefault(new Locale("en", "US"));
        printCurrency(spain,money); // $1.23, Spanish

        Locale.setDefault(Locale.Category.DISPLAY, spain);
        printCurrency(spain,money); //$1.23, español

        Locale.setDefault(Locale.Category.FORMAT, spain);
        printCurrency(spain, money); //1,23 €, español

    }

    private void printCurrency(Locale locale, double money){
        System.out.println(NumberFormat.getCurrencyInstance().format(money)
                + ", "+locale.getDisplayLanguage());
    }




    private void somethingAboutResourceBundle(){
        var rb = ResourceBundle.getBundle("Zoo", Locale.US);
        System.out.println(rb.getString("hello" + ", " + rb.getString("open")));
        rb.keySet().stream().map(k-> k + ": " + rb.getString(k)).forEach(System.out::println);

        var anotherRb = ResourceBundle.getBundle("Zoo", Locale.US);
    }

    private void formattingMessages(){
        var rb = ResourceBundle.getBundle("Zoo", Locale.getDefault());
        //helloByName = Hello, {0}, and {1}

        String format = rb.getString("helloByName");
        System.out.println(MessageFormat.format(format, "Tammy", "Henry"));
        //Hello, Tammy and Henry`
    }

    private void usingPropertiesClass(){
        var props = new Properties();
        props.setProperty("name", "Our Zoo");
        props.setProperty("open", "10am");

        System.out.println(props.getProperty("camel")); //null
        System.out.println(props.getProperty("camel", "Bob"));
    }


}
