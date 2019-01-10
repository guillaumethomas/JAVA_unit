import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Palindrome_unit {

    @BeforeAll
    public static void executedBeforeAll() {
        // Palindrome palindromeTester = new Palindrome();
        System.out.println("\n@Before: executedBeforeall");
    }

    @BeforeEach
    public void executedBeforeEach() {
        System.out.println("@Before: executedBeforeEach");

    }

    @DisplayName("Single test successful")
    @Test
    public void whenEmptyString_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }

    @DisplayName("Single test successful")
    @Test
    void whennotPalindrome() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(!palindromeTester.isPalindrome("test"));

    }
    @DisplayName("Single test successful")
    @Test
    void whenPalindrome() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("raar"));

    }
}