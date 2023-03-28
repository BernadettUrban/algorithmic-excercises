package Codewars;

import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * DESCRIPTION:
 * A pangram is a sentence that contains every single letter of the alphabet at
 * least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is
 * a pangram, because it uses the letters A-Z at least once (case is irrelevant).
 * <p>
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not.
 * Ignore numbers and punctuation.
 */
public class PangramChecker {
    public boolean check(String sentence) {
        boolean answer = true;

        sentence = sentence.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!sentence.contains(String.valueOf(ch))) {
                answer = false;
                break;
            }
        }

        return answer;
    }

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertTrue(pc.check(pangram1));
    }

    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertFalse(pc.check(pangram2));
    }
}
