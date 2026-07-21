import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddPositiveNumbers() {
        assertEquals(8, calculator.add(3, 5));
    }

    @Test
    void shouldAddNegativeNumbers() {
        assertEquals(-2, calculator.add(-3, 1));
    }

    @Test
    void shouldHandleZero() {
        assertEquals(5, calculator.add(5, 0));
    }

    @Test
    void shouldSubtractNumbers() {
        assertEquals(2, calculator.subtract(7, 5));
    }

    @Test
    void shouldMultiplyLargeNumbers() {
        assertEquals(120000, calculator.multiply(300, 400));
    }

    @Test
    void shouldDivideNumbers() {
        assertEquals(5, calculator.divide(20, 4));
    }

    @Test
    void shouldThrowExceptionWhenDivideByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
        assertEquals("Divisor cannot be zero", exception.getMessage());
    }

    @Disabled("Will enable after implementing advanced validation.")
    @Test
    void shouldHandleDecimalDivision() {
    }
}
