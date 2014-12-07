package io.jeffrey.vector;

import org.junit.Test;

public class GeneratedVectorRegister5Test extends CommonVectorTestingBase {

    @Test
    public void testset_4() throws Exception {
        final VectorRegister5 x = new VectorRegister5();
        x.set_4(3,5);
        assertEquals(3, x.x_4);
        assertEquals(5, x.y_4);
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
        assertEquals(0, x.x_1);
        assertEquals(0, x.y_1);
        assertEquals(0, x.x_2);
        assertEquals(0, x.y_2);
        assertEquals(0, x.x_3);
        assertEquals(0, x.y_3);
    }
}
