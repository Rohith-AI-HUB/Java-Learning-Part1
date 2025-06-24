package Practices;
import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Even Number Printer");
        System.out.println("Enter number of elements: ");
        int[] newArr = ArrayUtility.inputArray();

        System.out.println("Even numbers are: ");
        for (int num : newArr){
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
