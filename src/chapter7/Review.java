package chapter7;

public class Review {
    public int howMany(boolean b, boolean ... b2){
        return b2.length;
    }

    static  void nathing(){}

    public static void main(String[] args) {
        Review review = new Review();

        System.out.println(review.howMany(true));

        System.out.println(review.howMany(true, new boolean[]{true}));

        Review review1 = null;
        review1.nathing();
    }
}
