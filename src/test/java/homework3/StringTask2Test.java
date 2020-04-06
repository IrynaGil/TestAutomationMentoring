package homework3;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringTask2Test {
    private StringTask2 instance = new StringTask2();

    @Test
    public void shouldReturnTrue() {
        assertTrue(instance.isDigitOrPoint('0'));
        assertTrue(instance.isDigitOrPoint('1'));
        assertTrue(instance.isDigitOrPoint('9'));
        assertTrue(instance.isDigitOrPoint('.'));
    }

    @Test
    public void shouldReturnFalse() {
        assertFalse(instance.isDigitOrPoint('!'));
        assertFalse(instance.isDigitOrPoint('a'));
        assertFalse(instance.isDigitOrPoint('&'));
    }

    @Test
    public void shouldReturn2_50000000() {
        String sourceString = "Get modern feel with a smudge-resistant only for $2.50000000, you can finish now";
        String expected = "2.50000000";

        String actual = instance.findDoubleAsString(sourceString);

        assertEquals(expected, actual);
    }
}
