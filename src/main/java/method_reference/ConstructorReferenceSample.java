package method_reference;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ConstructorReferenceSample {


    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bcee";

        StringBuilder stringBuilder = new StringBuilder("initial value");

        stringBuilder.append(str1).append(",").append(str2).append(2);

        String strFinal = stringBuilder.toString();


        List<String> words = Arrays.asList("abc", "cde", "kkkk");
        List<StringBuilder> wordsBuilders = new ArrayList<>();

        Function<String, StringBuilder> mapper = StringBuilder::new;

        for (String word : words){
           // wordsBuilders.add(new StringBuilder(word)); - imperative way
            wordsBuilders.add(mapper.apply(word));
        }
    }

}
