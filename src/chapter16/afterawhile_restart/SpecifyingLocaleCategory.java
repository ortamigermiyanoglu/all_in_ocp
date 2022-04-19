package chapter16.afterawhile_restart;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class SpecifyingLocaleCategory {

    public static void main(String[] args) {
        var slc = new SpecifyingLocaleCategory();

        var spain = new Locale("es", "ES");
        var germany = Locale.GERMANY;
                //new Locale("de", "DE");
        var money = 1.23;

        Locale.setDefault(Locale.US);
        slc.printCurrency(spain,money);

        Locale.setDefault(Locale.Category.DISPLAY, germany);
        slc.printCurrency(spain,money);

        Locale.setDefault(Locale.Category.FORMAT, germany);
        slc.printCurrency(spain,money);




    }


    public void printCurrency(Locale locale, double money){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(NumberFormat.getCurrencyInstance().format(money)
        + ", " + locale.getDisplayLanguage() + ", "
        + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM).format(ldt));
    }
}
