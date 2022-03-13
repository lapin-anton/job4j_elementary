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
        float in = 140.f;
        float expected = 2.0f;
        float out = Converter.rubleToEuro(in);
        boolean passed = out == expected;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 120.f;
        expected = 2.0f;
        out = Converter.rubleToDollar(in);
        passed = out == expected;

        System.out.printf("120 rubles are 2 dollars. Test result : " + passed);
    }

}
