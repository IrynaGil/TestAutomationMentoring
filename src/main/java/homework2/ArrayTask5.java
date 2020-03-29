package homework2;

import java.util.Arrays;

/**
 * Написать метод, который принимает в себя массив int*ов и выводит в консоль счётчик и значение элемента,
 * который повторяется больше всего раз
 */
public class ArrayTask5 {
    private static int[] numbers = {13, 48, 25, 789, 9, 16, 789};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));

        printMaxCountAndValue(numbers);
    }

    private static void printMaxCountAndValue(int[] arr) {
        int maxCount = 0;
        int value = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            int count = 1;

            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (maxCount < count) {
                maxCount = count;
                value = arr[i];
            }
        }

        System.out.println("maxCount - " + maxCount + ", value - " + value);
    }
}