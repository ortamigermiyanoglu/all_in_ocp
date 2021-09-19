package chap9;

public abstract class Reptile extends Animal {
    abstract boolean isCarnivore();

    @Override
    public boolean canSwim(){
        boolean defaultVal = false;
        return defaultVal;
    };


}
