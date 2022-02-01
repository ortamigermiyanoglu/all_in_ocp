package chapter14.genericsrevisited;

import java.util.List;

public class Review {

    public static void main(String[] args) {
        List<?> q = List.of("samir", "nasri");

        /*
        q.removeIf(String::isEmpty);
        q.removeIf(s -> s.length() == 4);
         */
    }


}
