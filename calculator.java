// Calculator.java
import java.util.*;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition operation");
        System.out.println("2. Subtract Operation");
        System.out.println("3. Multiply operation");
        System.out.println("4. Divide");

        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
