package method_reference;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReferenceSample {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("aaa", "bbb", "ccc");

        words.forEach(StaticMethodReferenceSample::printToUpperCase);
    }

    public static void printToUpperCase(String value){
        System.out.println(value.toUpperCase());
    }
}
