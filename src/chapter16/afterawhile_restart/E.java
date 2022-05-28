package chapter16.afterawhile_restart;

import java.util.Locale;

public class E implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("dsfdsg");
    }

    public static void main(String[] args) {
        try (E e = new E();){

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Locale locale = new Locale.Builder().setRegion("US").build();
}
