import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        int product = num1 * num2;
        int quotiont= num1 /num2;
        System.out.println("product: " + product);
        System.out.println("Quotiont: " + quotiont);


        scanner.close();
    }
}
