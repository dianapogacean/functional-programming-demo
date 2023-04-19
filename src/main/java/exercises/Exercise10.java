package exercises;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise10 {

    //fibonacci series: 1,1,2,3,5,8,13,21,...
    public static void main(String[] args) {
        //Generate the 5th element in the Fibonacci series
        int fib = Stream.iterate(new int[]{1, 1}, f -> new int[]{f[1], f[0]+f[1]}) //1
                .limit(5) //2
                .reduce((a, b) -> b) //3
                .orElseThrow(IllegalArgumentException::new)[0]; //4

        /*
        1 - Stream.iterate(new int[]{1, 1}, f -> new int[]{f[1], f[0]+f[1]})
        This line creates a Stream of int arrays using the Stream.iterate method.
         The method takes two parameters: an initial seed value and a function
         that generates the next element based on the current one.
         The seed value is an array containing the first two Fibonacci numbers (1, 1).
         The function (lambda expression) f -> new int[]{f[1], f[0]+f[1]}
         generates the next element in the sequence by creating a new array where
          the first element is the second element of the previous array,
          and the second element is the sum of both elements in the previous array.
         */

        /*
        2 -limit(5)
        This line limits the Stream to the first five elements.
         So, it will contain only the first five Fibonacci numbers.
         */

        /*
        3 - reduce((a, b) -> b)
        This line uses the reduce operation to collapse the Stream into a single value.
        The lambda expression (a, b) -> b takes two arrays and returns the second one,
        effectively discarding the first one. After applying this operation,
        the Stream will contain only the last (5th) Fibonacci number.
         */

        /*
        4- orElseThrow(IllegalArgumentException::new)[0]
        This line is used to handle the case where the Stream is empty.
        If the Stream is empty, it will throw an IllegalArgumentException.
        However, since we used the limit method earlier, this case will never happen.
         Assuming the Stream is not empty, it will return the first element of the
         last array, which is the 5th Fibonacci number.
         */


        System.out.println(fib);
    }
}
