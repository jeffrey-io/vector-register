package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedVectorRegister2Test extends CommonVectorTestingBase {

    @Test
    public void testSET_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
    }

    @Test
    public void testSET_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
    }

    @Test
    public void testZERO_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        x.zero_out_0();
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
        Assert.assertTrue(x.is_0_zero());
    }

    @Test
    public void testZERO_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        x.zero_out_1();
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        Assert.assertFalse(x.is_0_zero());
        assertEquals(0, x.x_1);
        assertEquals(0, x.y_1);
        Assert.assertTrue(x.is_1_zero());
    }

    @Test
    public void testCOPY_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        x.copy_from_1_to_0();
        assertEquals(1, x.x_0);
        assertEquals(2, x.y_0);
    }

    @Test
    public void testCOPY_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        x.copy_from_0_to_1();
        assertEquals(1, x.x_1);
        assertEquals(2, x.y_1);
    }

    @Test
    public void testEXTRACT_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_0(-1,-2);
        x.extract_0(data, 0);
        x.extract_0(data, 5);
        x.extract_0(data, 8);
        assertEquals(-1,data[0]);
        assertEquals(-2,data[1]);
        assertEquals(2,data[2]);
        assertEquals(3,data[3]);
        assertEquals(4,data[4]);
        assertEquals(-1,data[5]);
        assertEquals(-2,data[6]);
        assertEquals(7,data[7]);
        assertEquals(-1,data[8]);
        assertEquals(-2,data[9]);
    }

    @Test
    public void testEXTRACT_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_1(-1,-2);
        x.extract_1(data, 0);
        x.extract_1(data, 5);
        x.extract_1(data, 8);
        assertEquals(-1,data[0]);
        assertEquals(-2,data[1]);
        assertEquals(2,data[2]);
        assertEquals(3,data[3]);
        assertEquals(4,data[4]);
        assertEquals(-1,data[5]);
        assertEquals(-2,data[6]);
        assertEquals(7,data[7]);
        assertEquals(-1,data[8]);
        assertEquals(-2,data[9]);
    }

    @Test
    public void testINJECT_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_0(data, 0);
        assertEquals(0, x.x_0);
        assertEquals(1, x.y_0);
        x.inject_0(data, 6);
        assertEquals(6, x.x_0);
        assertEquals(7, x.y_0);
        x.inject_0(data, 8);
        assertEquals(8, x.x_0);
        assertEquals(9, x.y_0);
    }

    @Test
    public void testINJECT_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_1(data, 0);
        assertEquals(0, x.x_1);
        assertEquals(1, x.y_1);
        x.inject_1(data, 6);
        assertEquals(6, x.x_1);
        assertEquals(7, x.y_1);
        x.inject_1(data, 8);
        assertEquals(8, x.x_1);
        assertEquals(9, x.y_1);
    }

    @Test
    public void testIS_ZERO_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        Assert.assertFalse(x.is_0_zero());
        x.set_0(0,5);
        assertEquals(0, x.x_0);
        assertEquals(5, x.y_0);
        Assert.assertFalse(x.is_0_zero());
        x.set_0(3,0);
        assertEquals(3, x.x_0);
        assertEquals(0, x.y_0);
        Assert.assertFalse(x.is_0_zero());
        x.set_0(0,0);
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
        Assert.assertTrue(x.is_0_zero());
    }

    @Test
    public void testIS_ZERO_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        Assert.assertFalse(x.is_1_zero());
        x.set_1(0,5);
        assertEquals(0, x.x_1);
        assertEquals(5, x.y_1);
        Assert.assertFalse(x.is_1_zero());
        x.set_1(3,0);
        assertEquals(3, x.x_1);
        assertEquals(0, x.y_1);
        Assert.assertFalse(x.is_1_zero());
        x.set_1(0,0);
        assertEquals(0, x.x_1);
        assertEquals(0, x.y_1);
        Assert.assertTrue(x.is_1_zero());
    }
}
