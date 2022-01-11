package chapter14.puttingalltogetherforgenerics;

public class Chicken implements Flyable{
    @Override
    public boolean canFly() {
        System.out.println("I'm chicken. I can fly");
        return true;
    }
}
