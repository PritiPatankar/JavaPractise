package Assignment01;
import java.util.Scanner;

public class InsuranceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nInsurance App Menu:");
            System.out.println("1. Premium Calculation");
            System.out.println("2. Maturity Amount Calculation");
            System.out.println("3. Convert Policy Details to Upper Case");
            System.out.println("4. Convert Policy Details to Lower Case");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculatePremium();
                    break;
                case 2:
                    calculateMaturityAmount();
                    break;
                case 3:
                    convertToUpperCase();
                    break;
                case 4:
                    convertToLowerCase();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void calculatePremium() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer's age: ");
        int age = scanner.nextInt();
        System.out.print("Enter sum assured: ");
        double sumAssured = scanner.nextDouble();

        double premium;
        if (age < 25) {
           premium = 0.05 * sumAssured;
        } else if (age <= 40) {
           premium = 0.10 * sumAssured;
        } else {
           premium = 0.20 * sumAssured;
        }

        System.out.println("Insurance premium: " + premium);
        scanner.close();
    }

    private static void calculateMaturityAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter insurance premium: ");
        double premium = scanner.nextDouble();
        System.out.print("Enter policy term (in years): ");
        int term = scanner.nextInt();
        System.out.print("Enter annual interest rate: ");
        double interestRate = scanner.nextDouble();

        double maturityAmount = premium * term * (1 + interestRate / 100);
        System.out.println("Maturity amount: " + maturityAmount);
        scanner.close();
    }

    private static void convertToUpperCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter policy details: ");
        String policyDetails = scanner.nextLine();
    
        String upperCaseDetails = policyDetails.toUpperCase();
        System.out.println("Policy details in upper case: " + upperCaseDetails);
        scanner.close();
    }

    private static void convertToLowerCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter policy details: ");
        String policyDetails = scanner.nextLine();

        String lowerCaseDetails = policyDetails.toLowerCase();
        System.out.println("Policy details in lower case: " + lowerCaseDetails);
        scanner.close();
    }
}
