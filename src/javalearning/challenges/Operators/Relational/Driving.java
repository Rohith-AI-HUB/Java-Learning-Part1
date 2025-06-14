package Relational;
import java.util.Scanner;

class Driving{
    public static void main(String[] args) {
        System.out.println("Driving Qualification Checker");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age =input.nextInt();

        if (age>=18){
            System.out.println("You are eligible to drive");
        } else {
            System.out.println("Sorry, you are not eligible to drive");
        }

    }
}