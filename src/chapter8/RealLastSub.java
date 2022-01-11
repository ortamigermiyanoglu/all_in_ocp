package chapter8;

public class RealLastSub extends RealLastSup {
    String words = "I am RealLastSub words wariable";
    static int number;

    @Override
    public void printing(){
        System.out.println("I am RealLastSub printing method");
    }

    public static void main(String[] args) {
        RealLastSup supReference = new RealLastSub();

        supReference.printing();
        System.out.println(supReference.words);
    }
}
