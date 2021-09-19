package chap8;

public class LastSub  extends LastSup{
    protected int num;
    int saziye;

    LastSub(int num){
        super.num = num;
    }

    /* it is not overriding
    @Override
    public void say(int number){
        System.out.print("LastSub:"+number);
    }
    */
    static StringBuilder hiddenMethod(int saziye){
        System.out.println("hiddenMethod call LastSub");
        return new StringBuilder();
    }

    // IT IS NOT OVERRIDING
    static void covariantParamInStatic(String cs){
        System.out.println("covariantParamInStatic call LastSub");
    }

    /* olmaz oyle
    static CharSequence returnTpeCovariantHiddenMehtod(){
        System.out.println("returnTpeCovariantHiddenMehtod call LastSub");
        return new String();
    }
    */
    

    @Override
    public String covariantReturn(){
        System.out.println("covariantReturn call LastSub");
        return new String();
    }

    //Overloading not overriding
    void covariantParamInInstance(String cs){
        System.out.println("covariantParamInInstance call LastSup");
    }

    void onlyInSub(){
        System.out.println("this method belongs only to LastSub");
    }
    public static void main(String[] args) {
        LastSub lastSub = new LastSub(5);
        lastSub.hiddenMethod(1);

        LastSup lastSup = new LastSub(5);
        lastSup.covariantReturn();
        lastSup.covariantParamInStatic("");

        System.out.println("calling lastSub num which is not assigned a value");
        System.out.println(lastSub.num);
        System.out.println("calling lastSup num which is assigned 5");
        System.out.println(lastSup.num);
        //lastSup.onlyInSub();  DNC
        lastSup.onlyInSup();
    }
}
