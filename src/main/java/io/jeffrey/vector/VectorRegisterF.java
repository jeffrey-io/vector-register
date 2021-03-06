package io.jeffrey.vector;

/** a register bank that contains 15 vectors along with all possible operations */
public class VectorRegisterF extends VectorRegisterE {
    public double x_14;
    public double y_14;

    public VectorRegisterF() {
        x_14 = 0.0;
        y_14 = 0.0;
    }

    /** add the 14 and 0 together and store the result to the 14 vector */
    public void add_0_to_14() {
        x_14 += x_0;
        y_14 += y_0;
    }

    /** add the 14 and 1 together and store the result to the 14 vector */
    public void add_1_to_14() {
        x_14 += x_1;
        y_14 += y_1;
    }

    /** add the 14 and 10 together and store the result to the 14 vector */
    public void add_10_to_14() {
        x_14 += x_10;
        y_14 += y_10;
    }

    /** add the 14 and 11 together and store the result to the 14 vector */
    public void add_11_to_14() {
        x_14 += x_11;
        y_14 += y_11;
    }

    /** add the 14 and 12 together and store the result to the 14 vector */
    public void add_12_to_14() {
        x_14 += x_12;
        y_14 += y_12;
    }

    /** add the 14 and 13 together and store the result to the 14 vector */
    public void add_13_to_14() {
        x_14 += x_13;
        y_14 += y_13;
    }

    /** add the 0 and 14 together and store the result to the 0 vector */
    public void add_14_to_0() {
        x_0 += x_14;
        y_0 += y_14;
    }

    /** add the 1 and 14 together and store the result to the 1 vector */
    public void add_14_to_1() {
        x_1 += x_14;
        y_1 += y_14;
    }

    /** add the 10 and 14 together and store the result to the 10 vector */
    public void add_14_to_10() {
        x_10 += x_14;
        y_10 += y_14;
    }

    /** add the 11 and 14 together and store the result to the 11 vector */
    public void add_14_to_11() {
        x_11 += x_14;
        y_11 += y_14;
    }

    /** add the 12 and 14 together and store the result to the 12 vector */
    public void add_14_to_12() {
        x_12 += x_14;
        y_12 += y_14;
    }

    /** add the 13 and 14 together and store the result to the 13 vector */
    public void add_14_to_13() {
        x_13 += x_14;
        y_13 += y_14;
    }

    /** add the 2 and 14 together and store the result to the 2 vector */
    public void add_14_to_2() {
        x_2 += x_14;
        y_2 += y_14;
    }

    /** add the 3 and 14 together and store the result to the 3 vector */
    public void add_14_to_3() {
        x_3 += x_14;
        y_3 += y_14;
    }

    /** add the 4 and 14 together and store the result to the 4 vector */
    public void add_14_to_4() {
        x_4 += x_14;
        y_4 += y_14;
    }

    /** add the 5 and 14 together and store the result to the 5 vector */
    public void add_14_to_5() {
        x_5 += x_14;
        y_5 += y_14;
    }

    /** add the 6 and 14 together and store the result to the 6 vector */
    public void add_14_to_6() {
        x_6 += x_14;
        y_6 += y_14;
    }

    /** add the 7 and 14 together and store the result to the 7 vector */
    public void add_14_to_7() {
        x_7 += x_14;
        y_7 += y_14;
    }

    /** add the 8 and 14 together and store the result to the 8 vector */
    public void add_14_to_8() {
        x_8 += x_14;
        y_8 += y_14;
    }

    /** add the 9 and 14 together and store the result to the 9 vector */
    public void add_14_to_9() {
        x_9 += x_14;
        y_9 += y_14;
    }

    /** add the 14 and 2 together and store the result to the 14 vector */
    public void add_2_to_14() {
        x_14 += x_2;
        y_14 += y_2;
    }

    /** add the 14 and 3 together and store the result to the 14 vector */
    public void add_3_to_14() {
        x_14 += x_3;
        y_14 += y_3;
    }

    /** add the 14 and 4 together and store the result to the 14 vector */
    public void add_4_to_14() {
        x_14 += x_4;
        y_14 += y_4;
    }

    /** add the 14 and 5 together and store the result to the 14 vector */
    public void add_5_to_14() {
        x_14 += x_5;
        y_14 += y_5;
    }

    /** add the 14 and 6 together and store the result to the 14 vector */
    public void add_6_to_14() {
        x_14 += x_6;
        y_14 += y_6;
    }

    /** add the 14 and 7 together and store the result to the 14 vector */
    public void add_7_to_14() {
        x_14 += x_7;
        y_14 += y_7;
    }

    /** add the 14 and 8 together and store the result to the 14 vector */
    public void add_8_to_14() {
        x_14 += x_8;
        y_14 += y_8;
    }

    /** add the 14 and 9 together and store the result to the 14 vector */
    public void add_9_to_14() {
        x_14 += x_9;
        y_14 += y_9;
    }

    /** return the angle (via atan2) of the 14 vector */
    public double angle_14() {
        return Math.atan2(y_14, x_14);
    }

