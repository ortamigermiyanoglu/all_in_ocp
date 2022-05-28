package chapter18.warming;

public class CheckResultsWithThreadSleep {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        new Thread(()->{
            for (int i=0; i<500; i++){
                CheckResultsWithThreadSleep.counter++;
            }
        }).start();

        int i = 0;
        while (CheckResultsWithThreadSleep.counter<100){
            System.out.println("Not Reached Yet" + (++i));
            Thread.sleep(1000);
        }
        System.out.println("Reached");
    }
}
