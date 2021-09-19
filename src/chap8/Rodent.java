package chap8;

public class Rodent {
    public Rodent(int x){
    }

    public void parameterCovariant(CharSequence s){}

    public void deneme(int o){}


    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 1;
    }

    public Object drill() throws RuntimeException{
        System.out.println("Rodent is drilling");
        return  2;
    }


}
