package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamsSample {

    public static void main(String[] args) {

        //creating streams from a collection (list)
        List<String> words1 = Arrays.asList("abc", "cde", "efg");
        Stream<String> words1Stream = words1.stream();

        //creating streams using the static method of Stream.of
        Stream<String> words2 = Stream.of("ddd", "kkk", "abc");

        //creating streams from arrays
        String[] words3 = new String[]{"eeee", "ooo", "wwww"};
        Stream<String> words3Stream = Arrays.stream(words3);


        //the following 2 lines produce the same result
        Stream<Double> doubleStream = Stream.generate(Math::random);
        Stream<Double> doubleStream1 = Stream.generate(() -> Math.random());

        //f(n)=f(n)+2
        Stream<Integer> evenNumbersStream = Stream.iterate(2, n -> n + 2);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);


       List<Integer> evenSquared =  numbers.stream()
                .filter(nb -> nb % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(evenSquared);


    }
}
