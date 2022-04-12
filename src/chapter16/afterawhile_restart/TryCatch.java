package chapter16.afterawhile_restart;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryCatch {


    public static void main(String[] args) {
        TryCatch tryCatch = new TryCatch();
        System.out.println(tryCatch.nothingButTrying());
//        tryCatch.nothingButThrowing();
        tryCatch.nothingButClosingOrder();
        try {
            tryCatch.nothingButTrickyEffectivelyFinal();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String nothingButTrying(){
        try {
            System.out.println("Executing try block");
            return "Return from try block";
        } finally {
            System.out.println("Executing finally block");
        }
    }

    public void  nothingButThrowing(){
        try {
            throw new NullPointerException();
        }
        finally {
            System.out.println("Executing finally block");
        }
    }

    public void nothingButClosingOrder(){
        try (var myReader1 = new MyReader(1);
        var myReader2 = new MyReader(2);
        var myReader3 = new MyReader(3)){
            System.out.println("Executing try block");
        } catch (Exception e) {
            System.out.println("Executing catch block");
        }
    }

    class MyReader implements AutoCloseable{
        Integer tag;

        public MyReader(Integer tag) {
            this.tag = tag;
        }

        @Override
        public void close() {
            System.out.println("Closing: " + getTag());
        }

        public Integer getTag() {
            return tag;
        }
    }

    public void nothingButScopeOnly(){
        try(Scanner s = new Scanner(System.in)) {
            String sami = s.nextLine();
        } catch (Exception e){
            /*
            s.nextInt()
             */
        }
    }

    public void nothingButEffectivelyFinal(){
        final var  myReader= new MyReader(1);
        var myMoviewReader = new MyReader(2);

        try (myReader;myMoviewReader){
            myMoviewReader.getTag();
            myReader.getTag();
        }
        finally {
            System.out.println("Executing finally block");
        }
    }

    public void nothingButTrickyEffectivelyFinal() throws IOException {
        var path = Paths.get("./myfile.txt");
        var writer = Files.newBufferedWriter(path);
        writer.write("This write is permitted but a really bad idea\n");
        try (writer){
            writer.append("Welcome to the zoo!\n");
        }
        /* DNC
        writer = null;
         */
    }


    public void  nothingButCarefulDontDoThis() throws IOException {
        var path1 = Paths.get("./myfile.txt");
        var path2 = Paths.get("./doesntexist.txt");
        var writer = Files.newBufferedWriter(path1);
        var reader = Files.newBufferedReader(path2);
        try (writer; reader){

        }

        /*
        * if you do above and get exception in definition of reader
        * then writer resource will remain open, will never be closed
        * */
    }

}
