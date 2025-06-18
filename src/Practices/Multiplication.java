package Practices;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = input.nextInt();
        Mulitply(num);
    }

    public static void Mulitply(int num) {
        int i = 1;
        while(i<=10){
            System.out.println(num + " * " + i + " = " + (num*i));
            i++;
        }
    }
}
