package chapter14.reviewquestions;

public class Hello <T>{
    T t;

    public Hello(T t){
        this.t = t;
    }

    @Override
    public String toString() {
        return t.toString();
    }
    private <T> void println(T message){
        System.out.println(t + "-" + message);
    }

    public static void main(String[] args) {
        new  Hello<String>("hi").println(1);
        new Hello("hola").println(true);
    }

}
