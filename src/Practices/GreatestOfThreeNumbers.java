package Practices;
import java.util.Scanner;
public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greatest Of three numbers");
        System.out.println("Enter the First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 =input.nextInt();
        System.out.println("Enter the Thired Number: ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3)
            System.out.println(("Greatest Number is: "+num1));
        else if (num2 > num1 && num2 > num3)
            System.out.println(("Greatest Number is: "+num2));
        else
            System.out.println(("Greatest Number is: "+num3));    
    }
}
