package chapter9;

interface MyInterface  extends AnOrdinaryInterface, JustAnInterface{
    /* protected access modifier not allowed in interface methods and variables
    protected static final int num = 0;
     */
    String word = "Ahmet";
    /* not allowed in interface since it doesn't instatiated
    static  {word = "Ahmet";}
    */
    int sayi = 9;
    public static final int baskaSayi = 10;

    Number getNumber();


}

