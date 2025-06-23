package Practices;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Please enter operator: ");
        char operator = input.next().charAt(0);
        int result = calculate(num1, num2, operator);
        System.out.println("Result of "+ num1 + " "+operator+" "+ num2 + " is: "+result);
    }

    public static int calculate(int num1, int num2, char operator){
        return switch (operator){
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> 0;
        };
    }
}
