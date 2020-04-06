package homework3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTask5Test {
    private StringTask5 instance = new StringTask5();

    @Test
    public void shouldReturn1() {
        String strDate1 = "2020-01-01T00:00:01";
        String strDate2 = "2020-01-01T00:00:02";
        long expected = 1;

        long actual = instance.secondsBetween(strDate1, strDate2);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1000() {
        String strDate1 = "2020-01-01T00:00:01";
        String strDate2 = "2020-01-01T00:16:41";
        long expected = 1000;

        long actual = instance.secondsBetween(strDate1, strDate2);

        assertEquals(expected, actual);
    }
}
