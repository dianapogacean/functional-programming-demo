package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Diana", "George");

        Consumer<String> printer = name -> {
            System.out.println(name + "1");
        };

        for (String name : names) {
            printer.accept(name);
        }

    }
}
