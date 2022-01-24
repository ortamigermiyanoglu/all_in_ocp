package chapter12;

public interface TryBase {
    default void printWhoIam(){
        System.out.println("I'm TryBase");
    }
}
