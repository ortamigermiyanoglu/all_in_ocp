package chapter16;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class WorkingWithDatesAndTimes {
    {
        System.out.println("--------------LOCAL DATE--------------");
        System.out.println(LocalDate.now());
        System.out.println("--------------LOCAL TIME--------------");
        System.out.println(LocalTime.now());
        System.out.println("--------------LOCAL DATE TIME--------------");
        System.out.println(LocalDateTime.now());
        System.out.println("--------------ZONED DATE TIME--------------");
        System.out.println(ZonedDateTime.now());

    }

    class FormattingDatesAndTimes{
        {
            LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
            System.out.println(date.getDayOfWeek()); //TUESDAY
            System.out.println(date.getMonth()); // OCTOBER
            System.out.println(date.getYear()); //2020
            System.out.println(date.getDayOfYear()); //294

            LocalTime time = LocalTime.of(11,12,34);
            LocalDateTime dt = LocalDateTime.of(date,time);


            System.out.println("-------------- Formatting Dates and Times");
            System.out.println("--------------ISO LOCAL DATE--------------");
            System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
            System.out.println("--------------ISO LOCAL TIME--------------");
            System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
            System.out.println("--------------ISO LOCAL DATE TIME--------------");
            System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

            /*
            * If you don't want to use one of the predefined formats, DateTimeFormatter supports a custom
            * format using a date format String
            * */

            var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
            System.out.println("--------------ofPattern(\"MMMM dd, yyyy 'at' hh:mm\")--------------");
            System.out.println(dt.format(f));


            /* below line will throw DateTimeException: unable to extract zone id from temporal
            * var f = DateTimeFormatter.ofPattern('h:mm z')
            * dt.format()
            * */

            var localDateTime = LocalDateTime.of(2020, Month.OCTOBER, 20,6,15,30);
            var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:s");
            var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
            var formatter3 = DateTimeFormatter.ofPattern("hh:mm:ss zz");

            System.out.println(formatter1.format(localDateTime));
            System.out.println(formatter2.format(localDateTime));
            /*
            * DateTimeException: Unable to extract ZoneId from temporal 2020-10-20T06:15:30
            * System.out.println(formatter3.format(localDateTime));
            * */


            var zonedDateTime = ZonedDateTime.now();
            var formatter4 = DateTimeFormatter.ofPattern("hh:mm:ss z");
            System.out.println(formatter4.format(zonedDateTime));


            System.out.println("--------------ADDING CUSTOM TEXT VALUES--------------");
            var formatter5 = DateTimeFormatter.ofPattern("MMMM dd, YYYY 'at' hh:mm");
            System.out.println(formatter5.format(localDateTime));

            var formatter6 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
            System.out.println(formatter6.format(localDateTime));

        }
    }


    public static void main(String[] args) {

        var main = new WorkingWithDatesAndTimes();
        main.new FormattingDatesAndTimes();
    }
}
