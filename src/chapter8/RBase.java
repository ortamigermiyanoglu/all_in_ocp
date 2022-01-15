package chapter8;

import java.util.ArrayList;
import java.util.List;

public class RBase {
static int s = 0;
    protected RBase(){
    }
    protected RBase(int s){
        this();
    }
    public CharSequence aMethod(){
        return null;
    }

    public void bMethod(List<CharSequence> sequences){
    }

    public List<String> cMethod(){
        return new ArrayList<>();
    }

    public void dMethod(CharSequence s){}

//    public static void main(String[] args) {
//        RBase rBase = new RBase();
//
//        // rBase.cMethod().add(3); DNC
//    }
    protected static Integer chew() throws Exception{
        return 1;
    }

    final public void eMethod(){
        System.out.println("RBase eMethod");
    }
}
