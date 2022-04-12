package chapter16.afterawhile_restart;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class WorkingWithDatesAndTimes {


    public static void main(String[] args) {
        var wwdat = new WorkingWithDatesAndTimes();
        wwdat.printNow();
        wwdat.usingOf();
        wwdat.customDTF();

    }


    private void printNow(){
        System.out.println("---printNow method---");
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
    }

    private void usingOf(){
        System.out.println("------usingOf method------");
        LocalDate localDate = LocalDate.of(2022, 4,12);
        LocalTime localTime = LocalTime.of(10,25,31,568100230);
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate,localTime, ZoneId.of("Asia/Istanbul"));

        System.out.println(zonedDateTime);
    }

    private void getDataOutOfLocalDateObject(){
        System.out.println("------getting data from local date object------");
        LocalDate localDate = LocalDate.of(2020, Month.OCTOBER,20);
        System.out.println(localDate.getDayOfWeek()); //TUESDAY
        System.out.println(localDate.getMonth()); //OCTOBER
        System.out.println(localDate.getYear()); //2020
        System.out.println(localDate.getDayOfYear()); //294
    }

    private  void dtfStandartISOFormatting(){
        System.out.println("------formatting with predefined formatter------");
        LocalDate localDate = LocalDate.of(2020, Month.OCTOBER,20);
        LocalTime localTime = LocalTime.of(11,12,34);

        LocalDateTime dt = LocalDateTime.of(localDate,localTime);

        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE)); // 2020-10-20
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_TIME)); // 11:12:34
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // October 20,2020 at 11:12
    }

    private void customDTF(){
        System.out.println("------formatting with custome date time formatter------");

        LocalDate localDate = LocalDate.of(2020, Month.OCTOBER,20);
        LocalTime localTime = LocalTime.of(11,12,34);

        LocalDateTime dt = LocalDateTime.of(localDate,localTime);

        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        /* let's break this down a bit
        * case matters m-> minute M-> month
        * number of symbols matters such as single M in month 1 for January
        * MM 01 ; MMM prints three letter abbreviation JAN; MMMM January
        *
        * */
        System.out.println("formatting " + dt.toString() +" :" +f1.format(dt));



        LocalDateTime dt2 = LocalDateTime.of(2020, Month.OCTOBER,20,6,15,30);
        var f2 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss:SSSS a");
        System.out.println("formatting " + dt2.toString() + " :"+f2.format(dt2));

        var f3 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
        System.out.println("formatting " + dt2.toString() + " :"+f3.format(dt2));

        var f4 = DateTimeFormatter.ofPattern("h:mm:s a");
        System.out.println("formatting " + dt2.toString() + " :"+f4.format(dt2));

        var f5 = DateTimeFormatter.ofPattern("'HAPPY NEW YEAR' yyyy'!'");
        System.out.println("formatting " + dt2.toString() + " :"+f5.format(dt2));


        var f6 = DateTimeFormatter.ofPattern("MMMM dd', Part''s at' hh:mm");
        /*
        * double '' is escaping character for placing ' in formatter
        * */
        System.out.println("formatting " + dt2.toString() + " :"+f6.format(dt2));





    }



}
