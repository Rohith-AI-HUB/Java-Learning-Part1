package Practices;
import java.util.Scanner;

public class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding odd or even\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        OddEvenTernary ternary = new OddEvenTernary();
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your number is: " + result);
    }
}
/*
 * 1. Write a program that prompts the user to enter a number.
 * 2. The program should display whether the number is odd or even.
 * 3. Use the ternary operator to determine the odd or even.
 */