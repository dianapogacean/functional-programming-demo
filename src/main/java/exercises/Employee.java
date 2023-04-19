package exercises;

public class Employee {
    private String name;
    private int age;
    private double salary;

   public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge(){
       return this.age;
    }

    public String getName(){
       return this.name;
    }

    public double getSalary(){
       return this.salary;
    }
}