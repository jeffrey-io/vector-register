package io.jeffrey.vector;

import org.junit.Assert;

public class CommonVectorTestingBase {
    protected static void assertZero(double x) {
        Assert.assertTrue(Math.abs(x) < 1E-10);
    }

    protected static void assertEquals(double x, double y) {
        assertZero(x - y);
    }
}
