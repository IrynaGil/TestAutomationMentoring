package homework3;

/**
 * Написать метод который принимает на себя строку и возвращает перевёрнутую
 */
public class StringTask1 {

    public String invertString1(String str) {
        if (str == null) {
            return null;
        }

        String res = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            res = str.substring(i, i + 1) + res;
        }

        return res;
    }

    public String invertString2(String str) {
        if (str == null) {
            return null;
        }

        String res = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }

        return res;
    }

    public String invertString3(String str) {
        if (str == null) {
            return null;
        }

        String res = "";

        for (char ch : str.toCharArray()) {
            res = ch + res;
        }

        return res;
    }

    public String invertString4(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public String invertString5(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
