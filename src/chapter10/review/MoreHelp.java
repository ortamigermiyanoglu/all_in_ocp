package chapter10.review;

import java.io.Closeable;
import java.io.IOException;

public class MoreHelp {
    class SideKick implements AutoCloseable{
        protected String n;
        public SideKick(String n){
            this.n = n;
        }

        public void close()  {
            System.out.print("L");
        }
    }

    public void requiresAssurance(){
        try (SideKick is = new SideKick("O")){
            System.out.print("O");
        } finally {
            System.out.print("K");
        }
    }

    public static void main(String[] args) {
        new MoreHelp().requiresAssurance();
        System.out.println("I");


        System.out.println(new MoreHelp().experimental());
    }

    public int experimental(){
        try {
            return 5/1;
        } catch (ClassCastException e){
            return 6/1;
        } catch (RuntimeException e){
            return 7/1;
        } finally {
            return 30;
        }
    }



}
