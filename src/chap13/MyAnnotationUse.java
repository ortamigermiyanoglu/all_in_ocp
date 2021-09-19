package chap13;

public class MyAnnotationUse {
    private int age;
    @MyTarget public MyAnnotationUse(){}
    public @MyTarget MyAnnotationUse(int age){
        this.age = age;
    }

    @MyTarget
    public static void main(String[] args) {
        @MyTarget MyAnnotationUse myAnnotationUse = new MyAnnotationUse();

        /* DNC target element type is not type use
        String myString = (@MyTarget String) "myString";
        */
    }

}
