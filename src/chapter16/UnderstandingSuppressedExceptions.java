package chapter16;

public class UnderstandingSuppressedExceptions {
    class TurkeyCage implements AutoCloseable{
        public TurkeyCage() {
        }

        @Override
        public void close() throws Exception {
            System.out.println("Close gate");
        }
    }

    class JammadTurkeyCage implements AutoCloseable {
        public JammadTurkeyCage() {
        }

        @Override
        public void close() throws Exception, IllegalStateException {
            throw new IllegalStateException(" Cage door does not close");
        }
    }


    public static void main(String[] args) {
        var use = new UnderstandingSuppressedExceptions();
        try (var jtc = use.new JammadTurkeyCage()){

        } catch (Exception e) {
            System.out.println("Caught: "+e.getMessage());;
        }

        System.out.println("--------- Throwable Suppressed ---------");

        try (var jtc = use.new JammadTurkeyCage()){
            throw new IllegalStateException("Turkeys run off");
        } catch (Exception e) {
            System.out.println("Caught: "+e.getMessage());
            for (Throwable t : e.getSuppressed()){
                System.out.println("Suppressed: " + t.getMessage());
            }
        }



    }



}
