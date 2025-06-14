package challenges.Operators.Logical;

import java.util.Scanner;

class Discount {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Welcome to Discount Dispather");
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you a Female (True/False): ");
        boolean isFemale = input.nextBoolean();

        if (age<5){
            System.out.println("You got 75% discount");
        } else if (isFemale){
            System.out.println("You got 50% discount");
        } else if (age>60 && !isFemale){
            System.out.println("You got 25% discount");
        } else {
            System.out.println("You are unlucky");
        }
    }
}
