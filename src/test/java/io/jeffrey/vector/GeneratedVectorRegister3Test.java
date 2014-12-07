package io.jeffrey.vector;

import org.junit.Test;

public class GeneratedVectorRegister3Test extends CommonVectorTestingBase {

    @Test
    public void testset_2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        x.set_2(3,5);
        assertEquals(3, x.x_2);
        assertEquals(5, x.y_2);
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
        assertEquals(0, x.x_1);
        assertEquals(0, x.y_1);
    }
}
