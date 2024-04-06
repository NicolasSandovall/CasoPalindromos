import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnhancedMethodPalindromeTest {
    @Test
    public void testEnhancedIsPalindrome_True() {
        assertTrue(EnhancedMethodPalindrome.enhancedIsPalindrome(""));
        assertTrue(EnhancedMethodPalindrome.enhancedIsPalindrome("aaabccbaaa"));
        assertTrue(EnhancedMethodPalindrome.enhancedIsPalindrome("la tele letal"));
        assertTrue(EnhancedMethodPalindrome.enhancedIsPalindrome("200#$"));
        assertTrue(EnhancedMethodPalindrome.enhancedIsPalindrome("Ana"));
        assertTrue(EnhancedMethodPalindrome.enhancedIsPalindrome("32{-.232+4#$%aA"));
        assertTrue(EnhancedMethodPalindrome.enhancedIsPalindrome("2#$%&&/(/(())(=)=)NICOOCIN=?¡*[¨[_:[*)&$:;_*¨"));


    }

    @Test
    public void testEnhancedIsPalindrome_False() {
        assertFalse(EnhancedMethodPalindrome.enhancedIsPalindrome("200 nnuw  200"));
        assertFalse(EnhancedMethodPalindrome.enhancedIsPalindrome("ANANA q"));
        assertFalse(EnhancedMethodPalindrome.enhancedIsPalindrome("ni"));
    }
}