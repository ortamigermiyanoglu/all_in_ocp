package chapter13.reviewquestions;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;

@Repeatable(FerociousPack.class)
public @interface Ferocious {
    int numOfSth = 5;
}
