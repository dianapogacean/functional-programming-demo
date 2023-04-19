package exercises;

import java.util.Arrays;
import java.util.List;

public class Exercise8 {

    /*
    Compute the average age of a list of Person objects. Display the name of each person while computing the average
     */
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35));

        double averageAge = people.stream()
                .peek((person) -> System.out.println("Adding to average: " + person.getName()))
                .mapToInt(Person::getAge) //mapToInt is a special kind of map, that transforms a Stream into an IntStream
                .average() //terminal operation available for IntStream objects - average
                .orElse(0); //average returns Optional. The method orElse first checks if the value is
        //present in the Optional. If not, it returns the parameter we pass (in this case, 0).

        System.out.println(averageAge);
    }
}
