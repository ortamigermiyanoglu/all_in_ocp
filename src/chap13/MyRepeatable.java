package chap13;

import java.lang.annotation.Repeatable;

@Deprecated
@Repeatable(MyRepeatables.class)
public @interface MyRepeatable {
    String danger();
}
