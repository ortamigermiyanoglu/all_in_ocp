package chapter16;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingCustomExceptions {
    class CannotSwimException extends Exception{
        public CannotSwimException(){
            super();
        }
        public CannotSwimException(Exception e){
            super(e);
        }
        public CannotSwimException(String message){
            super(message);
        }
    }

    @SuppressWarnings("all")
    public void iThrowCannotSwimException() throws CannotSwimException {
        new CannotSwimException("broken fin");
        throw new CannotSwimException(new IOException());
    }

    @SuppressWarnings("all")
    public void iThrowCannotSwimExceptionAndCatchIt() {
        try {
            throw new CannotSwimException(new IOException());
        } catch (CannotSwimException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception {
        CreatingCustomExceptions customExceptions = new CreatingCustomExceptions();
//        customExceptions.iThrowCannotSwimException();
        customExceptions.iThrowCannotSwimExceptionAndCatchIt();

        try(var bookReader = new MyFileReader("monkey")){

        } finally {
            System.out.println("Finally Block");
        }

        // closes in reverse order of declaration
        try(var bookReader1 = new MyFileReader("1");
            var bookReader2 = new MyFileReader("2");
            var bookReader3 = new MyFileReader("3")){
        } finally {
            System.out.println("Finally Block");
        }

        try (var bookReader1 = new MyFileReader("1")){

        } catch (Exception e){

          /* resources declared within a try with resources are in scope only within the try block
          *
          * bookReader1.getTag();
          *
          * */
        }

        System.out.println("-------Calling relaxMien method-------");
        customExceptions.relaxMien();
        System.out.println("-------relaxMien method end-------");

        var writer = Files.newBufferedWriter(Paths.get("abc.txt"));

        try (writer){

        } finally {
            //below line throws IO Exception, stream closed
            writer.append("abc");
        }



    }

    public void relaxMien(){
        final var bookReader = new MyFileReader("4");

        MyFileReader movieReader = new MyFileReader("5");

        try (bookReader; MyFileReader tvReader = new MyFileReader("6"); movieReader){

            System.out.println("Try Block");
        } catch (Exception e) {
            System.out.println("Finally Block");
            e.printStackTrace();
        }
        /* DNC
        * movieReader == null;
        * */
    }






}
