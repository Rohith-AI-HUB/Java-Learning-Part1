package challenges.Loop;
import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        // int num = 1; //initialization
        // while (num<= 10){ //condition
        //     System.out.println(num);
        //     num = num + 1; //increment
        // }
        // int count = 500;
        // while (count >= 200){
        //     System.out.println(count);
        //     count = count -1;
        // }
        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i < 5){
            int inp = input.nextInt();
            System.out.println("NUmber is: " + inp);
            i++;
        }
    }
}
