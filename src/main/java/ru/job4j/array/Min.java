package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] {0, 5, 10};
        int[] array1 = new int[] {10, 5, 3};
        int[] array2 = new int[] {10, 2, 5};
        System.out.println(Min.findMin(array));
        System.out.println(Min.findMin(array1));
        System.out.println(Min.findMin(array2));

    }
}
