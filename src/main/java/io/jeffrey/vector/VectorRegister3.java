package io.jeffrey.vector;

public class VectorRegister3 extends VectorRegister2 {
    public double x_2;
    public double y_2;

    public VectorRegister3() {
        x_2 = 0.0;
        y_2 = 0.0;
    }

    /** set the 2-vector to the given (x,y) */
    public void set_2(double x, double y) {
        x_2 = x;
        y_2 = y;
    }

    /** set the 2-vector to the (0,0) */
    public void zero_out_2() {
        x_2 = 0.0;
        y_2 = 0.0;
    }

    /** copy the 2 vector into the 0 vector */
    public void copy_from_2_to_0() {
        x_0 = x_2;
        y_0 = y_2;
    }

    /** copy the 2 vector into the 1 vector */
    public void copy_from_2_to_1() {
        x_1 = x_2;
        y_1 = y_2;
    }

    /** copy the 0 vector into the 2 vector */
    public void copy_from_0_to_2() {
        x_2 = x_0;
        y_2 = y_0;
    }

    /** copy the 1 vector into the 2 vector */
    public void copy_from_1_to_2() {
        x_2 = x_1;
        y_2 = y_1;
    }

    /** extract the 2-vector into the given output array starting at the given offset */
    public void extract_2(final double[] output, int offset) {
        output[offset + 0] = x_2;
        output[offset + 1] = y_2;
    }

    /** inject the given input starting at the given offset into the 2-vector */
    public void inject_2(final double[] input, int offset) {
        x_2 = input[offset + 0];
        y_2 = input[offset + 1];
    }

    /** is the 2-vector the origin */
    public boolean is_2_zero() {
        double d = 0.0;
        d += x_2 * x_2;
        d += y_2 * y_2;
        if (Math.abs(d) < ZERO_LIMIT)
            return true;
        return false;
    }

    /** return the angle (via atan2) of the 2 vector */
    public double angle_2() {
        return Math.atan2(y_2, x_2);
    }

    /** set the 2 vector to the complex number corresponding to the given angle */
    public void set_2_by_angle(double theta) {
        x_2 = Math.cos(theta);
        y_2 = Math.sin(theta);
    }

    /** add the 0 and 2 together and store the result to the 0 vector */
    public void add_2_to_0() {
        x_0 += x_2;
        y_0 += y_2;
    }

    /** add the 1 and 2 together and store the result to the 1 vector */
    public void add_2_to_1() {
        x_1 += x_2;
        y_1 += y_2;
    }

    /** add the 2 and 0 together and store the result to the 2 vector */
    public void add_0_to_2() {
        x_2 += x_0;
        y_2 += y_0;
    }

    /** add the 2 and 1 together and store the result to the 2 vector */
    public void add_1_to_2() {
        x_2 += x_1;
        y_2 += y_1;
    }

    /** subtract the 0 and 2 together and store the result to the 0 vector */
    public void sub_2_from_0() {
        x_0 -= x_2;
        y_0 -= y_2;
    }

    /** subtract the 1 and 2 together and store the result to the 1 vector */
    public void sub_2_from_1() {
        x_1 -= x_2;
        y_1 -= y_2;
    }

    /** subtract the 2 and 0 together and store the result to the 2 vector */
    public void sub_0_from_2() {
        x_2 -= x_0;
        y_2 -= y_0;
    }

    /** subtract the 2 and 1 together and store the result to the 2 vector */
    public void sub_1_from_2() {
        x_2 -= x_1;
        y_2 -= y_1;
    }

    /** multiply vector 2 by the given scalar */
    public void mult_2_by(double s) {
        x_2 *= s;
        y_2 *= s;
    }

    /** divide vector 2 by the given scalar */
    public void div_2_by(double s) {
        x_2 *= s;
        y_2 *= s;
    }

    /** return the dot product between the 0 and 2 vectors */
    public double dot_2_0() {
        return x_0 * x_2 + y_0 * y_2;
    }

    /** return the dot product between the 1 and 2 vectors */
    public double dot_2_1() {
        return x_1 * x_2 + y_1 * y_2;
    }

    /** return the dot product between the 2 and 0 vectors */
    public double dot_0_2() {
        return x_2 * x_0 + y_2 * y_0;
    }

    /** return the dot product between the 2 and 1 vectors */
    public double dot_1_2() {
        return x_2 * x_1 + y_2 * y_1;
    }

    /** treat vector 2 as a complex number and conjugate it */
    public void conjugate_2() {
        y_2 *= -1;
    }

    /** multiply via complex numbers the 0 and 2 together and store the result to the 0 vector */
    public void complex_mult2_0() {
        double t = x_0 * x_2 - y_0 * y_2;
        y_0 = x_0 * y_2 + y_0 * x_2;
        x_0 = t;
    }

    /** multiply via complex numbers the 1 and 2 together and store the result to the 1 vector */
    public void complex_mult2_1() {
        double t = x_1 * x_2 - y_1 * y_2;
        y_1 = x_1 * y_2 + y_1 * x_2;
        x_1 = t;
    }

    /** multiply via complex numbers the 2 and 0 together and store the result to the 2 vector */
    public void complex_mult0_2() {
        double t = x_2 * x_0 - y_2 * y_0;
        y_2 = x_2 * y_0 + y_2 * x_0;
        x_2 = t;
    }

