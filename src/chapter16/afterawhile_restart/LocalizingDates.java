package chapter16.afterawhile_restart;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalizingDates {

    /*
    *
    * For formatting dates:             DateTimeFormatter.ofLocalizedDate(dateStyle)
    * For formatting times:             DateTimeFormatter.ofLocalizedTime(timeStyle)
    * For formatting dates and times:   DateTimeFormatter.ofLocalizedDateTime(dateStyle, timeStyle)
    * For formatting dates and times:   DateTimeFormatter.ofLocalizedDataTime(dateTimeStyle)
    *
    * */


    public static void main(String[] args) {
        var ld = new LocalizingDates();

        var us = new Locale("en", "US");
        var italy = new Locale("it", "IT");

        Locale.setDefault(us);
        System.out.println(Locale.getDefault());

        System.out.println("US \t\t\t\t\t\t ITALY");

        var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 15, 12, 34);
        ld.print(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM), dt, italy);

        ld.print(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM), dt, italy);



    }

    public void print(DateTimeFormatter dtf, LocalDateTime localDateTime, Locale locale){
        System.out.println(dtf.format(localDateTime) + "\t\t"
        + dtf.withLocale(locale).format(localDateTime));
    }
}
