package chapter14.genericmethods;

public class Crate <T>{
    private T contents;
    public T emptyCrate(){
        return contents;
    }

    public Crate() {
    }

    public Crate(T contents) {
        this.contents = contents;
    }

    public void packCrate(T contents){
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "Crate{" +
                "contents=" + contents +
                '}';
    }
}
