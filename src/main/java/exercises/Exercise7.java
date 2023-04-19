package exercises;

import java.util.List;
import java.util.Optional;

public class Exercise7 {

    /*
    Find first divisor of 3 in a list of integers
     */
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int divisor = 3;

        Optional<Integer> foundNumber = numbers.stream()
                .filter(number -> number % divisor == 0)
                .findFirst();

        System.out.println(foundNumber.orElse(null));
    }
}
