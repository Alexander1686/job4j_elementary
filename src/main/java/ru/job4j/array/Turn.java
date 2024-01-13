package ru.job4j.array;

 public class Turn {

   public static int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
                int temp = array[i];
                array[array.length - 1 - i] = temp;
                array[i] = (array.length - 1 - i);
                System.out.println(array[i]);
            }
       return array;
        }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        Turn.back(array);
    }
}


