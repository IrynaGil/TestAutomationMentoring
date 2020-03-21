package homework1;

import org.junit.Test;

import static homework1.Task3.fingerName;
import static org.junit.Assert.assertEquals;

public class Task3Test {

    @Test
    public void shouldReturnFirstFingerName() {
        String expected = "большой";

        assertEquals(expected, fingerName(1));
    }

    @Test
    public void shouldReturnSecondFingerName() {
        String expected = "указательный";

        assertEquals(expected, fingerName(2));
    }

    @Test
    public void shouldReturnThirdFingerName() {
        String expected = "средний";

        assertEquals(expected, fingerName(3));
    }

    @Test
    public void shouldReturnFourthFingerName() {
        String expected = "безымянный";

        assertEquals(expected, fingerName(4));
    }

    @Test
    public void shouldReturnFifthFingerName() {
        String expected = "мизинец";

        assertEquals(expected, fingerName(5));
    }

    @Test
    public void shouldReturnDefaultAnswer() {
        String expected = "wrong input";

        assertEquals(expected, fingerName(8));
    }
}