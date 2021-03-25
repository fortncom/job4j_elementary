package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTenToSeventeenThenFiftyTwo() {
        int start = 10;
        int finish = 17;
        int result = Counter.sumByEven(start, finish);
        int expected = 52;
        Assert.assertEquals(expected, result);
    }
}
