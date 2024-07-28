package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                count++;
            } else {
                result += symbol;
                if (count > 1) {
                    result += count;
                }
                symbol = input.charAt(i);
                count = 1;
            }
        }

        result += symbol;
        if (count > 1) {
            result += count;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(encode("a"));
        System.out.println(encode("aa"));
        System.out.println(encode("aaabbc"));
        System.out.println(encode("abbccc"));
        System.out.println(encode("aaabcc"));
        System.out.println(encode("abc"));
        System.out.println(encode("aaabbbccc"));
        System.out.println(encode("aaaaaaaaaaaabbbcdddd"));
        System.out.println(encode("aaabbbbaaabbcccddddd"));
    }
}