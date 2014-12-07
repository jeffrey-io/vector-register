package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedVectorRegister3Test extends CommonVectorTestingBase {

    @Test
    public void testSET_2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        x.set_2(3,5);
        assertEquals(3, x.x_2);
        assertEquals(5, x.y_2);
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
        assertEquals(0, x.x_1);
        assertEquals(0, x.y_1);
    }

    @Test
    public void testZERO_2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        x.set_2(3,5);
        assertEquals(3, x.x_2);
        assertEquals(5, x.y_2);
        x.zero_out_2();
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        Assert.assertFalse(x.is_0_zero());
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        Assert.assertFalse(x.is_1_zero());
        assertEquals(0, x.x_2);
        assertEquals(0, x.y_2);
        Assert.assertTrue(x.is_2_zero());
    }

    @Test
    public void testIS_ZERO_2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        x.set_2(3,5);
        assertEquals(3, x.x_2);
        assertEquals(5, x.y_2);
        Assert.assertFalse(x.is_2_zero());
        x.set_2(0,5);
        assertEquals(0, x.x_2);
        assertEquals(5, x.y_2);
        Assert.assertFalse(x.is_2_zero());
        x.set_2(3,0);
        assertEquals(3, x.x_2);
        assertEquals(0, x.y_2);
        Assert.assertFalse(x.is_2_zero());
        x.set_2(0,0);
        assertEquals(0, x.x_2);
        assertEquals(0, x.y_2);
        Assert.assertTrue(x.is_2_zero());
    }

    @Test
    public void testCOPY_2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_2(1,2);
        x.set_2(3,5);
        assertEquals(3, x.x_2);
        assertEquals(5, x.y_2);
        x.copy_from_0_to_2();
        assertEquals(1, x.x_2);
        assertEquals(2, x.y_2);
        x.set_2(3,5);
        assertEquals(3, x.x_2);
        assertEquals(5, x.y_2);
        x.copy_from_1_to_2();
        assertEquals(1, x.x_2);
        assertEquals(2, x.y_2);
    }

    @Test
    public void testEXTRACT_2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_2(-1,-2);
        x.extract_2(data, 0);
        x.extract_2(data, 5);
        x.extract_2(data, 8);
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
    public void testINJECT_2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_2(data, 0);
        assertEquals(0, x.x_2);
        assertEquals(1, x.y_2);
        x.inject_2(data, 6);
        assertEquals(6, x.x_2);
        assertEquals(7, x.y_2);
        x.inject_2(data, 8);
        assertEquals(8, x.x_2);
        assertEquals(9, x.y_2);
    }

    @Test
    public void testANGLES_2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        x.set_2_by_angle(0.5);
        assertEquals(0.8775825618903728, x.x_2);
        assertEquals(0.479425538604203, x.y_2);
        x.set_2_by_angle(1.5);
        assertEquals(0.0707372016677029, x.x_2);
        assertEquals(0.9974949866040544, x.y_2);
        x.set_2_by_angle(2.5);
        assertEquals(-0.8011436155469337, x.x_2);
        assertEquals(0.5984721441039564, x.y_2);
        double u, v;
        for(double theta = 0; theta < 7; theta += 0.1) {
            x.set_2_by_angle(theta);
            double omega = x.angle_2();
            u = x.x_2;
            v = x.y_2;
            x.set_2_by_angle(omega);
            assertEquals(u, x.x_2);
            assertEquals(v, x.y_2);
        }
    }

    @Test
    public void testALGEBRA2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_2(1,2);
        x.set_2(3,5);
        x.mult_2_by(4);
        assertEquals(12, x.x_2);
        assertEquals(20, x.y_2);
        x.div_2_by(2);
        assertEquals(6, x.x_2);
        assertEquals(10, x.y_2);
        x.add_0_to_2();
        assertEquals(7, x.x_2);
        assertEquals(12, x.y_2);
        x.sub_0_from_2();
        assertEquals(6, x.x_2);
        assertEquals(10, x.y_2);
        assertEquals(6+2*10,x.dot_0_2());
        x.set_2(1,2);
        x.set_2(3,5);
        x.mult_2_by(4);
        assertEquals(12, x.x_2);
        assertEquals(20, x.y_2);
        x.div_2_by(2);
        assertEquals(6, x.x_2);
        assertEquals(10, x.y_2);
        x.add_1_to_2();
        assertEquals(7, x.x_2);
        assertEquals(12, x.y_2);
        x.sub_1_from_2();
        assertEquals(6, x.x_2);
        assertEquals(10, x.y_2);
        assertEquals(6+2*10,x.dot_1_2());
        x.set_2(1,2);
    }

    @Test
    public void testCOMPLEX_CONJ_2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        x.set_2(3,5);
        assertEquals(3, x.x_2);
        assertEquals(5, x.y_2);
        x.conjugate_2();
        assertEquals(3, x.x_2);
        assertEquals(-5, x.y_2);
    }

    @Test
    public void testCOMPLEX2() throws Exception {
        final VectorRegister3 x = new VectorRegister3();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_2(1,2);
        x.set_2(3,5);
        x.complex_mult_0_2();
        assertEquals(3-10, x.x_2);
        assertEquals(5+6, x.y_2);
        x.set_2(1,2);
        x.set_2(3,5);
        x.complex_mult_1_2();
        assertEquals(3-10, x.x_2);
        assertEquals(5+6, x.y_2);
        x.set_2(1,2);
    }
}
