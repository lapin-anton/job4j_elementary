package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.printf("140 rubles are %.2f euro.%n", euro);

        float dollar = Converter.rubleToDollar(100);
        System.out.printf("120 rubles are %.2f dollars.%n", dollar);
    }

}
