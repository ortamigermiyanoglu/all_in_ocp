package chap13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@MyTarget()
@Target(ElementType.TYPE_USE)
public @interface MyTypeUseTarget {
}
