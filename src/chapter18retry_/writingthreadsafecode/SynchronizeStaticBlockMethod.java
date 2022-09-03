package chapter18retry_.writingthreadsafecode;

public class SynchronizeStaticBlockMethod {

    public static synchronized void printDaysWOrk(){
        System.out.println("Finished work");
    }

    public static void printDaysWork(){
        synchronized (SynchronizeStaticBlockMethod.class){
            System.out.println("Finished work");
        }
    }
}
