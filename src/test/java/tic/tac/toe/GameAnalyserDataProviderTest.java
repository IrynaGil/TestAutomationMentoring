package tic.tac.toe;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(DataProviderRunner.class)
public class GameAnalyserDataProviderTest {
    private GameAnalyser gameAnalyser = new GameAnalyser(GameAnalyser.CROSS);

    @DataProvider
    public static Object[][] stringTestData() {
        return new Object[][]{
                {"", GameAnalyser.WRONG_INPUT},
                {"XXX", GameAnalyser.WRONG_INPUT},
                {"XOXOXOXOXO", GameAnalyser.WRONG_INPUT},
                {"123456789", GameAnalyser.WRONG_INPUT},
                {"XODXXOOXO", GameAnalyser.WRONG_INPUT},
                {"XoOX--XXO", GameAnalyser.WRONG_INPUT},
                {"XXXOOOOOO", GameAnalyser.WRONG_STATUS},
                {"XXXXX-OOX", GameAnalyser.WRONG_STATUS},
                {"XOXOXOXOX", String.format(GameAnalyser.GAMEOVER_HAVE_WINNER, GameAnalyser.CROSS)},
                {"XO--OXXO-", String.format(GameAnalyser.GAMEOVER_HAVE_WINNER, GameAnalyser.ZERO)},
                {"XOXOXXOXO", GameAnalyser.GAMEOVER_NO_WINNER},
                {"XO-------", String.format(GameAnalyser.IN_GAME_WHO_MOVES, GameAnalyser.CROSS)},
                {"XO--X----", String.format(GameAnalyser.IN_GAME_WHO_MOVES, GameAnalyser.ZERO)}
        };
    }

    @Test
    @UseDataProvider("stringTestData")
    public void dataProviderTest(String inputString, String expected) {
        String actual = gameAnalyser.analyseGameStatus(inputString);
        assertEquals("Mismatch: ", expected, actual);
    }
}
