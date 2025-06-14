package Practices;
import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determine if the Number is odd or even");
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else
            System.out.println("The number is odd");

    }
}