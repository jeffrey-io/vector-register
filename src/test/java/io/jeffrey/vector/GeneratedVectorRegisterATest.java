package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedVectorRegisterATest extends CommonVectorTestingBase {

    @Test
    public void testSET_9() throws Exception {
        final VectorRegisterA x = new VectorRegisterA();
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
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
    }

    @Test
    public void testZERO_9() throws Exception {
        final VectorRegisterA x = new VectorRegisterA();
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
        x.zero_out_9();
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
        assertEquals(0, x.x_9);
        assertEquals(0, x.y_9);
        Assert.assertTrue(x.is_9_zero());
    }

    @Test
    public void testIS_ZERO_9() throws Exception {
        final VectorRegisterA x = new VectorRegisterA();
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        Assert.assertFalse(x.is_9_zero());
        x.set_9(0,5);
        assertEquals(0, x.x_9);
        assertEquals(5, x.y_9);
        Assert.assertFalse(x.is_9_zero());
        x.set_9(3,0);
        assertEquals(3, x.x_9);
        assertEquals(0, x.y_9);
        Assert.assertFalse(x.is_9_zero());
        x.set_9(0,0);
        assertEquals(0, x.x_9);
        assertEquals(0, x.y_9);
        Assert.assertTrue(x.is_9_zero());
    }

    @Test
    public void testCOPY_9() throws Exception {
        final VectorRegisterA x = new VectorRegisterA();
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
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.copy_from_0_to_9();
        assertEquals(1, x.x_9);
        assertEquals(2, x.y_9);
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.copy_from_1_to_9();
        assertEquals(1, x.x_9);
        assertEquals(2, x.y_9);
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.copy_from_2_to_9();
        assertEquals(1, x.x_9);
        assertEquals(2, x.y_9);
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.copy_from_3_to_9();
        assertEquals(1, x.x_9);
        assertEquals(2, x.y_9);
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.copy_from_4_to_9();
        assertEquals(1, x.x_9);
        assertEquals(2, x.y_9);
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.copy_from_5_to_9();
        assertEquals(1, x.x_9);
        assertEquals(2, x.y_9);
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.copy_from_6_to_9();
        assertEquals(1, x.x_9);
        assertEquals(2, x.y_9);
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.copy_from_7_to_9();
        assertEquals(1, x.x_9);
        assertEquals(2, x.y_9);
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.copy_from_8_to_9();
        assertEquals(1, x.x_9);
        assertEquals(2, x.y_9);
    }

    @Test
    public void testEXTRACT_9() throws Exception {
        final VectorRegisterA x = new VectorRegisterA();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_9(-1,-2);
        x.extract_9(data, 0);
        x.extract_9(data, 5);
        x.extract_9(data, 8);
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
    public void testINJECT_9() throws Exception {
        final VectorRegisterA x = new VectorRegisterA();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_9(data, 0);
        assertEquals(0, x.x_9);
        assertEquals(1, x.y_9);
        x.inject_9(data, 6);
        assertEquals(6, x.x_9);
        assertEquals(7, x.y_9);
        x.inject_9(data, 8);
        assertEquals(8, x.x_9);
        assertEquals(9, x.y_9);
    }

    @Test
    public void testANGLES_9() throws Exception {
        final VectorRegisterA x = new VectorRegisterA();
        x.set_9_by_angle(0.5);
        assertEquals(0.8775825618903728, x.x_9);
        assertEquals(0.479425538604203, x.y_9);
        x.set_9_by_angle(1.5);
        assertEquals(0.0707372016677029, x.x_9);
        assertEquals(0.9974949866040544, x.y_9);
        x.set_9_by_angle(2.5);
        assertEquals(-0.8011436155469337, x.x_9);
        assertEquals(0.5984721441039564, x.y_9);
        double u, v;
        for(double theta = 0; theta < 7; theta += 0.1) {
            x.set_9_by_angle(theta);
            double omega = x.angle_9();
            u = x.x_9;
            v = x.y_9;
            x.set_9_by_angle(omega);
            assertEquals(u, x.x_9);
            assertEquals(v, x.y_9);
        }
    }

    @Test
    public void testALGEBRA9() throws Exception {
        final VectorRegisterA x = new VectorRegisterA();
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
        x.set_9(3,5);
        x.mult_9_by(4);
        assertEquals(12, x.x_9);
        assertEquals(20, x.y_9);
        x.div_9_by(2);
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        x.add_0_to_9();
        assertEquals(7, x.x_9);
        assertEquals(12, x.y_9);
        x.sub_0_from_9();
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        assertEquals(6+2*10,x.dot_0_9());
        x.set_9(1,2);
        x.set_9(3,5);
        x.mult_9_by(4);
        assertEquals(12, x.x_9);
        assertEquals(20, x.y_9);
        x.div_9_by(2);
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        x.add_1_to_9();
        assertEquals(7, x.x_9);
        assertEquals(12, x.y_9);
        x.sub_1_from_9();
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        assertEquals(6+2*10,x.dot_1_9());
        x.set_9(1,2);
        x.set_9(3,5);
        x.mult_9_by(4);
        assertEquals(12, x.x_9);
        assertEquals(20, x.y_9);
        x.div_9_by(2);
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        x.add_2_to_9();
        assertEquals(7, x.x_9);
        assertEquals(12, x.y_9);
        x.sub_2_from_9();
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        assertEquals(6+2*10,x.dot_2_9());
        x.set_9(1,2);
        x.set_9(3,5);
        x.mult_9_by(4);
        assertEquals(12, x.x_9);
        assertEquals(20, x.y_9);
        x.div_9_by(2);
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        x.add_3_to_9();
        assertEquals(7, x.x_9);
        assertEquals(12, x.y_9);
        x.sub_3_from_9();
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        assertEquals(6+2*10,x.dot_3_9());
        x.set_9(1,2);
        x.set_9(3,5);
        x.mult_9_by(4);
        assertEquals(12, x.x_9);
        assertEquals(20, x.y_9);
        x.div_9_by(2);
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        x.add_4_to_9();
        assertEquals(7, x.x_9);
        assertEquals(12, x.y_9);
        x.sub_4_from_9();
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        assertEquals(6+2*10,x.dot_4_9());
        x.set_9(1,2);
        x.set_9(3,5);
        x.mult_9_by(4);
        assertEquals(12, x.x_9);
        assertEquals(20, x.y_9);
        x.div_9_by(2);
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        x.add_5_to_9();
        assertEquals(7, x.x_9);
        assertEquals(12, x.y_9);
        x.sub_5_from_9();
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        assertEquals(6+2*10,x.dot_5_9());
        x.set_9(1,2);
        x.set_9(3,5);
        x.mult_9_by(4);
        assertEquals(12, x.x_9);
        assertEquals(20, x.y_9);
        x.div_9_by(2);
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        x.add_6_to_9();
        assertEquals(7, x.x_9);
        assertEquals(12, x.y_9);
        x.sub_6_from_9();
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        assertEquals(6+2*10,x.dot_6_9());
        x.set_9(1,2);
        x.set_9(3,5);
        x.mult_9_by(4);
        assertEquals(12, x.x_9);
        assertEquals(20, x.y_9);
        x.div_9_by(2);
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        x.add_7_to_9();
        assertEquals(7, x.x_9);
        assertEquals(12, x.y_9);
        x.sub_7_from_9();
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        assertEquals(6+2*10,x.dot_7_9());
        x.set_9(1,2);
        x.set_9(3,5);
        x.mult_9_by(4);
        assertEquals(12, x.x_9);
        assertEquals(20, x.y_9);
        x.div_9_by(2);
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        x.add_8_to_9();
        assertEquals(7, x.x_9);
        assertEquals(12, x.y_9);
        x.sub_8_from_9();
        assertEquals(6, x.x_9);
        assertEquals(10, x.y_9);
        assertEquals(6+2*10,x.dot_8_9());
        x.set_9(1,2);
    }

    @Test
    public void testCOMPLEX_CONJ_9() throws Exception {
        final VectorRegisterA x = new VectorRegisterA();
        x.set_9(3,5);
        assertEquals(3, x.x_9);
        assertEquals(5, x.y_9);
        x.conjugate_9();
        assertEquals(3, x.x_9);
        assertEquals(-5, x.y_9);
    }

    @Test
    public void testCOMPLEX9() throws Exception {
        final VectorRegisterA x = new VectorRegisterA();
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
        x.set_9(3,5);
        x.complex_mult_0_9();
        assertEquals(3-10, x.x_9);
        assertEquals(5+6, x.y_9);
        x.set_9(1,2);
        x.set_9(3,5);
        x.complex_mult_1_9();
        assertEquals(3-10, x.x_9);
        assertEquals(5+6, x.y_9);
        x.set_9(1,2);
        x.set_9(3,5);
        x.complex_mult_2_9();
        assertEquals(3-10, x.x_9);
        assertEquals(5+6, x.y_9);
        x.set_9(1,2);
        x.set_9(3,5);
        x.complex_mult_3_9();
        assertEquals(3-10, x.x_9);
        assertEquals(5+6, x.y_9);
        x.set_9(1,2);
        x.set_9(3,5);
        x.complex_mult_4_9();
        assertEquals(3-10, x.x_9);
        assertEquals(5+6, x.y_9);
        x.set_9(1,2);
        x.set_9(3,5);
        x.complex_mult_5_9();
        assertEquals(3-10, x.x_9);
        assertEquals(5+6, x.y_9);
        x.set_9(1,2);
        x.set_9(3,5);
        x.complex_mult_6_9();
        assertEquals(3-10, x.x_9);
        assertEquals(5+6, x.y_9);
        x.set_9(1,2);
        x.set_9(3,5);
        x.complex_mult_7_9();
        assertEquals(3-10, x.x_9);
        assertEquals(5+6, x.y_9);
        x.set_9(1,2);
        x.set_9(3,5);
        x.complex_mult_8_9();
        assertEquals(3-10, x.x_9);
        assertEquals(5+6, x.y_9);
        x.set_9(1,2);
    }
}
