package academy.javapro;

import java.util.*;
import java.util.stream.*;

public class StudentStreamLab {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.5, "Junior"),
                new Student("Bob", 3.8, "Senior"),
                new Student("Charlie", 2.9, "Sophomore"),
                new Student("David", 3.1, "Freshman"),
                new Student("Eve", 3.9, "Junior")
        );

        // Filtering: Students with GPA > 3.0
        List<Student> highGpaStudents = students.stream()
                .filter(s -> s.getGpa() > 3.0)
                .collect(Collectors.toList());

        System.out.println("Students with GPA > 3.0:");
        for (Student s : highGpaStudents) {
            System.out.println(
                s.getName() + " (" + s.getCollegeYear() + ") - GPA: " + s.getGpa()
            );
        }
        System.out.println();

        // Mapping: Extract names of students with GPA > 3.0
        System.out.println("High GPA student names:");
        highGpaStudents.stream()
                .map(Student::getName)
                .forEach(System.out::println);
        System.out.println();

        // Reducing: Calculate the average GPA of all students
        double averageGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);

        System.out.printf("Average GPA: %.2f\n\n", averageGpa);

        // Collecting: Collect all "Junior" students into a list
        List<Student> juniors = students.stream()
                .filter(s -> "Junior".equals(s.getCollegeYear()))
                .collect(Collectors.toList());

        System.out.println("Juniors:");
        for (Student j : juniors) {
            System.out.println(
                j.getName() + " (" + j.getCollegeYear() + ") - GPA: " + j.getGpa()
            );
        }
    }
}
