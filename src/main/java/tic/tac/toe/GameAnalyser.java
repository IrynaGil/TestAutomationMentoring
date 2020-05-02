package tic.tac.toe;

import java.util.regex.Pattern;

public class GameAnalyser {
    public static final String CROSS = "X";
    public static final String ZERO = "O";
    public static final String BLANK = "-";
    public static final String WRONG_INPUT = "Неправильный ввод";
    public static final String WRONG_STATUS = "Правильный ввод, некорректный статус";
    public static final String GAMEOVER_HAVE_WINNER = "Корректный статус, игра закончена, '%s' выиграли"; //https://www.examclouds.com/ru/java/java-core-russian/formatirovanie-strok
    public static final String GAMEOVER_NO_WINNER = "Корректный статус, игра закончена - ничья";
    public static final String IN_GAME_WHO_MOVES = "Корректный статус, игра продолжается, '%s' ходят";
    public static Pattern pattern;

    static {
        pattern = Pattern.compile("^[" + CROSS + ZERO + BLANK + "]{9}$"); //https://stackoverflow.com/questions/26767866/java-pattern-matcher
    }

    private String whoStarts;

    public GameAnalyser(String whoStarts) {
        this.whoStarts = whoStarts;
    }

    public String analyseGameStatus(String inputString) {
        if (checkWrongInput(inputString)) {
            return WRONG_INPUT;
        }

        if (checkWrongStatus(inputString)) {
            return WRONG_STATUS;
        }

        String[][] array = convertStringToArray(inputString);

        String whoWon = checkCompletedLine(array);
        if (!"".equals(whoWon)) {
            return String.format(GAMEOVER_HAVE_WINNER, whoWon);
        }

        if (noEmptyCell(inputString)) {
            return GAMEOVER_NO_WINNER;
        }

        String whoMoves = checkWhoMoves(inputString);
        return String.format(IN_GAME_WHO_MOVES, whoMoves);
    }

    private boolean noEmptyCell(String inputString) {
        return !inputString.contains(BLANK);
    }

    private boolean checkWrongInput(String inputString) {
        return !pattern.matcher(inputString).matches();
    }

    private boolean checkWrongStatus(String inputString) {
        byte countFirstPlayer = 0;
        byte countSecondPlayer = 0;

        for (int i = 0; i <= inputString.length() - 1; i++) {
            String currentSymbol = inputString.substring(i, i + 1);

            if (BLANK.equals(currentSymbol)) {
                continue;
            }

            if (whoStarts.equals(currentSymbol)) {
                countFirstPlayer++;
            } else {
                countSecondPlayer++;
            }
        }

        return countFirstPlayer < countSecondPlayer || countFirstPlayer - countSecondPlayer > 1;
    }

    private String checkWhoMoves(String inputString) {
        byte countFirstPlayer = 0;
        byte countSecondPlayer = 0;

        for (int i = 0; i <= inputString.length() - 1; i++) {
            String currentSymbol = inputString.substring(i, i + 1);

            if (BLANK.equals(currentSymbol)) {
                continue;
            }

            if (whoStarts.equals(currentSymbol)) {
                countFirstPlayer++;
            } else {
                countSecondPlayer++;
            }
        }

        if (countFirstPlayer == countSecondPlayer) {
            return whoStarts;
        } else {
            return whoStarts.equals(CROSS) ? ZERO : CROSS;
        }
    }

    private String[][] convertStringToArray(String inputString) {
        String[][] array = new String[3][3];

        int n = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                array[i][j] = inputString.substring(n, n + 1);
                n++;
            }
        }

        return array;
    }

    private String checkCompletedLine(String[][] array) {
        for (int i = 0; i <= 2; i++) {
            if (!BLANK.equals(array[i][0]) && array[i][0].equals(array[i][1]) && array[i][1].equals(array[i][2])) {
                return array[i][0];
            }
        }

        for (int j = 0; j <= 2; j++) {
            if (!BLANK.equals(array[0][j]) && array[0][j].equals(array[1][j]) && array[1][j].equals(array[2][j])) {
                return array[0][j];
            }
        }

        if (!BLANK.equals(array[0][0]) && array[0][0].equals(array[1][1]) && array[1][1].equals(array[2][2])) {
            return array[0][0];
        }

        if (!BLANK.equals(array[0][2]) && array[0][2].equals(array[1][1]) && array[1][1].equals(array[2][0])) {
            return array[0][2];
        }

        return "";
    }

    public String getWhoStarts() {
        return whoStarts;
    }

    public void setWhoStarts(String whoStarts) {
        this.whoStarts = whoStarts;
    }
}
