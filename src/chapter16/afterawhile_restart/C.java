package chapter16.afterawhile_restart;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class C extends A{

    public static void main(String[] args) {
        /* DNC
        try {
            throw new A();
        } catch (C a){
            System.out.println("exception catched");
        }
         */

        var ldt = LocalDateTime.of(2020,5,10,11,12,33);
        var dtf = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println(dtf.format(ldt));
    }
}
