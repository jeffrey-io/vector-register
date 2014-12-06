package io.jeffrey.vector;

public class VectorRegister7 extends VectorRegister6 {
    public double x_6;
    public double y_6;

    public VectorRegister7() {
        x_6 = 0.0;
        y_6 = 0.0;
    }

    /** set the 6-vector to the given (x,y) */
    public void set6(double x, double y) {
        x_6 = x;
        y_6 = y;
    }

    /** add the 0 and 6 together and store the result to the 0 vector */
    public void add_6_to_0() {
        x_0 += x_6;
        y_0 += y_6;
    }

    /** add the 1 and 6 together and store the result to the 1 vector */
    public void add_6_to_1() {
        x_1 += x_6;
        y_1 += y_6;
    }

    /** add the 2 and 6 together and store the result to the 2 vector */
    public void add_6_to_2() {
        x_2 += x_6;
        y_2 += y_6;
    }

    /** add the 3 and 6 together and store the result to the 3 vector */
    public void add_6_to_3() {
        x_3 += x_6;
        y_3 += y_6;
    }

    /** add the 4 and 6 together and store the result to the 4 vector */
    public void add_6_to_4() {
        x_4 += x_6;
        y_4 += y_6;
    }

    /** add the 5 and 6 together and store the result to the 5 vector */
    public void add_6_to_5() {
        x_5 += x_6;
        y_5 += y_6;
    }

    /** add the 6 and 0 together and store the result to the 6 vector */
    public void add_0_to_6() {
        x_6 += x_0;
        y_6 += y_0;
    }

    /** add the 6 and 1 together and store the result to the 6 vector */
    public void add_1_to_6() {
        x_6 += x_1;
        y_6 += y_1;
    }

    /** add the 6 and 2 together and store the result to the 6 vector */
    public void add_2_to_6() {
        x_6 += x_2;
        y_6 += y_2;
    }

    /** add the 6 and 3 together and store the result to the 6 vector */
    public void add_3_to_6() {
        x_6 += x_3;
        y_6 += y_3;
    }

    /** add the 6 and 4 together and store the result to the 6 vector */
    public void add_4_to_6() {
        x_6 += x_4;
        y_6 += y_4;
    }

    /** add the 6 and 5 together and store the result to the 6 vector */
    public void add_5_to_6() {
        x_6 += x_5;
        y_6 += y_5;
    }

    /** set the 6-vector to the (0,0) */
    public void zeroOut6() {
        x_6 = 0.0;
        y_6 = 0.0;
    }

    /** copy the 6 vector into the 0 vector */
    public void copy_from_6_to_0() {
        x_0 = x_6;
        y_0 = y_6;
    }

    /** copy the 6 vector into the 1 vector */
    public void copy_from_6_to_1() {
        x_1 = x_6;
        y_1 = y_6;
    }

    /** copy the 6 vector into the 2 vector */
    public void copy_from_6_to_2() {
        x_2 = x_6;
        y_2 = y_6;
    }

    /** copy the 6 vector into the 3 vector */
    public void copy_from_6_to_3() {
        x_3 = x_6;
        y_3 = y_6;
    }

    /** copy the 6 vector into the 4 vector */
    public void copy_from_6_to_4() {
        x_4 = x_6;
        y_4 = y_6;
    }

    /** copy the 6 vector into the 5 vector */
    public void copy_from_6_to_5() {
        x_5 = x_6;
        y_5 = y_6;
    }

    /** copy the 0 vector into the 6 vector */
    public void copy_from_0_to_6() {
        x_6 = x_0;
        y_6 = y_0;
    }

    /** copy the 1 vector into the 6 vector */
    public void copy_from_1_to_6() {
        x_6 = x_1;
        y_6 = y_1;
    }

    /** copy the 2 vector into the 6 vector */
    public void copy_from_2_to_6() {
        x_6 = x_2;
        y_6 = y_2;
    }

    /** copy the 3 vector into the 6 vector */
    public void copy_from_3_to_6() {
        x_6 = x_3;
        y_6 = y_3;
    }

    /** copy the 4 vector into the 6 vector */
    public void copy_from_4_to_6() {
        x_6 = x_4;
        y_6 = y_4;
    }

