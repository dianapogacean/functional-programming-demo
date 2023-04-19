package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise6 {

    public static void main(String[] args) {
        List<String> words1 = Arrays.asList("apple", "banana", "cherry", "apple", "fig");
        List<String> words2 = Arrays.asList("grape", "kiwi", "banana", "mango");

        Predicate<String> stringPredicate = str -> str.length() >= 5;
        Predicate<String> stringPredicate1 = str -> str.charAt(0) == 'a';
        List<String> joined = Stream.concat(words1.stream(), words2.stream())
                .distinct()
                .filter(stringPredicate.or(stringPredicate1))
                .collect(Collectors.toList());

        System.out.println(joined);

    }
}
