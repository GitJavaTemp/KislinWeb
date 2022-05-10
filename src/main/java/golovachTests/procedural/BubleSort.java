package golovachTests.procedural;

import java.util.Arrays;

/**
 * Admin
 * 02.05.2021
 */
//Пример сортировки пузырьком, двигается меньшее значение к началу

public class BubleSort {
    public static void main(String[] args) {
        int[] data = {5, 45, 4, 89, 38, 2, 12, 34, 98, 37, 67, 49};
        System.out.println(Arrays.toString(data));
        sortArrayBuble(data);
        System.out.println(Arrays.toString(data));
    }

    public static void sortArrayBuble(int[] data) {
        int tmp;
        for (int end = 0; end <= data.length - 1; end++) {
            for (int index = data.length-1; index > end; index--) {
                if (data[index] < data[index - 1]) {
                    tmp = data[index - 1];
                    data[index - 1] = data[index];
                    data[index] = tmp;
                }
            }
        }
    }
}