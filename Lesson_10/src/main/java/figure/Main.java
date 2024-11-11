package figure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "green", "black");
        Rectangle rectangle = new Rectangle(3, 10, "red", "black");
        Triangle triangle = new Triangle(2.5, 4.5, 6, "blue", "black");

        System.out.println("[Perimeter, Area, Fill Color, Border Color]");
        System.out.println(Arrays.toString(circle.getProperties()));
        System.out.println(Arrays.toString(rectangle.getProperties()));
        System.out.println(Arrays.toString(triangle.getProperties()));
    }
}
