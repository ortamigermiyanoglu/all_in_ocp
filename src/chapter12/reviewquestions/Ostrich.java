package chapter12.reviewquestions;

public class Ostrich {
    private int count = 0;
    private interface Wilde{}
    /* Non-static field 'count' cannot be referenced from a static OstrichWrangler class
    static class OstrichWrangler implements Wilde{
        public int stampade(){
            return count;
        }
    }
    */
}
