package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class VectorRegisterFTest extends CommonVectorTestingBase {



    @Test
    public void testBasicIO() {
        VectorRegisterF reg = new VectorRegisterF();
        reg.set_0(1, 2);
        assertEquals(reg.x_0, 1);
        assertEquals(reg.y_0, 2);
        reg.zero_out_0();
        assertZero(reg.x_0);
        assertZero(reg.y_0);
        double[] data = new double[] { -1, 1, 2, 3, 0, 0 };
        reg.inject_0(data, 1);
        assertEquals(reg.x_0, 1);
        assertEquals(reg.y_0, 2);
        assertZero(data[4]);
        assertZero(data[5]);
        reg.extract_0(data, 4);
        assertEquals(data[4], 1);
        assertEquals(data[5], 2);
    }

    @Test
    public void testBasicTransform() {
        VectorRegisterF reg = new VectorRegisterF();
        reg.set_0(1, 2);
        reg.set_1(3, 4);
        reg.set_2(1, 0);
        reg.set_3(0, 1);

        reg.transform_2_by_0_1();
        reg.transform_3_by_0_1();
        reg.sub_0_from_2();
        reg.sub_1_from_3();
        Assert.assertTrue(reg.is_2_zero());
        Assert.assertTrue(reg.is_3_zero());
    }
}
