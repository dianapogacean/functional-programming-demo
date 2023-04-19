package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise4 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("ana", "are", "mere", "pere", "fructe");

        Map<Integer, List<String>> grouped =
                words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(grouped);
    }
}
