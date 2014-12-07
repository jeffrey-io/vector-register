package io.jeffrey.vector;

import org.junit.Test;

public class GeneratedVectorRegister4Test extends CommonVectorTestingBase {

    @Test
    public void testset_3() throws Exception {
        final VectorRegister4 x = new VectorRegister4();
        x.set_3(3,5);
        assertEquals(3, x.x_3);
        assertEquals(5, x.y_3);
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
        assertEquals(0, x.x_1);
        assertEquals(0, x.y_1);
        assertEquals(0, x.x_2);
        assertEquals(0, x.y_2);
    }
}