    /** copy the 5 vector into the 6 vector */
    public void copy_from_5_to_6() {
        x_6 = x_5;
        y_6 = y_5;
    }

    /** extract the 6-vector into the given output array starting at the given offset */
    public void extract6(final double[] output, int offset) {
        output[offset + 0] = x_6;
        output[offset + 1] = y_6;
    }

    /** inject the given input starting at the given offset into the 6-vector */
    public void inject6(final double[] input, int offset) {
        x_6 = input[offset + 0];
        y_6 = input[offset + 1];
    }

    /** subtract the 0 and 6 together and store the result to the 0 vector */
    public void sub_6_from_0() {
        x_0 -= x_6;
        y_0 -= y_6;
    }

    /** subtract the 1 and 6 together and store the result to the 1 vector */
    public void sub_6_from_1() {
        x_1 -= x_6;
        y_1 -= y_6;
    }

    /** subtract the 2 and 6 together and store the result to the 2 vector */
    public void sub_6_from_2() {
        x_2 -= x_6;
        y_2 -= y_6;
    }

    /** subtract the 3 and 6 together and store the result to the 3 vector */
    public void sub_6_from_3() {
        x_3 -= x_6;
        y_3 -= y_6;
    }

    /** subtract the 4 and 6 together and store the result to the 4 vector */
    public void sub_6_from_4() {
        x_4 -= x_6;
        y_4 -= y_6;
    }

    /** subtract the 5 and 6 together and store the result to the 5 vector */
    public void sub_6_from_5() {
        x_5 -= x_6;
        y_5 -= y_6;
    }

    /** subtract the 6 and 0 together and store the result to the 6 vector */
    public void sub_0_from_6() {
        x_6 -= x_0;
        y_6 -= y_0;
    }

    /** subtract the 6 and 1 together and store the result to the 6 vector */
    public void sub_1_from_6() {
        x_6 -= x_1;
        y_6 -= y_1;
    }

    /** subtract the 6 and 2 together and store the result to the 6 vector */
    public void sub_2_from_6() {
        x_6 -= x_2;
        y_6 -= y_2;
    }

    /** subtract the 6 and 3 together and store the result to the 6 vector */
    public void sub_3_from_6() {
        x_6 -= x_3;
        y_6 -= y_3;
    }

    /** subtract the 6 and 4 together and store the result to the 6 vector */
    public void sub_4_from_6() {
        x_6 -= x_4;
        y_6 -= y_4;
    }

    /** subtract the 6 and 5 together and store the result to the 6 vector */
    public void sub_5_from_6() {
        x_6 -= x_5;
        y_6 -= y_5;
    }

    /** multiply vector 6 by the given scalar */
    public void mult_6_by(double s) {
        x_6 *= s;
        y_6 *= s;
    }

    /** divide vector 6 by the given scalar */
    public void div_6_by(double s) {
        x_6 *= s;
        y_6 *= s;
    }

    /** treat vector 6 as a complex number and conjugate it */
    public void conjugate_6() {
        y_6 *= -1;
    }

    /** multiply via complex numbers the 0 and 6 together and store the result to the 0 vector */
    public void complex_mult6_0() {
        double t = x_0 * x_6 - y_0 * y_6;
        y_0 = x_0 * y_6 + y_0 * x_6;
        x_0 = t;
    }

    /** multiply via complex numbers the 1 and 6 together and store the result to the 1 vector */
    public void complex_mult6_1() {
        double t = x_1 * x_6 - y_1 * y_6;
        y_1 = x_1 * y_6 + y_1 * x_6;
        x_1 = t;
    }

    /** multiply via complex numbers the 2 and 6 together and store the result to the 2 vector */
    public void complex_mult6_2() {
        double t = x_2 * x_6 - y_2 * y_6;
        y_2 = x_2 * y_6 + y_2 * x_6;
        x_2 = t;
    }

    /** multiply via complex numbers the 3 and 6 together and store the result to the 3 vector */
    public void complex_mult6_3() {
        double t = x_3 * x_6 - y_3 * y_6;
        y_3 = x_3 * y_6 + y_3 * x_6;
        x_3 = t;
    }

