package src.Practices;
import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Welcome to Compound Intrest Calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principle Amount: ");
        double principle = input.nextDouble();
        System.out.println("Enter the Rate of Interest: ");
        float rate = input.nextFloat();
        System.out.println("Enter the Time Period (in years): ");
        float years = input.nextFloat();

        // double intrest = principle * (1 + rate / 100) * years;
        double interest = principle * Math.pow((1 + rate / 100), years);
        System.out.println("The Compound Intrest is: " + interest+ "$");
    }
}
