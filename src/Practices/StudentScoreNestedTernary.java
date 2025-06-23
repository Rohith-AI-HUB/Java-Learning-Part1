package Practices;
import java.util.Scanner;

public class StudentScoreNestedTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student Score ");
        System.out.println("Please Enter the score: ");
        int marks = input.nextInt();
        String Category = marks > 80 ? "High" : (marks > 50) ? "Moderate" : "Low";
        System.out.println("Your Score is " + Category);
    }
}
