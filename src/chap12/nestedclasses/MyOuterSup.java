package chap12.nestedclasses;

public class MyOuterSup {
    private String greetings = "Hellooooooo";
    public static final String SUMUTELLA = "SUMUTELLA";

    static {
        String className = "MyOuterSup";
    }

    /* inner class instance variable cannot be access from outside
    public int getInnerSupNumber(){
        return aNumber;
    }
     */

    protected class Popocorn{
        public String greetings ="Hello World!";
        private Popocorn(){};
    }

    protected abstract class MyInnerSup{
        public int aNumber = 8;
        public abstract String howAboutYou();
        public static final String myMood = "It's fine, I'm fine";
    }

    enum MyInnerSeasonsEnum{
        WINTER, SPRING, SUMMER, FALL;

        private MyInnerSeasonsEnum(){
            System.out.println("Constructing " + this.name());
        }
    }

    public static void main(String[] args) {
        MyOuterSup.MyInnerSup abc = new MyOuterSup().new MyInnerSup() {
            @Override
            public String howAboutYou() {
                return null;
            }
        };

        MyOuterSup myOuterSup = new MyOuterSup();
        Popocorn popocorn = myOuterSup.new Popocorn();
        System.out.println(popocorn.greetings);
    }
}
