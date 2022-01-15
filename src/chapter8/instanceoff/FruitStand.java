package chapter8.instanceoff;

public class FruitStand {
    static public int a = 8;
    public static int b = 8;
    final public int c = 8;
    public final int d = 8;

    public static void main(String[] args) {
        Gala g = new Gala();
        Tangerine t = new Tangerine();
        Citrus c = new Citrus();

//        System.out.println(t instanceof Gala);
        System.out.println(c instanceof Tangerine);
        System.out.println(g instanceof Apple);
        System.out.println(t instanceof Apple);
        System.out.println(c instanceof Apple);
    }
}
