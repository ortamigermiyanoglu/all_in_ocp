package chapter14.recapgenerics;

public class MyGeneric2Field<T>{
    private T myGenericField;
    private T elGeneral;


    public MyGeneric2Field(T myGenericField) {
        this.myGenericField = myGenericField;
    }

    public T getMyGenericField() {
        return myGenericField;
    }

    public void setMyGenericField(T myGenericField) {
        this.myGenericField = myGenericField;
    }

    public T getElGeneral() {
        return elGeneral;
    }

    public void setElGeneral(T elGeneral) {
        this.elGeneral = elGeneral;
    }

    public static void main(String[] args) {
        // if you don't specify formal parameter type generics can be different type as seen below
        MyGeneric2Field myGeneric = new MyGeneric2Field<>(new StringBuilder("StringBuilder"));
        myGeneric.setElGeneral(new String("String"));

    }
}
