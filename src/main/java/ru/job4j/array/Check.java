package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean[] data = new boolean[]{true, true, true};
        boolean[] data2 = new boolean[]{true, false, true};
        boolean[] data3 = new boolean[]{false, false, false};
        boolean[] data4 = new boolean[]{false, true, false};
        System.out.println(Check.mono(data));
        System.out.println(Check.mono(data2));
        System.out.println(Check.mono(data3));
        System.out.println(Check.mono(data4));
    }
}
