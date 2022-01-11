package chapter14.recapgenerics;

public class TrickyClass<T>{
    public <T> T trickyMethod(T t){
        return t;
    }

    public static void main(String[] args) {
        TrickyClass<MyGeneric2Field> trickyInstance = new TrickyClass<>();
        System.out.println(trickyInstance.trickyMethod("Strange"));
    }
}
