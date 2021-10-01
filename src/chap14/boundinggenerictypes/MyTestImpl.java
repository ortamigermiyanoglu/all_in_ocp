package chap14.boundinggenerictypes;

import java.util.ArrayList;
import java.util.List;

public class MyTestImpl implements MyTest{
    @Override
    public void fly() {
        System.out.println("My TestImpl");
    }

    public static void main(String[] args) {
        MyTestImpl myTest = new MyTestImpl();
        List<MyTest> myTestList = new ArrayList<>();
        myTestList.add(myTest);

        myTest.groupOfFlyers(myTestList);
    }

    private void groupOfFlyers(List<? extends Flyer> flyers){
        for (Flyer flyer: flyers) {
            flyer.fly();
        }
    }
}