    /** multiply via complex numbers the 2 and 1 together and store the result to the 2 vector */
    public void complex_mult1_2() {
        double t = x_2 * x_1 - y_2 * y_1;
        y_2 = x_2 * y_1 + y_2 * x_1;
        x_2 = t;
    }

    /** compute and return the length of vector 2 */
    public double length_2() {
        double d = 0.0;
        d += x_2 * x_2;
        d += y_2 * y_2;
        return Math.sqrt(d);
    }

    /** normalize the 2-vector if it is not the origin */
    public boolean normalize_2() {
        double d = 0.0;
        d += x_2 * x_2;
        d += y_2 * y_2;
        if (Math.abs(d) < ZERO_LIMIT)
            return false;
        d = Math.sqrt(d);
        d = 1.0 / d;
        x_2 *= d;
        y_2 *= d;
        return true;
    }

    /** set the matrixed form by the 0 vector and 2 vector (by column) */
    public void set_matrix_0_2(double x0, double y0, double x1, double y1) {
        x_0 = x0;
        y_0 = y0;
        x_2 = x1;
        y_2 = y1;
    }

    /** set the matrixed form by the 1 vector and 2 vector (by column) */
    public void set_matrix_1_2(double x0, double y0, double x1, double y1) {
        x_1 = x0;
        y_1 = y0;
        x_2 = x1;
        y_2 = y1;
    }

    /** set the matrixed form by the 2 vector and 0 vector (by column) */
    public void set_matrix_2_0(double x0, double y0, double x1, double y1) {
        x_2 = x0;
        y_2 = y0;
        x_0 = x1;
        y_0 = y1;
    }

    /** set the matrixed form by the 2 vector and 1 vector (by column) */
    public void set_matrix_2_1(double x0, double y0, double x1, double y1) {
        x_2 = x0;
        y_2 = y0;
        x_1 = x1;
        y_1 = y1;
    }

    /** transform the 2 vector by the matrixed formed by the 0 and 1 vectors as columns */
    public void transform_2_by_0_1() {
        double t = x_0 * x_2 + x_1 * y_2;
        y_2 = y_0 * x_2 + y_1 * y_2;
        x_2 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 0 and 2 vectors as columns */
    public void transform_1_by_0_2() {
        double t = x_0 * x_1 + x_2 * y_1;
        y_1 = y_0 * x_1 + y_2 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 1 and 0 vectors as columns */
    public void transform_2_by_1_0() {
        double t = x_1 * x_2 + x_0 * y_2;
        y_2 = y_1 * x_2 + y_0 * y_2;
        x_2 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 1 and 2 vectors as columns */
    public void transform_0_by_1_2() {
        double t = x_1 * x_0 + x_2 * y_0;
        y_0 = y_1 * x_0 + y_2 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 2 and 0 vectors as columns */
    public void transform_1_by_2_0() {
        double t = x_2 * x_1 + x_0 * y_1;
        y_1 = y_2 * x_1 + y_0 * y_1;
        x_1 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 2 and 1 vectors as columns */
    public void transform_0_by_2_1() {
        double t = x_2 * x_0 + x_1 * y_0;
        y_0 = y_2 * x_0 + y_1 * y_0;
        x_0 = t;
    }

    /** invert the 2x2 matrix formed by vector 0 and vector 2 where the vectors are columns */
    public boolean invert_0_2() {
        double t = x_0;
        double invdet = x_0 * y_2 - y_0 * x_2;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_2 *= -1 * invdet;
        y_0 *= -1 * invdet;
        x_0 *= y_2 * invdet;
        y_2 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 1 and vector 2 where the vectors are columns */
    public boolean invert_1_2() {
        double t = x_1;
        double invdet = x_1 * y_2 - y_1 * x_2;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_2 *= -1 * invdet;
        y_1 *= -1 * invdet;
        x_1 *= y_2 * invdet;
        y_2 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 2 and vector 0 where the vectors are columns */
    public boolean invert_2_0() {
        double t = x_2;
        double invdet = x_2 * y_0 - y_2 * x_0;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_0 *= -1 * invdet;
        y_2 *= -1 * invdet;
        x_2 *= y_0 * invdet;
        y_0 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 2 and vector 1 where the vectors are columns */
    public boolean invert_2_1() {
        double t = x_2;
        double invdet = x_2 * y_1 - y_2 * x_1;
        if (Math.abs(invdet) < ZERO_LIMIT)
            return false;
        invdet = 1.0 / invdet;
        x_1 *= -1 * invdet;
        y_2 *= -1 * invdet;
        x_2 *= y_1 * invdet;
        y_1 *= t * invdet;
        return true;
    }

    /** transpose the matrix formed by vector 0 and vector 2 where the vectors are columns */
    public void transpose_0_2() {
        double t = y_0;
        y_0 = x_2;
        x_2 = t;
    }

    /** transpose the matrix formed by vector 1 and vector 2 where the vectors are columns */
    public void transpose_1_2() {
        double t = y_1;
        y_1 = x_2;
        x_2 = t;
    }

    /** transpose the matrix formed by vector 2 and vector 0 where the vectors are columns */
    public void transpose_2_0() {
        double t = y_2;
        y_2 = x_0;
        x_0 = t;
    }

    /** transpose the matrix formed by vector 2 and vector 1 where the vectors are columns */
    public void transpose_2_1() {
        double t = y_2;
        y_2 = x_1;
        x_1 = t;
    }
}
