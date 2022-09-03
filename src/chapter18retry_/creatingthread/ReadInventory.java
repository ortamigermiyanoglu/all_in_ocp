package chapter18retry_.creatingthread;

public class ReadInventory extends Thread{
    @Override
    public void run() {
        System.out.println("printing zoo inventory");
    }

    public static void main(String[] args) {
        (new ReadInventory()).start();
    }
}
