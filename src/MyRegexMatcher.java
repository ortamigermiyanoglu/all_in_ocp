import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyRegexMatcher {

    public static boolean isMatch(String word){
        return word.matches("^\\d+:\\d?\\d:\\d?\\d$");
    }

    public static Date parseDateWithLeniency(String str, String[] parsePatterns, boolean lenient) throws ParseException {
        if (str != null && parsePatterns != null) {
            SimpleDateFormat parser = new SimpleDateFormat();
            parser.setLenient(lenient);
            ParsePosition pos = new ParsePosition(0);

            for(int i = 0; i < parsePatterns.length; ++i) {
                String pattern = parsePatterns[i];
                if (parsePatterns[i].endsWith("ZZ")) {
                    pattern = pattern.substring(0, pattern.length() - 1);
                }

                parser.applyPattern(pattern);
                pos.setIndex(0);
                String str2 = str;
                if (parsePatterns[i].endsWith("ZZ")) {
                    for(int signIdx = indexOfSignChars(str, 0); signIdx >= 0; signIdx = indexOfSignChars(str2, signIdx)) {
                        str2 = reformatTimezone(str2, signIdx);
                        ++signIdx;
                    }
                }

                Date date = parser.parse(str2, pos);
                if (date != null && pos.getIndex() == str2.length()) {
                    return date;
                }
            }

            throw new ParseException("Unable to parse the date: " + str, -1);
        } else {
            throw new IllegalArgumentException("Date and Patterns must not be null");
        }
    }

    private static String reformatTimezone(String str, int signIdx) {
        String str2 = str;
        if (signIdx >= 0 && signIdx + 5 < str.length() && Character.isDigit(str.charAt(signIdx + 1)) && Character.isDigit(str.charAt(signIdx + 2)) && str.charAt(signIdx + 3) == ':' && Character.isDigit(str.charAt(signIdx + 4)) && Character.isDigit(str.charAt(signIdx + 5))) {
            str2 = str.substring(0, signIdx + 3) + str.substring(signIdx + 4);
        }

        return str2;
    }

    private static int indexOfSignChars(String str, int startPos) {
//        int idx = StringUtils.indexOf(str, '+', startPos);
        int idx = str.indexOf( '+', startPos);

        if (idx < 0) {
//            idx = StringUtils.indexOf(str, '-', startPos);
            idx = str.indexOf( '-', startPos);

        }

        return idx;
    }


        public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.print("Enter a word: ");
        String word = scan.next();

        while (!MyRegexMatcher.isMatch(word)){
            System.out.print("Not matching. Enter a new word: ");
            word = scan.next();
        }

        System.out.println("Match: "+word);

         */
            final String[] datePatterns = {"yyyy-MM-dd HH:mm"};

//            System.out.print(parseDateWithLeniency("2022-06-03 18:15:00+00:00",datePatterns, true));
            System.out.print(parseDateWithLeniency("2022-06-03 18:15",datePatterns, true));


        }

}
