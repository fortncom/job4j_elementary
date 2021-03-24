package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int outEuro = Converter.rubleToEuro(in);
        boolean passed = expected == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        int outDollar = Converter.rubleToDollar(in);
        passed = expected == outDollar;
        System.out.println("140 rubles are 2 dollar. Test result : " + passed);
    }

}
