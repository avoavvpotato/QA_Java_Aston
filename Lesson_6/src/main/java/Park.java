import java.util.ArrayList;
import java.util.List;

public class Park {
    private final List<Attraction> attractions;

    public Park() {
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String operatingHours, int price) {
        attractions.add(new Attraction(name, operatingHours, price));
    }

    public void printAttraction() {
        attractions.forEach(System.out::println);
    }

    private static class Attraction {
        private final String name;
        private final String hours;
        private final int price;

        public Attraction(String name, String operatingHours, int price) {
            this.name = name;
            this.hours = operatingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Name: " + name +
                    ", Operating Hours: " + hours +
                    ", Price: " + price;
        }
    }

}
