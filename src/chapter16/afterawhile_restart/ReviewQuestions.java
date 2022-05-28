package chapter16.afterawhile_restart;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class ReviewQuestions {
    static class TV implements AutoCloseable{
        @Override
        public void close() {
            System.out.println("closing");
        }
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2020-04-30", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        LocalDate localDate = LocalDate.parse("2020-04-30", DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); RuntimeException

        System.out.println(localDate.getYear() + " "
        + localDate.getMonthValue() + " " + localDate.getDayOfMonth());

        double  double1= 1234.0;
        String formattedDouble1 = new DecimalFormat("0,000.0#").format(double1);
        System.out.println(formattedDouble1);

        String formattedDouble2 = new DecimalFormat("#,###.0").format(double1);
        System.out.println(formattedDouble2);

        var rq = new ReviewQuestions();
        rq.practiceMoreDecimalFormat();

    }



    public void  practiceMoreDecimalFormat(){
        String pattern = "0,000.0#";
        var message = DoubleStream.of(5.21,8.49,1234).mapToObj(v -> new DecimalFormat(pattern).format(v))
                .collect(Collectors.joining("> <"));
        System.out.println("<"+message+">");

        int magic = 6;

        assert (magic > 0) : "ohNo";

        String s = null;
        int check = 10;
        assert  s != null : check++;

    }
}
