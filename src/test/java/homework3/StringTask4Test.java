package homework3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringTask4Test {
    private StringTask4 instance = new StringTask4();

    @Test
    public void shouldReturn2_5() {
        String initialString = "Get a modern feel  with a smudge-resistant only for $4.50 $2.50, you can finish now";
        Double expected = 2.5;

        Double actual = instance.findLastDouble(initialString);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNullWhenNoDoubles() {
        String initialString = "Get a modern feel  with a smudge-resistant only for you can finish now";
        Double actual = instance.findLastDouble(initialString);

        assertNull(actual);
    }

    @Test
    public void shouldReturnNullWhenWrongFormat() {
        String initialString = "Get a modern feel  with a smudge-resistant only $2.2.225 for you can finish now";
        Double actual = instance.findLastDouble(initialString);

        assertNull(actual);
    }
}
