package figure;

public class Circle implements FigureParameters{
    private final double radius;
    private final String fillColor;
    private final String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        validateRadius(radius);

        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    private void validateRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
    }

    @Override
    public double perimeter() {
        return Math.round(2 * Math.PI * radius * 10.0) / 10.0;
    }

    @Override
    public double area() {
        return Math.round(Math.PI * radius * radius * 10.0) / 10.0;
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}
