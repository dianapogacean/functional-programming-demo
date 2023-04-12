package lambdas;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        Supplier<Double> randomFunction = () -> Math.random();

        for (int i = 0; i < 5; i++) {
            System.out.println(randomFunction.get());
        }
    }
}
