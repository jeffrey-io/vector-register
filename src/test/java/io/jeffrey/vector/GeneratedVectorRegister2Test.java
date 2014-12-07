package io.jeffrey.vector;

import org.junit.Test;

public class GeneratedVectorRegister2Test extends CommonVectorTestingBase {

    @Test
    public void testset_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
    }

    @Test
    public void testset_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
    }
}
