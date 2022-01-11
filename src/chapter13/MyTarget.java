package chapter13;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

 @Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
public @interface MyTarget {
}
