package Assignment01;
import java.util.Scanner;

public class SubscriptionChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Subscription Checker!");

        System.out.print("Enter the number of days left in your subscription: ");
        int daysLeft = scanner.nextInt();

        if (daysLeft >= 0 && daysLeft <= 30) {
            if (daysLeft == 0) {
                System.out.println("Your subscription has ended. Please renew.");
            } else if (daysLeft >= 1 && daysLeft <= 5) {
                System.out.println("Your subscription is about to end. Please consider renewing.");
            } else {
                System.out.println("Your subscription is active.");
            }
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 30.");
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}
