package chapter8;

public class LastSup {
    public int num;
    static int saziye;

    LastSup(){
        this(saziye);
    }
    LastSup(long i){}

    protected void order(CharSequence charSequence){
        logger.append(charSequence);
    }
    private StringBuilder logger = new StringBuilder();
    static CharSequence hiddenMethod(int primitive){
        System.out.println("hiddenMethod call LastSup");
        return new String();
    }

    static void covariantParamInStatic(CharSequence cs){
        System.out.println("covariantParam call LastSup");
    }

    void covariantParamInInstance(CharSequence cs){
        System.out.println("covariantParamInInstance call LastSup");
    }

    static StringBuilder returnTpeCovariantHiddenMehtod(){
        System.out.println("returnTpeCovariantHiddenMehtod call LastSub");
        return new StringBuilder();
    }


    public CharSequence covariantReturn(){
        System.out.println("covariantReturn call LastSup");
        return new StringBuilder();
    }

    void onlyInSup(){
        System.out.println("this method belongs only to LastSup");
    }

    private void say(int number){
        System.out.print("LastSup:"+number);

    }
}
