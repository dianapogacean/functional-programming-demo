package exercises;

import java.util.List;

public class Exercise2 {
    /*
    Count words that start with a certain letter
     */
    public static void main(String[] args) {
        List<String> words = List.of("apple", "avocado", "banana", "blueberry", "cherry", "date", "fig", "grape");

        long count = words.stream()
                          .filter(word -> word.charAt(0) == 'a')
                          .count();

        System.out.println(count);
    }
}
