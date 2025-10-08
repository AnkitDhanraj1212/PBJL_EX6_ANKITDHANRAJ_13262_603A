package PBJL_EX6_ANKITDHANRAJ_13262_603A;

import java.util.*;
class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class PartB{
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(1, "Ankesh", 75.5),
            new Student(2, "Aadi", 82.0),
            new Student(3, "Yuvraj", 65.0),
            new Student(4, "Ankit", 90.0)
        );

        System.out.println("Students with marks >= 70, sorted by marks:");
        students.stream()
                .filter(s -> s.marks >= 70)
                .sorted(Comparator.comparingDouble(s -> s.marks))
                .forEach(System.out::println);

        System.out.println("\nStudents sorted by name:");
        students.stream()
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }
}
