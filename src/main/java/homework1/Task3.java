package homework1;

public class Task3 {
    public static void main(String[] args) {
        printFingerName(1, true);
        printFingerName(2, true);
        printFingerName(3, false);
        printFingerName(4, false);
        printFingerName(5, false);
        printFingerName(8, false);
    }

    public static void printFingerName(int fingerNumber, boolean extendedPrint) {
        String strToPrint = fingerName(fingerNumber);

        if (extendedPrint) {
            strToPrint = "" + fingerNumber + " - " + strToPrint;
        }

        System.out.println(strToPrint);
    }

    public static String fingerName(int fingerNumber) {
        String res;

        switch (fingerNumber) {
            case (1):
                res = "большой";
                break;
            case (2):
                res = "указательный";
                break;
            case (3):
                res = "средний";
                break;
            case (4):
                res = "безымянный";
                break;
            case (5):
                res = "мизинец";
                break;
            default:
                res = "wrong input";
                break;
        }

        return res;
    }
}
