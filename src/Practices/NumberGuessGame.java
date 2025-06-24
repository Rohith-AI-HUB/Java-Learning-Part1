package Practices;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number guess game\n");
        System.out.print("Please enter your number: ");
        int num = 5, guess;
        do {
            System.out.println("Please enter your number (0-10): ");
            guess = input.nextInt();
        } while (num != guess);
            System.out.println("Your number is: " + guess);
        }
    }