    /** multiply via complex numbers the 4 and 6 together and store the result to the 4 vector */
    public void complex_mult6_4() {
        double t = x_4 * x_6 - y_4 * y_6;
        y_4 = x_4 * y_6 + y_4 * x_6;
        x_4 = t;
    }

    /** multiply via complex numbers the 5 and 6 together and store the result to the 5 vector */
    public void complex_mult6_5() {
        double t = x_5 * x_6 - y_5 * y_6;
        y_5 = x_5 * y_6 + y_5 * x_6;
        x_5 = t;
    }

    /** multiply via complex numbers the 6 and 0 together and store the result to the 6 vector */
    public void complex_mult0_6() {
        double t = x_6 * x_0 - y_6 * y_0;
        y_6 = x_6 * y_0 + y_6 * x_0;
        x_6 = t;
    }

    /** multiply via complex numbers the 6 and 1 together and store the result to the 6 vector */
    public void complex_mult1_6() {
        double t = x_6 * x_1 - y_6 * y_1;
        y_6 = x_6 * y_1 + y_6 * x_1;
        x_6 = t;
    }

    /** multiply via complex numbers the 6 and 2 together and store the result to the 6 vector */
    public void complex_mult2_6() {
        double t = x_6 * x_2 - y_6 * y_2;
        y_6 = x_6 * y_2 + y_6 * x_2;
        x_6 = t;
    }

    /** multiply via complex numbers the 6 and 3 together and store the result to the 6 vector */
    public void complex_mult3_6() {
        double t = x_6 * x_3 - y_6 * y_3;
        y_6 = x_6 * y_3 + y_6 * x_3;
        x_6 = t;
    }

    /** multiply via complex numbers the 6 and 4 together and store the result to the 6 vector */
    public void complex_mult4_6() {
        double t = x_6 * x_4 - y_6 * y_4;
        y_6 = x_6 * y_4 + y_6 * x_4;
        x_6 = t;
    }

    /** multiply via complex numbers the 6 and 5 together and store the result to the 6 vector */
    public void complex_mult5_6() {
        double t = x_6 * x_5 - y_6 * y_5;
        y_6 = x_6 * y_5 + y_6 * x_5;
        x_6 = t;
    }

    /** compute and return the length of vector 6 */
    public double length_6() {
        double d = 0.0;
        d += x_6 * x_6;
        d += y_6 * y_6;
        return Math.sqrt(d);
    }

    /** normalize the 6-vector if it is not the origin */
    public boolean normalize_6() {
        double d = 0.0;
        d += x_6 * x_6;
        d += y_6 * y_6;
        if (Math.abs(d) < ZERO_LIMIT)
            return false;
        d = Math.sqrt(d);
        d = 1.0 / d;
        x_6 *= d;
        y_6 *= d;
        return true;
    }

