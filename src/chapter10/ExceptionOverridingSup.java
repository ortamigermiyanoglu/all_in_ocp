package chapter10;

import java.io.IOException;

public class ExceptionOverridingSup {

    public void run() throws RuntimeException{}

    public void run(String km) throws NumberFormatException{}

    public void run(Double meters) throws IOException{
        System.out.println(" I am running on " + this.getClass().getName().toString());
    }
}
