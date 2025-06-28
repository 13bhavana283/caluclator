import java.util.Scanner;

public class SmartCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result = 0;
        int choice;
        char continueChoice, reuseChoice;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        do {
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.print("Your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            continueChoice = sc.next().charAt(0);

            if (continueChoice == 'y' || continueChoice == 'Y') {
                System.out.print("Use previous result as first number? (y/n): ");
                reuseChoice = sc.next().charAt(0);

                if (reuseChoice == 'y' || reuseChoice == 'Y') {
                    num1 = result;
                } else {
                    System.out.print("Enter new first number: ");
                    num1 = sc.nextDouble();
                }
            }

        } while (continueChoice == 'y' || continueChoice == 'Y');

        System.out.println("Thanks for using the calculator!");
        sc.close();
    }
}
