package chap3;

public class Review {

    public static void main(String[] args) {
        long fani = 8L;

        double minus = 1.0;
        fani -= minus;

        System.out.println(fani);

        minus += fani;
        System.out.println(minus);


        double song = 20;
        System.out.println(   1_000f == song);


        float sadi = 14.6f;

        System.out.println(fani == 1_00f);

        System.out.println(song = fani);

        System.out.println(sadi = fani);
    }
}
