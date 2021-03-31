package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when10to50then4() {
        int expected = 4;
        Point point = new Point(1, 0);
        Point point2 = new Point(5, 0);
        double out = point.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to82then6() {
        int expected = 6;
        Point point = new Point(2, 2);
        Point point2 = new Point(8, 2);
        double out = point.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when13to56then5() {
        int expected = 5;
        Point point = new Point(1, 3);
        Point point2 = new Point(5, 6);
        double out = point.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
