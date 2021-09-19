package chap8;

import java.util.ArrayList;
import java.util.List;

public class GrizzlyBear extends Bear{
    public GrizzlyBear(CharSequence c) {
        super(c);
    }

    @Override
    public StringBuilder nonCollectionReturnTypeCovariant(){
        return new StringBuilder();
    }


    /*
    @Override
    public void diamondParameterCovariant(List<StringBuilder> integerList){}
    */


    // parameter  covariant type olamaz
    /*
    @Override
    public void parameterCovariant(ArrayList<Integer> integerList){}
    */


    //diamond ici covariant olamaz
    /*
    @Override
    public List<String> returnDiamondCovariant(){
        return null;
    }
    *
     */

    // return type covariant olunca override olmuyor


    @Override
    public ArrayList<Integer> returnTypeCovariant(){
        return null;
    }

//    @Override
//    public String nonCollectionParameterTypeCovariant(StringBuilder cs){
//        return new String();
//    }


}
