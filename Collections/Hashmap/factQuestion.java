import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FactorialCalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            int num;

            switch (choice) {
                case 1:
                System.out.print("Enter an integer: ");
                num = scanner.nextInt();
                System.out.println("Factorial of "+num+" is: "+calculateFactorial(num));
                break;

                case 2:
                System.out.print("Enter an integer: ");
                num = scanner.nextInt();
                for(int i=1; i<=num; i++){
                    System.out.println("Factorial of "+ i + " is:"+getFactorialSequence(num).get(i));
                }
                break;

                case 3:
                System.out.print("Enter an integer: ");
                num = scanner.nextInt();
                System.out.println("Sum of factorials up to "+num+" is: "+calculateFactorialSum(num));
                break;

                case 4:
                System.out.print("Enter an integer: ");
                num = scanner.nextInt();
                System.out.println("Enter the first integer (m): ");
                System.out.println("Enter the second integer (n): ");
                break;

                case 5:
                System.out.println("Goodbye!");
                // complete the implementation here and call below given function respectively
            }

        } while (choice != 5);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Calculate Factorial");
        System.out.println("2. Factorial Sequence");
        System.out.println("3. Factorial Sum");
        System.out.println("4. Factorial Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static long calculateFactorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact*i;
        }
        // calculate factorial
        return fact;
    }

    public static Map<Integer, Long> getFactorialSequence(int n) {
        // calculate factorial sequence and return map
        HashMap<Integer, Long> factSet = new HashMap<Integer, Long>();
        for(int i=1; i<=n; i++){
            factSet.put(i, calculateFactorial(i));
        }
        // key is number and value is factorial of that number
        return factSet;
    }

    public static long calculateFactorialSum(int n) {
        // calculate factorial sum
        int sum=0;
        for(int i=1; i<=n; i++){
            sum += calculateFactorial(i);
        }
        return sum;
    }

    public static double calculateFactorialDivision(int m, int n) throws IllegalArgumentException,ArithmeticException{
        // 1: throw new IllegalArgumentException when input m or n is incorrect to calculate factorial division
        if(m<0 || n<0 || m<n){
            throw new IllegalArgumentException("Inputs must be non-negative integers and m must be greater than or equals to n");
        }
        // 2:  calculate factorial division

        return (double)calculateFactorial(m)/(double)calculateFactorial(n);
    }
}
