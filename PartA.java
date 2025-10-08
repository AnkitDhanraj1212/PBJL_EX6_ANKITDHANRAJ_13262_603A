package PBJL_EX6_ANKITDHANRAJ_13262_603A;

import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class PartA {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(3, "aadi", 45000),
            new Employee(1, "yuvraj", 55000),
            new Employee(2, "Ankit", 50000)
        );

        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("Sorted by name:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("\nSorted by salary:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Integer.compare(e1.id, e2.id));
        System.out.println("\nSorted by id:");
        employees.forEach(System.out::println);
    }
}
