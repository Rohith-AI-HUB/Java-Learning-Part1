package src.Practices;
import java.util.Scanner;

class ConvertFtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celcius = (fahrenheit - 32) * 5/9;
        System.out.println("The Temperature in Celcius is: " + celcius+"C");    
    }
}
