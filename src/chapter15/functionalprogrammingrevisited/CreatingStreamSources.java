package chapter15.functionalprogrammingrevisited;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamSources {
    Stream<String> emptyStream = Stream.empty();
    Stream<Integer> singleElement = Stream.of(1);
    Stream<Integer> fromArray = Stream.of(1,2,3);


    ArrayList<String> list = (ArrayList)List.of("a","b", "c");
    Stream<String> fromList = list.stream();

    List<String> stringList = List.of("a","b","c");
    Stream<String> fromListParallel = list.parallelStream();

    Stream<Double> randomDouble =Stream.generate(Math::random);
    Stream<Integer> oddNumbers = Stream.iterate(1, n->n+2);

    Stream<Integer> oddNumbersUnder100 = Stream.iterate(1, n->n<100, n->n+2)
;





}
