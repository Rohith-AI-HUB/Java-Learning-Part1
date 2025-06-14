package Practices;
import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Lets calculate the Perimeter of Rectangle\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the length of rectangle: ");
        double length = input.nextDouble();
        System.out.print("Please provide the breadth of rectangle: ");
        double breadth = input.nextDouble();

        double perimeter = 2 * (length + breadth);

        System.out.println("Perimeter of the rectangle is : " + perimeter+" cm");
    }
}
