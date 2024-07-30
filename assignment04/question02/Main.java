package assignment04.question02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read two numbers from the user
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            // Perform division
            double result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        scanner.close();
    }
}

