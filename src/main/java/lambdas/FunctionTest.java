package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ana", "Mirela", "Marius");
        List<Integer> sizeOfNames = new ArrayList<>();

        Function<String, Integer> sizeFunction = str -> str.length();

        for (String name : names) {
            sizeOfNames.add(sizeFunction.apply(name));
        }

        System.out.println(sizeOfNames);
    }
}
