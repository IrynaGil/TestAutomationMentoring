package tic.tac.toe;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameAnalyserTest {
    private GameAnalyser gameAnalyser = new GameAnalyser(GameAnalyser.CROSS);

    @Test
    public void shouldReturnWrongInputWhenInputIsTooShort() {
        String expected = GameAnalyser.WRONG_INPUT;

        String actual = gameAnalyser.analyseGameStatus("");
        assertEquals(expected, actual);

        actual = gameAnalyser.analyseGameStatus("XXX");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnWrongInputWhenInputIsTooLong() {
        String expected = GameAnalyser.WRONG_INPUT;

        String actual = gameAnalyser.analyseGameStatus("XOXOXOXOXO");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnWrongInputWhenInputContainsIncorrectSymbols() {
        String expected = GameAnalyser.WRONG_INPUT;

        String actual = gameAnalyser.analyseGameStatus("123456789");
        assertEquals(expected, actual);

        actual = gameAnalyser.analyseGameStatus("XODXXOOXO");
        assertEquals(expected, actual);

        actual = gameAnalyser.analyseGameStatus("XoOX--XXO");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnWrongStatusWhenTooManySymbolsOfOneKind() {
        String expected = GameAnalyser.WRONG_STATUS;

        String actual = gameAnalyser.analyseGameStatus("XXXOOOOOO");
        assertEquals(expected, actual);

        actual = gameAnalyser.analyseGameStatus("XXXXX-OOX");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectStatusCrossesWon() {
        String expected = String.format(GameAnalyser.GAMEOVER_HAVE_WINNER, GameAnalyser.CROSS);

        String actual = gameAnalyser.analyseGameStatus("XOXOXOXOX");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectStatusZerosWon() {
        String expected = String.format(GameAnalyser.GAMEOVER_HAVE_WINNER, GameAnalyser.ZERO);

        String actual = gameAnalyser.analyseGameStatus("XO--OXXO-");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNoWinner() {
        String expected = GameAnalyser.GAMEOVER_NO_WINNER;

        String actual = gameAnalyser.analyseGameStatus("XOXOXXOXO");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectStatusCrossMoves() {
        String expected = String.format(GameAnalyser.IN_GAME_WHO_MOVES, GameAnalyser.CROSS);

        String actual = gameAnalyser.analyseGameStatus("XO-------");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectStatusZeroMoves() {
        String expected = String.format(GameAnalyser.IN_GAME_WHO_MOVES, GameAnalyser.ZERO);

        String actual = gameAnalyser.analyseGameStatus("XO--X----");
        assertEquals(expected, actual);
    }
}
