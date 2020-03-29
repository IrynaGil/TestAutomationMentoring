package homework2;

import java.util.Arrays;

/**
 * Написать метод, который принимает в себя массив int*ов,
 * подсчитывает количество элементов, которые делятся на 2, но не делятся на 3 (логические выражения)
 * и возвращает (return) как int
 */
public class ArrayTask4 {

    private static int[] numbers = {13, 48, 25, 789, 9, 16, 37};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));
        System.out.println(filterAndCount(numbers));
        System.out.println(filterAndCountWithStream(numbers));
    }

    public static int filterAndCount(int[] arr) {
        int count = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 3 != 0) {
                count++;
            }
        }

        return count;
    }

    private static int filterAndCountWithStream(int[] numbers) {
        return (int) Arrays.stream(numbers)
                .filter(i -> i % 2 == 0 && i % 3 != 0)
                .count();
    }
}
