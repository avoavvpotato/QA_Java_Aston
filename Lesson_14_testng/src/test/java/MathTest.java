import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MathTest {

    @Test
    public void testFactorial() {
        assertEquals(Math.factorial(0), 1);
        assertEquals(Math.factorial(1), 1);
        assertEquals(Math.factorial(2), 2);
        assertEquals(Math.factorial(3), 6);
        assertEquals(Math.factorial(4), 24);
        assertEquals(Math.factorial(5), 120);
        assertEquals(Math.factorial(6), 720);
        assertEquals(Math.factorial(7), 5040);
        assertEquals(Math.factorial(8), 40320);
        assertEquals(Math.factorial(9), 362880);
        assertEquals(Math.factorial(10), 3628800);
    }

    @Test
    public void testNegativeInputFactorialIterative() {
        Exception exception = expectThrows(IllegalArgumentException.class, () -> {
            Math.factorial(-10);
        });
        assertEquals("Factorial can not be negative.", exception.getMessage());
    }

    @Test
    public void testLargeInput() {
        long result = Math.factorial(20);
        assertEquals(result, 2432902008176640000L);
    }
}