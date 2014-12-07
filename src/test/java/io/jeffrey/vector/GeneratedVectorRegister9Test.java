package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedVectorRegister9Test extends CommonVectorTestingBase {

    @Test
    public void testSET_8() throws Exception {
        final VectorRegister9 x = new VectorRegister9();
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
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
    }

    @Test
    public void testZERO_8() throws Exception {
        final VectorRegister9 x = new VectorRegister9();
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
        x.zero_out_8();
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
        assertEquals(0, x.x_8);
        assertEquals(0, x.y_8);
        Assert.assertTrue(x.is_8_zero());
    }

    @Test
    public void testCOPY_8() throws Exception {
        final VectorRegister9 x = new VectorRegister9();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_2(1,2);
        x.set_3(1,2);
        x.set_4(1,2);
        x.set_5(1,2);
        x.set_6(1,2);
        x.set_7(1,2);
        x.set_8(1,2);
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        x.copy_from_0_to_8();
        assertEquals(1, x.x_8);
        assertEquals(2, x.y_8);
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        x.copy_from_1_to_8();
        assertEquals(1, x.x_8);
        assertEquals(2, x.y_8);
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        x.copy_from_2_to_8();
        assertEquals(1, x.x_8);
        assertEquals(2, x.y_8);
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        x.copy_from_3_to_8();
        assertEquals(1, x.x_8);
        assertEquals(2, x.y_8);
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        x.copy_from_4_to_8();
        assertEquals(1, x.x_8);
        assertEquals(2, x.y_8);
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        x.copy_from_5_to_8();
        assertEquals(1, x.x_8);
        assertEquals(2, x.y_8);
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        x.copy_from_6_to_8();
        assertEquals(1, x.x_8);
        assertEquals(2, x.y_8);
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        x.copy_from_7_to_8();
        assertEquals(1, x.x_8);
        assertEquals(2, x.y_8);
    }

    @Test
    public void testEXTRACT_8() throws Exception {
        final VectorRegister9 x = new VectorRegister9();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_8(-1,-2);
        x.extract_8(data, 0);
        x.extract_8(data, 5);
        x.extract_8(data, 8);
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
    public void testINJECT_8() throws Exception {
        final VectorRegister9 x = new VectorRegister9();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_8(data, 0);
        assertEquals(0, x.x_8);
        assertEquals(1, x.y_8);
        x.inject_8(data, 6);
        assertEquals(6, x.x_8);
        assertEquals(7, x.y_8);
        x.inject_8(data, 8);
        assertEquals(8, x.x_8);
        assertEquals(9, x.y_8);
    }

    @Test
    public void testIS_ZERO_8() throws Exception {
        final VectorRegister9 x = new VectorRegister9();
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        Assert.assertFalse(x.is_8_zero());
        x.set_8(0,5);
        assertEquals(0, x.x_8);
        assertEquals(5, x.y_8);
        Assert.assertFalse(x.is_8_zero());
        x.set_8(3,0);
        assertEquals(3, x.x_8);
        assertEquals(0, x.y_8);
        Assert.assertFalse(x.is_8_zero());
        x.set_8(0,0);
        assertEquals(0, x.x_8);
        assertEquals(0, x.y_8);
        Assert.assertTrue(x.is_8_zero());
    }
}
