public class Main {
    public static void main(String[] args) {
        // Check first array
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        System.out.println("\nCheck valid Array.");
        ArrayHandler.printArray(validArray);
        try {
            int sum = ArrayHandler.sumArrayElements(validArray);
            System.out.println("Sum of the array elements is equal to " + sum);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        // Check second array
        String[][] invalidRows = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        System.out.println("\nCheck invalid Array by Rows.");
        ArrayHandler.printArray(invalidRows);
        try {
            int sum = ArrayHandler.sumArrayElements(invalidRows);
            System.out.println("Sum of the array elements is equal to " + sum);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        // Check third array
        String[][] invalidColumns = {
                {"1", "2", "3"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        System.out.println("\nCheck invalid Array by Columns.");
        ArrayHandler.printArray(invalidColumns);
        try {
            int sum = ArrayHandler.sumArrayElements(invalidColumns);
            System.out.println("Sum of the array elements is equal to " + sum);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        // Check fourth array
        String[][] invalidData = {
                {"1", "2", "3", "x"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        System.out.println("\nCheck invalid Array by Data.");
        ArrayHandler.printArray(invalidData);
        try {
            int sum = ArrayHandler.sumArrayElements(invalidData);
            System.out.println("Sum of the array elements is equal to " + sum);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
