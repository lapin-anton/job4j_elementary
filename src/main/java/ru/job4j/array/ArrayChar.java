package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        if (pref.length <= word.length) {
            for (int i = 0; i < pref.length; i++) {
                if (pref[i] != word[i]) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

}
