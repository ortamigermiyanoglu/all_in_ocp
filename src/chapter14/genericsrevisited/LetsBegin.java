package chapter14.genericsrevisited;

public class LetsBegin <T,U>{
    private T content;
    private U size;

    public LetsBegin(T content, U size) {
        this.content = content;
        this.size = size;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public U getSize() {
        return size;
    }

    public void setSize(U size) {
        this.size = size;
    }

    public static void main(String[] args) {
        LetsBegin letsBegin = new LetsBegin<>("sami", 5);

        String content = (String) letsBegin.getContent();
        Integer size = (Integer) letsBegin.getSize();



    }
}
