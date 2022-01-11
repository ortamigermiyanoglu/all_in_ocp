package chapter13;

public @interface Exercise {

    /* DNC since it's final
    final boolean isBunny();
    */

    public static final String name = "Samir";
    int hoursPerDay();
    int startHour() default 6;
    /* DNC since default value not constant
    String address() default new String("ABC street");
     */

    /* DNC only []
    String[][] generalInfo();
     */

    /* DNC wrapper classes
    Integer height();
     */

    /* DNC type not supported
    Cheetah friendlyCheetah();
    */
    String name() default  name;
}
