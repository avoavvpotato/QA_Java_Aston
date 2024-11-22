import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create a list of words with animals.");
        List<String> animals = List.of(
                "cat",
                "dog",
                "bird",
                "fish",
                "cat",
                "elephant",
                "tiger",
                "dog",
                "turtle",
                "bird",
                "rabbit",
                "bunny",
                "cat"
        );

        WordUtils wordUtils = new WordUtils();

        Set<String> uniqueAnimals = wordUtils.getUniqueWords(animals);

        System.out.println("\nPrint unique animals.");
        for(String animal : uniqueAnimals) {
            System.out.println(animal);
        }

        Map<String, Integer> countAnimalsMap = wordUtils.countWordFrequency(animals);

        System.out.println("\nPrint frequencies of words in list.");
        for (Map.Entry<String, Integer> entry : countAnimalsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nCreate phone directory.");
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        try {
            phoneDirectory.add("Ivanov", "+79991234567");
            phoneDirectory.add("Petrov", "+79362345678");
            phoneDirectory.add("Ivanov", "+79243456789");
            phoneDirectory.add("Sidorov", "+79894567890");

            String surname = "Ivanov";
            System.out.println("Print numbers for surname " + surname + ":");
            List<String> phoneNumbers = phoneDirectory.get(surname);

            for (String number : phoneNumbers) {
                System.out.println(number);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
