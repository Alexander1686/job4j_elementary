package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int data, int el) {
        int[] massiv = new int[data];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i;
        }
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
        System.out.println(indexOf(5, 3));
        System.out.println(indexOf(5, 10));
    }
}

