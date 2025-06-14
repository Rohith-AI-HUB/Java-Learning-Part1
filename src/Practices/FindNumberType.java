package Practices;
import java.util.Scanner;
public class FindNumberType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Determine if the number is positive, negative or zero");
        System.out.print("Please provide the number: ");
        int number = input.nextInt();
        if(number > 0)
            System.out.println("The number is positive");
        else if(number <0)
            System.out.println("The number is negative");
        else
            System.out.println("The number is zero");
    }
}
