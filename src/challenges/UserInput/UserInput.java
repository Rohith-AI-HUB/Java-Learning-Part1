package src.Challenges.UserInput;
import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = Input.nextLine();
        System.out.println("Hello " + name);
        System.out.print(name + " Please enter your age: ");
        int age = Input.nextInt();
        System.out.println(name+" Your age is "+age+".");
    }
}
// Output:
// Enter your name: 
// Rohit
// Hello Rohit