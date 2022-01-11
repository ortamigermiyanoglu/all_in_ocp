package chapter12.reviewquestions;

public enum FlavorsEnum {
    VANILLA,CHOCOLATE{    public boolean hasMilk(){
        return false;
    }}, STRAWBERRY{
        public int getNum(){return 5;}
    };
    static final FlavorsEnum DEFAULT = STRAWBERRY;

    public boolean hasMilk(){
        return false;
    }

    public static void main(String[] args) {
        for (final FlavorsEnum e: FlavorsEnum.values() // final  var e works too
             ) {
            System.out.println(e.ordinal() +" " + e.name());
        }

        float rest = 3;
        double mest = 3;

        System.out.println(FlavorsEnum.CHOCOLATE.rest());
        System.out.println(FlavorsEnum.CHOCOLATE.mest());

    }

    float rest(){
        return 3;
    }

    double mest(){
        return 5;
    }
}
