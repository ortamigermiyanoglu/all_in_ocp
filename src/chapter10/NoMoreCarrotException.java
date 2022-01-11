package chapter10;

public class NoMoreCarrotException  extends Exception{
    public void eatCarrot() throws NoMoreCarrotException{}

    public void bad(){
        try {
            eatCarrot();
        } catch (NoMoreCarrotException e) {
            e.printStackTrace();
        }
    }

    public void good() throws NoMoreCarrotException {
        eatCarrot();
    }
}
