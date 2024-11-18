public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(int expectedSize, int actualSize, String type) {
        super("Array size mismatch in the number of " + type + ": expected size is " + expectedSize + ", but got " + actualSize + ".");
    }
}
