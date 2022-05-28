package chapter16.afterawhile_restart;

import java.io.FileNotFoundException;
import java.util.Locale;

public class StuckTurkeyCage implements AutoCloseable{
    @Override
    public void close() throws Exception {
        throw new FileNotFoundException("Cage not closed");
    }

    public static void main(String[] args) {
        try (var stc = new StuckTurkeyCage()){

        } catch (Exception e) {
            e.printStackTrace();
        }

        var us = new Locale("EN", "US");
        System.out.println(us.getCountry() + "," + us.getDisplayLanguage());

    }
}
