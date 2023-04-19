package exercises;

import java.util.List;

public class Exercise1 {

    /*
    Sum of all even numbers in a list
     */
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .reduce(0, (a,b) -> a+b);

        System.out.println(sum);
    }
}
