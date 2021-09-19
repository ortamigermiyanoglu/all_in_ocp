package chap8;

import javax.security.auth.login.AccountExpiredException;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.List;

public class GenericOverrideSuper {

    public void bubbleGum(List<Double> doubleList) throws IOException, AccountExpiredException {}
    public void chew(List<Object> objectList){}
}
