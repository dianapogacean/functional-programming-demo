package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {

    /*
    Given a list of integers, filter even values, square them and sort them in descending order
     */
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1,2,3,5,6,8,9);

        List<Double> result = numbers.stream()
                .filter(n -> n%2==0)
                .map(n -> Math.pow(n,2))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
