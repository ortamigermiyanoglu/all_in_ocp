package chapter8;

import java.io.IOException;
import java.util.List;

public class GenericOverrideSub extends GenericOverrideSuper{
    //public void chew(List<Double> objectList){} DNC compile
    public void bubbleGum(List<Double> doubleList) throws IOException {}

}
