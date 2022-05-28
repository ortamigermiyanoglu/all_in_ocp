package chapter16.afterawhile_restart;

public class D implements AutoCloseable{
    @Override
    public void close()  {
        throw new RuntimeException("safaf");
    }

    public static void main(String[] args) {
        try (D d = new D();){

        }
    }
}
