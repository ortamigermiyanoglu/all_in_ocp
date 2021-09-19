package chap10;

import java.io.IOException;

public class TryWithResourceClass implements AutoCloseable{
    public void close() throws Exception {

    }

    public void doNothing() throws Exception {
        try (TryWithResourceClass resourceClass = new TryWithResourceClass()){

        }
    }

    public void tryingSthCrazy(){
        getIOException();
    }

    public IOException getIOException(){
        return new IOException();
    }
}
