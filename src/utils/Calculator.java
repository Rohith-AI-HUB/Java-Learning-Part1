package utils;
import Geometry.Circle;
import Geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rec = new Rectangle(10, 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double recArea = rec.length * rec.width;

        System.out.printf("Circle area: %s\n", cirArea);
        System.out.println("Rectangle area: " + recArea);
        System.out.println("Circle area is greater than Rectangle area: " + (cirArea > recArea));
    }
}
