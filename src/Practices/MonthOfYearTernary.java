package Practices;
import java.util.Scanner;

class MonthSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Month Printer");
        System.out.println("Please enter number between 1 to 12: ");
        int num = input.nextInt();
        String monthName = getMonthName(num);
        System.out.println("Month of "+ num + " is: "+monthName);
    }

    public static String getMonthName(int num){
        return switch (num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";
    };
    }
}