    /** transform the 6 vector by the matrixed formed by the 0 and 1 vectors as columns */
    public void transform_6_by_0_1() {
        double t = x_0 * x_6 + x_1 * y_6;
        y_6 = y_0 * x_6 + y_1 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 0 and 2 vectors as columns */
    public void transform_6_by_0_2() {
        double t = x_0 * x_6 + x_2 * y_6;
        y_6 = y_0 * x_6 + y_2 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 0 and 3 vectors as columns */
    public void transform_6_by_0_3() {
        double t = x_0 * x_6 + x_3 * y_6;
        y_6 = y_0 * x_6 + y_3 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 0 and 4 vectors as columns */
    public void transform_6_by_0_4() {
        double t = x_0 * x_6 + x_4 * y_6;
        y_6 = y_0 * x_6 + y_4 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 0 and 5 vectors as columns */
    public void transform_6_by_0_5() {
        double t = x_0 * x_6 + x_5 * y_6;
        y_6 = y_0 * x_6 + y_5 * y_6;
        x_6 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 0 and 6 vectors as columns */
    public void transform_1_by_0_6() {
        double t = x_0 * x_1 + x_6 * y_1;
        y_1 = y_0 * x_1 + y_6 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 0 and 6 vectors as columns */
    public void transform_2_by_0_6() {
        double t = x_0 * x_2 + x_6 * y_2;
        y_2 = y_0 * x_2 + y_6 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 0 and 6 vectors as columns */
    public void transform_3_by_0_6() {
        double t = x_0 * x_3 + x_6 * y_3;
        y_3 = y_0 * x_3 + y_6 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 0 and 6 vectors as columns */
    public void transform_4_by_0_6() {
        double t = x_0 * x_4 + x_6 * y_4;
        y_4 = y_0 * x_4 + y_6 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 0 and 6 vectors as columns */
    public void transform_5_by_0_6() {
        double t = x_0 * x_5 + x_6 * y_5;
        y_5 = y_0 * x_5 + y_6 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 1 and 0 vectors as columns */
    public void transform_6_by_1_0() {
        double t = x_1 * x_6 + x_0 * y_6;
        y_6 = y_1 * x_6 + y_0 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 1 and 2 vectors as columns */
    public void transform_6_by_1_2() {
        double t = x_1 * x_6 + x_2 * y_6;
        y_6 = y_1 * x_6 + y_2 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 1 and 3 vectors as columns */
    public void transform_6_by_1_3() {
        double t = x_1 * x_6 + x_3 * y_6;
        y_6 = y_1 * x_6 + y_3 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 1 and 4 vectors as columns */
    public void transform_6_by_1_4() {
        double t = x_1 * x_6 + x_4 * y_6;
        y_6 = y_1 * x_6 + y_4 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 1 and 5 vectors as columns */
    public void transform_6_by_1_5() {
        double t = x_1 * x_6 + x_5 * y_6;
        y_6 = y_1 * x_6 + y_5 * y_6;
        x_6 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 1 and 6 vectors as columns */
    public void transform_0_by_1_6() {
        double t = x_1 * x_0 + x_6 * y_0;
        y_0 = y_1 * x_0 + y_6 * y_0;
        x_0 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 1 and 6 vectors as columns */
    public void transform_2_by_1_6() {
        double t = x_1 * x_2 + x_6 * y_2;
        y_2 = y_1 * x_2 + y_6 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 1 and 6 vectors as columns */
    public void transform_3_by_1_6() {
        double t = x_1 * x_3 + x_6 * y_3;
        y_3 = y_1 * x_3 + y_6 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 1 and 6 vectors as columns */
    public void transform_4_by_1_6() {
        double t = x_1 * x_4 + x_6 * y_4;
        y_4 = y_1 * x_4 + y_6 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 1 and 6 vectors as columns */
    public void transform_5_by_1_6() {
        double t = x_1 * x_5 + x_6 * y_5;
        y_5 = y_1 * x_5 + y_6 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 2 and 0 vectors as columns */
    public void transform_6_by_2_0() {
        double t = x_2 * x_6 + x_0 * y_6;
        y_6 = y_2 * x_6 + y_0 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 2 and 1 vectors as columns */
    public void transform_6_by_2_1() {
        double t = x_2 * x_6 + x_1 * y_6;
        y_6 = y_2 * x_6 + y_1 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 2 and 3 vectors as columns */
    public void transform_6_by_2_3() {
        double t = x_2 * x_6 + x_3 * y_6;
        y_6 = y_2 * x_6 + y_3 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 2 and 4 vectors as columns */
    public void transform_6_by_2_4() {
        double t = x_2 * x_6 + x_4 * y_6;
        y_6 = y_2 * x_6 + y_4 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 2 and 5 vectors as columns */
    public void transform_6_by_2_5() {
        double t = x_2 * x_6 + x_5 * y_6;
        y_6 = y_2 * x_6 + y_5 * y_6;
        x_6 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 2 and 6 vectors as columns */
    public void transform_0_by_2_6() {
        double t = x_2 * x_0 + x_6 * y_0;
        y_0 = y_2 * x_0 + y_6 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 2 and 6 vectors as columns */
    public void transform_1_by_2_6() {
        double t = x_2 * x_1 + x_6 * y_1;
        y_1 = y_2 * x_1 + y_6 * y_1;
        x_1 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 2 and 6 vectors as columns */
    public void transform_3_by_2_6() {
        double t = x_2 * x_3 + x_6 * y_3;
        y_3 = y_2 * x_3 + y_6 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 2 and 6 vectors as columns */
    public void transform_4_by_2_6() {
        double t = x_2 * x_4 + x_6 * y_4;
        y_4 = y_2 * x_4 + y_6 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 2 and 6 vectors as columns */
    public void transform_5_by_2_6() {
        double t = x_2 * x_5 + x_6 * y_5;
        y_5 = y_2 * x_5 + y_6 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 3 and 0 vectors as columns */
    public void transform_6_by_3_0() {
        double t = x_3 * x_6 + x_0 * y_6;
        y_6 = y_3 * x_6 + y_0 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 3 and 1 vectors as columns */
    public void transform_6_by_3_1() {
        double t = x_3 * x_6 + x_1 * y_6;
        y_6 = y_3 * x_6 + y_1 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 3 and 2 vectors as columns */
    public void transform_6_by_3_2() {
        double t = x_3 * x_6 + x_2 * y_6;
        y_6 = y_3 * x_6 + y_2 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 3 and 4 vectors as columns */
    public void transform_6_by_3_4() {
        double t = x_3 * x_6 + x_4 * y_6;
        y_6 = y_3 * x_6 + y_4 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 3 and 5 vectors as columns */
    public void transform_6_by_3_5() {
        double t = x_3 * x_6 + x_5 * y_6;
        y_6 = y_3 * x_6 + y_5 * y_6;
        x_6 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 3 and 6 vectors as columns */
    public void transform_0_by_3_6() {
        double t = x_3 * x_0 + x_6 * y_0;
        y_0 = y_3 * x_0 + y_6 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 3 and 6 vectors as columns */
    public void transform_1_by_3_6() {
        double t = x_3 * x_1 + x_6 * y_1;
        y_1 = y_3 * x_1 + y_6 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 3 and 6 vectors as columns */
    public void transform_2_by_3_6() {
        double t = x_3 * x_2 + x_6 * y_2;
        y_2 = y_3 * x_2 + y_6 * y_2;
        x_2 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 3 and 6 vectors as columns */
    public void transform_4_by_3_6() {
        double t = x_3 * x_4 + x_6 * y_4;
        y_4 = y_3 * x_4 + y_6 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 3 and 6 vectors as columns */
    public void transform_5_by_3_6() {
        double t = x_3 * x_5 + x_6 * y_5;
        y_5 = y_3 * x_5 + y_6 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 4 and 0 vectors as columns */
    public void transform_6_by_4_0() {
        double t = x_4 * x_6 + x_0 * y_6;
        y_6 = y_4 * x_6 + y_0 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 4 and 1 vectors as columns */
    public void transform_6_by_4_1() {
        double t = x_4 * x_6 + x_1 * y_6;
        y_6 = y_4 * x_6 + y_1 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 4 and 2 vectors as columns */
    public void transform_6_by_4_2() {
        double t = x_4 * x_6 + x_2 * y_6;
        y_6 = y_4 * x_6 + y_2 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 4 and 3 vectors as columns */
    public void transform_6_by_4_3() {
        double t = x_4 * x_6 + x_3 * y_6;
        y_6 = y_4 * x_6 + y_3 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 4 and 5 vectors as columns */
    public void transform_6_by_4_5() {
        double t = x_4 * x_6 + x_5 * y_6;
        y_6 = y_4 * x_6 + y_5 * y_6;
        x_6 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 4 and 6 vectors as columns */
    public void transform_0_by_4_6() {
        double t = x_4 * x_0 + x_6 * y_0;
        y_0 = y_4 * x_0 + y_6 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 4 and 6 vectors as columns */
    public void transform_1_by_4_6() {
        double t = x_4 * x_1 + x_6 * y_1;
        y_1 = y_4 * x_1 + y_6 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 4 and 6 vectors as columns */
    public void transform_2_by_4_6() {
        double t = x_4 * x_2 + x_6 * y_2;
        y_2 = y_4 * x_2 + y_6 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 4 and 6 vectors as columns */
    public void transform_3_by_4_6() {
        double t = x_4 * x_3 + x_6 * y_3;
        y_3 = y_4 * x_3 + y_6 * y_3;
        x_3 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 4 and 6 vectors as columns */
    public void transform_5_by_4_6() {
        double t = x_4 * x_5 + x_6 * y_5;
        y_5 = y_4 * x_5 + y_6 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 5 and 0 vectors as columns */
    public void transform_6_by_5_0() {
        double t = x_5 * x_6 + x_0 * y_6;
        y_6 = y_5 * x_6 + y_0 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 5 and 1 vectors as columns */
    public void transform_6_by_5_1() {
        double t = x_5 * x_6 + x_1 * y_6;
        y_6 = y_5 * x_6 + y_1 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 5 and 2 vectors as columns */
    public void transform_6_by_5_2() {
        double t = x_5 * x_6 + x_2 * y_6;
        y_6 = y_5 * x_6 + y_2 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 5 and 3 vectors as columns */
    public void transform_6_by_5_3() {
        double t = x_5 * x_6 + x_3 * y_6;
        y_6 = y_5 * x_6 + y_3 * y_6;
        x_6 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 5 and 4 vectors as columns */
    public void transform_6_by_5_4() {
        double t = x_5 * x_6 + x_4 * y_6;
        y_6 = y_5 * x_6 + y_4 * y_6;
        x_6 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 5 and 6 vectors as columns */
    public void transform_0_by_5_6() {
        double t = x_5 * x_0 + x_6 * y_0;
        y_0 = y_5 * x_0 + y_6 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 5 and 6 vectors as columns */
    public void transform_1_by_5_6() {
        double t = x_5 * x_1 + x_6 * y_1;
        y_1 = y_5 * x_1 + y_6 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 5 and 6 vectors as columns */
    public void transform_2_by_5_6() {
        double t = x_5 * x_2 + x_6 * y_2;
        y_2 = y_5 * x_2 + y_6 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 5 and 6 vectors as columns */
    public void transform_3_by_5_6() {
        double t = x_5 * x_3 + x_6 * y_3;
        y_3 = y_5 * x_3 + y_6 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 5 and 6 vectors as columns */
    public void transform_4_by_5_6() {
        double t = x_5 * x_4 + x_6 * y_4;
        y_4 = y_5 * x_4 + y_6 * y_4;
        x_4 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 6 and 0 vectors as columns */
    public void transform_1_by_6_0() {
        double t = x_6 * x_1 + x_0 * y_1;
        y_1 = y_6 * x_1 + y_0 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 6 and 0 vectors as columns */
    public void transform_2_by_6_0() {
        double t = x_6 * x_2 + x_0 * y_2;
        y_2 = y_6 * x_2 + y_0 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 6 and 0 vectors as columns */
    public void transform_3_by_6_0() {
        double t = x_6 * x_3 + x_0 * y_3;
        y_3 = y_6 * x_3 + y_0 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 6 and 0 vectors as columns */
    public void transform_4_by_6_0() {
        double t = x_6 * x_4 + x_0 * y_4;
        y_4 = y_6 * x_4 + y_0 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 6 and 0 vectors as columns */
    public void transform_5_by_6_0() {
        double t = x_6 * x_5 + x_0 * y_5;
        y_5 = y_6 * x_5 + y_0 * y_5;
        x_5 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 6 and 1 vectors as columns */
    public void transform_0_by_6_1() {
        double t = x_6 * x_0 + x_1 * y_0;
        y_0 = y_6 * x_0 + y_1 * y_0;
        x_0 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 6 and 1 vectors as columns */
    public void transform_2_by_6_1() {
        double t = x_6 * x_2 + x_1 * y_2;
        y_2 = y_6 * x_2 + y_1 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 6 and 1 vectors as columns */
    public void transform_3_by_6_1() {
        double t = x_6 * x_3 + x_1 * y_3;
        y_3 = y_6 * x_3 + y_1 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 6 and 1 vectors as columns */
    public void transform_4_by_6_1() {
        double t = x_6 * x_4 + x_1 * y_4;
        y_4 = y_6 * x_4 + y_1 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 6 and 1 vectors as columns */
    public void transform_5_by_6_1() {
        double t = x_6 * x_5 + x_1 * y_5;
        y_5 = y_6 * x_5 + y_1 * y_5;
        x_5 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 6 and 2 vectors as columns */
    public void transform_0_by_6_2() {
        double t = x_6 * x_0 + x_2 * y_0;
        y_0 = y_6 * x_0 + y_2 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 6 and 2 vectors as columns */
    public void transform_1_by_6_2() {
        double t = x_6 * x_1 + x_2 * y_1;
        y_1 = y_6 * x_1 + y_2 * y_1;
        x_1 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 6 and 2 vectors as columns */
    public void transform_3_by_6_2() {
        double t = x_6 * x_3 + x_2 * y_3;
        y_3 = y_6 * x_3 + y_2 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 6 and 2 vectors as columns */
    public void transform_4_by_6_2() {
        double t = x_6 * x_4 + x_2 * y_4;
        y_4 = y_6 * x_4 + y_2 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 6 and 2 vectors as columns */
    public void transform_5_by_6_2() {
        double t = x_6 * x_5 + x_2 * y_5;
        y_5 = y_6 * x_5 + y_2 * y_5;
        x_5 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 6 and 3 vectors as columns */
    public void transform_0_by_6_3() {
        double t = x_6 * x_0 + x_3 * y_0;
        y_0 = y_6 * x_0 + y_3 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 6 and 3 vectors as columns */
    public void transform_1_by_6_3() {
        double t = x_6 * x_1 + x_3 * y_1;
        y_1 = y_6 * x_1 + y_3 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 6 and 3 vectors as columns */
    public void transform_2_by_6_3() {
        double t = x_6 * x_2 + x_3 * y_2;
        y_2 = y_6 * x_2 + y_3 * y_2;
        x_2 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 6 and 3 vectors as columns */
    public void transform_4_by_6_3() {
        double t = x_6 * x_4 + x_3 * y_4;
        y_4 = y_6 * x_4 + y_3 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 6 and 3 vectors as columns */
    public void transform_5_by_6_3() {
        double t = x_6 * x_5 + x_3 * y_5;
        y_5 = y_6 * x_5 + y_3 * y_5;
        x_5 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 6 and 4 vectors as columns */
    public void transform_0_by_6_4() {
        double t = x_6 * x_0 + x_4 * y_0;
        y_0 = y_6 * x_0 + y_4 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 6 and 4 vectors as columns */
    public void transform_1_by_6_4() {
        double t = x_6 * x_1 + x_4 * y_1;
        y_1 = y_6 * x_1 + y_4 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 6 and 4 vectors as columns */
    public void transform_2_by_6_4() {
        double t = x_6 * x_2 + x_4 * y_2;
        y_2 = y_6 * x_2 + y_4 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 6 and 4 vectors as columns */
    public void transform_3_by_6_4() {
        double t = x_6 * x_3 + x_4 * y_3;
        y_3 = y_6 * x_3 + y_4 * y_3;
        x_3 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 6 and 4 vectors as columns */
    public void transform_5_by_6_4() {
        double t = x_6 * x_5 + x_4 * y_5;
        y_5 = y_6 * x_5 + y_4 * y_5;
        x_5 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 6 and 5 vectors as columns */
    public void transform_0_by_6_5() {
        double t = x_6 * x_0 + x_5 * y_0;
        y_0 = y_6 * x_0 + y_5 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 6 and 5 vectors as columns */
    public void transform_1_by_6_5() {
        double t = x_6 * x_1 + x_5 * y_1;
        y_1 = y_6 * x_1 + y_5 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 6 and 5 vectors as columns */
    public void transform_2_by_6_5() {
        double t = x_6 * x_2 + x_5 * y_2;
        y_2 = y_6 * x_2 + y_5 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 6 and 5 vectors as columns */
    public void transform_3_by_6_5() {
        double t = x_6 * x_3 + x_5 * y_3;
        y_3 = y_6 * x_3 + y_5 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 6 and 5 vectors as columns */
    public void transform_4_by_6_5() {
        double t = x_6 * x_4 + x_5 * y_4;
        y_4 = y_6 * x_4 + y_5 * y_4;
        x_4 = t;
    }

    /** invert the 2x2 matrix formed by vector 0 and vector 6 where the vectors are columns */
    public boolean invert_0_6() {
        double t = x_0;
        double invdet = x_0 * y_6 - y_0 * x_6;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_6 *= -1 * invdet;
        y_0 *= -1 * invdet;
        x_0 *= y_6 * invdet;
        y_6 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 1 and vector 6 where the vectors are columns */
    public boolean invert_1_6() {
        double t = x_1;
        double invdet = x_1 * y_6 - y_1 * x_6;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_6 *= -1 * invdet;
        y_1 *= -1 * invdet;
        x_1 *= y_6 * invdet;
        y_6 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 2 and vector 6 where the vectors are columns */
    public boolean invert_2_6() {
        double t = x_2;
        double invdet = x_2 * y_6 - y_2 * x_6;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_6 *= -1 * invdet;
        y_2 *= -1 * invdet;
        x_2 *= y_6 * invdet;
        y_6 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 3 and vector 6 where the vectors are columns */
    public boolean invert_3_6() {
        double t = x_3;
        double invdet = x_3 * y_6 - y_3 * x_6;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_6 *= -1 * invdet;
        y_3 *= -1 * invdet;
        x_3 *= y_6 * invdet;
        y_6 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 4 and vector 6 where the vectors are columns */
    public boolean invert_4_6() {
        double t = x_4;
        double invdet = x_4 * y_6 - y_4 * x_6;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_6 *= -1 * invdet;
        y_4 *= -1 * invdet;
        x_4 *= y_6 * invdet;
        y_6 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 5 and vector 6 where the vectors are columns */
    public boolean invert_5_6() {
        double t = x_5;
        double invdet = x_5 * y_6 - y_5 * x_6;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_6 *= -1 * invdet;
        y_5 *= -1 * invdet;
        x_5 *= y_6 * invdet;
        y_6 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 6 and vector 0 where the vectors are columns */
    public boolean invert_6_0() {
        double t = x_6;
        double invdet = x_6 * y_0 - y_6 * x_0;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_0 *= -1 * invdet;
        y_6 *= -1 * invdet;
        x_6 *= y_0 * invdet;
        y_0 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 6 and vector 1 where the vectors are columns */
    public boolean invert_6_1() {
        double t = x_6;
        double invdet = x_6 * y_1 - y_6 * x_1;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_1 *= -1 * invdet;
        y_6 *= -1 * invdet;
        x_6 *= y_1 * invdet;
        y_1 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 6 and vector 2 where the vectors are columns */
    public boolean invert_6_2() {
        double t = x_6;
        double invdet = x_6 * y_2 - y_6 * x_2;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_2 *= -1 * invdet;
        y_6 *= -1 * invdet;
        x_6 *= y_2 * invdet;
        y_2 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 6 and vector 3 where the vectors are columns */
    public boolean invert_6_3() {
        double t = x_6;
        double invdet = x_6 * y_3 - y_6 * x_3;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_3 *= -1 * invdet;
        y_6 *= -1 * invdet;
        x_6 *= y_3 * invdet;
        y_3 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 6 and vector 4 where the vectors are columns */
    public boolean invert_6_4() {
        double t = x_6;
        double invdet = x_6 * y_4 - y_6 * x_4;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_4 *= -1 * invdet;
        y_6 *= -1 * invdet;
        x_6 *= y_4 * invdet;
        y_4 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 6 and vector 5 where the vectors are columns */
    public boolean invert_6_5() {
        double t = x_6;
        double invdet = x_6 * y_5 - y_6 * x_5;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_5 *= -1 * invdet;
        y_6 *= -1 * invdet;
        x_6 *= y_5 * invdet;
        y_5 *= t * invdet;
        return true;
    }

    /** is the 6-vector the origin */
    public boolean isZero_6() {
        double d = 0.0;
        d += x_6 * x_6;
        d += y_6 * y_6;
        if (Math.abs(d) < ZERO_LIMIT)
            return true;
        return false;
    }
}
