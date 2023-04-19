package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    /*
    Count words that start with letter 'a'
     */
    public static void main(String[] args) {

        List<String> words = Arrays.asList("ana", "banana", "avocado", "cherry", "ananas");

        long count = words.stream()
                .filter( str -> str.charAt(0)=='a')
                .count();

        System.out.println(count);

       List<String> withA =  words.stream()
               .filter(str -> str.charAt(0)=='a')
               .collect(Collectors.toList());

        System.out.println(withA);


    }
}
