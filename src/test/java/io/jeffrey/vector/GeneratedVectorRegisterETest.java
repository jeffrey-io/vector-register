package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedVectorRegisterETest extends CommonVectorTestingBase {

    @Test
    public void testSET_13() throws Exception {
        final VectorRegisterE x = new VectorRegisterE();
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
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
        assertEquals(0, x.x_10);
        assertEquals(0, x.y_10);
        assertEquals(0, x.x_11);
        assertEquals(0, x.y_11);
        assertEquals(0, x.x_12);
        assertEquals(0, x.y_12);
    }

    @Test
    public void testZERO_13() throws Exception {
        final VectorRegisterE x = new VectorRegisterE();
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
        x.set_11(3,5);
        assertEquals(3, x.x_11);
        assertEquals(5, x.y_11);
        x.set_12(3,5);
        assertEquals(3, x.x_12);
        assertEquals(5, x.y_12);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.zero_out_13();
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
        assertEquals(3, x.x_10);
        assertEquals(5, x.y_10);
        Assert.assertFalse(x.is_10_zero());
        assertEquals(3, x.x_11);
        assertEquals(5, x.y_11);
        Assert.assertFalse(x.is_11_zero());
        assertEquals(3, x.x_12);
        assertEquals(5, x.y_12);
        Assert.assertFalse(x.is_12_zero());
        assertEquals(0, x.x_13);
        assertEquals(0, x.y_13);
        Assert.assertTrue(x.is_13_zero());
    }

    @Test
    public void testCOPY_13() throws Exception {
        final VectorRegisterE x = new VectorRegisterE();
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
        x.set_11(1,2);
        x.set_12(1,2);
        x.set_13(1,2);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_0_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_1_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_2_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_3_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_4_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_5_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_6_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_7_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_8_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_9_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_10_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_11_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        x.copy_from_12_to_13();
        assertEquals(1, x.x_13);
        assertEquals(2, x.y_13);
    }

    @Test
    public void testEXTRACT_13() throws Exception {
        final VectorRegisterE x = new VectorRegisterE();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_13(-1,-2);
        x.extract_13(data, 0);
        x.extract_13(data, 5);
        x.extract_13(data, 8);
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
    public void testINJECT_13() throws Exception {
        final VectorRegisterE x = new VectorRegisterE();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_13(data, 0);
        assertEquals(0, x.x_13);
        assertEquals(1, x.y_13);
        x.inject_13(data, 6);
        assertEquals(6, x.x_13);
        assertEquals(7, x.y_13);
        x.inject_13(data, 8);
        assertEquals(8, x.x_13);
        assertEquals(9, x.y_13);
    }

    @Test
    public void testIS_ZERO_13() throws Exception {
        final VectorRegisterE x = new VectorRegisterE();
        x.set_13(3,5);
        assertEquals(3, x.x_13);
        assertEquals(5, x.y_13);
        Assert.assertFalse(x.is_13_zero());
        x.set_13(0,5);
        assertEquals(0, x.x_13);
        assertEquals(5, x.y_13);
        Assert.assertFalse(x.is_13_zero());
        x.set_13(3,0);
        assertEquals(3, x.x_13);
        assertEquals(0, x.y_13);
        Assert.assertFalse(x.is_13_zero());
        x.set_13(0,0);
        assertEquals(0, x.x_13);
        assertEquals(0, x.y_13);
        Assert.assertTrue(x.is_13_zero());
    }
}
