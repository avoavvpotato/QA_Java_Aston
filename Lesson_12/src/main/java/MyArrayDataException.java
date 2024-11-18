public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int row, int column) {
        super("Failed to parse element at position: [" + row + "][" + column + "].");
    }
}
