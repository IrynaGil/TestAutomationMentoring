package homework3;

/**
 * Написать метод который принимает в себя строку в которой есть double значение
 * *(например “Get a modern feel  with a smudge-resistant only for $2.50, you can finish now”)
 * достаёт из него числовое значение и возвращает как double.
 * После чего этот дабл вызывается из другого метода в котором
 * он умножается на 4 и выводится в консоль вместе с текстом
 */
public class StringTask2 {
    private static StringTask2 instance = new StringTask2();

    public static void main(String[] args) {
        String initialString = "Get a modern feel with a smudge-resistant only for $2.5000000, you can finish now";

        String doubleAsString = instance.findDoubleAsString(initialString);

        instance.multiplyBy4AndPrint(doubleAsString, initialString);
    }

    public String findDoubleAsString(String str) {
        String doubleAsString = "";

        for (char c : str.toCharArray()) {
            if (isDigitOrPoint(c)) {
                doubleAsString += c;
            } else {
                if (!"".equals(doubleAsString)) {
                    break;
                }
            }
        }

        return doubleAsString;
    }

    public boolean isDigitOrPoint(char c) {
        return c >= 48 && c <= 57 || c == 46;
    }

    public void multiplyBy4AndPrint(String doubleAsString, String initialString) {
        double doubleValue;

        try {
            doubleValue = Double.parseDouble(doubleAsString);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException for " + doubleAsString);
            return;
        }

        double newDoubleValue = doubleValue * 4;

        String resultString = initialString.replaceFirst(doubleAsString, Double.toString(newDoubleValue));

        System.out.println("Source string:");
        System.out.println(initialString);
        System.out.println("");
        System.out.println("Result string:");
        System.out.println(resultString);
    }
}
