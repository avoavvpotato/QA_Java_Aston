package figure;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(3, 10, "red", "black");
            Circle circle = new Circle(2.5, "green", "black");
            Triangle triangle = new Triangle(2.5, 4.5, 6, "blue", "black");

            System.out.println("[Perimeter, Area, Fill Color, Border Color]");
            System.out.println(Arrays.toString(circle.getProperties()));
            System.out.println(Arrays.toString(rectangle.getProperties()));
            System.out.println(Arrays.toString(triangle.getProperties()));
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating figures: " + e.getMessage());
        }

        try {
            Rectangle rectangle = new Rectangle(-3, 10, "red", "black");
            System.out.println("[Perimeter, Area, Fill Color, Border Color]");
            System.out.println(Arrays.toString(rectangle.getProperties()));
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating figures: " + e.getMessage());
        }

        try {
            Rectangle rectangle = new Rectangle(3, 10, "", "black");
            System.out.println("[Perimeter, Area, Fill Color, Border Color]");
            System.out.println(Arrays.toString(rectangle.getProperties()));
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating figures: " + e.getMessage());
        }
    }
}
