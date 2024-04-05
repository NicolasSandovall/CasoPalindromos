import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodPalindromeTest {
    @Test
    public void testIsPalindrome_True() {
        assertTrue(MethodPalindrome.isPalindrome(""));
        assertTrue(MethodPalindrome.isPalindrome("aaabccbaaa"));
        assertTrue(MethodPalindrome.isPalindrome("la tele letal"));
    }

    @Test
    public void testIsPalindrome_False() {
        assertFalse(MethodPalindrome.isPalindrome("ahabccbaaa"));
        assertFalse(MethodPalindrome.isPalindrome("200"));
    }

}
