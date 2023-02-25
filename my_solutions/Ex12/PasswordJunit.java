import org.junit.*;
import static org.junit.Assert.*;

public class PasswordJunit {
    @Test
    public void test() {
        assertTrue(PasswordChecker.isGoodPassword("AbC1&z8c"));
        assertFalse(PasswordChecker.isGoodPassword("sngredbiuggvnd68368dfg68gf4h684fh35b4"));
        assertEquals("cock", false, PasswordChecker.isGoodPassword("cock"));
    }
}