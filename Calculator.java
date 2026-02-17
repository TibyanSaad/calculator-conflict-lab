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
            int sum = num1+num2;
            int differernce = num1 - num2;
            System.out.println("Sum: " + sum);
            System.out.println("differernce: " + differernce);

           System.out.println("\nEnter a number to calculate factorial :") ;
            int factNum  = scanner.nextInt();

            int factorial = 1;
            for ( int i =  factNum; i >= 1; i--) {
                factorial = factorial * i;
            }
            System.out.println("factorial of" +  factNum + "is: " + factorial);





        scanner.close();
    }

}