package chapter14;

public class ComprendesMendes {
    private String amigo;
    private String comprende;

    public String getAmigo() {
        return amigo;
    }

    public void setAmigo(String amigo) {
        this.amigo = amigo;
    }

    public String getComprende() {
        return comprende;
    }

    public void setComprende(String comprende) {
        this.comprende = comprende;
    }

    @Override
    public String toString() {
        return "ComprendesMendes{" +
                "amigo='" + amigo + '\'' +
                ", comprende='" + comprende + '\'' +
                '}';
    }
}
