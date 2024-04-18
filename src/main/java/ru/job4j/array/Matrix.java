package ru.job4j.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(Matrix.multiple(2)));
        System.out.println(Arrays.deepToString(Matrix.multiple(5)));
        System.out.println(Arrays.deepToString(Matrix.multiple(9)));
    }
}
