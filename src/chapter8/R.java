package chapter8;

import java.util.ArrayList;
import java.util.List;

public class R extends RBase{
    int s;
    R(){
    }
    @Override
    public String aMethod() {
        return new String();
    }

    @Override
    public void bMethod(List<CharSequence> sequences) {
    }

    @Override
    public ArrayList<String> cMethod() {
        return new ArrayList<>();
    }

    //dnc
//    @Override
//    public void dMethod(String s) {
//
//    }

//    public Number chew() throws RuntimeException{
//        return 1;
//    }

//    public void eMethod(){
//        System.out.println("R eMethod");
//    }

    public void fMethod(long l){

    }

    public static void main(String[] args) {
        R r = new R();
        r.fMethod(2);

        long l = 3;
        long ll = 3L;
        Long lll = 2l;
        Long llll = 4L;

    }
}
