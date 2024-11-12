package figure;

class Rectangle implements FigureParameters {
    private final double width;
    private final double height;
    private final String fillColor;
    private final String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        Validator.validateSide(width);
        Validator.validateSide(height);
        Validator.validateColor(fillColor, "Fill color");
        Validator.validateColor(borderColor, "Border color");

        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        return Math.round(width * height * 10.0) / 10.0;
    }

    @Override
    public double perimeter() {
        return Math.round(2 * (width + height) * 10.0) / 10.0;
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
