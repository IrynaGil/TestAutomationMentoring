package homework1;

public class Task4 {
    public static void main(String[] args) {
        printWorkingWeek("Понедельник");
        printWorkingWeek("Вторник");
        printWorkingWeek("Среда");
        printWorkingWeek("Четверг");
        printWorkingWeek("Пятница");
        printWorkingWeek("Суббота");
        printWorkingWeek("Воскресенье");
        printWorkingWeek("Восьмой день недели");
    }

    public static void printWorkingWeek(String dayOfTheWeek) {
        System.out.println(detectWeekend(dayOfTheWeek));
    }

    public static String detectWeekend (String dayOfTheWeek) {
        String res = "wrong input...";

        if ("Понедельник".equalsIgnoreCase(dayOfTheWeek)) {
            res = "будний";
        } else if ("Вторник".equalsIgnoreCase(dayOfTheWeek)) {
            res = "будний";
        } else if ("Среда".equalsIgnoreCase(dayOfTheWeek)) {
            res = "будний";
        } else if ("Четверг".equalsIgnoreCase(dayOfTheWeek)) {
            res = "будний";
        } else if ("Пятница".equalsIgnoreCase(dayOfTheWeek)) {
            res = "будний";
        } else if ("Суббота".equalsIgnoreCase(dayOfTheWeek)) {
            res = "выходной";
        } else if ("Воскресенье".equalsIgnoreCase(dayOfTheWeek)) {
            res = "выходной";
        }

        return res;
    }
}
