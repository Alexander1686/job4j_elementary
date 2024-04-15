package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int val = array[i][j];
                result = result + val;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{10}};
        int[][] array1 = {{1, 2}, {1, 2}};
        int[][] array2 = {{1, 2, 1}, {1, 2, 0}};
        System.out.println(sum(array));
        System.out.println(sum(array1));
        System.out.println(sum(array2));
    }
}