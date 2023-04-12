package lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Marius", "Mirela", "Ana");

        //annonymous inner class
        //   Collections.sort(names, new Comparator<String>() {
//
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//
//        });

        Collections.sort(names, (str1, str2) -> str1.length() - str2.length());


    }
}
