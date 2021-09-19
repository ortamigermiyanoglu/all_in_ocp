package chap9;

public class Stork extends Bird{
    @Override
    public String getName() {
        return "Stork";
    }

    public static void main(String[] args) {
        Bird b = new Stork();
        b.printName();
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}
