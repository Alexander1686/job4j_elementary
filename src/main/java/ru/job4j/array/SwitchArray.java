package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        int temp2 = array[dest];
        array[dest] = temp;
        array[source] = temp2;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        System.out.println(' ');
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
        int[] rsl2 = swap(nums, 5, 3);
        System.out.println(' ');
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl2[index]);
        }
    }
}
