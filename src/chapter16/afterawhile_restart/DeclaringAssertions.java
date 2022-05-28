package chapter16.afterawhile_restart;

public class DeclaringAssertions {
    /*
    * Assertions vs Unit Tests
    *
    * assertions are commonly used to verify the internal state of a program, while unit tests are most frequently
    * used to verify behavior
    *
    * */


    /*
    * Validating data with assert statement
    *
    * assert test_value:object;
    *
    * object.toString() will be called
    *
    * assert test_value;
    *
    * */

    /*
    * enabling-disabling assertions
    *
    * single file source code:
    * java -ea Party.java
    *
    * enabling for specific package and any subpackage
    * java -ea:com.demos... Main
    *
    * enabling only for a specific class
    * java -ea:com.demos.TestColors Main
    *
    *
    * enabling assertions for entire application but disabling assertions for specific class
    * java -ea:com.demos... -da:com.demos.TestColors Main
    *
    * */

    /* Assertion applications
    *       Usage               Decription
    * internal invariants       assert that a value is within certain constraint such as assert x>0
    * class invariants          assert the validity of an object's state such as private methods within the class that return a boolean
    * control-flow invariants   assert that a line of code you assume is unreachable is never reached
    * pre-conditions            assert that certain conditions are met before a method is invoked
    * post-conditions           assert that certain conditions are met after a method executes successfully
    *
    * */

    public static void main(String[] args) {
        int age = 1, height = 2;
        double length = 100.0;
        String name = "Cecelia";


        assert 1==age;
        assert (2==height);
        assert 100.0 == length : "Problem with length";
        assert ("Cecelia".equals(name)) : "Failed to verify user data";
        assert 5==6 : new DeclaringAssertions.MusabbekYaniTatli();




        System.out.println(null instanceof String);

    }

    static class MusabbekYaniTatli {
        private String tatlininArapcasi;

        public MusabbekYaniTatli() {
            this.tatlininArapcasi = "ımşebbak";
        }

        public String getTatlininArapcasi() {
            return tatlininArapcasi;
        }

        @Override
        public String toString() {
            return "MusabbekYaniTatli{" +
                    "tatlininArapcasi='" + tatlininArapcasi + '\'' +
                    '}';
        }
    }



}
