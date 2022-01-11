package chapter14;

import java.util.*;
import java.util.function.BiFunction;

public class MyCommonMapMethods {
    /*
    * void clear()
    * boolean containsKey(Object key)
    * boolean containsValue(Object value)
    * Set<Map.Entry<K,V>> entrySet() -> returns a Set of key/value pairs
    * void forEach(BiConsumer(K key, V value))
    * V get(Object key)
    * V getOrDefault(Object key, V defaultValue)
    * boolean isEmpty()  -> null key? null value?
    * Set<K> keySet()
    * V merge(K key, V value, Function<V, V, V> func) -> sets value if key not set. runs the function if the ket is set to determine the new value. Removes if null
    * V put(K key, V value) -> returns previous value or null
    * V putIfAbsent(K key, V value) -> adds value if not exists and returns null. Otherwise returns existing value
    * V remove(Object Key)
    * V replace(K key, V value) -> replaces the value for a given key if the key is set. returns the original value or null if none
    * void replaceAll(BiFunction<K,V,v> func) -> replaces each value with the result of the function
    * int size() returns the number of entries
    * Collection<V> values() -> returns Collection of all values
    *
    */


    @SuppressWarnings("unused")
    public static void main(String[] args) {
        /* throws NPE
        Map<String, String> stringStringMap = Map.of("key1", "value1", "key2", null, "key2", "valu3");
        */

        Map<String, String> stringStringMap = Map.ofEntries(
                Map.entry("Key1", "Val1"),
                Map.entry("Key2", "Val2")
        );


        Map<String, String> experimentMap = new HashMap<>();
        System.out.println("put null key: " + experimentMap.put(null, "nulKey's value"));
        System.out.println("isEmpty: " + experimentMap.isEmpty());
        System.out.println("put key1 val1: " + experimentMap.put("key1", "val1"));
        System.out.println("put key2 val2: " + experimentMap.put("key2", "val2"));
        System.out.println("putIfAbset key3 val3: " + experimentMap.putIfAbsent("key3", "val3"));
        System.out.println("putIfAbsent existing key1 val9: " + experimentMap.putIfAbsent("key1", "val9"));

        experimentMap.forEach((k,v)-> System.out.println(k + " : " + v));

        System.out.println("put existing key1 val9: " + experimentMap.put("key1", "val9"));

        experimentMap.forEach((k,v)-> System.out.println(k + " : " + v));

        System.out.println("replace non-existing key4 val4: " + experimentMap.replace("key4","val4"));

        System.out.println("printing map with entry set");
        Set<Map.Entry<String, String>> entries = experimentMap.entrySet();
        entries.forEach(e ->System.out.println(e.getKey() +" : " + e.getValue()));

        Collection<String> experimentMapValues = experimentMap.values();


        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        integerIntegerMap.put(1,2);
        integerIntegerMap.put(2,4);
        integerIntegerMap.put(3,6);


        System.out.println("replace method: " + integerIntegerMap.replace(2,8)); // prints existing value(4) before replacing


        BiFunction<Integer, Integer, Integer> integerIntegerIntegerBiFunction = (k,v)->k+v;
        integerIntegerMap.replaceAll(integerIntegerIntegerBiFunction::apply);
        /*
        integerIntegerMap.replaceAll(Integer::sum);
        integerIntegerMap.replaceAll((k,v)->k+v);
        */


        System.out.println("merge method but meaningless for me");
        BiFunction<String, String, String> mapper = (v1, v2)-> v1.length()>v2.length() ? v1 : v2;
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");

        String jenny = favorites.merge("Hamdi Land", "Skyride", mapper);
        favorites.forEach((k,v)->System.out.println(k + " : " + v));

        System.out.println("merge method but meaningful");

        var map = new HashMap<String, Integer>();

        var words = List.of("Foo", "Bar", "Foo", "Buzz", "Foo", "Buzz", "Fizz","Fizz");

        words.forEach(word -> {
            var prev = map.get(word);
            if (prev == null) {
                map.put(word, 1);
            } else {
                map.put(word, prev + 1);
            }
        });
        System.out.println(map); // {Bar=1, Fizz=2, Foo=3, Buzz=2}

        map.clear();
        words.forEach(word -> {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        });
        System.out.println(map); // {Bar=1, Fizz=2, Foo=3, Buzz=2}

        map.clear();
        words.forEach(word -> {
            map.putIfAbsent(word, 0);
            map.computeIfPresent(word, (w, prev) -> prev + 1);
        });
        System.out.println(map); // {Bar=1, Fizz=2, Foo=3, Buzz=2}


        words.forEach(k -> {
            map.merge(k, 0, (a, b)->a+b);
        });

        System.out.println(map);


    }
}
