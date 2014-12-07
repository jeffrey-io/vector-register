package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedVectorRegisterBTest extends CommonVectorTestingBase {

    @Test
    public void testSET_10() throws Exception {
        final VectorRegisterB x = new VectorRegisterB();
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
        assertEquals(0, x.x_1);
        assertEquals(0, x.y_1);
        assertEquals(0, x.x_2);
        assertEquals(0, x.y_2);
        assertEquals(0, x.x_3);
        assertEquals(0, x.y_3);
        assertEquals(0, x.x_4);
        assertEquals(0, x.y_4);
        assertEquals(0, x.x_5);
        assertEquals(0, x.y_5);
        assertEquals(0, x.x_6);
        assertEquals(0, x.y_6);
        assertEquals(0, x.x_7);
        assertEquals(0, x.y_7);
        assertEquals(0, x.x_8);
        assertEquals(0, x.y_8);
        assertEquals(0, x.x_9);
        assertEquals(0, x.y_9);
    }

    @Test
    public void testZERO_10() throws Exception {
        final VectorRegisterB x = new VectorRegisterB();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        x.set_2(3,5);
        assertEquals(3, x.x_2);
        assertEquals(5, x.y_2);
        x.set_3(3,5);
        assertEquals(3, x.x_3);
        assertEquals(5, x.y_3);
        x.set_4(3,5);
        assertEquals(3, x.x_4);
        assertEquals(5, x.y_4);
        x.set_5(3,5);
        assertEquals(3, x.x_5);
        assertEquals(5, x.y_5);
        x.set_6(3,5);
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
        x.set_7(3,5);
        assertEquals(3, x.x_7);
        assertEquals(5, x.y_7);
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.zero_out_10();
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        Assert.assertFalse(x.is_0_zero());
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        Assert.assertFalse(x.is_1_zero());
        assertEquals(3, x.x_2);
        assertEquals(5, x.y_2);
        Assert.assertFalse(x.is_2_zero());
        assertEquals(3, x.x_3);
        assertEquals(5, x.y_3);
        Assert.assertFalse(x.is_3_zero());
        assertEquals(3, x.x_4);
        assertEquals(5, x.y_4);
        Assert.assertFalse(x.is_4_zero());
        assertEquals(3, x.x_5);
        assertEquals(5, x.y_5);
        Assert.assertFalse(x.is_5_zero());
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
        Assert.assertFalse(x.is_6_zero());
        assertEquals(3, x.x_7);
        assertEquals(5, x.y_7);
        Assert.assertFalse(x.is_7_zero());
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        Assert.assertFalse(x.is_8_zero());
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        Assert.assertFalse(x.is_9_zero());
        assertEquals(0, x.x_10);
        assertEquals(0, x.y_10);
        Assert.assertTrue(x.is_10_zero());
    }

    @Test
    public void testIS_ZERO_10() throws Exception {
        final VectorRegisterB x = new VectorRegisterB();
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        Assert.assertFalse(x.is_10_zero());
        x.set_10(0,5);
        assertEquals(0, x.x_10);
        assertEquals(5, x.y_10);
        Assert.assertFalse(x.is_10_zero());
        x.set_10(3,0);
        assertEquals(3, x.x_10);
        assertEquals(0, x.y_10);
        Assert.assertFalse(x.is_10_zero());
        x.set_10(0,0);
        assertEquals(0, x.x_10);
        assertEquals(0, x.y_10);
        Assert.assertTrue(x.is_10_zero());
    }

    @Test
    public void testCOPY_10() throws Exception {
        final VectorRegisterB x = new VectorRegisterB();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_2(1,2);
        x.set_3(1,2);
        x.set_4(1,2);
        x.set_5(1,2);
        x.set_6(1,2);
        x.set_7(1,2);
        x.set_8(1,2);
        x.set_9(1,2);
        x.set_10(1,2);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.copy_from_0_to_10();
        assertEquals(1, x.x_10);
        assertEquals(2, x.y_10);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.copy_from_1_to_10();
        assertEquals(1, x.x_10);
        assertEquals(2, x.y_10);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.copy_from_2_to_10();
        assertEquals(1, x.x_10);
        assertEquals(2, x.y_10);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.copy_from_3_to_10();
        assertEquals(1, x.x_10);
        assertEquals(2, x.y_10);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.copy_from_4_to_10();
        assertEquals(1, x.x_10);
        assertEquals(2, x.y_10);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.copy_from_5_to_10();
        assertEquals(1, x.x_10);
        assertEquals(2, x.y_10);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.copy_from_6_to_10();
        assertEquals(1, x.x_10);
        assertEquals(2, x.y_10);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.copy_from_7_to_10();
        assertEquals(1, x.x_10);
        assertEquals(2, x.y_10);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.copy_from_8_to_10();
        assertEquals(1, x.x_10);
        assertEquals(2, x.y_10);
        x.set_10(3,5);
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        x.copy_from_9_to_10();
        assertEquals(1, x.x_10);
        assertEquals(2, x.y_10);
    }

    @Test
    public void testEXTRACT_10() throws Exception {
        final VectorRegisterB x = new VectorRegisterB();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_10(-1,-2);
        x.extract_10(data, 0);
        x.extract_10(data, 5);
        x.extract_10(data, 8);
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
    public void testINJECT_10() throws Exception {
        final VectorRegisterB x = new VectorRegisterB();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_10(data, 0);
        assertEquals(0, x.x_10);
        assertEquals(1, x.y_10);
        x.inject_10(data, 6);
        assertEquals(6, x.x_10);
        assertEquals(7, x.y_10);
        x.inject_10(data, 8);
        assertEquals(8, x.x_10);
        assertEquals(9, x.y_10);
    }
}
