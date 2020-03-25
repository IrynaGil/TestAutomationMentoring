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
        System.out.println(detectWeekend2(dayOfTheWeek));
    }

    public static String detectWeekend1(String dayOfTheWeek) {
        String res;

        if ("Суббота".equalsIgnoreCase(dayOfTheWeek) || "Воскресенье".equalsIgnoreCase(dayOfTheWeek)) {
            res = "выходной";
        } else {
            res = "будний";
        }

        return res;
    }


    public static String detectWeekend2(String dayOfTheWeek) {
        String res;

        if ("Понедельник".equalsIgnoreCase(dayOfTheWeek) ||
                "Вторник".equalsIgnoreCase(dayOfTheWeek) ||
                "Среда".equalsIgnoreCase(dayOfTheWeek) ||
                "Четверг".equalsIgnoreCase(dayOfTheWeek) ||
                "Пятница".equalsIgnoreCase(dayOfTheWeek)) {
            res = "будний";
        } else if ("Суббота".equalsIgnoreCase(dayOfTheWeek) || "Воскресенье".equalsIgnoreCase(dayOfTheWeek)) {
            res = "выходной";
        } else {
            res = "wrong input...";
        }

        return res;
    }
}
