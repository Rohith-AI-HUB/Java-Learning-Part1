package challenges.Operators.BitWise;
import java.util.Scanner;
public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = input.nextInt();
        int result = num1 & num2;
        int result1 = num1 | num2;
        int result2 = num2 ^ num1;
        int result3 = ~num1;
        int result4 = num1<<1;
        int result5 = num1>>1;
        System.out.println("Result is: "+result);
        System.out.println("Result is: "+result1);
        System.out.println("Result is: "+result2);
        System.out.println("Result is: "+result3);
        System.out.println("Result is: "+result4);
        System.out.println("Result is: "+result5);
    }
}
