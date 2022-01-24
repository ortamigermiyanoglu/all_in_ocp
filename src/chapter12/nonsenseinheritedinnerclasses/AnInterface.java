package chapter12.nonsenseinheritedinnerclasses;

import chapter12.TryFunctionalInterface;

public interface AnInterface extends TryFunctionalInterface {

    default void iPrintYou() {
        System.out.println("you");
    }

}
