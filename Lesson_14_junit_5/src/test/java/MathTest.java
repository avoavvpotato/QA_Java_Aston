import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {
    @Test
    public void testFactorial() {
        assertEquals(1, Math.factorial(0));
        assertEquals(1, Math.factorial(1));
        assertEquals(2, Math.factorial(2));
        assertEquals(6, Math.factorial(3));
        assertEquals(24, Math.factorial(4));
        assertEquals(120, Math.factorial(5));
        assertEquals(720, Math.factorial(6));
        assertEquals(5040, Math.factorial(7));
        assertEquals(40320, Math.factorial(8));
        assertEquals(362880, Math.factorial(9));
        assertEquals(3628800, Math.factorial(10));
    }

    @Test
    public void testNegativeInputFactorialIterative() {
        try {
            Math.factorial(-10);
            fail("Expected IllegalArgumentException for negative input.");
        } catch (IllegalArgumentException e) {
            assertEquals("Factorial can not be negative.", e.getMessage());
        }
    }

    @Test
    public void testLargeInput() {
        long result = Math.factorial(20);
        assertEquals(2432902008176640000L, result);
    }
}