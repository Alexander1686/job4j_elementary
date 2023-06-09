package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
        System.out.println(out);
    }

    @Test
    public void whenP6K2Square3() {
        int expected = 3;
        int p = 8;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.6);
        System.out.println(out);
    }

    @Test
    public void whenP6K2Square4() {
        int expected = 4;
        int p = 9;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.6);
        System.out.println(out);
    }

}