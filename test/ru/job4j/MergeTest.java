package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class MergeTest {

    @Test
    public void whenMerge2And3Then5() {
        int[] expected = new int[] {1, 2, 3, 4, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        Assert.assertArrayEquals(expected, result);
    }
}