package homework3;

/**
 * Написать метод который принимает в себя строку в которой есть два double   значения
 * *(например “Get a modern feel  with a smudge-resistant only for $4.50 $2.50, you can finish now”)
 * и достаёт из него последнее числовое значение и возвращает как double
 */
public class StringTask4 {
    private static StringTask4 instance = new StringTask4();

    public static void main(String[] args) {
        String initialString = "Get a modern feel  with a smudge-resistant only for $4.50 $2.50, you can finish now";

        double lastDouble = instance.findLastDouble(initialString);

        System.out.println("Initial String:");
        System.out.println(initialString);
        System.out.println("");
        System.out.println("Last Double:");
        System.out.println(lastDouble);
    }

    public Double findLastDouble(String str) {
        String doubleAsString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            if (isDigitOrPoint(str.charAt(i))) {
                doubleAsString = str.charAt(i) + doubleAsString;
            } else {
                if (!"".equals(doubleAsString)) {
                    break;
                }
            }
        }

        try {
            return Double.parseDouble(doubleAsString);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException for " + doubleAsString);
        }

        return null;
    }

    public boolean isDigitOrPoint(char c) {
        return c >= 48 && c <= 57 || c == 46;
    }
}
