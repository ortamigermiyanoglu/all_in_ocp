package chapter8;

import java.util.List;

public class Bear {
    StringBuilder sb = new StringBuilder("t");

    public List<Integer> returnTypeCovariant(){
        return null;
    }

    public CharSequence nonCollectionReturnTypeCovariant(){
        return new String();
    }

    public CharSequence nonCollectionParameterTypeCovariant(CharSequence cs){
        return new String();
    }




    public List<CharSequence> returnDiamondCovariant(){
        return null;
    }

    public void parameterCovariant(List<Integer> integerList){}

    public void diamondParameterCovariant(List<CharSequence> integerList){}

    {
        sb.append("a");
        sb.append('c');
    }

    private Bear(){
        sb.append("b");
    }

    public Bear(CharSequence c){
        this();
        sb.append(c);
    }

    public static void main(String[] args) {
        Object bear = new Bear();
        bear = new Bear("f");
        System.out.println(((Bear)bear).sb);
    }
}
