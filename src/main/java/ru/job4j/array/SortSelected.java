package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            System.out.println(i);
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
        }
        return data;
    }

    public static void main(String[] args) {
        int[] massiv = new int[]{3, 4, 1};
        int[] massiv2 = new int[]{3, 4, 1, 2, 5};
        System.out.println(SortSelected.sort(massiv));
        System.out.println(SortSelected.sort(massiv2));

    }
}