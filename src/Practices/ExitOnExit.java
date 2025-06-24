package Practices;
import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exit on Exit");
        while(true){
            System.out.println("Enter your command: ");
            String command = input.next();
            if (command.equals("Exit")){
                try {
                    System.out.println("Exiting...10%");
                    Thread.sleep(1000);
                    System.out.println("Exiting...20%");
                    Thread.sleep(1000);
                    System.out.println("Exiting...30%");
                    Thread.sleep(1000);
                    System.out.println("Exiting...40%");
                    Thread.sleep(1000);
                    System.out.println("Exiting...50%");
                    Thread.sleep(1000);
                    System.out.println("Exiting...60%");
                    Thread.sleep(1000);
                    System.out.println("Exiting...70%");
                    Thread.sleep(1000);
                    System.out.println("Exiting...80%");
                    Thread.sleep(1000);
                    System.out.println("Exiting...90%");
                    Thread.sleep(1000);
                    System.out.println("Exiting...100%");
                    Thread.sleep(1000);
                    break;
                } catch (InterruptedException e) {
                    System.out.println("Exiting process interrupted.");
                    Thread.currentThread().interrupt(); // Restore the interrupted status
                }
            }
        }
        System.out.println("Exited");
    }
}
