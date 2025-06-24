package Practices;
import java.util.Scanner;

public class OccurenceForEach {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Occurence Checker");
        int[] nums = ArrayUtility.inputArray();
        System.out.println("Enter the number to find occurence: ");
        int element = input.nextInt();
        int count = 0;
        for(int num : nums) {
            if(num == element) {
                count++;
            }
        }
        int occ = count;
        System.out.println("The occurence of " + element + " is " + occ);
    }
}
