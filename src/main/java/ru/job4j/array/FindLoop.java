package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int goalIndex = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                goalIndex = i;
                break;
            }
        }
        return goalIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        System.out.println(indexOf(nums, 3));
        System.out.println(indexOf(nums, 10));
    }
}

