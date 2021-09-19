package chap12.java9plusinterface;

public class Human implements IsWarmBlood, Walk, Run{
    @Override
    public boolean hasScales() {
        return false;
    }

    @Override
    public int getSpeed() {
        return Walk.super.getSpeed();
    }
}
