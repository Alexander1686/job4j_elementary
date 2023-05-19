package ru.job4j.calcucator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfDifferenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double sumOfAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат sumOfDifferenceAndDivision равен: " + sumOfDifferenceAndDivision(10, 20));
        System.out.println("Результат sumOfAll равен: " + sumOfAll(10, 20));
    }

}
