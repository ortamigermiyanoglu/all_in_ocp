package chapter12;

public class AQuiteInterestingCase {

    public static void boo(){
        System.out.println("Not scared");
    }

    protected final class Spirit{
        public void boo(){
            System.out.println("Boo");
        }
    }

    public static void main(String[] args) {
        /* compile error Cannot inherit from final 'chapter12.AQuiteInterestingCase.Spirit'
        var g = new AQuiteInterestingCase().new Spirit(){};
        *
         */

    }

}
