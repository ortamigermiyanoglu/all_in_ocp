package chapter8;

public class SamerImplementer implements Samers, SamerWithDefault{
    @Override
    public void samerA() {
        System.out.println("I'm overriden samer");
    }


    public static void main(String[] args) {
        SamerWithDefault samer = new SamerImplementer();
        samer.samerA();
    }
}
