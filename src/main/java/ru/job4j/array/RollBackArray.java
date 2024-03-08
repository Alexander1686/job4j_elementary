package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
            System.out.println(result[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[] {};
        int[] array1 = new int[] {1};
        int[] array2 = new int[] {1, 2, 3, 4};
        int[] array3 = new int[] {1, 1, 1, 1};
        RollBackArray.rollback(array);
        RollBackArray.rollback(array1);
        RollBackArray.rollback(array2);
        RollBackArray.rollback(array3);

    }
}
