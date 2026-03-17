import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeedbackTest { // LA CLASSE EST BIEN LÀ
    @Test
    public void testDivision() {
        int res = 10 / 0; 
        assertEquals(res, 0);
    }
}
