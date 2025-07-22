import java.util.Scanner;

public class MathMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueMenu;

        do {
            System.out.println("**MATH MENU **");
            System.out.println("1. Print Table of a Number");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Check Prime Number");
            System.out.println("4. Print Fibonacci Series");
            System.out.println("5. Exit");
            System.out.println("********************************");
            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to print its table: ");
                    int tableNum = scanner.nextInt();
                    System.out.println("\nMultiplication Table of " + tableNum + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
                    }
                    break;

                case 2:
                    System.out.print("Enter a number to calculate its factorial: ");
                    int factNum = scanner.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= factNum; i++) {
                        factorial *= i;
                    }
                    System.out.println("\nFactorial of " + factNum + " is: " + factorial);
                    break;

                case 3:
                    System.out.print("Enter a number to check if it's prime: ");
                    int primeNum = scanner.nextInt();
                    boolean isPrime = true;

                    if (primeNum <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= primeNum / 2; i++) {
                            if (primeNum % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }

                    if (isPrime) {
                        System.out.println("\n" + primeNum + " is a Prime Number.");
                    } else {
                        System.out.println("\n" + primeNum + " is NOT a Prime Number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the number of terms for Fibonacci series: ");
                    int terms = scanner.nextInt();
                    int first = 0, second = 1;

                    System.out.println("\nFibonacci Series up to " + terms + " terms:");
                    for (int i = 1; i <= terms; i++) {
                        System.out.print(first + " ");
                        int next = first + second;
                        first = second;
                        second = next;
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("\nExiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("\nInvalid choice! Please select a number from 1 to 5.");
            }

            System.out.print("\nDo you want to return to the menu? (Y/N): ");
            continueMenu = scanner.next().charAt(0);
            System.out.println();

        } while (continueMenu == 'Y' || continueMenu == 'y');

        System.out.println("Thank you for using the Math Menu. Have a great day!");
        scanner.close();
    }
}
