import org.junit.*;
import static org.junit.Assert.*;

public class PalindromeJunit {
    @Test
    public void test1() {
        String string1 = "Otto";
        assertEquals(true, Palindrome.isPalindrome(string1));
    }

    @Test
    public void test2() {
        String string2 = "Risotto, Sir?";
        assertEquals(true, Palindrome.isPalindrome(string2));
    }

    @Test
    public void test3() {
        String string3 = "Do geese see God?";
        assertTrue(Palindrome.isPalindrome(string3));
    }

    @Test
    public void testcock() {
        assertFalse(Palindrome.isPalindrome("cock"));
    }
}