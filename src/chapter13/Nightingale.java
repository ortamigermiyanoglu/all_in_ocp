package chapter13;

import java.util.ArrayList;

public class Nightingale {
    public void wakeUp(){
        SongBird.sing(10);
    }

    public void goToBed(){
        SongBird.chirp(new ArrayList<>());
    }

    public static void main(String[] args) {
        var birdy = new Nightingale();
        birdy.wakeUp();
        birdy.goToBed();


        /* DNC
        List<String>[] myListArray = new List[4];
        List<Integer> integerList = new ArrayList<>();
        myListArray[0]  = integerList; //gives compile error
         */
    }
}
