package chapter8;

public interface SamerWithDefault {
    default void samerA(){
        privateSamerA();
    }

    private void privateSamerA(){}

    public static void staticSamer(){
        privateStaticSamer();
    }

    private static void privateStaticSamer(){}

}
