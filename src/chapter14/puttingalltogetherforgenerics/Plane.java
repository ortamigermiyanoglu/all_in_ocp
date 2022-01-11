package chapter14.puttingalltogetherforgenerics;

public class Plane implements Flyable{
    @Override
    public boolean canFly() {
        System.out.println("I'm plane. I can fly");
        return true;
    }
}
