package ru.job4j.array;

import java.util.Arrays;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                if (array[row][cell] < 0) {
                    array[row][cell] = 0;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] array = {{1, -2}, {1, 2}};
        int[][] array1 = {{1, 0}, {1, 2}};
        int[][] array2 = {{1, -2}, {1, 2, -3}, {1, -2, 3, -4}, {1, 2, -3, -4, 5}};
        int[][] array3 = {{1, 0}, {1, 2, 0}, {1, 0, 3, 0}, {1, 2, 0, 0, 5}};
        System.out.println(Arrays.deepToString(SkipNegative.skip(array)));
        System.out.println(Arrays.deepToString(SkipNegative.skip(array1)));
        System.out.println(Arrays.deepToString(SkipNegative.skip(array2)));
        System.out.println(Arrays.deepToString(SkipNegative.skip(array3)));
    }
}