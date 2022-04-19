package chapter16.afterawhile_restart;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CustomFormatter {
    /*
    * Symbol        Meaning                                             Example
    *  #            omit the position if no digit exists                $2.2
    *  0            put 0 in the position if no digit exists for it     $002.20
    * */

    public static void main(String[] args) {
        var cf = new CustomFormatter();
        cf.customFormat();
    }


    public void customFormat(){
        double d = 1234567.467;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d));

        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println(f2.format(d));

        NumberFormat f3 = new DecimalFormat("$#,###,###.##");
        System.out.println(f3.format(d));
    }



}
