package chapter18retry_.creatingthread;

public class CheckResultsWSleep {
    private static int counter = 0;
    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i < 500; i++) {
                CheckResultsWSleep.counter++;
            }
        }).start();
        while (CheckResultsWSleep.counter<100){
            System.out.println("Not reached yet");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Reached!");
    }
}
