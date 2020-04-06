package homework3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringTask3Test {
    private StringTask3 instance = new StringTask3();

    @Test
    public void shouldReturnWITHWhenItIsNotInTheEnd() {
        String initialString = "Get modern feel with a smudge-resistant only for $2.50, you can finish now";
        String currentWord = "feel";

        String expected = "WITH";

        String actual = instance.upperCaseTheNextWord(initialString, currentWord);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNullWhenItIsInTheEnd() {
        String initialString = "Get modern feel";
        String currentWord = "feel";

        String actual = instance.upperCaseTheNextWord(initialString, currentWord);

        assertNull(actual);
    }

    @Test
    public void shouldReturnWITHWhenMoreSpaces() {
        String initialString = "Get modern feel     with a smudge-resistant only for $2.50, you can finish now";
        String currentWord = "feel";

        String expected = "WITH";

        String actual = instance.upperCaseTheNextWord(initialString, currentWord);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnWITHWhenCurrentWordTwice() {
        String initialString = "Get modern feel with a smudge-resistant only for $2.50, you can feel it and finish now";
        String currentWord = "feel";

        String expected = "WITH";

        String actual = instance.upperCaseTheNextWord(initialString, currentWord);

        assertEquals(expected, actual);
    }
}
