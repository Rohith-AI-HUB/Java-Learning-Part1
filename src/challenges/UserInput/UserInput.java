import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = Input.nextLine();
        System.out.println("Hello " + name);
    }
}
// Output:
// Enter your name: 
// Rohit
// Hello Rohit