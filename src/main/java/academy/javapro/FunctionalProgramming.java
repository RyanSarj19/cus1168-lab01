package academy.javapro;

import java.util.*;
import java.util.stream.*;

public class FunctionalProgramming {
    public static void main(String[] args) {
        // We create a list of numbers for you
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // First, let's print our original list
        System.out.println("Original numbers: " + numbers);

        // TASK 1: Filter even numbers and print them
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)     // This keeps only even numbers
                .collect(Collectors.toList());  // This collects results into a new list
        System.out.println("Even numbers: " + evenNumbers);

        // TASK 2: Create a stream that doubles each number in the original list
        // Replace the comment with .map(n -> n * 2)
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        // TASK 3: Sum all numbers in doubledNumbers
        int sum = doubledNumbers.stream()
                .mapToInt(n -> n)
                .sum();

        // Print results
        System.out.println("Doubled numbers: " + doubledNumbers);
        System.out.println("Sum of doubled numbers: " + sum);
    }
}
