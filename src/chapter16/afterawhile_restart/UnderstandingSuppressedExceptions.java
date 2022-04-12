package chapter16.afterawhile_restart;

public class UnderstandingSuppressedExceptions {

    /*
    * the resources in try statement are closed before
    * any programmer coded catch blocks are run
    * */


    public static void main(String[] args) throws Exception {
        var understandingSuppressedExceptions = new UnderstandingSuppressedExceptions();

        understandingSuppressedExceptions.nothingButCatchcingCloseMethodException();

        understandingSuppressedExceptions.nothingButSuppressingException();
    }


    class TurkeyCage implements AutoCloseable{

        @Override
        public void close() throws Exception {
            System.out.println("Close fate");
        }
    }

    class JammedTurkeyCage implements AutoCloseable{
        @Override
        public void close() throws Exception {
            throw new IllegalStateException("Cage door could not be closed");
        }
    }

    public void nothingButCatchcingCloseMethodException(){
        try (var jammedTurkeyCage = new JammedTurkeyCage()){

        } catch (Exception e) {
            System.out.println("caught: "+ e.getMessage());
        }
    }
    public void nothingButSuppressingException() throws Exception {
        /*
        * line L1 throws exception
        * immediately after L1 java tries to close the resource and adds a suppressed exception
        * now we have a problem, finally block runs after all this
        * the previous exception from L1 is lost
        * */
        try (var jammedTurkeyCage = new JammedTurkeyCage()){
            L1: throw  new IllegalStateException("Turkey's ran off");
        } finally {
            throw new RuntimeException(" and we couldn't find them");
        }
    }



}
