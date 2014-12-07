package io.jeffrey.vector;

import org.junit.Assert;
import org.junit.Test;

public class GeneratedVectorRegister5Test extends CommonVectorTestingBase {

    @Test
    public void testSET_4() throws Exception {
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

    @Test
    public void testZERO_4() throws Exception {
        final VectorRegister5 x = new VectorRegister5();
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
        x.zero_out_4();
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
        assertEquals(0, x.x_4);
        assertEquals(0, x.y_4);
        Assert.assertTrue(x.is_4_zero());
    }

    @Test
    public void testIS_ZERO_4() throws Exception {
        final VectorRegister5 x = new VectorRegister5();
        x.set_4(3,5);
        assertEquals(3, x.x_4);
        assertEquals(5, x.y_4);
        Assert.assertFalse(x.is_4_zero());
        x.set_4(0,5);
        assertEquals(0, x.x_4);
        assertEquals(5, x.y_4);
        Assert.assertFalse(x.is_4_zero());
        x.set_4(3,0);
        assertEquals(3, x.x_4);
        assertEquals(0, x.y_4);
        Assert.assertFalse(x.is_4_zero());
        x.set_4(0,0);
        assertEquals(0, x.x_4);
        assertEquals(0, x.y_4);
        Assert.assertTrue(x.is_4_zero());
    }

    @Test
    public void testCOPY_4() throws Exception {
        final VectorRegister5 x = new VectorRegister5();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_2(1,2);
        x.set_3(1,2);
        x.set_4(1,2);
        x.set_4(3,5);
        assertEquals(3, x.x_4);
        assertEquals(5, x.y_4);
        x.copy_from_0_to_4();
        assertEquals(1, x.x_4);
        assertEquals(2, x.y_4);
        x.set_4(3,5);
        assertEquals(3, x.x_4);
        assertEquals(5, x.y_4);
        x.copy_from_1_to_4();
        assertEquals(1, x.x_4);
        assertEquals(2, x.y_4);
        x.set_4(3,5);
        assertEquals(3, x.x_4);
        assertEquals(5, x.y_4);
        x.copy_from_2_to_4();
        assertEquals(1, x.x_4);
        assertEquals(2, x.y_4);
        x.set_4(3,5);
        assertEquals(3, x.x_4);
        assertEquals(5, x.y_4);
        x.copy_from_3_to_4();
        assertEquals(1, x.x_4);
        assertEquals(2, x.y_4);
    }

    @Test
    public void testEXTRACT_4() throws Exception {
        final VectorRegister5 x = new VectorRegister5();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.set_4(-1,-2);
        x.extract_4(data, 0);
        x.extract_4(data, 5);
        x.extract_4(data, 8);
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
    public void testINJECT_4() throws Exception {
        final VectorRegister5 x = new VectorRegister5();
        double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        x.inject_4(data, 0);
        assertEquals(0, x.x_4);
        assertEquals(1, x.y_4);
        x.inject_4(data, 6);
        assertEquals(6, x.x_4);
        assertEquals(7, x.y_4);
        x.inject_4(data, 8);
        assertEquals(8, x.x_4);
        assertEquals(9, x.y_4);
    }

    @Test
    public void testANGLES_4() throws Exception {
        final VectorRegister5 x = new VectorRegister5();
        x.set_4_by_angle(0.5);
        assertEquals(0.8775825618903728, x.x_4);
        assertEquals(0.479425538604203, x.y_4);
        x.set_4_by_angle(1.5);
        assertEquals(0.0707372016677029, x.x_4);
        assertEquals(0.9974949866040544, x.y_4);
        x.set_4_by_angle(2.5);
        assertEquals(-0.8011436155469337, x.x_4);
        assertEquals(0.5984721441039564, x.y_4);
        double u, v;
        for(double theta = 0; theta < 7; theta += 0.1) {
            x.set_4_by_angle(theta);
            double omega = x.angle_4();
            u = x.x_4;
            v = x.y_4;
            x.set_4_by_angle(omega);
            assertEquals(u, x.x_4);
            assertEquals(v, x.y_4);
        }
    }

    @Test
    public void testALGEBRA4() throws Exception {
        final VectorRegister5 x = new VectorRegister5();
        x.set_0(1,2);
        x.set_1(1,2);
        x.set_2(1,2);
        x.set_3(1,2);
        x.set_4(1,2);
        x.set_4(3,5);
        x.mult_4_by(4);
        assertEquals(12, x.x_4);
        assertEquals(20, x.y_4);
        x.div_4_by(2);
        assertEquals(6, x.x_4);
        assertEquals(10, x.y_4);
        x.add_0_to_4();
        assertEquals(7, x.x_4);
        assertEquals(12, x.y_4);
        x.set_4(1,2);
        x.set_4(3,5);
        x.mult_4_by(4);
        assertEquals(12, x.x_4);
        assertEquals(20, x.y_4);
        x.div_4_by(2);
        assertEquals(6, x.x_4);
        assertEquals(10, x.y_4);
        x.add_1_to_4();
        assertEquals(7, x.x_4);
        assertEquals(12, x.y_4);
        x.set_4(1,2);
        x.set_4(3,5);
        x.mult_4_by(4);
        assertEquals(12, x.x_4);
        assertEquals(20, x.y_4);
        x.div_4_by(2);
        assertEquals(6, x.x_4);
        assertEquals(10, x.y_4);
        x.add_2_to_4();
        assertEquals(7, x.x_4);
        assertEquals(12, x.y_4);
        x.set_4(1,2);
        x.set_4(3,5);
        x.mult_4_by(4);
        assertEquals(12, x.x_4);
        assertEquals(20, x.y_4);
        x.div_4_by(2);
        assertEquals(6, x.x_4);
        assertEquals(10, x.y_4);
        x.add_3_to_4();
        assertEquals(7, x.x_4);
        assertEquals(12, x.y_4);
        x.set_4(1,2);
    }
}
