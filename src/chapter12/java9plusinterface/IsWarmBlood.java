package chapter12.java9plusinterface;

public interface IsWarmBlood {
    private static void nonSense(){}
    public static final double celcius = 36.0;
    boolean hasScales();
    public default double getTemprature(){
        return 10.0;
    }
    /* DNC can't define methods with the same name public methods in Object class
    int toString();
     */

}
