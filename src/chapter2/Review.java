package chapter2;

public class Review {

    long ck;
    {
        int lk = 0;
    }
    //you just type var instead of primitive or reference type?
    //you can only use var for local variables
    // you cannot use for instance variables/class variables
    //var can be used in for loops
    //with some lambdas as well
    //var can be used in try with resources



    public void findAnswer(boolean check){
    }

    public void  checkAnswer(){
        boolean value;
//        findAnswer(value); DNC

    }




    public static void main(String[] args) {

        var apples = (short) 10;
        apples = (byte) 5; // compile because byte can be automatically promoted to short
        //apples = 1_000_00; DNC because 100000 beyond limit short, compiler treats it int and reports a type inference error



        //var a = null; DNC because type inference cannot be done
        // int a, var b =3; DNC
        int c,  d = 5;

        // var a=6, var c ="sdfsd";     DNC
        //var a = 6, b=7;       DNC


        var n = "myData";
        n = null;
        var m  = 4;
        // m=null; DNC primitive int cannot be assigned to null

        var kl = (String) null;

        // !!!!!!!!
        // be on the lookout for var used with constructors
        // method parameters or instance variables
        // !!!!!!!!

        System.out.println("0 == 0.0f: "+ (0 == 0.0f));

        long s = 1400;

        int a=0b101;
        int h=0xE;

        Review review = new Review();

        System.out.println("default primitive long: "+review.ck);
        System.out.println(review.ck == 0L);

        System.out.println((int) 6.8);

        double dble = 7;
        float flat = 8f;
        //long lng = flat;
        //long lng= dble;


        int cc;

        System.out.println(cc=8);

    }
}
