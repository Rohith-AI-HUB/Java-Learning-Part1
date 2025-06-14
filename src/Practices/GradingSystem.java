package Practices;
import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Grading System Based in Percentage");
        System.out.print("Please provide the percentage: ");
        int percentage = input.nextInt();

        if (percentage > 90){
            System.out.println("A");
        } else if (percentage > 75 && percentage <= 90){
            System.out.println("B");
        } else if (percentage > 60 && percentage <= 75){
            System.out.println("C");
        } else if (percentage >= 30 && percentage <= 60){
            System.out.println("D");
        } else if (percentage < 30){
            System.out.println("F");
        }
    }
}
