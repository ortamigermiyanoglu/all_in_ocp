package chapter16;

public class DeclaringAssertions {
    /*
    * The syntax for an assert statement has two forms
    *
    * assert test_value;
    * assert test_value: messagee;
    *
    * */

    /*
    * Presuming assertions are enabled, an assertion is a shorter way of  writing the following
    *
    * if(!boolean_expression) throw new AssertionError("error_message");
    *
    * */


    /*
    * We can enable assertions by executing it using the single file source-code command
    *
    * java -ea DeclaringAssertions.java
    *
    * */

    /*
    * By default, assert statements are ignored by th JVM at runtime. To enable assertions
    *
    * java -ea DeclaringAssertions
    *  or
    * java -enableassertions DeclaringAssertions
    *
    * java -ea:com.demos... my.programs.Main
    * the ellipsis (...) means any class in the specified package or subpackages
    *
    * java -ea:com.demos.TestColors my.programs.Main
    *
    * */

    /*
    * disabling assertions
    *
    * java -da:com.demos...
    * java -disableassertions:com.demos...
    * */

    public void assertions(int age, int height, int length, String name){
            assert 19==age;
            assert 2==height;
            assert 100.0 == length;
            assert "Cecilia".equalsIgnoreCase(name);
    }

    public void recognizingAssertionSyntaxErrors(){
        /*
        *
        * assert(1)
        * assert x-> true;
        * assert 1==2 ? "Accept" : "Error";
        * assert.test(5>age);
        *
        * */
    }

    public static void main(String[] args) {



    }
}
