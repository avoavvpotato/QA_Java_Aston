import java.util.Arrays;

public class ArrayHandler {
    public static int sumArrayElements(String[][] array) {
        int expectedSize = 4;

        if (array == null) {
            throw new MyArraySizeException(expectedSize, 0, "rows");
        }

        if (array.length != expectedSize) {
            throw new MyArraySizeException(expectedSize, array.length, "rows");
        }

        for (String[] row : array) {
            if (row.length != expectedSize) {
                throw new MyArraySizeException(expectedSize, row.length, "columns");
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }

    public static void printArray(String[][] array) {
        for (String[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}