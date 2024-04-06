public class EnhancedMethodPalindrome {
    public static boolean enhancedIsPalindrome(String word) {
        String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return cleanWord.contentEquals(new StringBuilder(cleanWord).reverse());
    }


}
