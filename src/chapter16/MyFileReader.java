package chapter16;

public class MyFileReader implements AutoCloseable{

    private String tag;

    public MyFileReader(String tag) {
        this.tag = tag;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed: "+tag);
    }

    public String getTag() {
        return tag;
    }

    public void nothing(){
        System.out.println("I do nothing mate");
    }
}
