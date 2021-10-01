package chap14.boundinggenerictypes;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {

    public void addSound(List<? super String> sounds){
        sounds.add("quack");
    }

    public void addSound2(List<?> sounds){
        //sounds.add("quack"); DNC
    }


    public void justTryingSth(Object o){
        System.out.println(o);
    }

    public static void main(String[] args) {
        LowerBound lowerBound = new LowerBound();

        List<String> strings = new ArrayList<>();
        List<Object> objects = new ArrayList<>();


        //addSound(List<Object> sounds) DNC for both
        lowerBound.addSound(objects);
        lowerBound.addSound(strings);

        Object o = "semir";
        String s = "azize";

        lowerBound.justTryingSth(o);
        lowerBound.justTryingSth(s);

    }

}
