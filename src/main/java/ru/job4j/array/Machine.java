package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        money -= price;
        int size = 0;
        for (int i : coins) {
            while (money >= i) {
                result[size] = i;
                size++;
                money -= i;
            }
        }
        return Arrays.copyOf(result, size);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Machine.change(100, 100)));
        System.out.println(Arrays.toString(Machine.change(50, 35)));
        System.out.println(Arrays.toString(Machine.change(50, 21)));
        System.out.println(Arrays.toString(Machine.change(50, 32)));
    }
}