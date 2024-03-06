package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] prefix) {
        boolean result = true;
        for (int i = 0; i < prefix.length; i++) {
            System.out.println(prefix[i]);
            if (prefix[i] != word[i]) {
                result = false;
                break;
            }
    }
        return result;
}

    public static void main(String[] args) {
        char[] word = new char[] {'h', 'e', 'l', 'l', 'o'};
        char[] prefix = new char[] {'h', 'e'};
        char[] prefix2 = new char[] {'h', 'i'};
      System.out.println(ArrayChar.startsWith(word, prefix));
        System.out.println(ArrayChar.startsWith(word, prefix2));
    }
}

