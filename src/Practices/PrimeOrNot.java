package Practices;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prime Number Checker");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isPrime = true;

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                isPrime = false;
                System.out.println(num + " is not a prime number");
                break;
            }
        }
        if (isPrime){
            System.out.println(num + " is a prime number");
        }
    }
}