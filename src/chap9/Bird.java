package chap9;

abstract public class Bird extends Animal{
    public abstract String getName();
    public void printName(){
        System.out.println(getName());
    }
}
