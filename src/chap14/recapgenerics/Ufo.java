package chap14.recapgenerics;

public class Ufo implements FlyerExtender{
    @Override
    public void fly() {
        System.out.println("UFO");
    }
}
