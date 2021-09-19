package chap12.nestedclasses;

public class MyOuterSub extends MyOuterSup.MyInnerSup {

    public MyOuterSub(){
        new MyOuterSup().super();
    }

    @Override
    public String howAboutYou() {
        return "fuck you, I'm okay";
    }

    public static void main(String[] args) {
        System.out.println("Garip");
        final var s = "Semir";

        MyOuterSup.MyInnerSup myInnerSup = new MyOuterSup().new MyInnerSup() {
            @Override
            public String howAboutYou() {
                return "I'm fine, I'm local class";
            }
        };
    }
}
