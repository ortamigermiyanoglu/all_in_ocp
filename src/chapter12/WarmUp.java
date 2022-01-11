package chapter12;

public class WarmUp {
    final int a;
    {a = 8;}
    /* DNC setB can be called many times or nonce
    final int b;

    private void setB(int b){
        this.b = b;
    }
    */

    private void printZooInfo(boolean isWeekend){
        final int giraffe = 5;
        long lemur;
        if (isWeekend) lemur = 5;
        /* DNC lemur might not be initialized
        System.out.println(giraffe+lemur);
         */
        System.out.println(giraffe);
    }

    private void finalSB(){
        final StringBuilder sb = new StringBuilder();
        /* DNC final is allowed to instantiated only once
        * sb = new StringBuilder();
        */
        sb.append(4);
        sb.append("abc");
    }

    private void mySwitch(MySeason season){
        switch (season){
            case FALL:
                System.out.println("It's Fall");
                break;
            /* SEMIR gives compile error
            case SEMIR:
                System.out.println("It's Semir");
                break;
            // MySeason gibe compile error
            case MySeason.SUMMER:
                System.out.println("It's Summer");
                break;

            */
        }
    }

    public static void main(String[] args) {
        /*
        WarmUp warmUp = new WarmUp();
        warmUp.printZooInfo(true);
         */
        //System.out.println(MySeason.SUMMER == "SUMMER"); DNC

        System.out.println("MySeason.SUMMER: "+ MySeason.SUMMER);
        System.out.println("MySeason.SUMMER.equals(\"SUMMER\"): " +MySeason.SUMMER.equals("SUMMER"));

        MySeason summer = MySeason.valueOf("SUMMER");
        /* illegal argument exception
        MySeason runtimeException = MySeason.valueOf("summer");
         */

        System.out.println(MySeason.SPRING.getHours());


    }
}
