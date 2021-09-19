package chap13;

import java.io.Serializable;
import java.lang.annotation.Documented;

/**
 * This class for javadoc annotations
 */
@Deprecated
public class Address implements Cloneable, Serializable {
    public String street;
    public String city;
    public String state;
    public String zipCode;

    /**
     *
     * @param state
     * @param city
     * @return zip code of given state&city
     */
    @Deprecated
    public String getZipCode(String state, String city) {
        return zipCode;
    }
}
