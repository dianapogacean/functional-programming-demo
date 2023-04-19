package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationsSample {

    public static void main(String[] args) {

        //forEach
        List<String> names = Arrays.asList("Ana", "Bob", "Charlie");
        names.stream().forEach(System.out::println);

        //reduce

        List<Integer> numbers = Arrays.asList(1, 2, 5, 7, 8, 9);

        numbers.stream().reduce(0, (a, b) -> a + b);
        numbers.stream().reduce(Integer::sum);
        numbers.stream().reduce((a, b) -> Integer.sum(a, b));

        //collect

        List<String> words = Arrays.asList("abc", "AbdreD", "kkkeEEE");
        List<String> wordsUppercase = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(wordsUppercase);

        //anyMatch, allMatch, noneMatch

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 5, 7, 8);
        boolean atLeastOneEven = numbers1.stream().anyMatch(n -> n % 2 == 0);

        System.out.println(atLeastOneEven);

        List<Integer> numbers2 = Arrays.asList(1, 2, 5, 7, 9);
        boolean allOdd = numbers2.stream().allMatch(nb -> nb % 2 == 1);

        System.out.println(allOdd);

        List<Integer> numbers3 = Arrays.asList(1, 2, 5, 7, 9);
        boolean noneEven = numbers3.stream().noneMatch(n -> n % 2 == 0);

        System.out.println(noneEven);


        //findFirst, findAny

        List<String> words1 = Arrays.asList("abcdddd", "Abd", "kkk");

        Optional<String> first = words1.stream()
                .filter(str -> str.length() == 3)
                .findAny();

        System.out.println(first.get());



    }
}
