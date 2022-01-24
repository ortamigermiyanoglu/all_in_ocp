package chapter12;

@FunctionalInterface
public interface TryFunctionalInterface {
    String toString();
    int hashCode();

    void printMe(Object o);

    default void iPrintYou() {
        System.out.println("you");
        iDoNothingMan();
    }

    private void iDoNothingMan(){

    }

    static void iAmJustAStaticMethodMand(){
        TryFunctionalInterface.iAmJustAprivateStaticMethodMan();
    }

    private static void iAmJustAprivateStaticMethodMan(){}

}
