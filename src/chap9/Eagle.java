package chap9;

public class Eagle extends Bird{
    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public String getName() {
        return "Eagle";
    }

    public static void main(String[] args) {
        Bird stork = new Stork();
        Bird eagle = new Eagle();

        stork =  eagle;

        System.out.println(stork.getName());

        System.out.println("-------------- above compiles and executes without error-exception --------------");

        Stork anotherStork = new Stork();
        Bird anotherEagle = new Eagle();

        //Bird explicit casting is redundant
        anotherEagle = (Bird) anotherStork;

        /* DOES NOT COMPILE
        anotherEagle = (Eagle) anotherStork;
        */

        /* DOES NOT COMPILE
        Eagle castEagle = (Eagle) anotherStork;
        Bird castEagle2 = (Eagle) anotherStork;
        *\
         */

        Object objectEagle = anotherEagle;

        Bird eagleBird = (Bird) objectEagle;

    }
}
