package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int excepted = 120;
        Assert.assertEquals(excepted, Factorial.calc(n));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int n = 0;
        int excepted = 1;
        Assert.assertEquals(excepted, Factorial.calc(n));
    }

}