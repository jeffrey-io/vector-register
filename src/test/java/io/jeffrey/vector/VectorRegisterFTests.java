package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class VectorRegisterFTests {
    @Test
    public void testBasicTransform() {
        VectorRegisterF reg = new VectorRegisterF();
        reg.set0(1, 2);
        reg.set1(3, 4);
        reg.set2(1, 0);
        reg.set3(0, 1);

        reg.transform_2_by_0_1();
        reg.transform_3_by_0_1();
        reg.sub_0_from_2();
        reg.sub_1_from_3();
        Assert.assertTrue(reg.isZero_2());
        Assert.assertTrue(reg.isZero_3());
    }
}
