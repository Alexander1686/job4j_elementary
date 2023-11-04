package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int index = 2; index < (number - 1); index++) {
            if ((number % index) == 0) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(CheckPrimeNumber.check(5));
        System.out.println(CheckPrimeNumber.check(4));
        System.out.println(CheckPrimeNumber.check(7));
        System.out.println(CheckPrimeNumber.check(17));
        System.out.println(CheckPrimeNumber.check(65));
        System.out.println(CheckPrimeNumber.check(1));
    }
}