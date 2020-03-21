package homework1;

public class Task2 {
    public static void main(String[] args) {
        printPriceEvaluation(999);
        printPriceEvaluation(1000);
        printPriceEvaluation(1001);
    }

    public static void printPriceEvaluation(int price) {
        System.out.println(priceEvaluation(price));
    }

    public static String priceEvaluation(int price) {
        String res;

        if (price < 1000) {
            res = "цена нормальная";
        } else {
            res = "цена завышена";
        }

        return res;
    }
}
