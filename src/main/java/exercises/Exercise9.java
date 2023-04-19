package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise9 {

    /*
    Given a list of employees with their names, ages, and salaries,
    filter out the employees with a salary below a certain threshold,
    sort them by age, and then transform the list into a list of names.
     */
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, 50000),
                new Employee("Bob", 25, 45000),
                new Employee("Charlie", 35, 55000),
                new Employee("David", 40, 60000)
        );
        double salaryThreshold = 50000;

        List<String> filteredNames = employees.stream()
                .filter(employee -> employee.getSalary() >= salaryThreshold) //intermediate operation - filter
                .sorted(Comparator.comparingInt(Employee::getAge)) //intermediate operation - sort by age
                .map(Employee::getName) //intermediate operation - map an Employee to a String (representing the employee's name)
                .collect(Collectors.toList()); //collect to a list

        System.out.println(filteredNames);
    }
}
