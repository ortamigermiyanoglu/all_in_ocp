package chap9;

public class MyInnerClass {
    InnerClass innerClass = new InnerClass();

    public int getMyNum() {
        return 5;
    }

    double size = 2.0f;
    protected class InnerClass{
        private int myNum;

        private InnerClass(){}

        public int getMyNum() {
            return myNum;
        }

        public void setMyNum(int myNum) {
            this.myNum = myNum;
        }
    }

    public static void main(String[] args) {
        MyInnerClass myInnerClass = new MyInnerClass();
        System.out.println(myInnerClass.innerClass.getMyNum());

        System.out.println("2022-07-20 15:34:00.000-04:00 : " + ("2022-07-20 15:34:00.000-04:00".length()));
        System.out.println("2022-07-20 15:34:00.000-04:00".substring(0,16));
    }

    // can be private/protectec but cannot be final
    protected interface myInnerInterface{
        public int getMyNum() ;
    }
}
