package figure;

class Triangle implements FigureParameters {
    private final double a;
    private final double b;
    private final double c;
    private final String fillColor;
    private final String borderColor;

    public Triangle(double a, double b, double c, String fillColor, String borderColor) {
        Validator.validateSide(a);
        Validator.validateSide(b);
        Validator.validateSide(c);
        Validator.validateTriangle(a, b, c);
        Validator.validateColor(fillColor, "Fill color");
        Validator.validateColor(borderColor, "Border color");

        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)) * 10.0) / 10.0;
    }

    @Override
    public double perimeter() {
        return Math.round((a + b + c) * 10.0) / 10.0;
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
