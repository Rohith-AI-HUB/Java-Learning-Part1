package Practices;
import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area of Triangle Calculator\n");
        System.out.println("Please enter the Breadth of the Triangle: ");
        double breadth = input.nextDouble();
        System.out.println("Please enter the Height of the Triangle: ");
        double height = input.nextDouble();
        double area = (breadth * height) / 2;
        System.out.println("The Area of the Triangle is: " + area);
    }
}
