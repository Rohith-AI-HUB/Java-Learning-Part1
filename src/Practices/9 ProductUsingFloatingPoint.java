package src.Practices;
import java.util.Scanner;

class ProductUsingFloatingPoint { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication");
        System.out.println("Please enter first decimal number: ");
        double num1 = input.nextDouble();
        System.out.println("Now please enter the second decimal number: ");
        double num2 = input.nextDouble();

        double product = num1 * num2;
        
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }
}
