package homework3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringTask1Test {
    private StringTask1 instance = new StringTask1();

    @Test
    public void shouldReturnInvertedString() {
        assertEquals("invertString1 failed", "321", instance.invertString1("123"));
        assertEquals("invertString2 failed", "321", instance.invertString2("123"));
        assertEquals("invertString3 failed", "321", instance.invertString3("123"));
        assertEquals("invertString4 failed", "321", instance.invertString4("123"));
        assertEquals("invertString5 failed", "321", instance.invertString5("123"));
    }

    @Test
    public void shouldReturnNull4Null() {
        assertNull("invertString1 failed", instance.invertString1(null));
        assertNull("invertString2 failed", instance.invertString2(null));
        assertNull("invertString3 failed", instance.invertString3(null));
        assertNull("invertString4 failed", instance.invertString4(null));
        assertNull("invertString5 failed", instance.invertString5(null));
    }

    @Test
    public void shouldReturnEmptyString() {
        assertEquals("invertString1 failed", "", instance.invertString1(""));
        assertEquals("invertString2 failed", "", instance.invertString2(""));
        assertEquals("invertString3 failed", "", instance.invertString3(""));
        assertEquals("invertString4 failed", "", instance.invertString4(""));
        assertEquals("invertString5 failed", "", instance.invertString5(""));
    }
}
