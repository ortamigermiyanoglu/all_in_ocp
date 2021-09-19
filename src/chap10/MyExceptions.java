package chap10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.MissingResourceException;

public class MyExceptions {
    /*
    *   Arithmetic Exception
    *  int answer = 11/0;
    *
    * */


    /*
    * Class Cast Exception
    *
    * String type = "moon";
    * Object obj = type;
    * Integer num = (Integer)
    *
    * */


    /*
    * Index Out Of Bound Exception
    *
    * int[] intArray = new int[0];
    * intArray[0] = 66;
    *
    * */

    public static void main(String[] args) throws SubException {
        MyExceptions myExceptions = new MyExceptions();
        /* DNC but if it had been compiled than it would have thrown NPE
        String name;
        System.out.println(name.length());
         */

        String word;
        try {
            word = "A word";
            myExceptions.exceptionThrower();
        } catch (SubException w){
            System.out.println("SubException has throwned");
        } catch (SupException w){
            try {
                System.out.println("SupException has throwned");
                throw new SupException();
            } catch (SupException supException1){
                System.out.println("SupException has throwned inside");
//                throw new SubException();
            }

        } finally {
            word = "Another word";
            System.out.println(word);
        }

        /* multi-cacth exceptions must be from disjoint classes
        try {
            myExceptions.exceptionThrower();
        } catch (SupException | SubException e){

        }
         */


        //myExceptions.oylesine();

        System.out.println("return value: " + myExceptions.goHome());;

    }

    public void throwsIndexOutOfBoundException(){
        throw  new IndexOutOfBoundsException();
    }

    public void throwsIndexOutOfBoundExceptionInMethodDeclaration() throws IndexOutOfBoundsException{
        
    }


    public void exceptionThrower() throws SupException, SubException{
        throw  new SupException();
    }

    public void mightThrow() throws DateTimeParseException, IndexOutOfBoundsException, IOException{
        throw new IndexOutOfBoundsException();
    }

    public void oylesine(){
        try {
            mightThrow();
        } catch ( IllegalStateException e){
            /*
            try {
                makesSense();
            } catch (FileAlreadyExistsException fileAlreadyExistsException) {
                fileAlreadyExistsException.printStackTrace();
            }
             */

        } catch (InputMismatchException | MissingResourceException e){

        } catch (FileNotFoundException | IllegalArgumentException e){
            System.exit(0);
        } catch (DateTimeParseException e){

        } catch (IOException e){

        }
    }

    public void callToExceptionalMethod(){
        try {
            throwsIndexOutOfBoundException();
        } catch (InputMismatchException e){

        }

        try {
            throwsIndexOutOfBoundException();
        } finally {

        }

        throwsIndexOutOfBoundException();
    }

    public void sthNotMeaningful(){
            throwsIndexOutOfBoundException();
            throwsIndexOutOfBoundExceptionInMethodDeclaration();
    }


    public void nonses() throws FileAlreadyExistsException {
        try {

        } catch (InputMismatchException e){

        }
        makesSense();
    }

    public void makesSense() throws FileAlreadyExistsException{
        throw new FileAlreadyExistsException("");
    }


    public int goHome(){
        try {
            System.out.println("1");
            return 1;
        } catch (Exception e){
            System.out.println("2");
            return 2;
        } finally {
            System.out.println("3");
            return 3;
        }
    }


}
