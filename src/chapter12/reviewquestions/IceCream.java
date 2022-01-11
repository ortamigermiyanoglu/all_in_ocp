package chapter12.reviewquestions;

public class IceCream {
    enum Flavors{
        CHOCOLATE, STRAWBERRY, VANILLA
    }

    protected final class abc{}

    public static void main(String[] args) {
        Flavors strawberry = null;

        /* DNC due to Flavor.blabla no need to Flavor
        switch (strawberry){
            case Flavors.VANILLA:
                System.out.println("v");
            case Flavors.CHOCOLATE:
                System.out.println("c");
            case Flavors.STRAWBERRY:
                System.out.println("v");
                break;
            default:
                System.out.println("missing flavor");
        }
        */
    }
}
