package chapter13;

public class Reindeer {
    /* DNC attribute value must be constant
    @Music(genres = null) String other;
     */

    /* DNC attribute value must be constant
    @Music(genres = {new String("asfaf")}) String other;
     */

    @Music(genres = {}, value = "Grup Yorum") String emptyArray;
    @Music("Ezginin Gunlugu") String oneElementArr;
    @Music({"Ezginin Gunlugu", "Grup Ozgurluk"}) String multipleElementArr;



}
