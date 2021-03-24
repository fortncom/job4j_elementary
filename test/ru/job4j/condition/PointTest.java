package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when10to50then4() {
        int expected = 4;
        int x1 = 1;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to82then6() {
        int expected = 6;
        int x1 = 2;
        int y1 = 2;
        int x2 = 8;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to56then5() {
        int expected = 5;
        int x1 = 1;
        int y1 = 3;
        int x2 = 5;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
