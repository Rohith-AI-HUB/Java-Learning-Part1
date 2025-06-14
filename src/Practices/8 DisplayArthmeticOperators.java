package Practices;

import java.util.Scanner;

class DisplayArthmeticOperators {
    public static void main(String[] args) {
        System.out.println("Welcome to Arithmetic Calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the First NUmber: ");
        int num1 = input.nextInt();
        System.out.print("Now provide the next number: ");
        int num2 = input.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Addition of " + num1 + " and " + num2 + "        is:  " + add);
        System.out.println("Subtraction of " + num1 + " and " + num2 + "     is:  " + sub);
        System.out.println("Multiplication of " + num1 + " and " + num2 + "  is:  " + mul);
        System.out.println("Division of " + num1 + " and " + num2 + "        is:  " + div);
        System.out.println("Modulus of " + num1 + " and " + num2 + "         is:  " + mod);
    }
}
