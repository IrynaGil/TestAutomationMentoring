package homework2;

import java.util.Arrays;

/**
 * Написать метод, который принимает в себя массив int*ов, находит 2 максимальных значения и возвращает их как массив из 2-x int*ов.
 */
public class ArrayTask3 {
    private static int[] numbers = {13, 48, 25, 789, 9, 16, 37};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(bubbleSort(numbers)));
        System.out.println(Arrays.toString(largestNumbers(numbers, 2)));
        System.out.println(Arrays.toString(largestNumbersWithStream(numbers, 2)));
    }

    public static int[] largestNumbers(int[] arr, int count) {
        if (numbers.length <= count) {
            return numbers;
        }

        int[] resArr = new int[count];
        for (int i = 0; i <= count - 1; i++) {
            resArr[i] = arr[arr.length - 1 - i];
        }

        return resArr;
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    private static int[] largestNumbersWithStream(int[] numbers, int count) {
        if (numbers.length <= count) {
            return numbers;
        }

        return Arrays.stream(numbers)
                .sorted()
                .skip(numbers.length - count)
                .toArray();
    }
}
