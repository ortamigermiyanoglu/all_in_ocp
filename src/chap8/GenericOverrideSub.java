package chap8;

import javax.security.auth.login.AccountExpiredException;
import java.io.IOException;
import java.nio.channels.AcceptPendingException;
import java.util.List;

public class GenericOverrideSub extends GenericOverrideSuper{
    //public void chew(List<Double> objectList){} DNC compile
    public void bubbleGum(List<Double> doubleList) throws IOException {}

}
