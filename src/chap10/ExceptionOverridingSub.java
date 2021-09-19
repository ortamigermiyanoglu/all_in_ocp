package chap10;

import java.io.IOException;

public class ExceptionOverridingSub extends ExceptionOverridingSup{
    @Override
    public void run() throws IndexOutOfBoundsException{}

    @Override
    public void run(String km) throws RuntimeException{}

    @Override
    public void run(Double meters) {
        System.out.println(" I am running on " + this.getClass().getName().toString());
    }

    public static void main(String[] args) {
        // sub.run() do not throws exception
        ExceptionOverridingSub sub = new ExceptionOverridingSub();
        sub.run(1.44);

        // even though reference is sup, the called run method is sub's run method
        // due to reference, now try-catch clause is required
        ExceptionOverridingSup sup = new ExceptionOverridingSub();
        try {
            sup.run(1.44);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

        } catch (ClassCastException |NullPointerException e){

        }



    }


}
