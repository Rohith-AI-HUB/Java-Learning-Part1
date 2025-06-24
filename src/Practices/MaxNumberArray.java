package Practices;
import java.util.Scanner;

public class MaxNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Max Number Checker");
        System.out.println("Enter number of elements: ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the elements: ");
            array[i] = input.nextInt();
        }
        // Find maximum using forEach
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number in array is: " + max);
    }
}
