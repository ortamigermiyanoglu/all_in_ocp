package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyExceptions2 {



    public void fakeCheckedExceptionThrower() throws LastSupException{}

    public void realCheckedExceptionThrower() throws LastSubException {
        throw new LastSubException();
    }

    public void realSupCheckedExceptionThrower() throws LastSupException {
        throw new LastSupException();
    }

    public void callToRealCheckedExceptionThrowerMethod() throws LastSubException {
        realCheckedExceptionThrower();
    }

    public void callToFakeCheckedExceptionThrowerMethod()  {
        try {
            fakeCheckedExceptionThrower();
        } catch (LastSupException e) {
            e.printStackTrace();
            System.out.println("");
        }
    }

    public void fakeRunTimeExceptionThrower() throws IndexOutOfBoundsException{}

    public void realRunTimeExceptionThrower() {
        throw new IndexOutOfBoundsException();
    }

    public void callToRealRunTimeExceptionThrower() throws LastSubException {
        fakeRunTimeExceptionThrower();
        realCheckedExceptionThrower();
    }

    public void playingWithTryCatch(){
        try {
            callToRealCheckedExceptionThrowerMethod();
        } catch (LastSupException e){

        } finally {

        }

        try {
            realSupCheckedExceptionThrower();
        } catch (LastSubException e){ // bu tek basina olsa hata verir catch olmadi hatasi

        } catch (LastSupException e) {
            e.printStackTrace();
        }

    }

    public void justCatchingForFun(){
        try {

        } catch (IndexOutOfBoundsException e){

        } /* below cannot be for fun because it is checked exception

        catch (IOException e){

        }
        */ catch (NullPointerException e){

        }

    }

    public  void  tryWithResources() throws IOException {

        //implicit finally block exists
        try (FileInputStream is = new FileInputStream("myText.txt");
             FileInputStream mis = new FileInputStream("myData.txt")){

        }
    }

    public static void main(String[] args) {

        //try with resources statement
        try (FileInputStream is = new FileInputStream("myText.txt")) {
            // read file data etc
            int s = 6;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }





}
