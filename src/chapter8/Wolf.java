package chapter8;

public class Wolf extends Howler{
    protected Wolf(String stars){
        super(2L);
    }
    public Wolf(){
        super((Long)null); //throws NPE
    }

    public static void main(String[] args) {
        new Wolf();
    }
}
