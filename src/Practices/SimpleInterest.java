package Practices;
import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Simple Intrest Calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principle Amount: ");
        double principle = input.nextDouble();
        System.out.println("Enter the Rate of Intrest: ");
        float rate = input.nextFloat();
        System.out.println("Enter the Time Period (in years): ");
        float years = input.nextFloat();

        double interest = (principle * rate * years) / 100;

        System.out.println("The Simple Intrest is: " + interest+ "$");
    }
}
