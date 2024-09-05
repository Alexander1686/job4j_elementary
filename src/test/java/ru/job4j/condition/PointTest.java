package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to02then2and23() {
        double expected = 2.23;
        Point a = new Point(1, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to00then3and60() {
        double expected = 1;
        Point a = new Point(2, 0);
        Point b = new Point(3, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111then173() {
        double expected = 1.73;
        Point c = new Point(0, 0, 0);
        Point d = new Point(1, 1, 1);
        double out = c.distance(d);
        Assert.assertEquals(expected, out, 0.01);
    }
}