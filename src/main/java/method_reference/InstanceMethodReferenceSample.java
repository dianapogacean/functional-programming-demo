package method_reference;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceSample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("AAAA", "BcdNB", "klsdjfEEEE");

        InstanceMethodReferenceSample obj = new InstanceMethodReferenceSample();

        words.forEach(obj::printToLowerCase);
    }


    public void printToLowerCase(String value){
        System.out.println(value.toLowerCase());
    }
}
