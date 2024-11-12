package figure;

public class Circle implements FigureParameters{
    private final double radius;
    private final String fillColor;
    private final String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        Validator.validateRadius(radius);
        Validator.validateColor(fillColor, "Fill color");
        Validator.validateColor(borderColor, "Border color");

        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
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
