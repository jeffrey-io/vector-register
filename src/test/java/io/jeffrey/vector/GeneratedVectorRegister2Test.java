package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedVectorRegister2Test extends CommonVectorTestingBase {

    @Test
    public void testSET_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
    }

    @Test
    public void testSET_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
    }

    @Test
    public void testZERO_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        x.zero_out_0();
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
        Assert.assertTrue(x.is_0_zero());
    }

    @Test
    public void testZERO_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        x.zero_out_1();
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        Assert.assertFalse(x.is_0_zero());
        assertEquals(0, x.x_1);
        assertEquals(0, x.y_1);
        Assert.assertTrue(x.is_1_zero());
    }

    @Test
    public void testIS_ZERO_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        Assert.assertFalse(x.is_0_zero());
        x.set_0(0,5);
        assertEquals(0, x.x_0);
        assertEquals(5, x.y_0);
        Assert.assertFalse(x.is_0_zero());
        x.set_0(3,0);
        assertEquals(3, x.x_0);
        assertEquals(0, x.y_0);
        Assert.assertFalse(x.is_0_zero());
        x.set_0(0,0);
        assertEquals(0, x.x_0);
        assertEquals(0, x.y_0);
        Assert.assertTrue(x.is_0_zero());
    }

    @Test
    public void testIS_ZERO_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        Assert.assertFalse(x.is_1_zero());
        x.set_1(0,5);
        assertEquals(0, x.x_1);
        assertEquals(5, x.y_1);
        Assert.assertFalse(x.is_1_zero());
        x.set_1(3,0);
        assertEquals(3, x.x_1);
        assertEquals(0, x.y_1);
        Assert.assertFalse(x.is_1_zero());
        x.set_1(0,0);
        assertEquals(0, x.x_1);
        assertEquals(0, x.y_1);
        Assert.assertTrue(x.is_1_zero());
    }

    @Test
    public void testCOPY_0_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        x.set_1(1,2);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        x.copy_from_1_to_0();
        assertEquals(1, x.x_0);
        assertEquals(2, x.y_0);
    }

    @Test
    public void testCOPY_1_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1(3,5);
        x.set_0(1,2);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        x.copy_from_0_to_1();
        assertEquals(1, x.x_1);
        assertEquals(2, x.y_1);
    }

    @Test
    public void testEXTRACT_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_0(-1,-2);
        x.extract_0(data, 0);
        x.extract_0(data, 5);
        x.extract_0(data, 8);
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
    public void testEXTRACT_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_1(-1,-2);
        x.extract_1(data, 0);
        x.extract_1(data, 5);
        x.extract_1(data, 8);
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
    public void testINJECT_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_0(data, 0);
        assertEquals(0, x.x_0);
        assertEquals(1, x.y_0);
        x.inject_0(data, 6);
        assertEquals(6, x.x_0);
        assertEquals(7, x.y_0);
        x.inject_0(data, 8);
        assertEquals(8, x.x_0);
        assertEquals(9, x.y_0);
    }

    @Test
    public void testINJECT_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_1(data, 0);
        assertEquals(0, x.x_1);
        assertEquals(1, x.y_1);
        x.inject_1(data, 6);
        assertEquals(6, x.x_1);
        assertEquals(7, x.y_1);
        x.inject_1(data, 8);
        assertEquals(8, x.x_1);
        assertEquals(9, x.y_1);
    }

    @Test
    public void testANGLES_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0_by_angle(0.5);
        assertEquals(0.8775825618903728, x.x_0);
        assertEquals(0.479425538604203, x.y_0);
        x.set_0_by_angle(1.5);
        assertEquals(0.0707372016677029, x.x_0);
        assertEquals(0.9974949866040544, x.y_0);
        x.set_0_by_angle(2.5);
        assertEquals(-0.8011436155469337, x.x_0);
        assertEquals(0.5984721441039564, x.y_0);
        double u, v;
        for(double theta = 0; theta < 7; theta += 0.1) {
            x.set_0_by_angle(theta);
            double omega = x.angle_0();
            u = x.x_0;
            v = x.y_0;
            x.set_0_by_angle(omega);
            assertEquals(u, x.x_0);
            assertEquals(v, x.y_0);
        }
    }

    @Test
    public void testANGLES_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1_by_angle(0.5);
        assertEquals(0.8775825618903728, x.x_1);
        assertEquals(0.479425538604203, x.y_1);
        x.set_1_by_angle(1.5);
        assertEquals(0.0707372016677029, x.x_1);
        assertEquals(0.9974949866040544, x.y_1);
        x.set_1_by_angle(2.5);
        assertEquals(-0.8011436155469337, x.x_1);
        assertEquals(0.5984721441039564, x.y_1);
        double u, v;
        for(double theta = 0; theta < 7; theta += 0.1) {
            x.set_1_by_angle(theta);
            double omega = x.angle_1();
            u = x.x_1;
            v = x.y_1;
            x.set_1_by_angle(omega);
            assertEquals(u, x.x_1);
            assertEquals(v, x.y_1);
        }
    }

    @Test
    public void testALGEBRA_0_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1(1,2);
        x.set_0(3,5);
        x.mult_0_by(4);
        assertEquals(12, x.x_0);
        assertEquals(20, x.y_0);
        x.div_0_by(2);
        assertEquals(6, x.x_0);
        assertEquals(10, x.y_0);
        x.add_1_to_0();
        assertEquals(7, x.x_0);
        assertEquals(12, x.y_0);
        x.sub_1_from_0();
        assertEquals(6, x.x_0);
        assertEquals(10, x.y_0);
        assertEquals(6+2*10,x.dot_1_0());
        x.set_0(1,2);
    }

    @Test
    public void testALGEBRA_1_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(1,2);
        x.set_1(3,5);
        x.mult_1_by(4);
        assertEquals(12, x.x_1);
        assertEquals(20, x.y_1);
        x.div_1_by(2);
        assertEquals(6, x.x_1);
        assertEquals(10, x.y_1);
        x.add_0_to_1();
        assertEquals(7, x.x_1);
        assertEquals(12, x.y_1);
        x.sub_0_from_1();
        assertEquals(6, x.x_1);
        assertEquals(10, x.y_1);
        assertEquals(6+2*10,x.dot_0_1());
        x.set_1(1,2);
    }

    @Test
    public void testCOMPLEX_CONJ_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(3, x.x_0);
        assertEquals(5, x.y_0);
        x.conjugate_0();
        assertEquals(3, x.x_0);
        assertEquals(-5, x.y_0);
    }

    @Test
    public void testCOMPLEX_CONJ_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1(3,5);
        assertEquals(3, x.x_1);
        assertEquals(5, x.y_1);
        x.conjugate_1();
        assertEquals(3, x.x_1);
        assertEquals(-5, x.y_1);
    }

    @Test
    public void testCOMPLEX_0_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        x.set_1(1,2);
        x.complex_mult_1_0();
        assertEquals(3-10, x.x_0);
        assertEquals(5+6, x.y_0);
    }

    @Test
    public void testCOMPLEX_1_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1(3,5);
        x.set_0(1,2);
        x.complex_mult_0_1();
        assertEquals(3-10, x.x_1);
        assertEquals(5+6, x.y_1);
    }

    @Test
    public void testPYTHAGOREAN_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_0(3,5);
        assertEquals(Math.sqrt(3*3+5*5), x.length_0());
        Assert.assertTrue(x.normalize_0());
        assertEquals(1, x.length_0());
        assertEquals(3/Math.sqrt(3*3+5*5), x.x_0);
        assertEquals(5/Math.sqrt(3*3+5*5), x.y_0);
        x.set_0(0,0);
        Assert.assertFalse(x.normalize_0());
    }

    @Test
    public void testPYTHAGOREAN_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_1(3,5);
        assertEquals(Math.sqrt(3*3+5*5), x.length_1());
        Assert.assertTrue(x.normalize_1());
        assertEquals(1, x.length_1());
        assertEquals(3/Math.sqrt(3*3+5*5), x.x_1);
        assertEquals(5/Math.sqrt(3*3+5*5), x.y_1);
        x.set_1(0,0);
        Assert.assertFalse(x.normalize_1());
    }

    @Test
    public void testMATRIX_0_1() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_matrix_0_1(1,3,2,4);
        assertEquals(1, x.x_0);
        assertEquals(3, x.y_0);
        assertEquals(2, x.x_1);
        assertEquals(4, x.y_1);
        assertEquals(1*4-2*3, x.det_0_1());
        assertEquals(-(1*4-2*3), x.det_1_0());
        Assert.assertTrue(x.invert_0_1());
        assertEquals(-2, x.x_0);
        assertEquals(1.5, x.y_0);
        assertEquals(1, x.x_1);
        assertEquals(-2, x.y_1);
        x.transpose_0_1();
        assertEquals(-2, x.x_0);
        assertEquals(1, x.y_0);
        assertEquals(1.5, x.x_1);
        assertEquals(-2, x.y_1);
        x.set_matrix_0_1(1,2,1,2);
        Assert.assertFalse(x.invert_0_1());
        assertEquals(0, x.det_0_1());
    }

    @Test
    public void testMATRIX_1_0() throws Exception {
        final VectorRegister2 x = new VectorRegister2();
        x.set_matrix_1_0(1,3,2,4);
        assertEquals(1, x.x_1);
        assertEquals(3, x.y_1);
        assertEquals(2, x.x_0);
        assertEquals(4, x.y_0);
        assertEquals(1*4-2*3, x.det_1_0());
        assertEquals(-(1*4-2*3), x.det_0_1());
        Assert.assertTrue(x.invert_1_0());
        assertEquals(-2, x.x_1);
        assertEquals(1.5, x.y_1);
        assertEquals(1, x.x_0);
        assertEquals(-2, x.y_0);
        x.transpose_1_0();
        assertEquals(-2, x.x_1);
        assertEquals(1, x.y_1);
        assertEquals(1.5, x.x_0);
        assertEquals(-2, x.y_0);
        x.set_matrix_1_0(1,2,1,2);
        Assert.assertFalse(x.invert_1_0());
        assertEquals(0, x.det_1_0());
    }
}
