package chapter14.genericsrevisited;

public class GenericMethods {
    /*
    * calling a constructor: writing new T() is not allowed because at runtime it would be
    *  new Object();
    *
    * creating an array of that generic type: this one is the most annoying, but it makes
    * sense because you'd be creating array of Object values
    *
    * calling instanceof: this is not allowed because at runtime List<Integer> and
    * List<String> llok the same to java due to type erasure
    *
    * Using a primitive type as a generic type parameter
    *
    * Creating a static variable as a generic type parameter: This is not allowed because the type
    * is linked to the instance of the class
    *
    * */

    static <T> void ship(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethods.<String>ship("samir");
        GenericMethods.<String[]>ship(new String[]{"ali", "veli"});
        GenericMethods.ship("sadi");
    }


}
