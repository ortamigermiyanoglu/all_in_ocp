package chapter12.nonsenseinheritedinnerclasses;

public class AnotherClassTwo extends V2OuterClass.InnerClassTwo{
    V2OuterClass v2OuterClass = new V2OuterClass();

    public AnotherClassTwo() {
//        v2OuterClass.super(); Cannot reference 'AnotherClassTwo.v2OuterClass' before supertype constructor has been calle
        new V2OuterClass().super();
        V2OuterClass v2OuterClass1 = new V2OuterClass();
//        v2OuterClass1.super(); call to super must be first statement
    }
}
