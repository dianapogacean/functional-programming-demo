package method_reference;

import java.util.Arrays;
import java.util.List;

public class ArbitraryMethodReferenceSample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "abc", "cde");

        words.forEach(String::toUpperCase);

        System.out.println(words);
    }
}
