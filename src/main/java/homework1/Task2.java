package homework1;

public class Task2 {
    public static void main(String[] args) {
        displayPriceEvaluation(999);
        displayPriceEvaluation(1000);
        displayPriceEvaluation(1001);
    }

    public static void displayPriceEvaluation(int price) {
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
