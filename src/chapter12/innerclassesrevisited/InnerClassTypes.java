package chapter12.innerclassesrevisited;

/*
 * Inner class: A non-static type defined at the member level of a class
 *      can be declared public,protected, package private, private
 *      can extend any class and implement any interface
 *      cannot declare static fields/methods except for static final fields
 *      can access members of the outer class including private members
 *      requires instance of outer class to be instantiated
 *
 * Static nested class: A static type defined at the member level of a class
 *      the nesting creates namespace because the enclosing class name must be used to refer it
 *      can be declared public,protected, package private, private
 *      the enclosing class can refer to the fields and methods of the static nested class
 *
 * Local class: A class defined within method body
 *      local classes are not limited to be declared only inside methods, they can be declared inside constructors and initializers too
 *      they don't have access modifiers
 *      they cannot be declared static and cannot declare static fields or methods, except for static final methods
 *      they can access local variables if they are final or effectively final
 *      they have access to all fields and methods of the enclosing class (when defined in an instance method)
 *
 * Anonymous class: A special case of a local class that does not have a name
 *      declared and instantiated in one statement using new keyword, a type name with parentheses and a set of braces {}
 *
 *
 *
 *
 * */

public class InnerClassTypes {
    private String greeting = "Hi";
    private int x = 10;
    private int height = 4;

    protected class Inner{
        private int repeat = 3;
        public void go(){
            for (int i=0; i<repeat; i++){
                System.out.println(greeting);
            }
        }
    }

    public void callInner(){
        Inner inner = new Inner();
        inner.repeat = 4;
        inner.go();
    }

    static class Nested{
        private int price = 6;

        private void printPrice(){
            System.out.println("The price is: " + price);
//            System.out.println("Outer instance variable x is: ");
        }
    }



    public static void main(String[] args) {
        InnerClassTypes review = new InnerClassTypes();
        // MEMBER INNER CLASS
        Inner inner = review.new Inner();
        B b = review.new B();
        B.C c = b.new C();
        c.allTheXs();

        //STATIC NESTED CLASS
        Nested nestedInnerClass = new Nested();
        nestedInnerClass.printPrice();

        review.calculate();



    }


    private void calculate(){
        final int width = 5;
        class MyLocalClass{
            public void multiply(){
                System.out.println(width*height);
            }
        }
    }


    private class B{
        private int x = 20;
        private class C{
            private int x = 30;
            public void allTheXs(){
                System.out.println("InnerClassTypes x: " + InnerClassTypes.this.x);
                System.out.println("Member Inner class B x:" + B.this.x);
                System.out.println("Member Inner class C x:" + this.x);
            }

        }
    }






}
