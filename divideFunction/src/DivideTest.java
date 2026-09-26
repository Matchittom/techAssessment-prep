import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    @Test
    void dividesPositiveNumbers() {
        assertEquals(5, MathUtil.divide(10, 2));
    }

    @Test
    void handlesNegativeNumbers() {
        assertEquals(-5, MathUtil.divide(-10, 2));
    }

    @Test
    void throwsOnDivideByZero() {
        Exception e = assertThrows(ArithmeticException.class,
                () -> MathUtil.divide(5, 0));
        assertTrue(e.getMessage().contains("zero"));
    }
}