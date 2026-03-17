import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorValidatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(15, calc.add(10, 5), "L'addition doit être exacte");
    }

    @Test
    void testDivisionParZero() {
        // Ici on vérifie si l'étudiant renvoie bien -1 comme demandé
        assertEquals(-1, calc.divide(10, 0), "La division par zéro doit retourner -1");
    }

    @Test
    void testDivisionNormale() {
        assertEquals(2, calc.divide(10, 5));
    }
}
