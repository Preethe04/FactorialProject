import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial obj = new Factorial();
        assertEquals(120L, obj.factorial(5));
        assertEquals(1L, obj.factorial(0));
        assertEquals(1L, obj.factorial(1));
        assertEquals(24L, obj.factorial(4));
        assertThrows(IllegalArgumentException.class, () -> obj.factorial(-1));
    }
}
