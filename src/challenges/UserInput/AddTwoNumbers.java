import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner Num1 = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = Num1.nextInt();
        Scanner Num2 = new Scanner(System.in);
        System.out.print("Enter your second number: ");
        int num2 = Num2.nextInt();
        System.out.println("The sum of the two numbers is: " + (num1 + num2));
        int sum = num1 + num2;
        System.out.println(sum);
    }
}