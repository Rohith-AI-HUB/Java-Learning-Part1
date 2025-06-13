package AssignmentOperators;
import java.util.Scanner;

class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number for A: ");
        int a = input.nextInt();
        System.out.print("Enter the number for B: ");
        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The Value of A after swap: "+a);
        System.out.println("The Value of B after swap: "+b);
    }
}

// public class SwapTwoNumbers { 
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 5;
//         int temp = a;
//         a=b;
//         b=temp;
//         System.out.println("a = "+a);
//         System.out.println("b = "+b);
//     }
// }