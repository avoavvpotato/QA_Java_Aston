import java.util.*;

public class PhoneDirectory {
    private final Map<String, List<String>> phoneDirectoryMap;

    public PhoneDirectory() {
        this.phoneDirectoryMap = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        validateInput(surname, phoneNumber);

        if (!phoneDirectoryMap.containsKey(surname)) {
            phoneDirectoryMap.put(surname, new ArrayList<>());
        }
        phoneDirectoryMap.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneDirectoryMap.getOrDefault(surname, new ArrayList<>());
    }

    private void validateInput(String surname, String phoneNumber) {
        if (surname == null || surname.trim().isEmpty()) {
            throw new IllegalArgumentException("Surname cannot be null or empty.");
        }
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Phone number cannot be null or empty.");
        }
    }
}