    /** multiply via complex numbers the 14 and 0 together and store the result to the 14 vector */
    public void complex_mult_0_14() {
        final double t = x_14 * x_0 - y_14 * y_0;
        y_14 = x_14 * y_0 + y_14 * x_0;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 1 together and store the result to the 14 vector */
    public void complex_mult_1_14() {
        final double t = x_14 * x_1 - y_14 * y_1;
        y_14 = x_14 * y_1 + y_14 * x_1;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 10 together and store the result to the 14 vector */
    public void complex_mult_10_14() {
        final double t = x_14 * x_10 - y_14 * y_10;
        y_14 = x_14 * y_10 + y_14 * x_10;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 11 together and store the result to the 14 vector */
    public void complex_mult_11_14() {
        final double t = x_14 * x_11 - y_14 * y_11;
        y_14 = x_14 * y_11 + y_14 * x_11;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 12 together and store the result to the 14 vector */
    public void complex_mult_12_14() {
        final double t = x_14 * x_12 - y_14 * y_12;
        y_14 = x_14 * y_12 + y_14 * x_12;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 13 together and store the result to the 14 vector */
    public void complex_mult_13_14() {
        final double t = x_14 * x_13 - y_14 * y_13;
        y_14 = x_14 * y_13 + y_14 * x_13;
        x_14 = t;
    }

    /** multiply via complex numbers the 0 and 14 together and store the result to the 0 vector */
    public void complex_mult_14_0() {
        final double t = x_0 * x_14 - y_0 * y_14;
        y_0 = x_0 * y_14 + y_0 * x_14;
        x_0 = t;
    }

    /** multiply via complex numbers the 1 and 14 together and store the result to the 1 vector */
    public void complex_mult_14_1() {
        final double t = x_1 * x_14 - y_1 * y_14;
        y_1 = x_1 * y_14 + y_1 * x_14;
        x_1 = t;
    }

    /** multiply via complex numbers the 10 and 14 together and store the result to the 10 vector */
    public void complex_mult_14_10() {
        final double t = x_10 * x_14 - y_10 * y_14;
        y_10 = x_10 * y_14 + y_10 * x_14;
        x_10 = t;
    }

    /** multiply via complex numbers the 11 and 14 together and store the result to the 11 vector */
    public void complex_mult_14_11() {
        final double t = x_11 * x_14 - y_11 * y_14;
        y_11 = x_11 * y_14 + y_11 * x_14;
        x_11 = t;
    }

    /** multiply via complex numbers the 12 and 14 together and store the result to the 12 vector */
    public void complex_mult_14_12() {
        final double t = x_12 * x_14 - y_12 * y_14;
        y_12 = x_12 * y_14 + y_12 * x_14;
        x_12 = t;
    }

    /** multiply via complex numbers the 13 and 14 together and store the result to the 13 vector */
    public void complex_mult_14_13() {
        final double t = x_13 * x_14 - y_13 * y_14;
        y_13 = x_13 * y_14 + y_13 * x_14;
        x_13 = t;
    }

    /** multiply via complex numbers the 2 and 14 together and store the result to the 2 vector */
    public void complex_mult_14_2() {
        final double t = x_2 * x_14 - y_2 * y_14;
        y_2 = x_2 * y_14 + y_2 * x_14;
        x_2 = t;
    }

    /** multiply via complex numbers the 3 and 14 together and store the result to the 3 vector */
    public void complex_mult_14_3() {
        final double t = x_3 * x_14 - y_3 * y_14;
        y_3 = x_3 * y_14 + y_3 * x_14;
        x_3 = t;
    }

    /** multiply via complex numbers the 4 and 14 together and store the result to the 4 vector */
    public void complex_mult_14_4() {
        final double t = x_4 * x_14 - y_4 * y_14;
        y_4 = x_4 * y_14 + y_4 * x_14;
        x_4 = t;
    }

    /** multiply via complex numbers the 5 and 14 together and store the result to the 5 vector */
    public void complex_mult_14_5() {
        final double t = x_5 * x_14 - y_5 * y_14;
        y_5 = x_5 * y_14 + y_5 * x_14;
        x_5 = t;
    }

    /** multiply via complex numbers the 6 and 14 together and store the result to the 6 vector */
    public void complex_mult_14_6() {
        final double t = x_6 * x_14 - y_6 * y_14;
        y_6 = x_6 * y_14 + y_6 * x_14;
        x_6 = t;
    }

    /** multiply via complex numbers the 7 and 14 together and store the result to the 7 vector */
    public void complex_mult_14_7() {
        final double t = x_7 * x_14 - y_7 * y_14;
        y_7 = x_7 * y_14 + y_7 * x_14;
        x_7 = t;
    }

    /** multiply via complex numbers the 8 and 14 together and store the result to the 8 vector */
    public void complex_mult_14_8() {
        final double t = x_8 * x_14 - y_8 * y_14;
        y_8 = x_8 * y_14 + y_8 * x_14;
        x_8 = t;
    }

    /** multiply via complex numbers the 9 and 14 together and store the result to the 9 vector */
    public void complex_mult_14_9() {
        final double t = x_9 * x_14 - y_9 * y_14;
        y_9 = x_9 * y_14 + y_9 * x_14;
        x_9 = t;
    }

    /** multiply via complex numbers the 14 and 2 together and store the result to the 14 vector */
    public void complex_mult_2_14() {
        final double t = x_14 * x_2 - y_14 * y_2;
        y_14 = x_14 * y_2 + y_14 * x_2;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 3 together and store the result to the 14 vector */
    public void complex_mult_3_14() {
        final double t = x_14 * x_3 - y_14 * y_3;
        y_14 = x_14 * y_3 + y_14 * x_3;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 4 together and store the result to the 14 vector */
    public void complex_mult_4_14() {
        final double t = x_14 * x_4 - y_14 * y_4;
        y_14 = x_14 * y_4 + y_14 * x_4;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 5 together and store the result to the 14 vector */
    public void complex_mult_5_14() {
        final double t = x_14 * x_5 - y_14 * y_5;
        y_14 = x_14 * y_5 + y_14 * x_5;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 6 together and store the result to the 14 vector */
    public void complex_mult_6_14() {
        final double t = x_14 * x_6 - y_14 * y_6;
        y_14 = x_14 * y_6 + y_14 * x_6;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 7 together and store the result to the 14 vector */
    public void complex_mult_7_14() {
        final double t = x_14 * x_7 - y_14 * y_7;
        y_14 = x_14 * y_7 + y_14 * x_7;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 8 together and store the result to the 14 vector */
    public void complex_mult_8_14() {
        final double t = x_14 * x_8 - y_14 * y_8;
        y_14 = x_14 * y_8 + y_14 * x_8;
        x_14 = t;
    }

    /** multiply via complex numbers the 14 and 9 together and store the result to the 14 vector */
    public void complex_mult_9_14() {
        final double t = x_14 * x_9 - y_14 * y_9;
        y_14 = x_14 * y_9 + y_14 * x_9;
        x_14 = t;
    }

    /** treat vector 14 as a complex number and conjugate it */
    public void conjugate_14() {
        y_14 *= -1;
    }

    /** copy the 0 vector into the 14 vector */
    public void copy_from_0_to_14() {
        x_14 = x_0;
        y_14 = y_0;
    }

    /** copy the 1 vector into the 14 vector */
    public void copy_from_1_to_14() {
        x_14 = x_1;
        y_14 = y_1;
    }

    /** copy the 10 vector into the 14 vector */
    public void copy_from_10_to_14() {
        x_14 = x_10;
        y_14 = y_10;
    }

    /** copy the 11 vector into the 14 vector */
    public void copy_from_11_to_14() {
        x_14 = x_11;
        y_14 = y_11;
    }

    /** copy the 12 vector into the 14 vector */
    public void copy_from_12_to_14() {
        x_14 = x_12;
        y_14 = y_12;
    }

    /** copy the 13 vector into the 14 vector */
    public void copy_from_13_to_14() {
        x_14 = x_13;
        y_14 = y_13;
    }

    /** copy the 14 vector into the 0 vector */
    public void copy_from_14_to_0() {
        x_0 = x_14;
        y_0 = y_14;
    }

    /** copy the 14 vector into the 1 vector */
    public void copy_from_14_to_1() {
        x_1 = x_14;
        y_1 = y_14;
    }

    /** copy the 14 vector into the 10 vector */
    public void copy_from_14_to_10() {
        x_10 = x_14;
        y_10 = y_14;
    }

    /** copy the 14 vector into the 11 vector */
    public void copy_from_14_to_11() {
        x_11 = x_14;
        y_11 = y_14;
    }

    /** copy the 14 vector into the 12 vector */
    public void copy_from_14_to_12() {
        x_12 = x_14;
        y_12 = y_14;
    }

    /** copy the 14 vector into the 13 vector */
    public void copy_from_14_to_13() {
        x_13 = x_14;
        y_13 = y_14;
    }

    /** copy the 14 vector into the 2 vector */
    public void copy_from_14_to_2() {
        x_2 = x_14;
        y_2 = y_14;
    }

    /** copy the 14 vector into the 3 vector */
    public void copy_from_14_to_3() {
        x_3 = x_14;
        y_3 = y_14;
    }

    /** copy the 14 vector into the 4 vector */
    public void copy_from_14_to_4() {
        x_4 = x_14;
        y_4 = y_14;
    }

    /** copy the 14 vector into the 5 vector */
    public void copy_from_14_to_5() {
        x_5 = x_14;
        y_5 = y_14;
    }

    /** copy the 14 vector into the 6 vector */
    public void copy_from_14_to_6() {
        x_6 = x_14;
        y_6 = y_14;
    }

    /** copy the 14 vector into the 7 vector */
    public void copy_from_14_to_7() {
        x_7 = x_14;
        y_7 = y_14;
    }

    /** copy the 14 vector into the 8 vector */
    public void copy_from_14_to_8() {
        x_8 = x_14;
        y_8 = y_14;
    }

    /** copy the 14 vector into the 9 vector */
    public void copy_from_14_to_9() {
        x_9 = x_14;
        y_9 = y_14;
    }

    /** copy the 2 vector into the 14 vector */
    public void copy_from_2_to_14() {
        x_14 = x_2;
        y_14 = y_2;
    }

    /** copy the 3 vector into the 14 vector */
    public void copy_from_3_to_14() {
        x_14 = x_3;
        y_14 = y_3;
    }

    /** copy the 4 vector into the 14 vector */
    public void copy_from_4_to_14() {
        x_14 = x_4;
        y_14 = y_4;
    }

    /** copy the 5 vector into the 14 vector */
    public void copy_from_5_to_14() {
        x_14 = x_5;
        y_14 = y_5;
    }

    /** copy the 6 vector into the 14 vector */
    public void copy_from_6_to_14() {
        x_14 = x_6;
        y_14 = y_6;
    }

    /** copy the 7 vector into the 14 vector */
    public void copy_from_7_to_14() {
        x_14 = x_7;
        y_14 = y_7;
    }

    /** copy the 8 vector into the 14 vector */
    public void copy_from_8_to_14() {
        x_14 = x_8;
        y_14 = y_8;
    }

    /** copy the 9 vector into the 14 vector */
    public void copy_from_9_to_14() {
        x_14 = x_9;
        y_14 = y_9;
    }

    /** find the determinate of the 2x2 matrix formed by vector 0 and vector 14 where the vectors are columns */
    public double det_0_14() {
        return x_0 * y_14 - y_0 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 1 and vector 14 where the vectors are columns */
    public double det_1_14() {
        return x_1 * y_14 - y_1 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 10 and vector 14 where the vectors are columns */
    public double det_10_14() {
        return x_10 * y_14 - y_10 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 11 and vector 14 where the vectors are columns */
    public double det_11_14() {
        return x_11 * y_14 - y_11 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 12 and vector 14 where the vectors are columns */
    public double det_12_14() {
        return x_12 * y_14 - y_12 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 13 and vector 14 where the vectors are columns */
    public double det_13_14() {
        return x_13 * y_14 - y_13 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 0 where the vectors are columns */
    public double det_14_0() {
        return x_14 * y_0 - y_14 * x_0;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 1 where the vectors are columns */
    public double det_14_1() {
        return x_14 * y_1 - y_14 * x_1;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 10 where the vectors are columns */
    public double det_14_10() {
        return x_14 * y_10 - y_14 * x_10;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 11 where the vectors are columns */
    public double det_14_11() {
        return x_14 * y_11 - y_14 * x_11;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 12 where the vectors are columns */
    public double det_14_12() {
        return x_14 * y_12 - y_14 * x_12;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 13 where the vectors are columns */
    public double det_14_13() {
        return x_14 * y_13 - y_14 * x_13;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 2 where the vectors are columns */
    public double det_14_2() {
        return x_14 * y_2 - y_14 * x_2;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 3 where the vectors are columns */
    public double det_14_3() {
        return x_14 * y_3 - y_14 * x_3;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 4 where the vectors are columns */
    public double det_14_4() {
        return x_14 * y_4 - y_14 * x_4;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 5 where the vectors are columns */
    public double det_14_5() {
        return x_14 * y_5 - y_14 * x_5;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 6 where the vectors are columns */
    public double det_14_6() {
        return x_14 * y_6 - y_14 * x_6;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 7 where the vectors are columns */
    public double det_14_7() {
        return x_14 * y_7 - y_14 * x_7;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 8 where the vectors are columns */
    public double det_14_8() {
        return x_14 * y_8 - y_14 * x_8;
    }

    /** find the determinate of the 2x2 matrix formed by vector 14 and vector 9 where the vectors are columns */
    public double det_14_9() {
        return x_14 * y_9 - y_14 * x_9;
    }

    /** find the determinate of the 2x2 matrix formed by vector 2 and vector 14 where the vectors are columns */
    public double det_2_14() {
        return x_2 * y_14 - y_2 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 3 and vector 14 where the vectors are columns */
    public double det_3_14() {
        return x_3 * y_14 - y_3 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 4 and vector 14 where the vectors are columns */
    public double det_4_14() {
        return x_4 * y_14 - y_4 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 5 and vector 14 where the vectors are columns */
    public double det_5_14() {
        return x_5 * y_14 - y_5 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 6 and vector 14 where the vectors are columns */
    public double det_6_14() {
        return x_6 * y_14 - y_6 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 7 and vector 14 where the vectors are columns */
    public double det_7_14() {
        return x_7 * y_14 - y_7 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 8 and vector 14 where the vectors are columns */
    public double det_8_14() {
        return x_8 * y_14 - y_8 * x_14;
    }

    /** find the determinate of the 2x2 matrix formed by vector 9 and vector 14 where the vectors are columns */
    public double det_9_14() {
        return x_9 * y_14 - y_9 * x_14;
    }

    /** divide vector 14 by the given scalar */
    public void div_14_by(final double s) {
        x_14 /= s;
        y_14 /= s;
    }

    /** return the dot product between the 14 and 0 vectors */
    public double dot_0_14() {
        return x_14 * x_0 + y_14 * y_0;
    }

    /** return the dot product between the 14 and 1 vectors */
    public double dot_1_14() {
        return x_14 * x_1 + y_14 * y_1;
    }

    /** return the dot product between the 14 and 10 vectors */
    public double dot_10_14() {
        return x_14 * x_10 + y_14 * y_10;
    }

    /** return the dot product between the 14 and 11 vectors */
    public double dot_11_14() {
        return x_14 * x_11 + y_14 * y_11;
    }

    /** return the dot product between the 14 and 12 vectors */
    public double dot_12_14() {
        return x_14 * x_12 + y_14 * y_12;
    }

    /** return the dot product between the 14 and 13 vectors */
    public double dot_13_14() {
        return x_14 * x_13 + y_14 * y_13;
    }

    /** return the dot product between the 0 and 14 vectors */
    public double dot_14_0() {
        return x_0 * x_14 + y_0 * y_14;
    }

    /** return the dot product between the 1 and 14 vectors */
    public double dot_14_1() {
        return x_1 * x_14 + y_1 * y_14;
    }

    /** return the dot product between the 10 and 14 vectors */
    public double dot_14_10() {
        return x_10 * x_14 + y_10 * y_14;
    }

    /** return the dot product between the 11 and 14 vectors */
    public double dot_14_11() {
        return x_11 * x_14 + y_11 * y_14;
    }

    /** return the dot product between the 12 and 14 vectors */
    public double dot_14_12() {
        return x_12 * x_14 + y_12 * y_14;
    }

    /** return the dot product between the 13 and 14 vectors */
    public double dot_14_13() {
        return x_13 * x_14 + y_13 * y_14;
    }

    /** return the dot product between the 2 and 14 vectors */
    public double dot_14_2() {
        return x_2 * x_14 + y_2 * y_14;
    }

    /** return the dot product between the 3 and 14 vectors */
    public double dot_14_3() {
        return x_3 * x_14 + y_3 * y_14;
    }

    /** return the dot product between the 4 and 14 vectors */
    public double dot_14_4() {
        return x_4 * x_14 + y_4 * y_14;
    }

    /** return the dot product between the 5 and 14 vectors */
    public double dot_14_5() {
        return x_5 * x_14 + y_5 * y_14;
    }

    /** return the dot product between the 6 and 14 vectors */
    public double dot_14_6() {
        return x_6 * x_14 + y_6 * y_14;
    }

    /** return the dot product between the 7 and 14 vectors */
    public double dot_14_7() {
        return x_7 * x_14 + y_7 * y_14;
    }

    /** return the dot product between the 8 and 14 vectors */
    public double dot_14_8() {
        return x_8 * x_14 + y_8 * y_14;
    }

    /** return the dot product between the 9 and 14 vectors */
    public double dot_14_9() {
        return x_9 * x_14 + y_9 * y_14;
    }

    /** return the dot product between the 14 and 2 vectors */
    public double dot_2_14() {
        return x_14 * x_2 + y_14 * y_2;
    }

    /** return the dot product between the 14 and 3 vectors */
    public double dot_3_14() {
        return x_14 * x_3 + y_14 * y_3;
    }

    /** return the dot product between the 14 and 4 vectors */
    public double dot_4_14() {
        return x_14 * x_4 + y_14 * y_4;
    }

    /** return the dot product between the 14 and 5 vectors */
    public double dot_5_14() {
        return x_14 * x_5 + y_14 * y_5;
    }

    /** return the dot product between the 14 and 6 vectors */
    public double dot_6_14() {
        return x_14 * x_6 + y_14 * y_6;
    }

    /** return the dot product between the 14 and 7 vectors */
    public double dot_7_14() {
        return x_14 * x_7 + y_14 * y_7;
    }

    /** return the dot product between the 14 and 8 vectors */
    public double dot_8_14() {
        return x_14 * x_8 + y_14 * y_8;
    }

    /** return the dot product between the 14 and 9 vectors */
    public double dot_9_14() {
        return x_14 * x_9 + y_14 * y_9;
    }

    /** extract the 14-vector into the given output array starting at the given offset */
    public void extract_14(final double[] output, final int offset) {
        output[offset + 0] = x_14;
        output[offset + 1] = y_14;
    }

    /** inject the given input starting at the given offset into the 14-vector */
    public void inject_14(final double[] input, final int offset) {
        x_14 = input[offset + 0];
        y_14 = input[offset + 1];
    }

    /** invert the 2x2 matrix formed by vector 0 and vector 14 where the vectors are columns */
    public boolean invert_0_14() {
        final double t = x_0;
        double invdet = x_0 * y_14 - y_0 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_0 *= -1 * invdet;
        x_0 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 1 and vector 14 where the vectors are columns */
    public boolean invert_1_14() {
        final double t = x_1;
        double invdet = x_1 * y_14 - y_1 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_1 *= -1 * invdet;
        x_1 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 14 where the vectors are columns */
    public boolean invert_10_14() {
        final double t = x_10;
        double invdet = x_10 * y_14 - y_10 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 11 and vector 14 where the vectors are columns */
    public boolean invert_11_14() {
        final double t = x_11;
        double invdet = x_11 * y_14 - y_11 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_11 *= -1 * invdet;
        x_11 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 12 and vector 14 where the vectors are columns */
    public boolean invert_12_14() {
        final double t = x_12;
        double invdet = x_12 * y_14 - y_12 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_12 *= -1 * invdet;
        x_12 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 13 and vector 14 where the vectors are columns */
    public boolean invert_13_14() {
        final double t = x_13;
        double invdet = x_13 * y_14 - y_13 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_13 *= -1 * invdet;
        x_13 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 0 where the vectors are columns */
    public boolean invert_14_0() {
        final double t = x_14;
        double invdet = x_14 * y_0 - y_14 * x_0;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_0 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_0 * invdet;
        y_0 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 1 where the vectors are columns */
    public boolean invert_14_1() {
        final double t = x_14;
        double invdet = x_14 * y_1 - y_14 * x_1;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_1 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_1 * invdet;
        y_1 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 10 where the vectors are columns */
    public boolean invert_14_10() {
        final double t = x_14;
        double invdet = x_14 * y_10 - y_14 * x_10;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_10 * invdet;
        y_10 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 11 where the vectors are columns */
    public boolean invert_14_11() {
        final double t = x_14;
        double invdet = x_14 * y_11 - y_14 * x_11;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_11 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_11 * invdet;
        y_11 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 12 where the vectors are columns */
    public boolean invert_14_12() {
        final double t = x_14;
        double invdet = x_14 * y_12 - y_14 * x_12;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_12 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_12 * invdet;
        y_12 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 13 where the vectors are columns */
    public boolean invert_14_13() {
        final double t = x_14;
        double invdet = x_14 * y_13 - y_14 * x_13;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_13 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_13 * invdet;
        y_13 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 2 where the vectors are columns */
    public boolean invert_14_2() {
        final double t = x_14;
        double invdet = x_14 * y_2 - y_14 * x_2;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_2 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_2 * invdet;
        y_2 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 3 where the vectors are columns */
    public boolean invert_14_3() {
        final double t = x_14;
        double invdet = x_14 * y_3 - y_14 * x_3;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_3 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_3 * invdet;
        y_3 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 4 where the vectors are columns */
    public boolean invert_14_4() {
        final double t = x_14;
        double invdet = x_14 * y_4 - y_14 * x_4;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_4 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_4 * invdet;
        y_4 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 5 where the vectors are columns */
    public boolean invert_14_5() {
        final double t = x_14;
        double invdet = x_14 * y_5 - y_14 * x_5;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_5 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_5 * invdet;
        y_5 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 6 where the vectors are columns */
    public boolean invert_14_6() {
        final double t = x_14;
        double invdet = x_14 * y_6 - y_14 * x_6;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_6 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_6 * invdet;
        y_6 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 7 where the vectors are columns */
    public boolean invert_14_7() {
        final double t = x_14;
        double invdet = x_14 * y_7 - y_14 * x_7;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_7 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_7 * invdet;
        y_7 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 8 where the vectors are columns */
    public boolean invert_14_8() {
        final double t = x_14;
        double invdet = x_14 * y_8 - y_14 * x_8;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_8 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_8 * invdet;
        y_8 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 14 and vector 9 where the vectors are columns */
    public boolean invert_14_9() {
        final double t = x_14;
        double invdet = x_14 * y_9 - y_14 * x_9;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_9 *= -1 * invdet;
        y_14 *= -1 * invdet;
        x_14 = y_9 * invdet;
        y_9 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 2 and vector 14 where the vectors are columns */
    public boolean invert_2_14() {
        final double t = x_2;
        double invdet = x_2 * y_14 - y_2 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_2 *= -1 * invdet;
        x_2 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 3 and vector 14 where the vectors are columns */
    public boolean invert_3_14() {
        final double t = x_3;
        double invdet = x_3 * y_14 - y_3 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_3 *= -1 * invdet;
        x_3 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 4 and vector 14 where the vectors are columns */
    public boolean invert_4_14() {
        final double t = x_4;
        double invdet = x_4 * y_14 - y_4 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_4 *= -1 * invdet;
        x_4 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 5 and vector 14 where the vectors are columns */
    public boolean invert_5_14() {
        final double t = x_5;
        double invdet = x_5 * y_14 - y_5 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_5 *= -1 * invdet;
        x_5 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 6 and vector 14 where the vectors are columns */
    public boolean invert_6_14() {
        final double t = x_6;
        double invdet = x_6 * y_14 - y_6 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_6 *= -1 * invdet;
        x_6 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 7 and vector 14 where the vectors are columns */
    public boolean invert_7_14() {
        final double t = x_7;
        double invdet = x_7 * y_14 - y_7 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_7 *= -1 * invdet;
        x_7 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 8 and vector 14 where the vectors are columns */
    public boolean invert_8_14() {
        final double t = x_8;
        double invdet = x_8 * y_14 - y_8 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_8 *= -1 * invdet;
        x_8 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 9 and vector 14 where the vectors are columns */
    public boolean invert_9_14() {
        final double t = x_9;
        double invdet = x_9 * y_14 - y_9 * x_14;
        if (Math.abs(invdet) < ZERO_LIMIT) {
            return false;
        }
        invdet = 1.0 / invdet;
        x_14 *= -1 * invdet;
        y_9 *= -1 * invdet;
        x_9 = y_14 * invdet;
        y_14 = t * invdet;
        return true;
    }

    /** is the 14-vector the origin */
    public boolean is_14_zero() {
        if (Math.abs(x_14) < ZERO_LIMIT && Math.abs(y_14) < ZERO_LIMIT) {
            return true;
        }
        return false;
    }

    /** compute and return the length of vector 14 */
    public double length_14() {
        double d = 0.0;
        d += x_14 * x_14;
        d += y_14 * y_14;
        return Math.sqrt(d);
    }

    /** multiply vector 14 by the given scalar */
    public void mult_14_by(final double s) {
        x_14 *= s;
        y_14 *= s;
    }

    /** normalize the 14-vector if it is not the origin */
    public boolean normalize_14() {
        double d = 0.0;
        d += x_14 * x_14;
        d += y_14 * y_14;
        if (Math.abs(d) < ZERO_LIMIT) {
            return false;
        }
        d = Math.sqrt(d);
        d = 1.0 / d;
        x_14 *= d;
        y_14 *= d;
        return true;
    }

    /** set the 14-vector to the given (x,y) */
    public void set_14(final double x, final double y) {
        x_14 = x;
        y_14 = y;
    }

    /** set the 14 vector to the complex number corresponding to the given angle */
    public void set_14_by_angle(final double theta) {
        x_14 = Math.cos(theta);
        y_14 = Math.sin(theta);
    }

    /** set the matrixed form by the 0 vector and 14 vector (by column) */
    public void set_matrix_0_14(final double x0, final double y0, final double x1, final double y1) {
        x_0 = x0;
        y_0 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 1 vector and 14 vector (by column) */
    public void set_matrix_1_14(final double x0, final double y0, final double x1, final double y1) {
        x_1 = x0;
        y_1 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 10 vector and 14 vector (by column) */
    public void set_matrix_10_14(final double x0, final double y0, final double x1, final double y1) {
        x_10 = x0;
        y_10 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 11 vector and 14 vector (by column) */
    public void set_matrix_11_14(final double x0, final double y0, final double x1, final double y1) {
        x_11 = x0;
        y_11 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 12 vector and 14 vector (by column) */
    public void set_matrix_12_14(final double x0, final double y0, final double x1, final double y1) {
        x_12 = x0;
        y_12 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 13 vector and 14 vector (by column) */
    public void set_matrix_13_14(final double x0, final double y0, final double x1, final double y1) {
        x_13 = x0;
        y_13 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 14 vector and 0 vector (by column) */
    public void set_matrix_14_0(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_0 = x1;
        y_0 = y1;
    }

    /** set the matrixed form by the 14 vector and 1 vector (by column) */
    public void set_matrix_14_1(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_1 = x1;
        y_1 = y1;
    }

    /** set the matrixed form by the 14 vector and 10 vector (by column) */
    public void set_matrix_14_10(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_10 = x1;
        y_10 = y1;
    }

    /** set the matrixed form by the 14 vector and 11 vector (by column) */
    public void set_matrix_14_11(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_11 = x1;
        y_11 = y1;
    }

    /** set the matrixed form by the 14 vector and 12 vector (by column) */
    public void set_matrix_14_12(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_12 = x1;
        y_12 = y1;
    }

    /** set the matrixed form by the 14 vector and 13 vector (by column) */
    public void set_matrix_14_13(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_13 = x1;
        y_13 = y1;
    }

    /** set the matrixed form by the 14 vector and 2 vector (by column) */
    public void set_matrix_14_2(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_2 = x1;
        y_2 = y1;
    }

    /** set the matrixed form by the 14 vector and 3 vector (by column) */
    public void set_matrix_14_3(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_3 = x1;
        y_3 = y1;
    }

    /** set the matrixed form by the 14 vector and 4 vector (by column) */
    public void set_matrix_14_4(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_4 = x1;
        y_4 = y1;
    }

    /** set the matrixed form by the 14 vector and 5 vector (by column) */
    public void set_matrix_14_5(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_5 = x1;
        y_5 = y1;
    }

    /** set the matrixed form by the 14 vector and 6 vector (by column) */
    public void set_matrix_14_6(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_6 = x1;
        y_6 = y1;
    }

    /** set the matrixed form by the 14 vector and 7 vector (by column) */
    public void set_matrix_14_7(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_7 = x1;
        y_7 = y1;
    }

    /** set the matrixed form by the 14 vector and 8 vector (by column) */
    public void set_matrix_14_8(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_8 = x1;
        y_8 = y1;
    }

    /** set the matrixed form by the 14 vector and 9 vector (by column) */
    public void set_matrix_14_9(final double x0, final double y0, final double x1, final double y1) {
        x_14 = x0;
        y_14 = y0;
        x_9 = x1;
        y_9 = y1;
    }

    /** set the matrixed form by the 2 vector and 14 vector (by column) */
    public void set_matrix_2_14(final double x0, final double y0, final double x1, final double y1) {
        x_2 = x0;
        y_2 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 3 vector and 14 vector (by column) */
    public void set_matrix_3_14(final double x0, final double y0, final double x1, final double y1) {
        x_3 = x0;
        y_3 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 4 vector and 14 vector (by column) */
    public void set_matrix_4_14(final double x0, final double y0, final double x1, final double y1) {
        x_4 = x0;
        y_4 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 5 vector and 14 vector (by column) */
    public void set_matrix_5_14(final double x0, final double y0, final double x1, final double y1) {
        x_5 = x0;
        y_5 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 6 vector and 14 vector (by column) */
    public void set_matrix_6_14(final double x0, final double y0, final double x1, final double y1) {
        x_6 = x0;
        y_6 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 7 vector and 14 vector (by column) */
    public void set_matrix_7_14(final double x0, final double y0, final double x1, final double y1) {
        x_7 = x0;
        y_7 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 8 vector and 14 vector (by column) */
    public void set_matrix_8_14(final double x0, final double y0, final double x1, final double y1) {
        x_8 = x0;
        y_8 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** set the matrixed form by the 9 vector and 14 vector (by column) */
    public void set_matrix_9_14(final double x0, final double y0, final double x1, final double y1) {
        x_9 = x0;
        y_9 = y0;
        x_14 = x1;
        y_14 = y1;
    }

    /** subtract the 14 and 0 together and store the result to the 14 vector */
    public void sub_0_from_14() {
        x_14 -= x_0;
        y_14 -= y_0;
    }

    /** subtract the 14 and 1 together and store the result to the 14 vector */
    public void sub_1_from_14() {
        x_14 -= x_1;
        y_14 -= y_1;
    }

    /** subtract the 14 and 10 together and store the result to the 14 vector */
    public void sub_10_from_14() {
        x_14 -= x_10;
        y_14 -= y_10;
    }

    /** subtract the 14 and 11 together and store the result to the 14 vector */
    public void sub_11_from_14() {
        x_14 -= x_11;
        y_14 -= y_11;
    }

    /** subtract the 14 and 12 together and store the result to the 14 vector */
    public void sub_12_from_14() {
        x_14 -= x_12;
        y_14 -= y_12;
    }

    /** subtract the 14 and 13 together and store the result to the 14 vector */
    public void sub_13_from_14() {
        x_14 -= x_13;
        y_14 -= y_13;
    }

    /** subtract the 0 and 14 together and store the result to the 0 vector */
    public void sub_14_from_0() {
        x_0 -= x_14;
        y_0 -= y_14;
    }

    /** subtract the 1 and 14 together and store the result to the 1 vector */
    public void sub_14_from_1() {
        x_1 -= x_14;
        y_1 -= y_14;
    }

    /** subtract the 10 and 14 together and store the result to the 10 vector */
    public void sub_14_from_10() {
        x_10 -= x_14;
        y_10 -= y_14;
    }

    /** subtract the 11 and 14 together and store the result to the 11 vector */
    public void sub_14_from_11() {
        x_11 -= x_14;
        y_11 -= y_14;
    }

    /** subtract the 12 and 14 together and store the result to the 12 vector */
    public void sub_14_from_12() {
        x_12 -= x_14;
        y_12 -= y_14;
    }

    /** subtract the 13 and 14 together and store the result to the 13 vector */
    public void sub_14_from_13() {
        x_13 -= x_14;
        y_13 -= y_14;
    }

    /** subtract the 2 and 14 together and store the result to the 2 vector */
    public void sub_14_from_2() {
        x_2 -= x_14;
        y_2 -= y_14;
    }

    /** subtract the 3 and 14 together and store the result to the 3 vector */
    public void sub_14_from_3() {
        x_3 -= x_14;
        y_3 -= y_14;
    }

    /** subtract the 4 and 14 together and store the result to the 4 vector */
    public void sub_14_from_4() {
        x_4 -= x_14;
        y_4 -= y_14;
    }

    /** subtract the 5 and 14 together and store the result to the 5 vector */
    public void sub_14_from_5() {
        x_5 -= x_14;
        y_5 -= y_14;
    }

    /** subtract the 6 and 14 together and store the result to the 6 vector */
    public void sub_14_from_6() {
        x_6 -= x_14;
        y_6 -= y_14;
    }

    /** subtract the 7 and 14 together and store the result to the 7 vector */
    public void sub_14_from_7() {
        x_7 -= x_14;
        y_7 -= y_14;
    }

    /** subtract the 8 and 14 together and store the result to the 8 vector */
    public void sub_14_from_8() {
        x_8 -= x_14;
        y_8 -= y_14;
    }

    /** subtract the 9 and 14 together and store the result to the 9 vector */
    public void sub_14_from_9() {
        x_9 -= x_14;
        y_9 -= y_14;
    }

    /** subtract the 14 and 2 together and store the result to the 14 vector */
    public void sub_2_from_14() {
        x_14 -= x_2;
        y_14 -= y_2;
    }

    /** subtract the 14 and 3 together and store the result to the 14 vector */
    public void sub_3_from_14() {
        x_14 -= x_3;
        y_14 -= y_3;
    }

    /** subtract the 14 and 4 together and store the result to the 14 vector */
    public void sub_4_from_14() {
        x_14 -= x_4;
        y_14 -= y_4;
    }

    /** subtract the 14 and 5 together and store the result to the 14 vector */
    public void sub_5_from_14() {
        x_14 -= x_5;
        y_14 -= y_5;
    }

    /** subtract the 14 and 6 together and store the result to the 14 vector */
    public void sub_6_from_14() {
        x_14 -= x_6;
        y_14 -= y_6;
    }

    /** subtract the 14 and 7 together and store the result to the 14 vector */
    public void sub_7_from_14() {
        x_14 -= x_7;
        y_14 -= y_7;
    }

    /** subtract the 14 and 8 together and store the result to the 14 vector */
    public void sub_8_from_14() {
        x_14 -= x_8;
        y_14 -= y_8;
    }

    /** subtract the 14 and 9 together and store the result to the 14 vector */
    public void sub_9_from_14() {
        x_14 -= x_9;
        y_14 -= y_9;
    }

    /** transform the 0 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_0_by_1_14() {
        final double t = x_1 * x_0 + x_14 * y_0;
        y_0 = y_1 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_0_by_10_14() {
        final double t = x_10 * x_0 + x_14 * y_0;
        y_0 = y_10 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_0_by_11_14() {
        final double t = x_11 * x_0 + x_14 * y_0;
        y_0 = y_11 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_0_by_12_14() {
        final double t = x_12 * x_0 + x_14 * y_0;
        y_0 = y_12 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_0_by_13_14() {
        final double t = x_13 * x_0 + x_14 * y_0;
        y_0 = y_13 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_0_by_14_1() {
        final double t = x_14 * x_0 + x_1 * y_0;
        y_0 = y_14 * x_0 + y_1 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_0_by_14_10() {
        final double t = x_14 * x_0 + x_10 * y_0;
        y_0 = y_14 * x_0 + y_10 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_0_by_14_11() {
        final double t = x_14 * x_0 + x_11 * y_0;
        y_0 = y_14 * x_0 + y_11 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_0_by_14_12() {
        final double t = x_14 * x_0 + x_12 * y_0;
        y_0 = y_14 * x_0 + y_12 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_0_by_14_13() {
        final double t = x_14 * x_0 + x_13 * y_0;
        y_0 = y_14 * x_0 + y_13 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_0_by_14_2() {
        final double t = x_14 * x_0 + x_2 * y_0;
        y_0 = y_14 * x_0 + y_2 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_0_by_14_3() {
        final double t = x_14 * x_0 + x_3 * y_0;
        y_0 = y_14 * x_0 + y_3 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_0_by_14_4() {
        final double t = x_14 * x_0 + x_4 * y_0;
        y_0 = y_14 * x_0 + y_4 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_0_by_14_5() {
        final double t = x_14 * x_0 + x_5 * y_0;
        y_0 = y_14 * x_0 + y_5 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_0_by_14_6() {
        final double t = x_14 * x_0 + x_6 * y_0;
        y_0 = y_14 * x_0 + y_6 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_0_by_14_7() {
        final double t = x_14 * x_0 + x_7 * y_0;
        y_0 = y_14 * x_0 + y_7 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_0_by_14_8() {
        final double t = x_14 * x_0 + x_8 * y_0;
        y_0 = y_14 * x_0 + y_8 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_0_by_14_9() {
        final double t = x_14 * x_0 + x_9 * y_0;
        y_0 = y_14 * x_0 + y_9 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_0_by_2_14() {
        final double t = x_2 * x_0 + x_14 * y_0;
        y_0 = y_2 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_0_by_3_14() {
        final double t = x_3 * x_0 + x_14 * y_0;
        y_0 = y_3 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_0_by_4_14() {
        final double t = x_4 * x_0 + x_14 * y_0;
        y_0 = y_4 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_0_by_5_14() {
        final double t = x_5 * x_0 + x_14 * y_0;
        y_0 = y_5 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_0_by_6_14() {
        final double t = x_6 * x_0 + x_14 * y_0;
        y_0 = y_6 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_0_by_7_14() {
        final double t = x_7 * x_0 + x_14 * y_0;
        y_0 = y_7 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_0_by_8_14() {
        final double t = x_8 * x_0 + x_14 * y_0;
        y_0 = y_8 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_0_by_9_14() {
        final double t = x_9 * x_0 + x_14 * y_0;
        y_0 = y_9 * x_0 + y_14 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_1_by_0_14() {
        final double t = x_0 * x_1 + x_14 * y_1;
        y_1 = y_0 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_1_by_10_14() {
        final double t = x_10 * x_1 + x_14 * y_1;
        y_1 = y_10 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_1_by_11_14() {
        final double t = x_11 * x_1 + x_14 * y_1;
        y_1 = y_11 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_1_by_12_14() {
        final double t = x_12 * x_1 + x_14 * y_1;
        y_1 = y_12 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_1_by_13_14() {
        final double t = x_13 * x_1 + x_14 * y_1;
        y_1 = y_13 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_1_by_14_0() {
        final double t = x_14 * x_1 + x_0 * y_1;
        y_1 = y_14 * x_1 + y_0 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_1_by_14_10() {
        final double t = x_14 * x_1 + x_10 * y_1;
        y_1 = y_14 * x_1 + y_10 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_1_by_14_11() {
        final double t = x_14 * x_1 + x_11 * y_1;
        y_1 = y_14 * x_1 + y_11 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_1_by_14_12() {
        final double t = x_14 * x_1 + x_12 * y_1;
        y_1 = y_14 * x_1 + y_12 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_1_by_14_13() {
        final double t = x_14 * x_1 + x_13 * y_1;
        y_1 = y_14 * x_1 + y_13 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_1_by_14_2() {
        final double t = x_14 * x_1 + x_2 * y_1;
        y_1 = y_14 * x_1 + y_2 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_1_by_14_3() {
        final double t = x_14 * x_1 + x_3 * y_1;
        y_1 = y_14 * x_1 + y_3 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_1_by_14_4() {
        final double t = x_14 * x_1 + x_4 * y_1;
        y_1 = y_14 * x_1 + y_4 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_1_by_14_5() {
        final double t = x_14 * x_1 + x_5 * y_1;
        y_1 = y_14 * x_1 + y_5 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_1_by_14_6() {
        final double t = x_14 * x_1 + x_6 * y_1;
        y_1 = y_14 * x_1 + y_6 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_1_by_14_7() {
        final double t = x_14 * x_1 + x_7 * y_1;
        y_1 = y_14 * x_1 + y_7 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_1_by_14_8() {
        final double t = x_14 * x_1 + x_8 * y_1;
        y_1 = y_14 * x_1 + y_8 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_1_by_14_9() {
        final double t = x_14 * x_1 + x_9 * y_1;
        y_1 = y_14 * x_1 + y_9 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_1_by_2_14() {
        final double t = x_2 * x_1 + x_14 * y_1;
        y_1 = y_2 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_1_by_3_14() {
        final double t = x_3 * x_1 + x_14 * y_1;
        y_1 = y_3 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_1_by_4_14() {
        final double t = x_4 * x_1 + x_14 * y_1;
        y_1 = y_4 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_1_by_5_14() {
        final double t = x_5 * x_1 + x_14 * y_1;
        y_1 = y_5 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_1_by_6_14() {
        final double t = x_6 * x_1 + x_14 * y_1;
        y_1 = y_6 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_1_by_7_14() {
        final double t = x_7 * x_1 + x_14 * y_1;
        y_1 = y_7 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_1_by_8_14() {
        final double t = x_8 * x_1 + x_14 * y_1;
        y_1 = y_8 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_1_by_9_14() {
        final double t = x_9 * x_1 + x_14 * y_1;
        y_1 = y_9 * x_1 + y_14 * y_1;
        x_1 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_10_by_0_14() {
        final double t = x_0 * x_10 + x_14 * y_10;
        y_10 = y_0 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_10_by_1_14() {
        final double t = x_1 * x_10 + x_14 * y_10;
        y_10 = y_1 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_10_by_11_14() {
        final double t = x_11 * x_10 + x_14 * y_10;
        y_10 = y_11 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_10_by_12_14() {
        final double t = x_12 * x_10 + x_14 * y_10;
        y_10 = y_12 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_10_by_13_14() {
        final double t = x_13 * x_10 + x_14 * y_10;
        y_10 = y_13 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_10_by_14_0() {
        final double t = x_14 * x_10 + x_0 * y_10;
        y_10 = y_14 * x_10 + y_0 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_10_by_14_1() {
        final double t = x_14 * x_10 + x_1 * y_10;
        y_10 = y_14 * x_10 + y_1 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_10_by_14_11() {
        final double t = x_14 * x_10 + x_11 * y_10;
        y_10 = y_14 * x_10 + y_11 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_10_by_14_12() {
        final double t = x_14 * x_10 + x_12 * y_10;
        y_10 = y_14 * x_10 + y_12 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_10_by_14_13() {
        final double t = x_14 * x_10 + x_13 * y_10;
        y_10 = y_14 * x_10 + y_13 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_10_by_14_2() {
        final double t = x_14 * x_10 + x_2 * y_10;
        y_10 = y_14 * x_10 + y_2 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_10_by_14_3() {
        final double t = x_14 * x_10 + x_3 * y_10;
        y_10 = y_14 * x_10 + y_3 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_10_by_14_4() {
        final double t = x_14 * x_10 + x_4 * y_10;
        y_10 = y_14 * x_10 + y_4 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_10_by_14_5() {
        final double t = x_14 * x_10 + x_5 * y_10;
        y_10 = y_14 * x_10 + y_5 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_10_by_14_6() {
        final double t = x_14 * x_10 + x_6 * y_10;
        y_10 = y_14 * x_10 + y_6 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_10_by_14_7() {
        final double t = x_14 * x_10 + x_7 * y_10;
        y_10 = y_14 * x_10 + y_7 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_10_by_14_8() {
        final double t = x_14 * x_10 + x_8 * y_10;
        y_10 = y_14 * x_10 + y_8 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_10_by_14_9() {
        final double t = x_14 * x_10 + x_9 * y_10;
        y_10 = y_14 * x_10 + y_9 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_10_by_2_14() {
        final double t = x_2 * x_10 + x_14 * y_10;
        y_10 = y_2 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_10_by_3_14() {
        final double t = x_3 * x_10 + x_14 * y_10;
        y_10 = y_3 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_10_by_4_14() {
        final double t = x_4 * x_10 + x_14 * y_10;
        y_10 = y_4 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_10_by_5_14() {
        final double t = x_5 * x_10 + x_14 * y_10;
        y_10 = y_5 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_10_by_6_14() {
        final double t = x_6 * x_10 + x_14 * y_10;
        y_10 = y_6 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_10_by_7_14() {
        final double t = x_7 * x_10 + x_14 * y_10;
        y_10 = y_7 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_10_by_8_14() {
        final double t = x_8 * x_10 + x_14 * y_10;
        y_10 = y_8 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_10_by_9_14() {
        final double t = x_9 * x_10 + x_14 * y_10;
        y_10 = y_9 * x_10 + y_14 * y_10;
        x_10 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_11_by_0_14() {
        final double t = x_0 * x_11 + x_14 * y_11;
        y_11 = y_0 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_11_by_1_14() {
        final double t = x_1 * x_11 + x_14 * y_11;
        y_11 = y_1 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_11_by_10_14() {
        final double t = x_10 * x_11 + x_14 * y_11;
        y_11 = y_10 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_11_by_12_14() {
        final double t = x_12 * x_11 + x_14 * y_11;
        y_11 = y_12 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_11_by_13_14() {
        final double t = x_13 * x_11 + x_14 * y_11;
        y_11 = y_13 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_11_by_14_0() {
        final double t = x_14 * x_11 + x_0 * y_11;
        y_11 = y_14 * x_11 + y_0 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_11_by_14_1() {
        final double t = x_14 * x_11 + x_1 * y_11;
        y_11 = y_14 * x_11 + y_1 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_11_by_14_10() {
        final double t = x_14 * x_11 + x_10 * y_11;
        y_11 = y_14 * x_11 + y_10 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_11_by_14_12() {
        final double t = x_14 * x_11 + x_12 * y_11;
        y_11 = y_14 * x_11 + y_12 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_11_by_14_13() {
        final double t = x_14 * x_11 + x_13 * y_11;
        y_11 = y_14 * x_11 + y_13 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_11_by_14_2() {
        final double t = x_14 * x_11 + x_2 * y_11;
        y_11 = y_14 * x_11 + y_2 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_11_by_14_3() {
        final double t = x_14 * x_11 + x_3 * y_11;
        y_11 = y_14 * x_11 + y_3 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_11_by_14_4() {
        final double t = x_14 * x_11 + x_4 * y_11;
        y_11 = y_14 * x_11 + y_4 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_11_by_14_5() {
        final double t = x_14 * x_11 + x_5 * y_11;
        y_11 = y_14 * x_11 + y_5 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_11_by_14_6() {
        final double t = x_14 * x_11 + x_6 * y_11;
        y_11 = y_14 * x_11 + y_6 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_11_by_14_7() {
        final double t = x_14 * x_11 + x_7 * y_11;
        y_11 = y_14 * x_11 + y_7 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_11_by_14_8() {
        final double t = x_14 * x_11 + x_8 * y_11;
        y_11 = y_14 * x_11 + y_8 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_11_by_14_9() {
        final double t = x_14 * x_11 + x_9 * y_11;
        y_11 = y_14 * x_11 + y_9 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_11_by_2_14() {
        final double t = x_2 * x_11 + x_14 * y_11;
        y_11 = y_2 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_11_by_3_14() {
        final double t = x_3 * x_11 + x_14 * y_11;
        y_11 = y_3 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_11_by_4_14() {
        final double t = x_4 * x_11 + x_14 * y_11;
        y_11 = y_4 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_11_by_5_14() {
        final double t = x_5 * x_11 + x_14 * y_11;
        y_11 = y_5 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_11_by_6_14() {
        final double t = x_6 * x_11 + x_14 * y_11;
        y_11 = y_6 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_11_by_7_14() {
        final double t = x_7 * x_11 + x_14 * y_11;
        y_11 = y_7 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_11_by_8_14() {
        final double t = x_8 * x_11 + x_14 * y_11;
        y_11 = y_8 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 11 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_11_by_9_14() {
        final double t = x_9 * x_11 + x_14 * y_11;
        y_11 = y_9 * x_11 + y_14 * y_11;
        x_11 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_12_by_0_14() {
        final double t = x_0 * x_12 + x_14 * y_12;
        y_12 = y_0 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_12_by_1_14() {
        final double t = x_1 * x_12 + x_14 * y_12;
        y_12 = y_1 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_12_by_10_14() {
        final double t = x_10 * x_12 + x_14 * y_12;
        y_12 = y_10 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_12_by_11_14() {
        final double t = x_11 * x_12 + x_14 * y_12;
        y_12 = y_11 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_12_by_13_14() {
        final double t = x_13 * x_12 + x_14 * y_12;
        y_12 = y_13 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_12_by_14_0() {
        final double t = x_14 * x_12 + x_0 * y_12;
        y_12 = y_14 * x_12 + y_0 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_12_by_14_1() {
        final double t = x_14 * x_12 + x_1 * y_12;
        y_12 = y_14 * x_12 + y_1 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_12_by_14_10() {
        final double t = x_14 * x_12 + x_10 * y_12;
        y_12 = y_14 * x_12 + y_10 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_12_by_14_11() {
        final double t = x_14 * x_12 + x_11 * y_12;
        y_12 = y_14 * x_12 + y_11 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_12_by_14_13() {
        final double t = x_14 * x_12 + x_13 * y_12;
        y_12 = y_14 * x_12 + y_13 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_12_by_14_2() {
        final double t = x_14 * x_12 + x_2 * y_12;
        y_12 = y_14 * x_12 + y_2 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_12_by_14_3() {
        final double t = x_14 * x_12 + x_3 * y_12;
        y_12 = y_14 * x_12 + y_3 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_12_by_14_4() {
        final double t = x_14 * x_12 + x_4 * y_12;
        y_12 = y_14 * x_12 + y_4 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_12_by_14_5() {
        final double t = x_14 * x_12 + x_5 * y_12;
        y_12 = y_14 * x_12 + y_5 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_12_by_14_6() {
        final double t = x_14 * x_12 + x_6 * y_12;
        y_12 = y_14 * x_12 + y_6 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_12_by_14_7() {
        final double t = x_14 * x_12 + x_7 * y_12;
        y_12 = y_14 * x_12 + y_7 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_12_by_14_8() {
        final double t = x_14 * x_12 + x_8 * y_12;
        y_12 = y_14 * x_12 + y_8 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_12_by_14_9() {
        final double t = x_14 * x_12 + x_9 * y_12;
        y_12 = y_14 * x_12 + y_9 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_12_by_2_14() {
        final double t = x_2 * x_12 + x_14 * y_12;
        y_12 = y_2 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_12_by_3_14() {
        final double t = x_3 * x_12 + x_14 * y_12;
        y_12 = y_3 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_12_by_4_14() {
        final double t = x_4 * x_12 + x_14 * y_12;
        y_12 = y_4 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_12_by_5_14() {
        final double t = x_5 * x_12 + x_14 * y_12;
        y_12 = y_5 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_12_by_6_14() {
        final double t = x_6 * x_12 + x_14 * y_12;
        y_12 = y_6 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_12_by_7_14() {
        final double t = x_7 * x_12 + x_14 * y_12;
        y_12 = y_7 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_12_by_8_14() {
        final double t = x_8 * x_12 + x_14 * y_12;
        y_12 = y_8 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 12 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_12_by_9_14() {
        final double t = x_9 * x_12 + x_14 * y_12;
        y_12 = y_9 * x_12 + y_14 * y_12;
        x_12 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_13_by_0_14() {
        final double t = x_0 * x_13 + x_14 * y_13;
        y_13 = y_0 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_13_by_1_14() {
        final double t = x_1 * x_13 + x_14 * y_13;
        y_13 = y_1 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_13_by_10_14() {
        final double t = x_10 * x_13 + x_14 * y_13;
        y_13 = y_10 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_13_by_11_14() {
        final double t = x_11 * x_13 + x_14 * y_13;
        y_13 = y_11 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_13_by_12_14() {
        final double t = x_12 * x_13 + x_14 * y_13;
        y_13 = y_12 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_13_by_14_0() {
        final double t = x_14 * x_13 + x_0 * y_13;
        y_13 = y_14 * x_13 + y_0 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_13_by_14_1() {
        final double t = x_14 * x_13 + x_1 * y_13;
        y_13 = y_14 * x_13 + y_1 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_13_by_14_10() {
        final double t = x_14 * x_13 + x_10 * y_13;
        y_13 = y_14 * x_13 + y_10 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_13_by_14_11() {
        final double t = x_14 * x_13 + x_11 * y_13;
        y_13 = y_14 * x_13 + y_11 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_13_by_14_12() {
        final double t = x_14 * x_13 + x_12 * y_13;
        y_13 = y_14 * x_13 + y_12 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_13_by_14_2() {
        final double t = x_14 * x_13 + x_2 * y_13;
        y_13 = y_14 * x_13 + y_2 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_13_by_14_3() {
        final double t = x_14 * x_13 + x_3 * y_13;
        y_13 = y_14 * x_13 + y_3 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_13_by_14_4() {
        final double t = x_14 * x_13 + x_4 * y_13;
        y_13 = y_14 * x_13 + y_4 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_13_by_14_5() {
        final double t = x_14 * x_13 + x_5 * y_13;
        y_13 = y_14 * x_13 + y_5 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_13_by_14_6() {
        final double t = x_14 * x_13 + x_6 * y_13;
        y_13 = y_14 * x_13 + y_6 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_13_by_14_7() {
        final double t = x_14 * x_13 + x_7 * y_13;
        y_13 = y_14 * x_13 + y_7 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_13_by_14_8() {
        final double t = x_14 * x_13 + x_8 * y_13;
        y_13 = y_14 * x_13 + y_8 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_13_by_14_9() {
        final double t = x_14 * x_13 + x_9 * y_13;
        y_13 = y_14 * x_13 + y_9 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_13_by_2_14() {
        final double t = x_2 * x_13 + x_14 * y_13;
        y_13 = y_2 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_13_by_3_14() {
        final double t = x_3 * x_13 + x_14 * y_13;
        y_13 = y_3 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_13_by_4_14() {
        final double t = x_4 * x_13 + x_14 * y_13;
        y_13 = y_4 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_13_by_5_14() {
        final double t = x_5 * x_13 + x_14 * y_13;
        y_13 = y_5 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_13_by_6_14() {
        final double t = x_6 * x_13 + x_14 * y_13;
        y_13 = y_6 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_13_by_7_14() {
        final double t = x_7 * x_13 + x_14 * y_13;
        y_13 = y_7 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_13_by_8_14() {
        final double t = x_8 * x_13 + x_14 * y_13;
        y_13 = y_8 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 13 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_13_by_9_14() {
        final double t = x_9 * x_13 + x_14 * y_13;
        y_13 = y_9 * x_13 + y_14 * y_13;
        x_13 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 1 vectors as columns */
    public void transform_14_by_0_1() {
        final double t = x_0 * x_14 + x_1 * y_14;
        y_14 = y_0 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 10 vectors as columns */
    public void transform_14_by_0_10() {
        final double t = x_0 * x_14 + x_10 * y_14;
        y_14 = y_0 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 11 vectors as columns */
    public void transform_14_by_0_11() {
        final double t = x_0 * x_14 + x_11 * y_14;
        y_14 = y_0 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 12 vectors as columns */
    public void transform_14_by_0_12() {
        final double t = x_0 * x_14 + x_12 * y_14;
        y_14 = y_0 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 13 vectors as columns */
    public void transform_14_by_0_13() {
        final double t = x_0 * x_14 + x_13 * y_14;
        y_14 = y_0 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 2 vectors as columns */
    public void transform_14_by_0_2() {
        final double t = x_0 * x_14 + x_2 * y_14;
        y_14 = y_0 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 3 vectors as columns */
    public void transform_14_by_0_3() {
        final double t = x_0 * x_14 + x_3 * y_14;
        y_14 = y_0 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 4 vectors as columns */
    public void transform_14_by_0_4() {
        final double t = x_0 * x_14 + x_4 * y_14;
        y_14 = y_0 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 5 vectors as columns */
    public void transform_14_by_0_5() {
        final double t = x_0 * x_14 + x_5 * y_14;
        y_14 = y_0 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 6 vectors as columns */
    public void transform_14_by_0_6() {
        final double t = x_0 * x_14 + x_6 * y_14;
        y_14 = y_0 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 7 vectors as columns */
    public void transform_14_by_0_7() {
        final double t = x_0 * x_14 + x_7 * y_14;
        y_14 = y_0 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 8 vectors as columns */
    public void transform_14_by_0_8() {
        final double t = x_0 * x_14 + x_8 * y_14;
        y_14 = y_0 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 0 and 9 vectors as columns */
    public void transform_14_by_0_9() {
        final double t = x_0 * x_14 + x_9 * y_14;
        y_14 = y_0 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 0 vectors as columns */
    public void transform_14_by_1_0() {
        final double t = x_1 * x_14 + x_0 * y_14;
        y_14 = y_1 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 10 vectors as columns */
    public void transform_14_by_1_10() {
        final double t = x_1 * x_14 + x_10 * y_14;
        y_14 = y_1 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 11 vectors as columns */
    public void transform_14_by_1_11() {
        final double t = x_1 * x_14 + x_11 * y_14;
        y_14 = y_1 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 12 vectors as columns */
    public void transform_14_by_1_12() {
        final double t = x_1 * x_14 + x_12 * y_14;
        y_14 = y_1 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 13 vectors as columns */
    public void transform_14_by_1_13() {
        final double t = x_1 * x_14 + x_13 * y_14;
        y_14 = y_1 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 2 vectors as columns */
    public void transform_14_by_1_2() {
        final double t = x_1 * x_14 + x_2 * y_14;
        y_14 = y_1 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 3 vectors as columns */
    public void transform_14_by_1_3() {
        final double t = x_1 * x_14 + x_3 * y_14;
        y_14 = y_1 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 4 vectors as columns */
    public void transform_14_by_1_4() {
        final double t = x_1 * x_14 + x_4 * y_14;
        y_14 = y_1 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 5 vectors as columns */
    public void transform_14_by_1_5() {
        final double t = x_1 * x_14 + x_5 * y_14;
        y_14 = y_1 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 6 vectors as columns */
    public void transform_14_by_1_6() {
        final double t = x_1 * x_14 + x_6 * y_14;
        y_14 = y_1 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 7 vectors as columns */
    public void transform_14_by_1_7() {
        final double t = x_1 * x_14 + x_7 * y_14;
        y_14 = y_1 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 8 vectors as columns */
    public void transform_14_by_1_8() {
        final double t = x_1 * x_14 + x_8 * y_14;
        y_14 = y_1 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 1 and 9 vectors as columns */
    public void transform_14_by_1_9() {
        final double t = x_1 * x_14 + x_9 * y_14;
        y_14 = y_1 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 0 vectors as columns */
    public void transform_14_by_10_0() {
        final double t = x_10 * x_14 + x_0 * y_14;
        y_14 = y_10 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 1 vectors as columns */
    public void transform_14_by_10_1() {
        final double t = x_10 * x_14 + x_1 * y_14;
        y_14 = y_10 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 11 vectors as columns */
    public void transform_14_by_10_11() {
        final double t = x_10 * x_14 + x_11 * y_14;
        y_14 = y_10 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 12 vectors as columns */
    public void transform_14_by_10_12() {
        final double t = x_10 * x_14 + x_12 * y_14;
        y_14 = y_10 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 13 vectors as columns */
    public void transform_14_by_10_13() {
        final double t = x_10 * x_14 + x_13 * y_14;
        y_14 = y_10 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 2 vectors as columns */
    public void transform_14_by_10_2() {
        final double t = x_10 * x_14 + x_2 * y_14;
        y_14 = y_10 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 3 vectors as columns */
    public void transform_14_by_10_3() {
        final double t = x_10 * x_14 + x_3 * y_14;
        y_14 = y_10 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 4 vectors as columns */
    public void transform_14_by_10_4() {
        final double t = x_10 * x_14 + x_4 * y_14;
        y_14 = y_10 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 5 vectors as columns */
    public void transform_14_by_10_5() {
        final double t = x_10 * x_14 + x_5 * y_14;
        y_14 = y_10 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 6 vectors as columns */
    public void transform_14_by_10_6() {
        final double t = x_10 * x_14 + x_6 * y_14;
        y_14 = y_10 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 7 vectors as columns */
    public void transform_14_by_10_7() {
        final double t = x_10 * x_14 + x_7 * y_14;
        y_14 = y_10 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 8 vectors as columns */
    public void transform_14_by_10_8() {
        final double t = x_10 * x_14 + x_8 * y_14;
        y_14 = y_10 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 10 and 9 vectors as columns */
    public void transform_14_by_10_9() {
        final double t = x_10 * x_14 + x_9 * y_14;
        y_14 = y_10 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 0 vectors as columns */
    public void transform_14_by_11_0() {
        final double t = x_11 * x_14 + x_0 * y_14;
        y_14 = y_11 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 1 vectors as columns */
    public void transform_14_by_11_1() {
        final double t = x_11 * x_14 + x_1 * y_14;
        y_14 = y_11 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 10 vectors as columns */
    public void transform_14_by_11_10() {
        final double t = x_11 * x_14 + x_10 * y_14;
        y_14 = y_11 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 12 vectors as columns */
    public void transform_14_by_11_12() {
        final double t = x_11 * x_14 + x_12 * y_14;
        y_14 = y_11 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 13 vectors as columns */
    public void transform_14_by_11_13() {
        final double t = x_11 * x_14 + x_13 * y_14;
        y_14 = y_11 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 2 vectors as columns */
    public void transform_14_by_11_2() {
        final double t = x_11 * x_14 + x_2 * y_14;
        y_14 = y_11 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 3 vectors as columns */
    public void transform_14_by_11_3() {
        final double t = x_11 * x_14 + x_3 * y_14;
        y_14 = y_11 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 4 vectors as columns */
    public void transform_14_by_11_4() {
        final double t = x_11 * x_14 + x_4 * y_14;
        y_14 = y_11 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 5 vectors as columns */
    public void transform_14_by_11_5() {
        final double t = x_11 * x_14 + x_5 * y_14;
        y_14 = y_11 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 6 vectors as columns */
    public void transform_14_by_11_6() {
        final double t = x_11 * x_14 + x_6 * y_14;
        y_14 = y_11 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 7 vectors as columns */
    public void transform_14_by_11_7() {
        final double t = x_11 * x_14 + x_7 * y_14;
        y_14 = y_11 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 8 vectors as columns */
    public void transform_14_by_11_8() {
        final double t = x_11 * x_14 + x_8 * y_14;
        y_14 = y_11 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 11 and 9 vectors as columns */
    public void transform_14_by_11_9() {
        final double t = x_11 * x_14 + x_9 * y_14;
        y_14 = y_11 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 0 vectors as columns */
    public void transform_14_by_12_0() {
        final double t = x_12 * x_14 + x_0 * y_14;
        y_14 = y_12 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 1 vectors as columns */
    public void transform_14_by_12_1() {
        final double t = x_12 * x_14 + x_1 * y_14;
        y_14 = y_12 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 10 vectors as columns */
    public void transform_14_by_12_10() {
        final double t = x_12 * x_14 + x_10 * y_14;
        y_14 = y_12 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 11 vectors as columns */
    public void transform_14_by_12_11() {
        final double t = x_12 * x_14 + x_11 * y_14;
        y_14 = y_12 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 13 vectors as columns */
    public void transform_14_by_12_13() {
        final double t = x_12 * x_14 + x_13 * y_14;
        y_14 = y_12 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 2 vectors as columns */
    public void transform_14_by_12_2() {
        final double t = x_12 * x_14 + x_2 * y_14;
        y_14 = y_12 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 3 vectors as columns */
    public void transform_14_by_12_3() {
        final double t = x_12 * x_14 + x_3 * y_14;
        y_14 = y_12 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 4 vectors as columns */
    public void transform_14_by_12_4() {
        final double t = x_12 * x_14 + x_4 * y_14;
        y_14 = y_12 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 5 vectors as columns */
    public void transform_14_by_12_5() {
        final double t = x_12 * x_14 + x_5 * y_14;
        y_14 = y_12 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 6 vectors as columns */
    public void transform_14_by_12_6() {
        final double t = x_12 * x_14 + x_6 * y_14;
        y_14 = y_12 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 7 vectors as columns */
    public void transform_14_by_12_7() {
        final double t = x_12 * x_14 + x_7 * y_14;
        y_14 = y_12 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 8 vectors as columns */
    public void transform_14_by_12_8() {
        final double t = x_12 * x_14 + x_8 * y_14;
        y_14 = y_12 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 12 and 9 vectors as columns */
    public void transform_14_by_12_9() {
        final double t = x_12 * x_14 + x_9 * y_14;
        y_14 = y_12 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 0 vectors as columns */
    public void transform_14_by_13_0() {
        final double t = x_13 * x_14 + x_0 * y_14;
        y_14 = y_13 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 1 vectors as columns */
    public void transform_14_by_13_1() {
        final double t = x_13 * x_14 + x_1 * y_14;
        y_14 = y_13 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 10 vectors as columns */
    public void transform_14_by_13_10() {
        final double t = x_13 * x_14 + x_10 * y_14;
        y_14 = y_13 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 11 vectors as columns */
    public void transform_14_by_13_11() {
        final double t = x_13 * x_14 + x_11 * y_14;
        y_14 = y_13 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 12 vectors as columns */
    public void transform_14_by_13_12() {
        final double t = x_13 * x_14 + x_12 * y_14;
        y_14 = y_13 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 2 vectors as columns */
    public void transform_14_by_13_2() {
        final double t = x_13 * x_14 + x_2 * y_14;
        y_14 = y_13 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 3 vectors as columns */
    public void transform_14_by_13_3() {
        final double t = x_13 * x_14 + x_3 * y_14;
        y_14 = y_13 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 4 vectors as columns */
    public void transform_14_by_13_4() {
        final double t = x_13 * x_14 + x_4 * y_14;
        y_14 = y_13 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 5 vectors as columns */
    public void transform_14_by_13_5() {
        final double t = x_13 * x_14 + x_5 * y_14;
        y_14 = y_13 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 6 vectors as columns */
    public void transform_14_by_13_6() {
        final double t = x_13 * x_14 + x_6 * y_14;
        y_14 = y_13 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 7 vectors as columns */
    public void transform_14_by_13_7() {
        final double t = x_13 * x_14 + x_7 * y_14;
        y_14 = y_13 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 8 vectors as columns */
    public void transform_14_by_13_8() {
        final double t = x_13 * x_14 + x_8 * y_14;
        y_14 = y_13 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 13 and 9 vectors as columns */
    public void transform_14_by_13_9() {
        final double t = x_13 * x_14 + x_9 * y_14;
        y_14 = y_13 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 0 vectors as columns */
    public void transform_14_by_2_0() {
        final double t = x_2 * x_14 + x_0 * y_14;
        y_14 = y_2 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 1 vectors as columns */
    public void transform_14_by_2_1() {
        final double t = x_2 * x_14 + x_1 * y_14;
        y_14 = y_2 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 10 vectors as columns */
    public void transform_14_by_2_10() {
        final double t = x_2 * x_14 + x_10 * y_14;
        y_14 = y_2 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 11 vectors as columns */
    public void transform_14_by_2_11() {
        final double t = x_2 * x_14 + x_11 * y_14;
        y_14 = y_2 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 12 vectors as columns */
    public void transform_14_by_2_12() {
        final double t = x_2 * x_14 + x_12 * y_14;
        y_14 = y_2 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 13 vectors as columns */
    public void transform_14_by_2_13() {
        final double t = x_2 * x_14 + x_13 * y_14;
        y_14 = y_2 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 3 vectors as columns */
    public void transform_14_by_2_3() {
        final double t = x_2 * x_14 + x_3 * y_14;
        y_14 = y_2 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 4 vectors as columns */
    public void transform_14_by_2_4() {
        final double t = x_2 * x_14 + x_4 * y_14;
        y_14 = y_2 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 5 vectors as columns */
    public void transform_14_by_2_5() {
        final double t = x_2 * x_14 + x_5 * y_14;
        y_14 = y_2 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 6 vectors as columns */
    public void transform_14_by_2_6() {
        final double t = x_2 * x_14 + x_6 * y_14;
        y_14 = y_2 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 7 vectors as columns */
    public void transform_14_by_2_7() {
        final double t = x_2 * x_14 + x_7 * y_14;
        y_14 = y_2 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 8 vectors as columns */
    public void transform_14_by_2_8() {
        final double t = x_2 * x_14 + x_8 * y_14;
        y_14 = y_2 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 2 and 9 vectors as columns */
    public void transform_14_by_2_9() {
        final double t = x_2 * x_14 + x_9 * y_14;
        y_14 = y_2 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 0 vectors as columns */
    public void transform_14_by_3_0() {
        final double t = x_3 * x_14 + x_0 * y_14;
        y_14 = y_3 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 1 vectors as columns */
    public void transform_14_by_3_1() {
        final double t = x_3 * x_14 + x_1 * y_14;
        y_14 = y_3 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 10 vectors as columns */
    public void transform_14_by_3_10() {
        final double t = x_3 * x_14 + x_10 * y_14;
        y_14 = y_3 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 11 vectors as columns */
    public void transform_14_by_3_11() {
        final double t = x_3 * x_14 + x_11 * y_14;
        y_14 = y_3 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 12 vectors as columns */
    public void transform_14_by_3_12() {
        final double t = x_3 * x_14 + x_12 * y_14;
        y_14 = y_3 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 13 vectors as columns */
    public void transform_14_by_3_13() {
        final double t = x_3 * x_14 + x_13 * y_14;
        y_14 = y_3 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 2 vectors as columns */
    public void transform_14_by_3_2() {
        final double t = x_3 * x_14 + x_2 * y_14;
        y_14 = y_3 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 4 vectors as columns */
    public void transform_14_by_3_4() {
        final double t = x_3 * x_14 + x_4 * y_14;
        y_14 = y_3 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 5 vectors as columns */
    public void transform_14_by_3_5() {
        final double t = x_3 * x_14 + x_5 * y_14;
        y_14 = y_3 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 6 vectors as columns */
    public void transform_14_by_3_6() {
        final double t = x_3 * x_14 + x_6 * y_14;
        y_14 = y_3 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 7 vectors as columns */
    public void transform_14_by_3_7() {
        final double t = x_3 * x_14 + x_7 * y_14;
        y_14 = y_3 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 8 vectors as columns */
    public void transform_14_by_3_8() {
        final double t = x_3 * x_14 + x_8 * y_14;
        y_14 = y_3 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 3 and 9 vectors as columns */
    public void transform_14_by_3_9() {
        final double t = x_3 * x_14 + x_9 * y_14;
        y_14 = y_3 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 0 vectors as columns */
    public void transform_14_by_4_0() {
        final double t = x_4 * x_14 + x_0 * y_14;
        y_14 = y_4 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 1 vectors as columns */
    public void transform_14_by_4_1() {
        final double t = x_4 * x_14 + x_1 * y_14;
        y_14 = y_4 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 10 vectors as columns */
    public void transform_14_by_4_10() {
        final double t = x_4 * x_14 + x_10 * y_14;
        y_14 = y_4 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 11 vectors as columns */
    public void transform_14_by_4_11() {
        final double t = x_4 * x_14 + x_11 * y_14;
        y_14 = y_4 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 12 vectors as columns */
    public void transform_14_by_4_12() {
        final double t = x_4 * x_14 + x_12 * y_14;
        y_14 = y_4 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 13 vectors as columns */
    public void transform_14_by_4_13() {
        final double t = x_4 * x_14 + x_13 * y_14;
        y_14 = y_4 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 2 vectors as columns */
    public void transform_14_by_4_2() {
        final double t = x_4 * x_14 + x_2 * y_14;
        y_14 = y_4 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 3 vectors as columns */
    public void transform_14_by_4_3() {
        final double t = x_4 * x_14 + x_3 * y_14;
        y_14 = y_4 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 5 vectors as columns */
    public void transform_14_by_4_5() {
        final double t = x_4 * x_14 + x_5 * y_14;
        y_14 = y_4 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 6 vectors as columns */
    public void transform_14_by_4_6() {
        final double t = x_4 * x_14 + x_6 * y_14;
        y_14 = y_4 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 7 vectors as columns */
    public void transform_14_by_4_7() {
        final double t = x_4 * x_14 + x_7 * y_14;
        y_14 = y_4 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 8 vectors as columns */
    public void transform_14_by_4_8() {
        final double t = x_4 * x_14 + x_8 * y_14;
        y_14 = y_4 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 4 and 9 vectors as columns */
    public void transform_14_by_4_9() {
        final double t = x_4 * x_14 + x_9 * y_14;
        y_14 = y_4 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 0 vectors as columns */
    public void transform_14_by_5_0() {
        final double t = x_5 * x_14 + x_0 * y_14;
        y_14 = y_5 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 1 vectors as columns */
    public void transform_14_by_5_1() {
        final double t = x_5 * x_14 + x_1 * y_14;
        y_14 = y_5 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 10 vectors as columns */
    public void transform_14_by_5_10() {
        final double t = x_5 * x_14 + x_10 * y_14;
        y_14 = y_5 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 11 vectors as columns */
    public void transform_14_by_5_11() {
        final double t = x_5 * x_14 + x_11 * y_14;
        y_14 = y_5 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 12 vectors as columns */
    public void transform_14_by_5_12() {
        final double t = x_5 * x_14 + x_12 * y_14;
        y_14 = y_5 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 13 vectors as columns */
    public void transform_14_by_5_13() {
        final double t = x_5 * x_14 + x_13 * y_14;
        y_14 = y_5 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 2 vectors as columns */
    public void transform_14_by_5_2() {
        final double t = x_5 * x_14 + x_2 * y_14;
        y_14 = y_5 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 3 vectors as columns */
    public void transform_14_by_5_3() {
        final double t = x_5 * x_14 + x_3 * y_14;
        y_14 = y_5 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 4 vectors as columns */
    public void transform_14_by_5_4() {
        final double t = x_5 * x_14 + x_4 * y_14;
        y_14 = y_5 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 6 vectors as columns */
    public void transform_14_by_5_6() {
        final double t = x_5 * x_14 + x_6 * y_14;
        y_14 = y_5 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 7 vectors as columns */
    public void transform_14_by_5_7() {
        final double t = x_5 * x_14 + x_7 * y_14;
        y_14 = y_5 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 8 vectors as columns */
    public void transform_14_by_5_8() {
        final double t = x_5 * x_14 + x_8 * y_14;
        y_14 = y_5 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 5 and 9 vectors as columns */
    public void transform_14_by_5_9() {
        final double t = x_5 * x_14 + x_9 * y_14;
        y_14 = y_5 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 0 vectors as columns */
    public void transform_14_by_6_0() {
        final double t = x_6 * x_14 + x_0 * y_14;
        y_14 = y_6 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 1 vectors as columns */
    public void transform_14_by_6_1() {
        final double t = x_6 * x_14 + x_1 * y_14;
        y_14 = y_6 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 10 vectors as columns */
    public void transform_14_by_6_10() {
        final double t = x_6 * x_14 + x_10 * y_14;
        y_14 = y_6 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 11 vectors as columns */
    public void transform_14_by_6_11() {
        final double t = x_6 * x_14 + x_11 * y_14;
        y_14 = y_6 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 12 vectors as columns */
    public void transform_14_by_6_12() {
        final double t = x_6 * x_14 + x_12 * y_14;
        y_14 = y_6 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 13 vectors as columns */
    public void transform_14_by_6_13() {
        final double t = x_6 * x_14 + x_13 * y_14;
        y_14 = y_6 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 2 vectors as columns */
    public void transform_14_by_6_2() {
        final double t = x_6 * x_14 + x_2 * y_14;
        y_14 = y_6 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 3 vectors as columns */
    public void transform_14_by_6_3() {
        final double t = x_6 * x_14 + x_3 * y_14;
        y_14 = y_6 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 4 vectors as columns */
    public void transform_14_by_6_4() {
        final double t = x_6 * x_14 + x_4 * y_14;
        y_14 = y_6 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 5 vectors as columns */
    public void transform_14_by_6_5() {
        final double t = x_6 * x_14 + x_5 * y_14;
        y_14 = y_6 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 7 vectors as columns */
    public void transform_14_by_6_7() {
        final double t = x_6 * x_14 + x_7 * y_14;
        y_14 = y_6 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 8 vectors as columns */
    public void transform_14_by_6_8() {
        final double t = x_6 * x_14 + x_8 * y_14;
        y_14 = y_6 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 6 and 9 vectors as columns */
    public void transform_14_by_6_9() {
        final double t = x_6 * x_14 + x_9 * y_14;
        y_14 = y_6 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 0 vectors as columns */
    public void transform_14_by_7_0() {
        final double t = x_7 * x_14 + x_0 * y_14;
        y_14 = y_7 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 1 vectors as columns */
    public void transform_14_by_7_1() {
        final double t = x_7 * x_14 + x_1 * y_14;
        y_14 = y_7 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 10 vectors as columns */
    public void transform_14_by_7_10() {
        final double t = x_7 * x_14 + x_10 * y_14;
        y_14 = y_7 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 11 vectors as columns */
    public void transform_14_by_7_11() {
        final double t = x_7 * x_14 + x_11 * y_14;
        y_14 = y_7 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 12 vectors as columns */
    public void transform_14_by_7_12() {
        final double t = x_7 * x_14 + x_12 * y_14;
        y_14 = y_7 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 13 vectors as columns */
    public void transform_14_by_7_13() {
        final double t = x_7 * x_14 + x_13 * y_14;
        y_14 = y_7 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 2 vectors as columns */
    public void transform_14_by_7_2() {
        final double t = x_7 * x_14 + x_2 * y_14;
        y_14 = y_7 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 3 vectors as columns */
    public void transform_14_by_7_3() {
        final double t = x_7 * x_14 + x_3 * y_14;
        y_14 = y_7 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 4 vectors as columns */
    public void transform_14_by_7_4() {
        final double t = x_7 * x_14 + x_4 * y_14;
        y_14 = y_7 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 5 vectors as columns */
    public void transform_14_by_7_5() {
        final double t = x_7 * x_14 + x_5 * y_14;
        y_14 = y_7 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 6 vectors as columns */
    public void transform_14_by_7_6() {
        final double t = x_7 * x_14 + x_6 * y_14;
        y_14 = y_7 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 8 vectors as columns */
    public void transform_14_by_7_8() {
        final double t = x_7 * x_14 + x_8 * y_14;
        y_14 = y_7 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 7 and 9 vectors as columns */
    public void transform_14_by_7_9() {
        final double t = x_7 * x_14 + x_9 * y_14;
        y_14 = y_7 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 0 vectors as columns */
    public void transform_14_by_8_0() {
        final double t = x_8 * x_14 + x_0 * y_14;
        y_14 = y_8 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 1 vectors as columns */
    public void transform_14_by_8_1() {
        final double t = x_8 * x_14 + x_1 * y_14;
        y_14 = y_8 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 10 vectors as columns */
    public void transform_14_by_8_10() {
        final double t = x_8 * x_14 + x_10 * y_14;
        y_14 = y_8 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 11 vectors as columns */
    public void transform_14_by_8_11() {
        final double t = x_8 * x_14 + x_11 * y_14;
        y_14 = y_8 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 12 vectors as columns */
    public void transform_14_by_8_12() {
        final double t = x_8 * x_14 + x_12 * y_14;
        y_14 = y_8 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 13 vectors as columns */
    public void transform_14_by_8_13() {
        final double t = x_8 * x_14 + x_13 * y_14;
        y_14 = y_8 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 2 vectors as columns */
    public void transform_14_by_8_2() {
        final double t = x_8 * x_14 + x_2 * y_14;
        y_14 = y_8 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 3 vectors as columns */
    public void transform_14_by_8_3() {
        final double t = x_8 * x_14 + x_3 * y_14;
        y_14 = y_8 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 4 vectors as columns */
    public void transform_14_by_8_4() {
        final double t = x_8 * x_14 + x_4 * y_14;
        y_14 = y_8 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 5 vectors as columns */
    public void transform_14_by_8_5() {
        final double t = x_8 * x_14 + x_5 * y_14;
        y_14 = y_8 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 6 vectors as columns */
    public void transform_14_by_8_6() {
        final double t = x_8 * x_14 + x_6 * y_14;
        y_14 = y_8 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 7 vectors as columns */
    public void transform_14_by_8_7() {
        final double t = x_8 * x_14 + x_7 * y_14;
        y_14 = y_8 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 8 and 9 vectors as columns */
    public void transform_14_by_8_9() {
        final double t = x_8 * x_14 + x_9 * y_14;
        y_14 = y_8 * x_14 + y_9 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 0 vectors as columns */
    public void transform_14_by_9_0() {
        final double t = x_9 * x_14 + x_0 * y_14;
        y_14 = y_9 * x_14 + y_0 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 1 vectors as columns */
    public void transform_14_by_9_1() {
        final double t = x_9 * x_14 + x_1 * y_14;
        y_14 = y_9 * x_14 + y_1 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 10 vectors as columns */
    public void transform_14_by_9_10() {
        final double t = x_9 * x_14 + x_10 * y_14;
        y_14 = y_9 * x_14 + y_10 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 11 vectors as columns */
    public void transform_14_by_9_11() {
        final double t = x_9 * x_14 + x_11 * y_14;
        y_14 = y_9 * x_14 + y_11 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 12 vectors as columns */
    public void transform_14_by_9_12() {
        final double t = x_9 * x_14 + x_12 * y_14;
        y_14 = y_9 * x_14 + y_12 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 13 vectors as columns */
    public void transform_14_by_9_13() {
        final double t = x_9 * x_14 + x_13 * y_14;
        y_14 = y_9 * x_14 + y_13 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 2 vectors as columns */
    public void transform_14_by_9_2() {
        final double t = x_9 * x_14 + x_2 * y_14;
        y_14 = y_9 * x_14 + y_2 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 3 vectors as columns */
    public void transform_14_by_9_3() {
        final double t = x_9 * x_14 + x_3 * y_14;
        y_14 = y_9 * x_14 + y_3 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 4 vectors as columns */
    public void transform_14_by_9_4() {
        final double t = x_9 * x_14 + x_4 * y_14;
        y_14 = y_9 * x_14 + y_4 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 5 vectors as columns */
    public void transform_14_by_9_5() {
        final double t = x_9 * x_14 + x_5 * y_14;
        y_14 = y_9 * x_14 + y_5 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 6 vectors as columns */
    public void transform_14_by_9_6() {
        final double t = x_9 * x_14 + x_6 * y_14;
        y_14 = y_9 * x_14 + y_6 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 7 vectors as columns */
    public void transform_14_by_9_7() {
        final double t = x_9 * x_14 + x_7 * y_14;
        y_14 = y_9 * x_14 + y_7 * y_14;
        x_14 = t;
    }

    /** transform the 14 vector by the matrixed formed by the 9 and 8 vectors as columns */
    public void transform_14_by_9_8() {
        final double t = x_9 * x_14 + x_8 * y_14;
        y_14 = y_9 * x_14 + y_8 * y_14;
        x_14 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_2_by_0_14() {
        final double t = x_0 * x_2 + x_14 * y_2;
        y_2 = y_0 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_2_by_1_14() {
        final double t = x_1 * x_2 + x_14 * y_2;
        y_2 = y_1 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_2_by_10_14() {
        final double t = x_10 * x_2 + x_14 * y_2;
        y_2 = y_10 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_2_by_11_14() {
        final double t = x_11 * x_2 + x_14 * y_2;
        y_2 = y_11 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_2_by_12_14() {
        final double t = x_12 * x_2 + x_14 * y_2;
        y_2 = y_12 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_2_by_13_14() {
        final double t = x_13 * x_2 + x_14 * y_2;
        y_2 = y_13 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_2_by_14_0() {
        final double t = x_14 * x_2 + x_0 * y_2;
        y_2 = y_14 * x_2 + y_0 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_2_by_14_1() {
        final double t = x_14 * x_2 + x_1 * y_2;
        y_2 = y_14 * x_2 + y_1 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_2_by_14_10() {
        final double t = x_14 * x_2 + x_10 * y_2;
        y_2 = y_14 * x_2 + y_10 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_2_by_14_11() {
        final double t = x_14 * x_2 + x_11 * y_2;
        y_2 = y_14 * x_2 + y_11 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_2_by_14_12() {
        final double t = x_14 * x_2 + x_12 * y_2;
        y_2 = y_14 * x_2 + y_12 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_2_by_14_13() {
        final double t = x_14 * x_2 + x_13 * y_2;
        y_2 = y_14 * x_2 + y_13 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_2_by_14_3() {
        final double t = x_14 * x_2 + x_3 * y_2;
        y_2 = y_14 * x_2 + y_3 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_2_by_14_4() {
        final double t = x_14 * x_2 + x_4 * y_2;
        y_2 = y_14 * x_2 + y_4 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_2_by_14_5() {
        final double t = x_14 * x_2 + x_5 * y_2;
        y_2 = y_14 * x_2 + y_5 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_2_by_14_6() {
        final double t = x_14 * x_2 + x_6 * y_2;
        y_2 = y_14 * x_2 + y_6 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_2_by_14_7() {
        final double t = x_14 * x_2 + x_7 * y_2;
        y_2 = y_14 * x_2 + y_7 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_2_by_14_8() {
        final double t = x_14 * x_2 + x_8 * y_2;
        y_2 = y_14 * x_2 + y_8 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_2_by_14_9() {
        final double t = x_14 * x_2 + x_9 * y_2;
        y_2 = y_14 * x_2 + y_9 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_2_by_3_14() {
        final double t = x_3 * x_2 + x_14 * y_2;
        y_2 = y_3 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_2_by_4_14() {
        final double t = x_4 * x_2 + x_14 * y_2;
        y_2 = y_4 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_2_by_5_14() {
        final double t = x_5 * x_2 + x_14 * y_2;
        y_2 = y_5 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_2_by_6_14() {
        final double t = x_6 * x_2 + x_14 * y_2;
        y_2 = y_6 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_2_by_7_14() {
        final double t = x_7 * x_2 + x_14 * y_2;
        y_2 = y_7 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_2_by_8_14() {
        final double t = x_8 * x_2 + x_14 * y_2;
        y_2 = y_8 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_2_by_9_14() {
        final double t = x_9 * x_2 + x_14 * y_2;
        y_2 = y_9 * x_2 + y_14 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_3_by_0_14() {
        final double t = x_0 * x_3 + x_14 * y_3;
        y_3 = y_0 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_3_by_1_14() {
        final double t = x_1 * x_3 + x_14 * y_3;
        y_3 = y_1 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_3_by_10_14() {
        final double t = x_10 * x_3 + x_14 * y_3;
        y_3 = y_10 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_3_by_11_14() {
        final double t = x_11 * x_3 + x_14 * y_3;
        y_3 = y_11 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_3_by_12_14() {
        final double t = x_12 * x_3 + x_14 * y_3;
        y_3 = y_12 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_3_by_13_14() {
        final double t = x_13 * x_3 + x_14 * y_3;
        y_3 = y_13 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_3_by_14_0() {
        final double t = x_14 * x_3 + x_0 * y_3;
        y_3 = y_14 * x_3 + y_0 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_3_by_14_1() {
        final double t = x_14 * x_3 + x_1 * y_3;
        y_3 = y_14 * x_3 + y_1 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_3_by_14_10() {
        final double t = x_14 * x_3 + x_10 * y_3;
        y_3 = y_14 * x_3 + y_10 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_3_by_14_11() {
        final double t = x_14 * x_3 + x_11 * y_3;
        y_3 = y_14 * x_3 + y_11 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_3_by_14_12() {
        final double t = x_14 * x_3 + x_12 * y_3;
        y_3 = y_14 * x_3 + y_12 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_3_by_14_13() {
        final double t = x_14 * x_3 + x_13 * y_3;
        y_3 = y_14 * x_3 + y_13 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_3_by_14_2() {
        final double t = x_14 * x_3 + x_2 * y_3;
        y_3 = y_14 * x_3 + y_2 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_3_by_14_4() {
        final double t = x_14 * x_3 + x_4 * y_3;
        y_3 = y_14 * x_3 + y_4 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_3_by_14_5() {
        final double t = x_14 * x_3 + x_5 * y_3;
        y_3 = y_14 * x_3 + y_5 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_3_by_14_6() {
        final double t = x_14 * x_3 + x_6 * y_3;
        y_3 = y_14 * x_3 + y_6 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_3_by_14_7() {
        final double t = x_14 * x_3 + x_7 * y_3;
        y_3 = y_14 * x_3 + y_7 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_3_by_14_8() {
        final double t = x_14 * x_3 + x_8 * y_3;
        y_3 = y_14 * x_3 + y_8 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_3_by_14_9() {
        final double t = x_14 * x_3 + x_9 * y_3;
        y_3 = y_14 * x_3 + y_9 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_3_by_2_14() {
        final double t = x_2 * x_3 + x_14 * y_3;
        y_3 = y_2 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_3_by_4_14() {
        final double t = x_4 * x_3 + x_14 * y_3;
        y_3 = y_4 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_3_by_5_14() {
        final double t = x_5 * x_3 + x_14 * y_3;
        y_3 = y_5 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_3_by_6_14() {
        final double t = x_6 * x_3 + x_14 * y_3;
        y_3 = y_6 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_3_by_7_14() {
        final double t = x_7 * x_3 + x_14 * y_3;
        y_3 = y_7 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_3_by_8_14() {
        final double t = x_8 * x_3 + x_14 * y_3;
        y_3 = y_8 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_3_by_9_14() {
        final double t = x_9 * x_3 + x_14 * y_3;
        y_3 = y_9 * x_3 + y_14 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_4_by_0_14() {
        final double t = x_0 * x_4 + x_14 * y_4;
        y_4 = y_0 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_4_by_1_14() {
        final double t = x_1 * x_4 + x_14 * y_4;
        y_4 = y_1 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_4_by_10_14() {
        final double t = x_10 * x_4 + x_14 * y_4;
        y_4 = y_10 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_4_by_11_14() {
        final double t = x_11 * x_4 + x_14 * y_4;
        y_4 = y_11 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_4_by_12_14() {
        final double t = x_12 * x_4 + x_14 * y_4;
        y_4 = y_12 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_4_by_13_14() {
        final double t = x_13 * x_4 + x_14 * y_4;
        y_4 = y_13 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_4_by_14_0() {
        final double t = x_14 * x_4 + x_0 * y_4;
        y_4 = y_14 * x_4 + y_0 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_4_by_14_1() {
        final double t = x_14 * x_4 + x_1 * y_4;
        y_4 = y_14 * x_4 + y_1 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_4_by_14_10() {
        final double t = x_14 * x_4 + x_10 * y_4;
        y_4 = y_14 * x_4 + y_10 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_4_by_14_11() {
        final double t = x_14 * x_4 + x_11 * y_4;
        y_4 = y_14 * x_4 + y_11 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_4_by_14_12() {
        final double t = x_14 * x_4 + x_12 * y_4;
        y_4 = y_14 * x_4 + y_12 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_4_by_14_13() {
        final double t = x_14 * x_4 + x_13 * y_4;
        y_4 = y_14 * x_4 + y_13 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_4_by_14_2() {
        final double t = x_14 * x_4 + x_2 * y_4;
        y_4 = y_14 * x_4 + y_2 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_4_by_14_3() {
        final double t = x_14 * x_4 + x_3 * y_4;
        y_4 = y_14 * x_4 + y_3 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_4_by_14_5() {
        final double t = x_14 * x_4 + x_5 * y_4;
        y_4 = y_14 * x_4 + y_5 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_4_by_14_6() {
        final double t = x_14 * x_4 + x_6 * y_4;
        y_4 = y_14 * x_4 + y_6 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_4_by_14_7() {
        final double t = x_14 * x_4 + x_7 * y_4;
        y_4 = y_14 * x_4 + y_7 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_4_by_14_8() {
        final double t = x_14 * x_4 + x_8 * y_4;
        y_4 = y_14 * x_4 + y_8 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_4_by_14_9() {
        final double t = x_14 * x_4 + x_9 * y_4;
        y_4 = y_14 * x_4 + y_9 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_4_by_2_14() {
        final double t = x_2 * x_4 + x_14 * y_4;
        y_4 = y_2 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_4_by_3_14() {
        final double t = x_3 * x_4 + x_14 * y_4;
        y_4 = y_3 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_4_by_5_14() {
        final double t = x_5 * x_4 + x_14 * y_4;
        y_4 = y_5 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_4_by_6_14() {
        final double t = x_6 * x_4 + x_14 * y_4;
        y_4 = y_6 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_4_by_7_14() {
        final double t = x_7 * x_4 + x_14 * y_4;
        y_4 = y_7 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_4_by_8_14() {
        final double t = x_8 * x_4 + x_14 * y_4;
        y_4 = y_8 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_4_by_9_14() {
        final double t = x_9 * x_4 + x_14 * y_4;
        y_4 = y_9 * x_4 + y_14 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_5_by_0_14() {
        final double t = x_0 * x_5 + x_14 * y_5;
        y_5 = y_0 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_5_by_1_14() {
        final double t = x_1 * x_5 + x_14 * y_5;
        y_5 = y_1 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_5_by_10_14() {
        final double t = x_10 * x_5 + x_14 * y_5;
        y_5 = y_10 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_5_by_11_14() {
        final double t = x_11 * x_5 + x_14 * y_5;
        y_5 = y_11 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_5_by_12_14() {
        final double t = x_12 * x_5 + x_14 * y_5;
        y_5 = y_12 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_5_by_13_14() {
        final double t = x_13 * x_5 + x_14 * y_5;
        y_5 = y_13 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_5_by_14_0() {
        final double t = x_14 * x_5 + x_0 * y_5;
        y_5 = y_14 * x_5 + y_0 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_5_by_14_1() {
        final double t = x_14 * x_5 + x_1 * y_5;
        y_5 = y_14 * x_5 + y_1 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_5_by_14_10() {
        final double t = x_14 * x_5 + x_10 * y_5;
        y_5 = y_14 * x_5 + y_10 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_5_by_14_11() {
        final double t = x_14 * x_5 + x_11 * y_5;
        y_5 = y_14 * x_5 + y_11 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_5_by_14_12() {
        final double t = x_14 * x_5 + x_12 * y_5;
        y_5 = y_14 * x_5 + y_12 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_5_by_14_13() {
        final double t = x_14 * x_5 + x_13 * y_5;
        y_5 = y_14 * x_5 + y_13 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_5_by_14_2() {
        final double t = x_14 * x_5 + x_2 * y_5;
        y_5 = y_14 * x_5 + y_2 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_5_by_14_3() {
        final double t = x_14 * x_5 + x_3 * y_5;
        y_5 = y_14 * x_5 + y_3 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_5_by_14_4() {
        final double t = x_14 * x_5 + x_4 * y_5;
        y_5 = y_14 * x_5 + y_4 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_5_by_14_6() {
        final double t = x_14 * x_5 + x_6 * y_5;
        y_5 = y_14 * x_5 + y_6 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_5_by_14_7() {
        final double t = x_14 * x_5 + x_7 * y_5;
        y_5 = y_14 * x_5 + y_7 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_5_by_14_8() {
        final double t = x_14 * x_5 + x_8 * y_5;
        y_5 = y_14 * x_5 + y_8 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_5_by_14_9() {
        final double t = x_14 * x_5 + x_9 * y_5;
        y_5 = y_14 * x_5 + y_9 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_5_by_2_14() {
        final double t = x_2 * x_5 + x_14 * y_5;
        y_5 = y_2 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_5_by_3_14() {
        final double t = x_3 * x_5 + x_14 * y_5;
        y_5 = y_3 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_5_by_4_14() {
        final double t = x_4 * x_5 + x_14 * y_5;
        y_5 = y_4 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_5_by_6_14() {
        final double t = x_6 * x_5 + x_14 * y_5;
        y_5 = y_6 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_5_by_7_14() {
        final double t = x_7 * x_5 + x_14 * y_5;
        y_5 = y_7 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_5_by_8_14() {
        final double t = x_8 * x_5 + x_14 * y_5;
        y_5 = y_8 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_5_by_9_14() {
        final double t = x_9 * x_5 + x_14 * y_5;
        y_5 = y_9 * x_5 + y_14 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_6_by_0_14() {
        final double t = x_0 * x_6 + x_14 * y_6;
        y_6 = y_0 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_6_by_1_14() {
        final double t = x_1 * x_6 + x_14 * y_6;
        y_6 = y_1 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_6_by_10_14() {
        final double t = x_10 * x_6 + x_14 * y_6;
        y_6 = y_10 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_6_by_11_14() {
        final double t = x_11 * x_6 + x_14 * y_6;
        y_6 = y_11 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_6_by_12_14() {
        final double t = x_12 * x_6 + x_14 * y_6;
        y_6 = y_12 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_6_by_13_14() {
        final double t = x_13 * x_6 + x_14 * y_6;
        y_6 = y_13 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_6_by_14_0() {
        final double t = x_14 * x_6 + x_0 * y_6;
        y_6 = y_14 * x_6 + y_0 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_6_by_14_1() {
        final double t = x_14 * x_6 + x_1 * y_6;
        y_6 = y_14 * x_6 + y_1 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_6_by_14_10() {
        final double t = x_14 * x_6 + x_10 * y_6;
        y_6 = y_14 * x_6 + y_10 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_6_by_14_11() {
        final double t = x_14 * x_6 + x_11 * y_6;
        y_6 = y_14 * x_6 + y_11 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_6_by_14_12() {
        final double t = x_14 * x_6 + x_12 * y_6;
        y_6 = y_14 * x_6 + y_12 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_6_by_14_13() {
        final double t = x_14 * x_6 + x_13 * y_6;
        y_6 = y_14 * x_6 + y_13 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_6_by_14_2() {
        final double t = x_14 * x_6 + x_2 * y_6;
        y_6 = y_14 * x_6 + y_2 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_6_by_14_3() {
        final double t = x_14 * x_6 + x_3 * y_6;
        y_6 = y_14 * x_6 + y_3 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_6_by_14_4() {
        final double t = x_14 * x_6 + x_4 * y_6;
        y_6 = y_14 * x_6 + y_4 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_6_by_14_5() {
        final double t = x_14 * x_6 + x_5 * y_6;
        y_6 = y_14 * x_6 + y_5 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_6_by_14_7() {
        final double t = x_14 * x_6 + x_7 * y_6;
        y_6 = y_14 * x_6 + y_7 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_6_by_14_8() {
        final double t = x_14 * x_6 + x_8 * y_6;
        y_6 = y_14 * x_6 + y_8 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_6_by_14_9() {
        final double t = x_14 * x_6 + x_9 * y_6;
        y_6 = y_14 * x_6 + y_9 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_6_by_2_14() {
        final double t = x_2 * x_6 + x_14 * y_6;
        y_6 = y_2 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_6_by_3_14() {
        final double t = x_3 * x_6 + x_14 * y_6;
        y_6 = y_3 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_6_by_4_14() {
        final double t = x_4 * x_6 + x_14 * y_6;
        y_6 = y_4 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_6_by_5_14() {
        final double t = x_5 * x_6 + x_14 * y_6;
        y_6 = y_5 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_6_by_7_14() {
        final double t = x_7 * x_6 + x_14 * y_6;
        y_6 = y_7 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_6_by_8_14() {
        final double t = x_8 * x_6 + x_14 * y_6;
        y_6 = y_8 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_6_by_9_14() {
        final double t = x_9 * x_6 + x_14 * y_6;
        y_6 = y_9 * x_6 + y_14 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_7_by_0_14() {
        final double t = x_0 * x_7 + x_14 * y_7;
        y_7 = y_0 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_7_by_1_14() {
        final double t = x_1 * x_7 + x_14 * y_7;
        y_7 = y_1 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_7_by_10_14() {
        final double t = x_10 * x_7 + x_14 * y_7;
        y_7 = y_10 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_7_by_11_14() {
        final double t = x_11 * x_7 + x_14 * y_7;
        y_7 = y_11 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_7_by_12_14() {
        final double t = x_12 * x_7 + x_14 * y_7;
        y_7 = y_12 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_7_by_13_14() {
        final double t = x_13 * x_7 + x_14 * y_7;
        y_7 = y_13 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_7_by_14_0() {
        final double t = x_14 * x_7 + x_0 * y_7;
        y_7 = y_14 * x_7 + y_0 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_7_by_14_1() {
        final double t = x_14 * x_7 + x_1 * y_7;
        y_7 = y_14 * x_7 + y_1 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_7_by_14_10() {
        final double t = x_14 * x_7 + x_10 * y_7;
        y_7 = y_14 * x_7 + y_10 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_7_by_14_11() {
        final double t = x_14 * x_7 + x_11 * y_7;
        y_7 = y_14 * x_7 + y_11 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_7_by_14_12() {
        final double t = x_14 * x_7 + x_12 * y_7;
        y_7 = y_14 * x_7 + y_12 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_7_by_14_13() {
        final double t = x_14 * x_7 + x_13 * y_7;
        y_7 = y_14 * x_7 + y_13 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_7_by_14_2() {
        final double t = x_14 * x_7 + x_2 * y_7;
        y_7 = y_14 * x_7 + y_2 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_7_by_14_3() {
        final double t = x_14 * x_7 + x_3 * y_7;
        y_7 = y_14 * x_7 + y_3 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_7_by_14_4() {
        final double t = x_14 * x_7 + x_4 * y_7;
        y_7 = y_14 * x_7 + y_4 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_7_by_14_5() {
        final double t = x_14 * x_7 + x_5 * y_7;
        y_7 = y_14 * x_7 + y_5 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_7_by_14_6() {
        final double t = x_14 * x_7 + x_6 * y_7;
        y_7 = y_14 * x_7 + y_6 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_7_by_14_8() {
        final double t = x_14 * x_7 + x_8 * y_7;
        y_7 = y_14 * x_7 + y_8 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_7_by_14_9() {
        final double t = x_14 * x_7 + x_9 * y_7;
        y_7 = y_14 * x_7 + y_9 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_7_by_2_14() {
        final double t = x_2 * x_7 + x_14 * y_7;
        y_7 = y_2 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_7_by_3_14() {
        final double t = x_3 * x_7 + x_14 * y_7;
        y_7 = y_3 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_7_by_4_14() {
        final double t = x_4 * x_7 + x_14 * y_7;
        y_7 = y_4 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_7_by_5_14() {
        final double t = x_5 * x_7 + x_14 * y_7;
        y_7 = y_5 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_7_by_6_14() {
        final double t = x_6 * x_7 + x_14 * y_7;
        y_7 = y_6 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_7_by_8_14() {
        final double t = x_8 * x_7 + x_14 * y_7;
        y_7 = y_8 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_7_by_9_14() {
        final double t = x_9 * x_7 + x_14 * y_7;
        y_7 = y_9 * x_7 + y_14 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_8_by_0_14() {
        final double t = x_0 * x_8 + x_14 * y_8;
        y_8 = y_0 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_8_by_1_14() {
        final double t = x_1 * x_8 + x_14 * y_8;
        y_8 = y_1 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_8_by_10_14() {
        final double t = x_10 * x_8 + x_14 * y_8;
        y_8 = y_10 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_8_by_11_14() {
        final double t = x_11 * x_8 + x_14 * y_8;
        y_8 = y_11 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_8_by_12_14() {
        final double t = x_12 * x_8 + x_14 * y_8;
        y_8 = y_12 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_8_by_13_14() {
        final double t = x_13 * x_8 + x_14 * y_8;
        y_8 = y_13 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_8_by_14_0() {
        final double t = x_14 * x_8 + x_0 * y_8;
        y_8 = y_14 * x_8 + y_0 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_8_by_14_1() {
        final double t = x_14 * x_8 + x_1 * y_8;
        y_8 = y_14 * x_8 + y_1 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_8_by_14_10() {
        final double t = x_14 * x_8 + x_10 * y_8;
        y_8 = y_14 * x_8 + y_10 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_8_by_14_11() {
        final double t = x_14 * x_8 + x_11 * y_8;
        y_8 = y_14 * x_8 + y_11 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_8_by_14_12() {
        final double t = x_14 * x_8 + x_12 * y_8;
        y_8 = y_14 * x_8 + y_12 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_8_by_14_13() {
        final double t = x_14 * x_8 + x_13 * y_8;
        y_8 = y_14 * x_8 + y_13 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_8_by_14_2() {
        final double t = x_14 * x_8 + x_2 * y_8;
        y_8 = y_14 * x_8 + y_2 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_8_by_14_3() {
        final double t = x_14 * x_8 + x_3 * y_8;
        y_8 = y_14 * x_8 + y_3 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_8_by_14_4() {
        final double t = x_14 * x_8 + x_4 * y_8;
        y_8 = y_14 * x_8 + y_4 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_8_by_14_5() {
        final double t = x_14 * x_8 + x_5 * y_8;
        y_8 = y_14 * x_8 + y_5 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_8_by_14_6() {
        final double t = x_14 * x_8 + x_6 * y_8;
        y_8 = y_14 * x_8 + y_6 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_8_by_14_7() {
        final double t = x_14 * x_8 + x_7 * y_8;
        y_8 = y_14 * x_8 + y_7 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 14 and 9 vectors as columns */
    public void transform_8_by_14_9() {
        final double t = x_14 * x_8 + x_9 * y_8;
        y_8 = y_14 * x_8 + y_9 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_8_by_2_14() {
        final double t = x_2 * x_8 + x_14 * y_8;
        y_8 = y_2 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_8_by_3_14() {
        final double t = x_3 * x_8 + x_14 * y_8;
        y_8 = y_3 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_8_by_4_14() {
        final double t = x_4 * x_8 + x_14 * y_8;
        y_8 = y_4 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_8_by_5_14() {
        final double t = x_5 * x_8 + x_14 * y_8;
        y_8 = y_5 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_8_by_6_14() {
        final double t = x_6 * x_8 + x_14 * y_8;
        y_8 = y_6 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_8_by_7_14() {
        final double t = x_7 * x_8 + x_14 * y_8;
        y_8 = y_7 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 9 and 14 vectors as columns */
    public void transform_8_by_9_14() {
        final double t = x_9 * x_8 + x_14 * y_8;
        y_8 = y_9 * x_8 + y_14 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 0 and 14 vectors as columns */
    public void transform_9_by_0_14() {
        final double t = x_0 * x_9 + x_14 * y_9;
        y_9 = y_0 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 1 and 14 vectors as columns */
    public void transform_9_by_1_14() {
        final double t = x_1 * x_9 + x_14 * y_9;
        y_9 = y_1 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 10 and 14 vectors as columns */
    public void transform_9_by_10_14() {
        final double t = x_10 * x_9 + x_14 * y_9;
        y_9 = y_10 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 11 and 14 vectors as columns */
    public void transform_9_by_11_14() {
        final double t = x_11 * x_9 + x_14 * y_9;
        y_9 = y_11 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 12 and 14 vectors as columns */
    public void transform_9_by_12_14() {
        final double t = x_12 * x_9 + x_14 * y_9;
        y_9 = y_12 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 13 and 14 vectors as columns */
    public void transform_9_by_13_14() {
        final double t = x_13 * x_9 + x_14 * y_9;
        y_9 = y_13 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 0 vectors as columns */
    public void transform_9_by_14_0() {
        final double t = x_14 * x_9 + x_0 * y_9;
        y_9 = y_14 * x_9 + y_0 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 1 vectors as columns */
    public void transform_9_by_14_1() {
        final double t = x_14 * x_9 + x_1 * y_9;
        y_9 = y_14 * x_9 + y_1 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 10 vectors as columns */
    public void transform_9_by_14_10() {
        final double t = x_14 * x_9 + x_10 * y_9;
        y_9 = y_14 * x_9 + y_10 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 11 vectors as columns */
    public void transform_9_by_14_11() {
        final double t = x_14 * x_9 + x_11 * y_9;
        y_9 = y_14 * x_9 + y_11 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 12 vectors as columns */
    public void transform_9_by_14_12() {
        final double t = x_14 * x_9 + x_12 * y_9;
        y_9 = y_14 * x_9 + y_12 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 13 vectors as columns */
    public void transform_9_by_14_13() {
        final double t = x_14 * x_9 + x_13 * y_9;
        y_9 = y_14 * x_9 + y_13 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 2 vectors as columns */
    public void transform_9_by_14_2() {
        final double t = x_14 * x_9 + x_2 * y_9;
        y_9 = y_14 * x_9 + y_2 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 3 vectors as columns */
    public void transform_9_by_14_3() {
        final double t = x_14 * x_9 + x_3 * y_9;
        y_9 = y_14 * x_9 + y_3 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 4 vectors as columns */
    public void transform_9_by_14_4() {
        final double t = x_14 * x_9 + x_4 * y_9;
        y_9 = y_14 * x_9 + y_4 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 5 vectors as columns */
    public void transform_9_by_14_5() {
        final double t = x_14 * x_9 + x_5 * y_9;
        y_9 = y_14 * x_9 + y_5 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 6 vectors as columns */
    public void transform_9_by_14_6() {
        final double t = x_14 * x_9 + x_6 * y_9;
        y_9 = y_14 * x_9 + y_6 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 7 vectors as columns */
    public void transform_9_by_14_7() {
        final double t = x_14 * x_9 + x_7 * y_9;
        y_9 = y_14 * x_9 + y_7 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 14 and 8 vectors as columns */
    public void transform_9_by_14_8() {
        final double t = x_14 * x_9 + x_8 * y_9;
        y_9 = y_14 * x_9 + y_8 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 2 and 14 vectors as columns */
    public void transform_9_by_2_14() {
        final double t = x_2 * x_9 + x_14 * y_9;
        y_9 = y_2 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 3 and 14 vectors as columns */
    public void transform_9_by_3_14() {
        final double t = x_3 * x_9 + x_14 * y_9;
        y_9 = y_3 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 4 and 14 vectors as columns */
    public void transform_9_by_4_14() {
        final double t = x_4 * x_9 + x_14 * y_9;
        y_9 = y_4 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 5 and 14 vectors as columns */
    public void transform_9_by_5_14() {
        final double t = x_5 * x_9 + x_14 * y_9;
        y_9 = y_5 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 6 and 14 vectors as columns */
    public void transform_9_by_6_14() {
        final double t = x_6 * x_9 + x_14 * y_9;
        y_9 = y_6 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 7 and 14 vectors as columns */
    public void transform_9_by_7_14() {
        final double t = x_7 * x_9 + x_14 * y_9;
        y_9 = y_7 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 8 and 14 vectors as columns */
    public void transform_9_by_8_14() {
        final double t = x_8 * x_9 + x_14 * y_9;
        y_9 = y_8 * x_9 + y_14 * y_9;
        x_9 = t;
    }

    /** transpose the matrix formed by vector 0 and vector 14 where the vectors are columns */
    public void transpose_0_14() {
        final double t = y_0;
        y_0 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 1 and vector 14 where the vectors are columns */
    public void transpose_1_14() {
        final double t = y_1;
        y_1 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 10 and vector 14 where the vectors are columns */
    public void transpose_10_14() {
        final double t = y_10;
        y_10 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 11 and vector 14 where the vectors are columns */
    public void transpose_11_14() {
        final double t = y_11;
        y_11 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 12 and vector 14 where the vectors are columns */
    public void transpose_12_14() {
        final double t = y_12;
        y_12 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 13 and vector 14 where the vectors are columns */
    public void transpose_13_14() {
        final double t = y_13;
        y_13 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 0 where the vectors are columns */
    public void transpose_14_0() {
        final double t = y_14;
        y_14 = x_0;
        x_0 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 1 where the vectors are columns */
    public void transpose_14_1() {
        final double t = y_14;
        y_14 = x_1;
        x_1 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 10 where the vectors are columns */
    public void transpose_14_10() {
        final double t = y_14;
        y_14 = x_10;
        x_10 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 11 where the vectors are columns */
    public void transpose_14_11() {
        final double t = y_14;
        y_14 = x_11;
        x_11 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 12 where the vectors are columns */
    public void transpose_14_12() {
        final double t = y_14;
        y_14 = x_12;
        x_12 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 13 where the vectors are columns */
    public void transpose_14_13() {
        final double t = y_14;
        y_14 = x_13;
        x_13 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 2 where the vectors are columns */
    public void transpose_14_2() {
        final double t = y_14;
        y_14 = x_2;
        x_2 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 3 where the vectors are columns */
    public void transpose_14_3() {
        final double t = y_14;
        y_14 = x_3;
        x_3 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 4 where the vectors are columns */
    public void transpose_14_4() {
        final double t = y_14;
        y_14 = x_4;
        x_4 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 5 where the vectors are columns */
    public void transpose_14_5() {
        final double t = y_14;
        y_14 = x_5;
        x_5 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 6 where the vectors are columns */
    public void transpose_14_6() {
        final double t = y_14;
        y_14 = x_6;
        x_6 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 7 where the vectors are columns */
    public void transpose_14_7() {
        final double t = y_14;
        y_14 = x_7;
        x_7 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 8 where the vectors are columns */
    public void transpose_14_8() {
        final double t = y_14;
        y_14 = x_8;
        x_8 = t;
    }

    /** transpose the matrix formed by vector 14 and vector 9 where the vectors are columns */
    public void transpose_14_9() {
        final double t = y_14;
        y_14 = x_9;
        x_9 = t;
    }

    /** transpose the matrix formed by vector 2 and vector 14 where the vectors are columns */
    public void transpose_2_14() {
        final double t = y_2;
        y_2 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 3 and vector 14 where the vectors are columns */
    public void transpose_3_14() {
        final double t = y_3;
        y_3 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 4 and vector 14 where the vectors are columns */
    public void transpose_4_14() {
        final double t = y_4;
        y_4 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 5 and vector 14 where the vectors are columns */
    public void transpose_5_14() {
        final double t = y_5;
        y_5 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 6 and vector 14 where the vectors are columns */
    public void transpose_6_14() {
        final double t = y_6;
        y_6 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 7 and vector 14 where the vectors are columns */
    public void transpose_7_14() {
        final double t = y_7;
        y_7 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 8 and vector 14 where the vectors are columns */
    public void transpose_8_14() {
        final double t = y_8;
        y_8 = x_14;
        x_14 = t;
    }

    /** transpose the matrix formed by vector 9 and vector 14 where the vectors are columns */
    public void transpose_9_14() {
        final double t = y_9;
        y_9 = x_14;
        x_14 = t;
    }

    /** set the 14-vector to the (0,0) */
    public void zero_out_14() {
        x_14 = 0.0;
        y_14 = 0.0;
    }
}
