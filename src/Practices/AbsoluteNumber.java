package Practices;
import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are here to find Absolute Number.\n");
        System.out.print("Please enter the number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value of " + num + " is " + result);
    }
}
