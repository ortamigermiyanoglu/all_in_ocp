package chapter16.afterawhile_restart;

import java.io.Closeable;
import java.io.IOException;

public class B extends A{

    class Door implements AutoCloseable{
        @Override
        public void close() throws Exception {
            System.out.print("D");
        }
    }

    class Window implements Closeable {

        @Override
        public void close() throws IOException {
            System.out.print("W");
            throw new RuntimeException();
        }
    }

    class Chair implements Closeable{
        @Override
        public void close() throws IOException {
            System.out.print("C");
            throw  new IOException();
        }
    }

    public static void main(String[] args) {
        B b = new B();
        Door door = b.new Door();
        try (door; var c = b.new Chair(); var w = b.new Window()){
            System.out.print("T");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.print("E");
        } finally {
            System.out.print("F");
        }
    }
}
