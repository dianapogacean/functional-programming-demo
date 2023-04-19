package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsSample {

    public static void main(String[] args) {


        //filter
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> numbers1Stream = numbers1.stream().filter(n -> n % 3 == 0);

        //map
        List<String> names = Arrays.asList("Anna", "Bob", "John");
        names.stream().map(str -> str.length());
        //names.stream().map(String::length);

        //flatMap
        List<String> sentences = Arrays.asList("Hello java", "Goodbye react");

        sentences.stream().flatMap(str -> Arrays.stream(str.split(" ")));

        //distinct
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 2, 4, 5, 5, 1);

        Stream<Integer> numbers2Stream = numbers2.stream().distinct();

        //sorted
        List<String> words = Arrays.asList("bob", "ana", "zzz");
        Stream<String> sorted1 = words.stream().sorted();
        Stream<String> sorted2 = words.stream().sorted( (str1, str2) -> str1.length()-str2.length());

        //peek
        List<Integer> numbers3 = Arrays.asList(1,2,3,4,5);

        numbers3.stream()
                .peek(nb -> System.out.println(nb))
                .map(nb -> nb * 2)
                .peek(System.out::println);

    }
}
