package chapter18.warming;

public class CheckResults {
    private int counter = 0;

    public static void main(String[] args) {
        CheckResults checker = new CheckResults();
        new Thread(()->{
            for (int i=0; i<500; i++){
                checker.counter++;
            }
        }).start();

        int i = 0;
        while (checker.counter<100){
            System.out.println("Not Reached Yet" + (++i));
        }
        System.out.println("Reached");
    }
}
