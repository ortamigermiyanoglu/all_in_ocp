package chapter12.functionalprogramming;

@FunctionalInterface
public interface Sprint {
    public void sprint(int speed);
    String toString();
    default int getFive(){return 5;}
}
