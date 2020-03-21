package homework1;

import org.junit.Test;

import static homework1.Task2.priceEvaluation;
import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void shouldReturnNormalPrice() {
        String expected = "цена нормальная";

        //assertEquals(expected, priceEvaluation(999));
        //another way:
        assertTrue(expected.equals(priceEvaluation(999)));
    }

    @Test
    public void shouldReturnHighPrice() {
        String expected = "цена завышена";

        assertEquals(expected, priceEvaluation(1000));
        assertEquals(expected, priceEvaluation(1001));
    }
}