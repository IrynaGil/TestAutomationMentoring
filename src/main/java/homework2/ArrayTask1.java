package homework2;

import java.util.Arrays;
import java.util.OptionalInt;

/**
 * Написать метод, который принимает в себя массив int*ов и возвращает (return) максимальный элемент
 */
public class ArrayTask1 {
    private static int[] numbers1;
    private static int[] numbers2 = {28, 36, 4, 98, 12, 125};

    static {
        numbers1 = new int[5];
        numbers1[0] = 10;
        numbers1[1] = 567;
        numbers1[2] = 45;
        numbers1[3] = 11;
        numbers1[4] = 60;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers1));
        System.out.println(maxValueWhile(numbers1));

        System.out.println(Arrays.toString(numbers2));
        System.out.println(maxValueForI(numbers2));

        System.out.println(maxValueWithStream(numbers2));
    }

    public static int maxValueWhile(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int res = numbers[0];

        int i = 1;
        while (i <= numbers.length - 1) {
            if (res < numbers[i]) {
                res = numbers[i];
            }
            i++;
        }

        return res;
    }

    public static int maxValueForI(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int res = numbers[0];

        for (int i = 1; i <= numbers.length - 1; i++) {
            if (res < numbers[i]) {
                res = numbers[i];
            }
        }

        return res;
    }

    private static OptionalInt maxValueWithStream(int[] intArray) {
        return Arrays.stream(intArray)
                .max();
    }
}
