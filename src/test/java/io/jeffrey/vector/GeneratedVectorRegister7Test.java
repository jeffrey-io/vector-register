package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedVectorRegister7Test extends CommonVectorTestingBase {

    @Test
    public void testSET_6() throws Exception {
        final VectorRegister7 x = new VectorRegister7();
        x.set_6(3,5);
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
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
    }

    @Test
    public void testZERO_6() throws Exception {
        final VectorRegister7 x = new VectorRegister7();
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
        x.zero_out_6();
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
        assertEquals(0, x.x_6);
        assertEquals(0, x.y_6);
        Assert.assertTrue(x.is_6_zero());
    }

    @Test
    public void testIS_ZERO_6() throws Exception {
        final VectorRegister7 x = new VectorRegister7();
        x.set_6(3,5);
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
        Assert.assertFalse(x.is_6_zero());
        x.set_6(0,5);
        assertEquals(0, x.x_6);
        assertEquals(5, x.y_6);
        Assert.assertFalse(x.is_6_zero());
        x.set_6(3,0);
        assertEquals(3, x.x_6);
        assertEquals(0, x.y_6);
        Assert.assertFalse(x.is_6_zero());
        x.set_6(0,0);
        assertEquals(0, x.x_6);
        assertEquals(0, x.y_6);
        Assert.assertTrue(x.is_6_zero());
    }

    @Test
    public void testCOPY_6() throws Exception {
        final VectorRegister7 x = new VectorRegister7();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_2(1,2);
        x.set_3(1,2);
        x.set_4(1,2);
        x.set_5(1,2);
        x.set_6(1,2);
        x.set_6(3,5);
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
        x.copy_from_0_to_6();
        assertEquals(1, x.x_6);
        assertEquals(2, x.y_6);
        x.set_6(3,5);
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
        x.copy_from_1_to_6();
        assertEquals(1, x.x_6);
        assertEquals(2, x.y_6);
        x.set_6(3,5);
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
        x.copy_from_2_to_6();
        assertEquals(1, x.x_6);
        assertEquals(2, x.y_6);
        x.set_6(3,5);
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
        x.copy_from_3_to_6();
        assertEquals(1, x.x_6);
        assertEquals(2, x.y_6);
        x.set_6(3,5);
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
        x.copy_from_4_to_6();
        assertEquals(1, x.x_6);
        assertEquals(2, x.y_6);
        x.set_6(3,5);
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
        x.copy_from_5_to_6();
        assertEquals(1, x.x_6);
        assertEquals(2, x.y_6);
    }

    @Test
    public void testEXTRACT_6() throws Exception {
        final VectorRegister7 x = new VectorRegister7();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_6(-1,-2);
        x.extract_6(data, 0);
        x.extract_6(data, 5);
        x.extract_6(data, 8);
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
    public void testINJECT_6() throws Exception {
        final VectorRegister7 x = new VectorRegister7();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_6(data, 0);
        assertEquals(0, x.x_6);
        assertEquals(1, x.y_6);
        x.inject_6(data, 6);
        assertEquals(6, x.x_6);
        assertEquals(7, x.y_6);
        x.inject_6(data, 8);
        assertEquals(8, x.x_6);
        assertEquals(9, x.y_6);
    }

    @Test
    public void testANGLES_6() throws Exception {
        final VectorRegister7 x = new VectorRegister7();
        x.set_6_by_angle(0.5);
        assertEquals(0.8775825618903728, x.x_6);
        assertEquals(0.479425538604203, x.y_6);
        x.set_6_by_angle(1.5);
        assertEquals(0.0707372016677029, x.x_6);
        assertEquals(0.9974949866040544, x.y_6);
        x.set_6_by_angle(2.5);
        assertEquals(-0.8011436155469337, x.x_6);
        assertEquals(0.5984721441039564, x.y_6);
        double u, v;
        for(double theta = 0; theta < 7; theta += 0.1) {
            x.set_6_by_angle(theta);
            double omega = x.angle_6();
            u = x.x_6;
            v = x.y_6;
            x.set_6_by_angle(omega);
            assertEquals(u, x.x_6);
            assertEquals(v, x.y_6);
        }
    }

    @Test
    public void testALGEBRA6() throws Exception {
        final VectorRegister7 x = new VectorRegister7();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_2(1,2);
        x.set_3(1,2);
        x.set_4(1,2);
        x.set_5(1,2);
        x.set_6(1,2);
        x.set_6(3,5);
        x.mult_6_by(4);
        assertEquals(12, x.x_6);
        assertEquals(20, x.y_6);
        x.div_6_by(2);
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        x.add_0_to_6();
        assertEquals(7, x.x_6);
        assertEquals(12, x.y_6);
        x.sub_0_from_6();
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        assertEquals(6+2*10,x.dot_0_6());
        x.set_6(1,2);
        x.set_6(3,5);
        x.mult_6_by(4);
        assertEquals(12, x.x_6);
        assertEquals(20, x.y_6);
        x.div_6_by(2);
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        x.add_1_to_6();
        assertEquals(7, x.x_6);
        assertEquals(12, x.y_6);
        x.sub_1_from_6();
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        assertEquals(6+2*10,x.dot_1_6());
        x.set_6(1,2);
        x.set_6(3,5);
        x.mult_6_by(4);
        assertEquals(12, x.x_6);
        assertEquals(20, x.y_6);
        x.div_6_by(2);
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        x.add_2_to_6();
        assertEquals(7, x.x_6);
        assertEquals(12, x.y_6);
        x.sub_2_from_6();
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        assertEquals(6+2*10,x.dot_2_6());
        x.set_6(1,2);
        x.set_6(3,5);
        x.mult_6_by(4);
        assertEquals(12, x.x_6);
        assertEquals(20, x.y_6);
        x.div_6_by(2);
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        x.add_3_to_6();
        assertEquals(7, x.x_6);
        assertEquals(12, x.y_6);
        x.sub_3_from_6();
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        assertEquals(6+2*10,x.dot_3_6());
        x.set_6(1,2);
        x.set_6(3,5);
        x.mult_6_by(4);
        assertEquals(12, x.x_6);
        assertEquals(20, x.y_6);
        x.div_6_by(2);
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        x.add_4_to_6();
        assertEquals(7, x.x_6);
        assertEquals(12, x.y_6);
        x.sub_4_from_6();
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        assertEquals(6+2*10,x.dot_4_6());
        x.set_6(1,2);
        x.set_6(3,5);
        x.mult_6_by(4);
        assertEquals(12, x.x_6);
        assertEquals(20, x.y_6);
        x.div_6_by(2);
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        x.add_5_to_6();
        assertEquals(7, x.x_6);
        assertEquals(12, x.y_6);
        x.sub_5_from_6();
        assertEquals(6, x.x_6);
        assertEquals(10, x.y_6);
        assertEquals(6+2*10,x.dot_5_6());
        x.set_6(1,2);
    }

    @Test
    public void testCOMPLEX_CONJ_6() throws Exception {
        final VectorRegister7 x = new VectorRegister7();
        x.set_6(3,5);
        assertEquals(3, x.x_6);
        assertEquals(5, x.y_6);
        x.conjugate_6();
        assertEquals(3, x.x_6);
        assertEquals(-5, x.y_6);
    }

    @Test
    public void testCOMPLEX6() throws Exception {
        final VectorRegister7 x = new VectorRegister7();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_2(1,2);
        x.set_3(1,2);
        x.set_4(1,2);
        x.set_5(1,2);
        x.set_6(1,2);
        x.set_6(3,5);
        x.complex_mult_0_6();
        assertEquals(3-10, x.x_6);
        assertEquals(5+6, x.y_6);
        x.set_6(1,2);
        x.set_6(3,5);
        x.complex_mult_1_6();
        assertEquals(3-10, x.x_6);
        assertEquals(5+6, x.y_6);
        x.set_6(1,2);
        x.set_6(3,5);
        x.complex_mult_2_6();
        assertEquals(3-10, x.x_6);
        assertEquals(5+6, x.y_6);
        x.set_6(1,2);
        x.set_6(3,5);
        x.complex_mult_3_6();
        assertEquals(3-10, x.x_6);
        assertEquals(5+6, x.y_6);
        x.set_6(1,2);
        x.set_6(3,5);
        x.complex_mult_4_6();
        assertEquals(3-10, x.x_6);
        assertEquals(5+6, x.y_6);
        x.set_6(1,2);
        x.set_6(3,5);
        x.complex_mult_5_6();
        assertEquals(3-10, x.x_6);
        assertEquals(5+6, x.y_6);
        x.set_6(1,2);
    }
}
