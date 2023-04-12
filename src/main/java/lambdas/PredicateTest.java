package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = new ArrayList<>();

        Predicate<Integer> evenPredicate = number -> number%2==0;

        for (Integer i : numbers){
            if (evenPredicate.test(i)){
                evenNumbers.add(i);
            }
        }

        System.out.println(evenNumbers);
    }
}
