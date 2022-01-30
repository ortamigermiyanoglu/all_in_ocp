package chapter14.genericsrevisited;

public class ThreeWaysImplementingGenericInterface {


    static class ShippablePlastic implements Shippable<String>{

        @Override
        public void ship(String s) {

        }

        @Override
        public <U> int weight(U u) {
            return 0;
        }
    }

    static class ShippableFreezedWater<String> implements Shippable<String> {


        @Override
        public void ship(String string) {

        }

        @Override
        public <U> int weight(U u) {
            return 0;
        }
    }

    static class ShippableLiquid implements Shippable{

        @Override
        public void ship(Object o) {

        }

        @Override
        public int weight(Object o) {
            return 0;
        }
    }


    public static void main(String[] args) {

        ThreeWaysImplementingGenericInterface.ShippableLiquid staticInner = new ThreeWaysImplementingGenericInterface.ShippableLiquid();

    }


}
