package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int up) {
        int result = up > right && up > left ? up : max(left, right);
        return result;
    }

    public static int max(int left, int right, int up, int down) {
        int result = down > right && down > left && down > up ? down : max(left, right, up);
        return result;
    }

    public static void main(String[] args) {
        int rsl = max(1, 2);
        System.out.println(rsl);
        rsl = max(1, 2, 3);
        System.out.println(rsl);
        rsl = max(1, 2, 3, 4);
        System.out.println(rsl);
    }
}