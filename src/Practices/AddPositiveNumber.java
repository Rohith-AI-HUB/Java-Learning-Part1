package Practices;
import java.util.Scanner;

public class AddPositiveNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Add Positive Number");
        int[] numArr = ArrayUtility.inputArray();

        int sum = 0;
        for (int num : numArr){
            if (num < 0){
                continue;
            }
            sum +=num;
        }
        System.out.println("Sum of positive numbers is: " + sum);
    }
}
