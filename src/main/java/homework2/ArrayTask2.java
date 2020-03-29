package homework2;

import java.util.Arrays;

/**
 * Написать метод, который переворачивает массив
 */
public class ArrayTask2 {
    private static int[] numbers1 = {13, 48, 25, 789, 9, 16, 37};
    private static int[] numbers2 = {3, 17, 78, 234, 67, 125};
    private static int[] numbers3 = {11, 56, 87, 3, 987, 12, 53};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(invertNumbersWhile(numbers1)));

        System.out.println(Arrays.toString(numbers2));
        System.out.println(Arrays.toString(invertNumbersForI(numbers2)));

        System.out.println(Arrays.toString(numbers3));
        System.out.println(Arrays.toString(invertNumbersSameArray(numbers3)));
    }

    public static int[] invertNumbersWhile(int[] numbers) {
        int[] resArray = new int[numbers.length];

        int i = 0;
        while (i <= numbers.length - 1) {
            resArray[numbers.length - 1 - i] = numbers[i];
            i++;
        }

        return resArray;
    }

    public static int[] invertNumbersForI(int[] numbers) {
        int[] resArray = new int[numbers.length];

        for (int i = 0; i <= numbers.length - 1; i++) {
            resArray[numbers.length - 1 - i] = numbers[i];
        }

        return resArray;
    }

    public static int[] invertNumbersSameArray(int[] numbers) {
        int num = numbers.length / 2 - 1;

        for (int i = 0; i <= num; i++) {
            int t = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = t;
        }

        return numbers;
    }
}