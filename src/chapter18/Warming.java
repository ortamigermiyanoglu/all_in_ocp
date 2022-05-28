package chapter18;

import chapter18.creatingthread.PrintData;
import chapter18.creatingthread.ReadInventoryThread;

import java.util.function.Supplier;

public class Warming {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "";

        System.out.println("begin");
        new ReadInventoryThread().start();
        new Thread(new PrintData()).start();
        new ReadInventoryThread().start();
        System.out.println("end");

    }
}
