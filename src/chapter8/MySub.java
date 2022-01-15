package chapter8;

import java.util.Collections;
import java.util.Map;

public class MySub extends MySuper{
    private  int sami;
    int rezzak = 33;

    MySub() {
        super(5);
    }

    public int getSami() {
        return sami;
    }

    public void setSami(int sami) { // public olmazsa compile error
        super.setSami(7);
        this.sami = sami;

        System.out.println(super.getSami());
        System.out.println(this.getSami());
    }

    public int getRezzak() {
        return rezzak;
    }

//    public List<String> sonDeney(){
//        List<String> integerList = new ArrayList<>();
//        return integerList;
//    }



    public void setRezzak(int rezzak) {
        this.rezzak = rezzak;
    }
    @Override
    public StringBuilder covarianT( ){
        StringBuilder sb = new StringBuilder();
        return sb;
    }

    public Integer wrapperOverride(){
        return 7;
    }

    public static void main(String[] args) {
        MySub mySub = new MySub();
        mySub.setSami(3);

        MySuper supersin = mySub;

        //System.out.println(supersin.getRezzak()); compile error


    }









    public void aMethod(Integer n1, String s2, Map<String, String> stringStringMap){
        if (stringStringMap==null){
            aMethod(n1, s2);
        }
        // continue
    }

    private void aMethod(Integer n1, String s2){

    }


}
