package chap14.reviewquestions;

import java.util.Comparator;
import java.util.Locale;

public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.toLowerCase().compareTo(o1.toLowerCase());
    }
}
