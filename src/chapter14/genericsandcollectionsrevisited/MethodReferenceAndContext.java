package chapter14.genericsandcollectionsrevisited;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceAndContext {

    public static Integer countWords(MethodReferenceAndContext... words){
        return words.length;
    }



    public static void main(String[] args) {
        Supplier<Integer> methodRef1 = MethodReferenceAndContext::countWords;
        Supplier<Integer> methodRef2 = MethodReferenceAndContext::countWords;
        Function<MethodReferenceAndContext, Integer> methodRef3 = MethodReferenceAndContext::countWords;
        BiFunction<MethodReferenceAndContext, MethodReferenceAndContext, Integer>
                methodRef4 = MethodReferenceAndContext::countWords;
    }




}
