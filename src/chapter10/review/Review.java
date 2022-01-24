package chapter10.review;

public class Review  extends ReviewBase{

    /*
    DNC
    @Override
    public void noException() throws Exception {
    }

    */

    @Override
    public void noException() throws IllegalArgumentException {

    }

    @Override
    public void yesException() throws RuntimeException {
    }

    public static void main(String[] args) {
        Review instance = new Review();
        Object obj = Integer.valueOf(3);
        String  str = (String) obj;




        try {
            String sami = "sami";
        } finally {
            System.exit(0);
        }

        try{
            instance.rollOut();
        } catch (IllegalArgumentException | NullPointerException e){

        }
    }



    public void rollOut() throws ClassCastException{}

}
