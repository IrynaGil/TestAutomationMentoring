package homework3;

/**
 * Написать метод который принимает в себя строку с несколькими словами и возвращает строку с одним словом,
 * которое идёт за текущим в upper case (например мы ищем строке
 * “Get a modern feel  with a smudge-resistant only for $2.50, you can finish now” слово которой идёт после слова “feel”
 * (т.е. должен вернуть “WITH” )
 */
public class StringTask3 {
    private static StringTask3 instance = new StringTask3();

    public static void main(String[] args) {
        String initialString = "Get a modern feel  with a smudge-resistant only for $2.50, you can finish now";
        String currentWord = "feel";

        String resultWord = instance.upperCaseTheNextWord(initialString, currentWord);

        System.out.println("Initial String: Current Word");
        System.out.println(initialString + ":" + currentWord);
        System.out.println("");
        System.out.println("Result Word:");
        System.out.println(resultWord);
    }

    public String upperCaseTheNextWord(String initialString, String currentWord) {
        String res = null;

        String[] words = initialString.split(" ");

        int i = 0;

        while (i <= words.length - 1 - 1) {
            if (words[i].equals(currentWord)) {
                break;
            }
            i++;
        }
        i++;
        while (i <= words.length - 1) {
            if (!"".equals(words[i])) {
                res = words[i].toUpperCase();
                break;
            }
            i++;
        }

        return res;
    }
}
