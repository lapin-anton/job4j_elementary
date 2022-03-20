package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {
    @Test
    public void whenBackArrayLength5() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] excepted = new int[]{5, 4, 3, 2, 1};
        Assert.assertArrayEquals(excepted, Turn.back(array));
    }

    @Test
    public void whenBackArrayLength10() {
        int[] array = new int[]{-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int[] excepted = new int[]{5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5};
        Assert.assertArrayEquals(excepted, Turn.back(array));
    }
}