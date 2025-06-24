package Practices;
import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fibonnaci Series");
        System.out.println("Enter the number of terms: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(Fibonnaci(i)+ " ");
        }
    }

    public static int Fibonnaci(int n){
        System.out.print(".");
        if (n == 1 ){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return Fibonnaci(n -1 )+  Fibonnaci(n -2);
    }
}
