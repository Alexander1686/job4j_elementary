package ru.job4j.array;

import java.util.Arrays;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (target == (array[i] + array[j])) {
                int[] arr = new int[] {i, j};
                return arr;
            } else if (target != (array[i] + array[j])) {
                j--;
            }
            if (array[i] == array[j]) {
                i++;
                j = array.length - 1;
            }
        }
        int[] arr = new int[0]; return arr;
    }

    public static void main(String[] args) {
        int[] array1 = {5, 5};
        int[] array2 = {-7, -5, 0, 5, 8, 12};
        int[] array3 = {0, 2, 5, 8, 10, 12};
        System.out.println(Arrays.toString(getIndexes(array1, 10)));
        System.out.println(Arrays.toString(getIndexes(array1, 12)));
        System.out.println(Arrays.toString(getIndexes(array2, 3)));
        System.out.println(Arrays.toString(getIndexes(array3, 15)));

    }
}
