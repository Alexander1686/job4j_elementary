package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(double value) {
        double rsl = value / 70;
        return (double) rsl;
    }

    public static double rubleToDollar(double value) {
        double rsl = value / 60;
        return (double) rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

        double in = 140;
        double ind = 140;
        double expected = 2;
        double expecteddollar = 2.3333333333333335;
        double out = Converter.rubleToEuro(in);
        double outdollar = Converter.rubleToDollar(ind);
        boolean passed = expected == out;
        boolean passeddollar = expecteddollar == outdollar;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 rubles are 2.3333333333333335. Test result : " + passeddollar);

    }
}
