package homework1;

import org.junit.Test;

import static homework1.Task1.weatherDescriptionIfStatements;
import static homework1.Task1.weatherDescriptionWithSwitch;
import static org.junit.Assert.assertEquals;

public class Task1Test {

    @Test
    public void shouldReturnItIsCold4ExactWord() {
        String expected = "It is cold";
        String season = "winter";
        System.out.println(season);

        assertEquals(expected, weatherDescriptionIfStatements(season));
        assertEquals(expected, weatherDescriptionWithSwitch(season));
    }

    @Test
    public void shouldReturnItIsCold4UppercaseWord() {
        String expected = "It is cold";
        String season = "WINTER";
        System.out.println(season);

        assertEquals(expected, weatherDescriptionIfStatements(season));
        assertEquals(expected, weatherDescriptionWithSwitch(season));
    }

    @Test
    public void shouldReturnItIsCold4AnycaseWord() {
        String expected = "It is cold";
        String season = "WiNTeR";
        System.out.println(season);

        assertEquals(expected, weatherDescriptionIfStatements(season));
        assertEquals(expected, weatherDescriptionWithSwitch(season));
    }

    @Test
    public void shouldReturnItIsCold4NewExactWord() {
        String expected = "It is cold";
        String season = new String("winter");
        System.out.println(season);

        assertEquals(expected, weatherDescriptionIfStatements(season));
        assertEquals(expected, weatherDescriptionWithSwitch(season));
    }

    @Test
    public void shouldReturnItIsNotThatColdAnyMore4NewExactWord() {
        String expected = "It is not that cold any more";
        String season = new String("spring");
        System.out.println(season);

        assertEquals(expected, weatherDescriptionIfStatements(season));
        assertEquals(expected, weatherDescriptionWithSwitch(season));
    }

    @Test
    public void shouldReturnItIsHot4NewExactWord() {
        String expected = "It is hot!!!";
        String season = new String("summer");
        System.out.println(season);

        assertEquals(expected, weatherDescriptionIfStatements(season));
        assertEquals(expected, weatherDescriptionWithSwitch(season));
    }

    @Test
    public void shouldReturnItIsBecomingColder4NewExactWord() {
        String expected = "It is becoming colder...";
        String season = new String("autumn");
        System.out.println(season);

        assertEquals(expected, weatherDescriptionIfStatements(season));
        assertEquals(expected, weatherDescriptionWithSwitch(season));
    }

    @Test
    public void shouldReturnWrongInput4OtherWords() {
        String expected = "wrong input...";
        String season = new String("abracadabra");
        System.out.println(season);

        assertEquals(expected, weatherDescriptionIfStatements(season));
        assertEquals(expected, weatherDescriptionWithSwitch(season));
    }

    @Test
    public void shouldReturnWrongInput4Null() {
        String expected = "wrong input...";
        String season = null;
        System.out.println(season);

        assertEquals(expected, weatherDescriptionIfStatements(season));
        assertEquals(expected, weatherDescriptionWithSwitch(season));
    }

}