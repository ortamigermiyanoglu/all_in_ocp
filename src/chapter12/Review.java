package chapter12;

public class Review {

    enum Flavors{
        VANILLA, CHOCOLATE, STRAWBERRY;
        static final Flavors DEFAULT = VANILLA;
    }

    public static void main(String[] args) {
        for (final var e : Flavors.values()){
            System.out.print(e.ordinal() + " ");
        }
    }


    public void tryParams(boolean[] booleans){}
    /* DNC
    * public void tryParams(boolean... booleans){}
    * */

    //declaring final local variable
    public void v0id(boolean isWeekend){
        final long lemur;
        if (isWeekend) lemur = 5;

    }

    public void v0id(boolean isWeekend, boolean isWeekday){
        final long lemur;
        final int giraffe = 8;
        if (isWeekend) lemur = 15;

        /* DNC since lemur might not be initialized
        * System.out.println(giraffe + " " + lemur);
        * */

    }
}
