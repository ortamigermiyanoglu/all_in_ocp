package chapter10.review;

public class Mouse {
    public String name;

    public void findCheese() throws NumberFormatException{
        System.out.println(1);
        try  {
            System.out.println(2);
            name.toString();
            System.out.println(3);
        } catch (NullPointerException | ClassCastException e){
            System.out.println(4);
            throw e;
        }

        try {
            String samir = "semir";
        } catch (NumberFormatException e){

        }
    }
}
