package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[] args) {
        int[] left = new int[]{1, 2, 3};
        int[] right = new int[]{6, 4, 3};
        int[] right2 = new int[]{3, 3, 4};
        System.out.println(check(left, right));
        System.out.println(check(left, right2));
    }
}
