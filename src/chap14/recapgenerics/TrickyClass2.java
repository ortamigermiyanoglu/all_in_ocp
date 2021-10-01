package chap14.recapgenerics;

public class TrickyClass2 <T>{
    private T myGenericField;
    private T elGeneral;

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

    /*
    * Boyle yapinca type parameter hiding yapiyor elGeneral ve myGenericField'taki generic T yi hide ediyor
    */
    public <T> TrickyClass2(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        TrickyClass2<StringBuilder> trickyInstance = new TrickyClass2<StringBuilder>(new StringBuilder("Hello I'm StringBuilder in constructor"));

    }
}
