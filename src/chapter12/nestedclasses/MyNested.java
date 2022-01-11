package chapter12.nestedclasses;

public class MyNested {

    /* DNC MyNestedIn -> aNumber unreachable
    public int getMyNestedInNumber(){
        return aNumber;
    }
     */

    static class MyNestedIn{
        private int aNumber = 8;

        MyNestedIn(int aNumber){
            this.aNumber = aNumber;
        }

        public int getaNumber(){
            return aNumber;
        }

    }
}
