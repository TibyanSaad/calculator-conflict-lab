import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        int product = num1 * num2;
        int quotient = num1 / num2;
        int sum = num1 + num2;
        int difference = num1 - num2;

        System.out.println("product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("Power: " + Math.pow(num1,num2));
        scanner.close();
    }
}
