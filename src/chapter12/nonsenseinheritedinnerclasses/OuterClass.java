package chapter12.nonsenseinheritedinnerclasses;

class OuterClass {
    abstract class InnerClassOne {
        private int x = 10;

        void methodOfInnerClassOne() {
            System.out.println("From InnerClassOne");
        }

        abstract int getX();

        abstract void helloWorld();
    }

    class InnerClassTwo extends InnerClassOne {
        @Override
        int getX() {
            return super.x;
        }

        @Override
        void helloWorld() {
            System.out.println("Hello World!");
        }
    }

    static class InnerClassThree extends InnerClassOne{

        InnerClassThree(){
            new OuterClass().super();
        }


        @Override
        int getX() {
            return 0;
        }

        @Override
        void helloWorld() {

        }
    }

    public static void main(String[] args) {
        OuterClass.InnerClassThree innerClassThree = new OuterClass.InnerClassThree();
    }
}

