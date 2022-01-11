package chapter10;

public class PrintingMyExceptions {
    private void hop(){
        throw new RuntimeException("cannot hop");
    }

    public static void main(String[] args) {
        PrintingMyExceptions printingMyExceptions = new PrintingMyExceptions();

        try {
            printingMyExceptions.hop();
        } catch (RuntimeException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }
}
