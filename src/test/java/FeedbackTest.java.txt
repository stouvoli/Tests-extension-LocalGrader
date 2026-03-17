import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FeedbackTest { // LA CLASSE EST BIEN LÀ
    @Test
    void testCalcul() { assertEquals(10, 5 + 5); }
    
    @Test
    void testErreur() { fail("Ceci est un test d'affichage"); }
}
