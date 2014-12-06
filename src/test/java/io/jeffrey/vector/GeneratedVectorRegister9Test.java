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
    public void testANGLES_8() throws Exception {
        final VectorRegister9 x = new VectorRegister9();
        x.set_8_by_angle(0.5);
        assertEquals(0.8775825618903728, x.x_8);
        assertEquals(0.479425538604203, x.y_8);
        x.set_8_by_angle(1.5);
        assertEquals(0.0707372016677029, x.x_8);
        assertEquals(0.9974949866040544, x.y_8);
        x.set_8_by_angle(2.5);
        assertEquals(-0.8011436155469337, x.x_8);
        assertEquals(0.5984721441039564, x.y_8);
        double u, v;
        for(double theta = 0; theta < 7; theta += 0.1) {
            x.set_8_by_angle(theta);
            double omega = x.angle_8();
            u = x.x_8;
            v = x.y_8;
            x.set_8_by_angle(omega);
            assertEquals(u, x.x_8);
            assertEquals(v, x.y_8);
        }
    }

    @Test
    public void testALGEBRA8() throws Exception {
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
        x.mult_8_by(4);
        assertEquals(12, x.x_8);
        assertEquals(20, x.y_8);
        x.div_8_by(2);
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        x.add_0_to_8();
        assertEquals(7, x.x_8);
        assertEquals(12, x.y_8);
        x.sub_0_from_8();
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        assertEquals(6+2*10,x.dot_0_8());
        x.set_8(1,2);
        x.set_8(3,5);
        x.mult_8_by(4);
        assertEquals(12, x.x_8);
        assertEquals(20, x.y_8);
        x.div_8_by(2);
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        x.add_1_to_8();
        assertEquals(7, x.x_8);
        assertEquals(12, x.y_8);
        x.sub_1_from_8();
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        assertEquals(6+2*10,x.dot_1_8());
        x.set_8(1,2);
        x.set_8(3,5);
        x.mult_8_by(4);
        assertEquals(12, x.x_8);
        assertEquals(20, x.y_8);
        x.div_8_by(2);
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        x.add_2_to_8();
        assertEquals(7, x.x_8);
        assertEquals(12, x.y_8);
        x.sub_2_from_8();
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        assertEquals(6+2*10,x.dot_2_8());
        x.set_8(1,2);
        x.set_8(3,5);
        x.mult_8_by(4);
        assertEquals(12, x.x_8);
        assertEquals(20, x.y_8);
        x.div_8_by(2);
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        x.add_3_to_8();
        assertEquals(7, x.x_8);
        assertEquals(12, x.y_8);
        x.sub_3_from_8();
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        assertEquals(6+2*10,x.dot_3_8());
        x.set_8(1,2);
        x.set_8(3,5);
        x.mult_8_by(4);
        assertEquals(12, x.x_8);
        assertEquals(20, x.y_8);
        x.div_8_by(2);
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        x.add_4_to_8();
        assertEquals(7, x.x_8);
        assertEquals(12, x.y_8);
        x.sub_4_from_8();
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        assertEquals(6+2*10,x.dot_4_8());
        x.set_8(1,2);
        x.set_8(3,5);
        x.mult_8_by(4);
        assertEquals(12, x.x_8);
        assertEquals(20, x.y_8);
        x.div_8_by(2);
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        x.add_5_to_8();
        assertEquals(7, x.x_8);
        assertEquals(12, x.y_8);
        x.sub_5_from_8();
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        assertEquals(6+2*10,x.dot_5_8());
        x.set_8(1,2);
        x.set_8(3,5);
        x.mult_8_by(4);
        assertEquals(12, x.x_8);
        assertEquals(20, x.y_8);
        x.div_8_by(2);
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        x.add_6_to_8();
        assertEquals(7, x.x_8);
        assertEquals(12, x.y_8);
        x.sub_6_from_8();
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        assertEquals(6+2*10,x.dot_6_8());
        x.set_8(1,2);
        x.set_8(3,5);
        x.mult_8_by(4);
        assertEquals(12, x.x_8);
        assertEquals(20, x.y_8);
        x.div_8_by(2);
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        x.add_7_to_8();
        assertEquals(7, x.x_8);
        assertEquals(12, x.y_8);
        x.sub_7_from_8();
        assertEquals(6, x.x_8);
        assertEquals(10, x.y_8);
        assertEquals(6+2*10,x.dot_7_8());
        x.set_8(1,2);
    }

    @Test
    public void testCOMPLEX_CONJ_8() throws Exception {
        final VectorRegister9 x = new VectorRegister9();
        x.set_8(3,5);
        assertEquals(3, x.x_8);
        assertEquals(5, x.y_8);
        x.conjugate_8();
        assertEquals(3, x.x_8);
        assertEquals(-5, x.y_8);
    }

    @Test
    public void testCOMPLEX8() throws Exception {
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
        x.complex_mult_0_8();
        assertEquals(3-10, x.x_8);
        assertEquals(5+6, x.y_8);
        x.set_8(1,2);
        x.set_8(3,5);
        x.complex_mult_1_8();
        assertEquals(3-10, x.x_8);
        assertEquals(5+6, x.y_8);
        x.set_8(1,2);
        x.set_8(3,5);
        x.complex_mult_2_8();
        assertEquals(3-10, x.x_8);
        assertEquals(5+6, x.y_8);
        x.set_8(1,2);
        x.set_8(3,5);
        x.complex_mult_3_8();
        assertEquals(3-10, x.x_8);
        assertEquals(5+6, x.y_8);
        x.set_8(1,2);
        x.set_8(3,5);
        x.complex_mult_4_8();
        assertEquals(3-10, x.x_8);
        assertEquals(5+6, x.y_8);
        x.set_8(1,2);
        x.set_8(3,5);
        x.complex_mult_5_8();
        assertEquals(3-10, x.x_8);
        assertEquals(5+6, x.y_8);
        x.set_8(1,2);
        x.set_8(3,5);
        x.complex_mult_6_8();
        assertEquals(3-10, x.x_8);
        assertEquals(5+6, x.y_8);
        x.set_8(1,2);
        x.set_8(3,5);
        x.complex_mult_7_8();
        assertEquals(3-10, x.x_8);
        assertEquals(5+6, x.y_8);
        x.set_8(1,2);
    }

    @Test
    public void testPYTHAGOREAN_8() throws Exception {
        final VectorRegister9 x = new VectorRegister9();
        x.set_8(3,5);
        assertEquals(Math.sqrt(3*3+5*5), x.length_8());
        x.normalize_8();
        assertEquals(1, x.length_8());
        assertEquals(3/Math.sqrt(3*3+5*5), x.x_8);
        assertEquals(5/Math.sqrt(3*3+5*5), x.y_8);
    }
}
