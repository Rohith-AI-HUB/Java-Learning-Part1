package Practices;
import java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide the age: ");
        int age = input.nextInt();

        if (age <13){
            System.out.println("Child");
        } else if (age <20 && age >= 13){
            System.out.println("Teenager");
        } else if (age <60 && age >= 20){
            System.out.println("Adult");
        } else if (age >= 60){
            System.out.println("Senior");
        }
    }
}
