package figure;

public class Validator {

    public static void validateRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
    }

    public static void validateSide(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("All side must be positive. Provided: " + side);
        }
    }

    public static void validateTriangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("The provided sides do not form a valid triangle.");
        }
    }

    public static void validateColor(String color, String colorName) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException(colorName + " cannot be null or empty.");
        }
    }
}
