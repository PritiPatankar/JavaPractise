package Question01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Read group of integers data from the user
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbersList.add(num);
            uniqueNumbers.add(num);
        }

        // Print the final list without duplicates
        System.out.println("Final list without duplicates:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Accept an integer number from the user
        System.out.print("Enter an integer to search: ");
        int searchNum = scanner.nextInt();

        // Check if the number exists in the list
        if (uniqueNumbers.contains(searchNum)) {
            // Remove the number from the list
            uniqueNumbers.remove(searchNum);
            System.out.println(searchNum + " removed from the list.");
        } else {
            // Add the number to the list
            uniqueNumbers.add(searchNum);
            System.out.println(searchNum + " added to the list.");
        }

        // Print the final updated list
        System.out.println("Updated list:");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
