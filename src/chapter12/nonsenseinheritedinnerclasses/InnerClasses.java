package chapter12.nonsenseinheritedinnerclasses;

public class InnerClasses {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();   //Instantiating OuterClass

        OuterClass.InnerClassTwo innerTwo = outer.new InnerClassTwo();  //Instantiating InnerClassTwo

        System.out.println(innerTwo.getX());
        innerTwo.methodOfInnerClassOne();
    }
}
