import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeedbackTest {
    @Test
    public void testDivision() {
        int res = 10 / 0; // Provoque une ArithmeticException
        assertEquals(res, 0);
    }
}
