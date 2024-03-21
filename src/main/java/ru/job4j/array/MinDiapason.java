package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[] {-1, 0, 5, 10};
        int[] array1 = new int[] {10, 5, 3, 1};
        int[] array2 = new int[] {10, 2, 5, 1};
        System.out.println(findMin(array, 1, 3));
        System.out.println(findMin(array1, 1, 3));
        System.out.println(findMin(array2, 0, 2));

    }
}
