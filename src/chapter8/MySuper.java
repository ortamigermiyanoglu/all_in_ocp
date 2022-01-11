package chapter8;

import java.util.ArrayList;
import java.util.List;

public class MySuper{
    private int sami;
    int age;
    MySuper(int age){
        this.age = age;
    }

    public int getSami() {
        return sami;
    }

    public List<Integer> sonDeney(){
        List<Integer> integerList = new ArrayList<>();
        return integerList;
    }

    public CharSequence covarianT(){
        return "a";
    }

    public Integer wrapperOverride(){
        return 7;
    }

    public void setSami(int sami) {
        this.sami = sami;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
