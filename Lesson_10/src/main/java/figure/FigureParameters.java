package figure;

public interface FigureParameters {
    default double perimeter() {
        System.out.println("Function perimeter() not implemented");
        return 0;
    }

    default double area() {
        System.out.println("Function area() not implemented");
        return 0;
    }

    default String getFillColor() {
        System.out.println("Function getFillColor() not implemented");
        return "";
    }
    default String getBorderColor() {
        System.out.println("Function getBorderColor() not implemented");
        return "";
    }

    default String[] getProperties() {
        return new String[] {
                String.valueOf(perimeter()),
                String.valueOf(area()),
                getFillColor(),
                getBorderColor()
        };
    }
}
