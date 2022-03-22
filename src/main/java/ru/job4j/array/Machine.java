package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int sub = money - price;
        int size = 0;
        int index = 0;
        for (int i = 0; i < coins.length; i++) {
            if (sub >= coins[i]) {
                size += sub / coins[i];
                for (int j = index; j < size; j++) {
                    rsl[j] = coins[i];
                }
                sub %= coins[i];
                index = size;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

}
