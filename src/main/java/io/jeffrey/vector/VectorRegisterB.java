package io.jeffrey.vector;

public class VectorRegisterB extends VectorRegisterA {
    public double x_10;
    public double y_10;
    
    public VectorRegisterB() {
        x_10 = 0.0;
        y_10 = 0.0;
    }

    /** set the 10-vector to the given (x,y) */
    public void set10(double x, double y) {
        x_10 = x;
        y_10 = y;
    }

    /** add the 0 and 10 together and store the result to the 0 vector */
    public void add_10_to_0() {
        x_0+=x_10;
        y_0+=y_10;
    }

    /** add the 1 and 10 together and store the result to the 1 vector */
    public void add_10_to_1() {
        x_1+=x_10;
        y_1+=y_10;
    }

    /** add the 2 and 10 together and store the result to the 2 vector */
    public void add_10_to_2() {
        x_2+=x_10;
        y_2+=y_10;
    }

    /** add the 3 and 10 together and store the result to the 3 vector */
    public void add_10_to_3() {
        x_3+=x_10;
        y_3+=y_10;
    }

    /** add the 4 and 10 together and store the result to the 4 vector */
    public void add_10_to_4() {
        x_4+=x_10;
        y_4+=y_10;
    }

    /** add the 5 and 10 together and store the result to the 5 vector */
    public void add_10_to_5() {
        x_5+=x_10;
        y_5+=y_10;
    }

    /** add the 6 and 10 together and store the result to the 6 vector */
    public void add_10_to_6() {
        x_6+=x_10;
        y_6+=y_10;
    }

    /** add the 7 and 10 together and store the result to the 7 vector */
    public void add_10_to_7() {
        x_7+=x_10;
        y_7+=y_10;
    }

    /** add the 8 and 10 together and store the result to the 8 vector */
    public void add_10_to_8() {
        x_8+=x_10;
        y_8+=y_10;
    }

    /** add the 9 and 10 together and store the result to the 9 vector */
    public void add_10_to_9() {
        x_9+=x_10;
        y_9+=y_10;
    }

    /** add the 10 and 0 together and store the result to the 10 vector */
    public void add_0_to_10() {
        x_10+=x_0;
        y_10+=y_0;
    }

    /** add the 10 and 1 together and store the result to the 10 vector */
    public void add_1_to_10() {
        x_10+=x_1;
        y_10+=y_1;
    }

    /** add the 10 and 2 together and store the result to the 10 vector */
    public void add_2_to_10() {
        x_10+=x_2;
        y_10+=y_2;
    }

    /** add the 10 and 3 together and store the result to the 10 vector */
    public void add_3_to_10() {
        x_10+=x_3;
        y_10+=y_3;
    }

    /** add the 10 and 4 together and store the result to the 10 vector */
    public void add_4_to_10() {
        x_10+=x_4;
        y_10+=y_4;
    }

    /** add the 10 and 5 together and store the result to the 10 vector */
    public void add_5_to_10() {
        x_10+=x_5;
        y_10+=y_5;
    }

    /** add the 10 and 6 together and store the result to the 10 vector */
    public void add_6_to_10() {
        x_10+=x_6;
        y_10+=y_6;
    }

    /** add the 10 and 7 together and store the result to the 10 vector */
    public void add_7_to_10() {
        x_10+=x_7;
        y_10+=y_7;
    }

    /** add the 10 and 8 together and store the result to the 10 vector */
    public void add_8_to_10() {
        x_10+=x_8;
        y_10+=y_8;
    }

    /** add the 10 and 9 together and store the result to the 10 vector */
    public void add_9_to_10() {
        x_10+=x_9;
        y_10+=y_9;
    }

    /** set the 10-vector to the (0,0) */
    public void zeroOut10() {
        x_10 = 0.0;
        y_10 = 0.0;
    }

    /** copy the 10 vector into the 0 vector */
    public void copy_from_10_to_0() {
        x_0=x_10;
        y_0=y_10;
    }

    /** copy the 10 vector into the 1 vector */
    public void copy_from_10_to_1() {
        x_1=x_10;
        y_1=y_10;
    }

    /** copy the 10 vector into the 2 vector */
    public void copy_from_10_to_2() {
        x_2=x_10;
        y_2=y_10;
    }

    /** copy the 10 vector into the 3 vector */
    public void copy_from_10_to_3() {
        x_3=x_10;
        y_3=y_10;
    }

    /** copy the 10 vector into the 4 vector */
    public void copy_from_10_to_4() {
        x_4=x_10;
        y_4=y_10;
    }

    /** copy the 10 vector into the 5 vector */
    public void copy_from_10_to_5() {
        x_5=x_10;
        y_5=y_10;
    }

    /** copy the 10 vector into the 6 vector */
    public void copy_from_10_to_6() {
        x_6=x_10;
        y_6=y_10;
    }

    /** copy the 10 vector into the 7 vector */
    public void copy_from_10_to_7() {
        x_7=x_10;
        y_7=y_10;
    }

    /** copy the 10 vector into the 8 vector */
    public void copy_from_10_to_8() {
        x_8=x_10;
        y_8=y_10;
    }

    /** copy the 10 vector into the 9 vector */
    public void copy_from_10_to_9() {
        x_9=x_10;
        y_9=y_10;
    }

    /** copy the 0 vector into the 10 vector */
    public void copy_from_0_to_10() {
        x_10=x_0;
        y_10=y_0;
    }

    /** copy the 1 vector into the 10 vector */
    public void copy_from_1_to_10() {
        x_10=x_1;
        y_10=y_1;
    }

    /** copy the 2 vector into the 10 vector */
    public void copy_from_2_to_10() {
        x_10=x_2;
        y_10=y_2;
    }

    /** copy the 3 vector into the 10 vector */
    public void copy_from_3_to_10() {
        x_10=x_3;
        y_10=y_3;
    }

    /** copy the 4 vector into the 10 vector */
    public void copy_from_4_to_10() {
        x_10=x_4;
        y_10=y_4;
    }

    /** copy the 5 vector into the 10 vector */
    public void copy_from_5_to_10() {
        x_10=x_5;
        y_10=y_5;
    }

    /** copy the 6 vector into the 10 vector */
    public void copy_from_6_to_10() {
        x_10=x_6;
        y_10=y_6;
    }

    /** copy the 7 vector into the 10 vector */
    public void copy_from_7_to_10() {
        x_10=x_7;
        y_10=y_7;
    }

    /** copy the 8 vector into the 10 vector */
    public void copy_from_8_to_10() {
        x_10=x_8;
        y_10=y_8;
    }

    /** copy the 9 vector into the 10 vector */
    public void copy_from_9_to_10() {
        x_10=x_9;
        y_10=y_9;
    }

    /** extract the 10-vector into the given output array starting at the given offset */
    public void extract10(final double[] output, int offset) {
        output[offset+0]=x_10;
        output[offset+1]=y_10;
    }

    /** subtract the 0 and 10 together and store the result to the 0 vector */
    public void sub_10_from_0() {
        x_0-=x_10;
        y_0-=y_10;
    }

    /** subtract the 1 and 10 together and store the result to the 1 vector */
    public void sub_10_from_1() {
        x_1-=x_10;
        y_1-=y_10;
    }

    /** subtract the 2 and 10 together and store the result to the 2 vector */
    public void sub_10_from_2() {
        x_2-=x_10;
        y_2-=y_10;
    }

    /** subtract the 3 and 10 together and store the result to the 3 vector */
    public void sub_10_from_3() {
        x_3-=x_10;
        y_3-=y_10;
    }

    /** subtract the 4 and 10 together and store the result to the 4 vector */
    public void sub_10_from_4() {
        x_4-=x_10;
        y_4-=y_10;
    }

    /** subtract the 5 and 10 together and store the result to the 5 vector */
    public void sub_10_from_5() {
        x_5-=x_10;
        y_5-=y_10;
    }

    /** subtract the 6 and 10 together and store the result to the 6 vector */
    public void sub_10_from_6() {
        x_6-=x_10;
        y_6-=y_10;
    }

    /** subtract the 7 and 10 together and store the result to the 7 vector */
    public void sub_10_from_7() {
        x_7-=x_10;
        y_7-=y_10;
    }

    /** subtract the 8 and 10 together and store the result to the 8 vector */
    public void sub_10_from_8() {
        x_8-=x_10;
        y_8-=y_10;
    }

    /** subtract the 9 and 10 together and store the result to the 9 vector */
    public void sub_10_from_9() {
        x_9-=x_10;
        y_9-=y_10;
    }

    /** subtract the 10 and 0 together and store the result to the 10 vector */
    public void sub_0_from_10() {
        x_10-=x_0;
        y_10-=y_0;
    }

    /** subtract the 10 and 1 together and store the result to the 10 vector */
    public void sub_1_from_10() {
        x_10-=x_1;
        y_10-=y_1;
    }

    /** subtract the 10 and 2 together and store the result to the 10 vector */
    public void sub_2_from_10() {
        x_10-=x_2;
        y_10-=y_2;
    }

    /** subtract the 10 and 3 together and store the result to the 10 vector */
    public void sub_3_from_10() {
        x_10-=x_3;
        y_10-=y_3;
    }

    /** subtract the 10 and 4 together and store the result to the 10 vector */
    public void sub_4_from_10() {
        x_10-=x_4;
        y_10-=y_4;
    }

    /** subtract the 10 and 5 together and store the result to the 10 vector */
    public void sub_5_from_10() {
        x_10-=x_5;
        y_10-=y_5;
    }

    /** subtract the 10 and 6 together and store the result to the 10 vector */
    public void sub_6_from_10() {
        x_10-=x_6;
        y_10-=y_6;
    }

    /** subtract the 10 and 7 together and store the result to the 10 vector */
    public void sub_7_from_10() {
        x_10-=x_7;
        y_10-=y_7;
    }

    /** subtract the 10 and 8 together and store the result to the 10 vector */
    public void sub_8_from_10() {
        x_10-=x_8;
        y_10-=y_8;
    }

    /** subtract the 10 and 9 together and store the result to the 10 vector */
    public void sub_9_from_10() {
        x_10-=x_9;
        y_10-=y_9;
    }

    /** multiply vector 10 by the given scalar */
    public void mult_10_by(double s) {
        x_10*= s;
        y_10*= s;
    }

    /** divide vector 10 by the given scalar */
    public void div_10_by(double s) {
        x_10*= s;
        y_10*= s;
    }

    /** treat vector 10 as a complex number and conjugate it */
    public void conjugate_10() {
        y_10 *= -1;
    }

    /** compute and return the length of vector 10 */
    public double length_10() {
        double d = 0.0;
        d += x_10*x_10;
        d += y_10*y_10;
        return Math.sqrt(d);
    }

    /** normalize the 10-vector if it is not the origin */
    public boolean normalize_10() {
        double d = 0.0;
        d += x_10*x_10;
        d += y_10*y_10;
        if(Math.abs(d) < ZERO_LIMIT) return false;
        d = Math.sqrt(d);
        d = 1.0 / d;
        x_10 *= d;
        y_10 *= d;
        return true;
    }

    /** transform the 10 vector by the matrixed formed by the 0 and 1 vectors as columns */
    public void transform_10_by_0_1() {
        double t = x_0 * x_10 + x_1 * y_10;
        y_10=y_0 * x_10 + y_1 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 0 and 2 vectors as columns */
    public void transform_10_by_0_2() {
        double t = x_0 * x_10 + x_2 * y_10;
        y_10=y_0 * x_10 + y_2 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 0 and 3 vectors as columns */
    public void transform_10_by_0_3() {
        double t = x_0 * x_10 + x_3 * y_10;
        y_10=y_0 * x_10 + y_3 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 0 and 4 vectors as columns */
    public void transform_10_by_0_4() {
        double t = x_0 * x_10 + x_4 * y_10;
        y_10=y_0 * x_10 + y_4 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 0 and 5 vectors as columns */
    public void transform_10_by_0_5() {
        double t = x_0 * x_10 + x_5 * y_10;
        y_10=y_0 * x_10 + y_5 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 0 and 6 vectors as columns */
    public void transform_10_by_0_6() {
        double t = x_0 * x_10 + x_6 * y_10;
        y_10=y_0 * x_10 + y_6 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 0 and 7 vectors as columns */
    public void transform_10_by_0_7() {
        double t = x_0 * x_10 + x_7 * y_10;
        y_10=y_0 * x_10 + y_7 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 0 and 8 vectors as columns */
    public void transform_10_by_0_8() {
        double t = x_0 * x_10 + x_8 * y_10;
        y_10=y_0 * x_10 + y_8 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 0 and 9 vectors as columns */
    public void transform_10_by_0_9() {
        double t = x_0 * x_10 + x_9 * y_10;
        y_10=y_0 * x_10 + y_9 * y_10;
        x_10 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 0 and 10 vectors as columns */
    public void transform_1_by_0_10() {
        double t = x_0 * x_1 + x_10 * y_1;
        y_1=y_0 * x_1 + y_10 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 0 and 10 vectors as columns */
    public void transform_2_by_0_10() {
        double t = x_0 * x_2 + x_10 * y_2;
        y_2=y_0 * x_2 + y_10 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 0 and 10 vectors as columns */
    public void transform_3_by_0_10() {
        double t = x_0 * x_3 + x_10 * y_3;
        y_3=y_0 * x_3 + y_10 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 0 and 10 vectors as columns */
    public void transform_4_by_0_10() {
        double t = x_0 * x_4 + x_10 * y_4;
        y_4=y_0 * x_4 + y_10 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 0 and 10 vectors as columns */
    public void transform_5_by_0_10() {
        double t = x_0 * x_5 + x_10 * y_5;
        y_5=y_0 * x_5 + y_10 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 0 and 10 vectors as columns */
    public void transform_6_by_0_10() {
        double t = x_0 * x_6 + x_10 * y_6;
        y_6=y_0 * x_6 + y_10 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 0 and 10 vectors as columns */
    public void transform_7_by_0_10() {
        double t = x_0 * x_7 + x_10 * y_7;
        y_7=y_0 * x_7 + y_10 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 0 and 10 vectors as columns */
    public void transform_8_by_0_10() {
        double t = x_0 * x_8 + x_10 * y_8;
        y_8=y_0 * x_8 + y_10 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 0 and 10 vectors as columns */
    public void transform_9_by_0_10() {
        double t = x_0 * x_9 + x_10 * y_9;
        y_9=y_0 * x_9 + y_10 * y_9;
        x_9 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 1 and 0 vectors as columns */
    public void transform_10_by_1_0() {
        double t = x_1 * x_10 + x_0 * y_10;
        y_10=y_1 * x_10 + y_0 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 1 and 2 vectors as columns */
    public void transform_10_by_1_2() {
        double t = x_1 * x_10 + x_2 * y_10;
        y_10=y_1 * x_10 + y_2 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 1 and 3 vectors as columns */
    public void transform_10_by_1_3() {
        double t = x_1 * x_10 + x_3 * y_10;
        y_10=y_1 * x_10 + y_3 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 1 and 4 vectors as columns */
    public void transform_10_by_1_4() {
        double t = x_1 * x_10 + x_4 * y_10;
        y_10=y_1 * x_10 + y_4 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 1 and 5 vectors as columns */
    public void transform_10_by_1_5() {
        double t = x_1 * x_10 + x_5 * y_10;
        y_10=y_1 * x_10 + y_5 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 1 and 6 vectors as columns */
    public void transform_10_by_1_6() {
        double t = x_1 * x_10 + x_6 * y_10;
        y_10=y_1 * x_10 + y_6 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 1 and 7 vectors as columns */
    public void transform_10_by_1_7() {
        double t = x_1 * x_10 + x_7 * y_10;
        y_10=y_1 * x_10 + y_7 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 1 and 8 vectors as columns */
    public void transform_10_by_1_8() {
        double t = x_1 * x_10 + x_8 * y_10;
        y_10=y_1 * x_10 + y_8 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 1 and 9 vectors as columns */
    public void transform_10_by_1_9() {
        double t = x_1 * x_10 + x_9 * y_10;
        y_10=y_1 * x_10 + y_9 * y_10;
        x_10 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 1 and 10 vectors as columns */
    public void transform_0_by_1_10() {
        double t = x_1 * x_0 + x_10 * y_0;
        y_0=y_1 * x_0 + y_10 * y_0;
        x_0 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 1 and 10 vectors as columns */
    public void transform_2_by_1_10() {
        double t = x_1 * x_2 + x_10 * y_2;
        y_2=y_1 * x_2 + y_10 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 1 and 10 vectors as columns */
    public void transform_3_by_1_10() {
        double t = x_1 * x_3 + x_10 * y_3;
        y_3=y_1 * x_3 + y_10 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 1 and 10 vectors as columns */
    public void transform_4_by_1_10() {
        double t = x_1 * x_4 + x_10 * y_4;
        y_4=y_1 * x_4 + y_10 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 1 and 10 vectors as columns */
    public void transform_5_by_1_10() {
        double t = x_1 * x_5 + x_10 * y_5;
        y_5=y_1 * x_5 + y_10 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 1 and 10 vectors as columns */
    public void transform_6_by_1_10() {
        double t = x_1 * x_6 + x_10 * y_6;
        y_6=y_1 * x_6 + y_10 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 1 and 10 vectors as columns */
    public void transform_7_by_1_10() {
        double t = x_1 * x_7 + x_10 * y_7;
        y_7=y_1 * x_7 + y_10 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 1 and 10 vectors as columns */
    public void transform_8_by_1_10() {
        double t = x_1 * x_8 + x_10 * y_8;
        y_8=y_1 * x_8 + y_10 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 1 and 10 vectors as columns */
    public void transform_9_by_1_10() {
        double t = x_1 * x_9 + x_10 * y_9;
        y_9=y_1 * x_9 + y_10 * y_9;
        x_9 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 2 and 0 vectors as columns */
    public void transform_10_by_2_0() {
        double t = x_2 * x_10 + x_0 * y_10;
        y_10=y_2 * x_10 + y_0 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 2 and 1 vectors as columns */
    public void transform_10_by_2_1() {
        double t = x_2 * x_10 + x_1 * y_10;
        y_10=y_2 * x_10 + y_1 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 2 and 3 vectors as columns */
    public void transform_10_by_2_3() {
        double t = x_2 * x_10 + x_3 * y_10;
        y_10=y_2 * x_10 + y_3 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 2 and 4 vectors as columns */
    public void transform_10_by_2_4() {
        double t = x_2 * x_10 + x_4 * y_10;
        y_10=y_2 * x_10 + y_4 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 2 and 5 vectors as columns */
    public void transform_10_by_2_5() {
        double t = x_2 * x_10 + x_5 * y_10;
        y_10=y_2 * x_10 + y_5 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 2 and 6 vectors as columns */
    public void transform_10_by_2_6() {
        double t = x_2 * x_10 + x_6 * y_10;
        y_10=y_2 * x_10 + y_6 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 2 and 7 vectors as columns */
    public void transform_10_by_2_7() {
        double t = x_2 * x_10 + x_7 * y_10;
        y_10=y_2 * x_10 + y_7 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 2 and 8 vectors as columns */
    public void transform_10_by_2_8() {
        double t = x_2 * x_10 + x_8 * y_10;
        y_10=y_2 * x_10 + y_8 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 2 and 9 vectors as columns */
    public void transform_10_by_2_9() {
        double t = x_2 * x_10 + x_9 * y_10;
        y_10=y_2 * x_10 + y_9 * y_10;
        x_10 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 2 and 10 vectors as columns */
    public void transform_0_by_2_10() {
        double t = x_2 * x_0 + x_10 * y_0;
        y_0=y_2 * x_0 + y_10 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 2 and 10 vectors as columns */
    public void transform_1_by_2_10() {
        double t = x_2 * x_1 + x_10 * y_1;
        y_1=y_2 * x_1 + y_10 * y_1;
        x_1 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 2 and 10 vectors as columns */
    public void transform_3_by_2_10() {
        double t = x_2 * x_3 + x_10 * y_3;
        y_3=y_2 * x_3 + y_10 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 2 and 10 vectors as columns */
    public void transform_4_by_2_10() {
        double t = x_2 * x_4 + x_10 * y_4;
        y_4=y_2 * x_4 + y_10 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 2 and 10 vectors as columns */
    public void transform_5_by_2_10() {
        double t = x_2 * x_5 + x_10 * y_5;
        y_5=y_2 * x_5 + y_10 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 2 and 10 vectors as columns */
    public void transform_6_by_2_10() {
        double t = x_2 * x_6 + x_10 * y_6;
        y_6=y_2 * x_6 + y_10 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 2 and 10 vectors as columns */
    public void transform_7_by_2_10() {
        double t = x_2 * x_7 + x_10 * y_7;
        y_7=y_2 * x_7 + y_10 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 2 and 10 vectors as columns */
    public void transform_8_by_2_10() {
        double t = x_2 * x_8 + x_10 * y_8;
        y_8=y_2 * x_8 + y_10 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 2 and 10 vectors as columns */
    public void transform_9_by_2_10() {
        double t = x_2 * x_9 + x_10 * y_9;
        y_9=y_2 * x_9 + y_10 * y_9;
        x_9 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 3 and 0 vectors as columns */
    public void transform_10_by_3_0() {
        double t = x_3 * x_10 + x_0 * y_10;
        y_10=y_3 * x_10 + y_0 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 3 and 1 vectors as columns */
    public void transform_10_by_3_1() {
        double t = x_3 * x_10 + x_1 * y_10;
        y_10=y_3 * x_10 + y_1 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 3 and 2 vectors as columns */
    public void transform_10_by_3_2() {
        double t = x_3 * x_10 + x_2 * y_10;
        y_10=y_3 * x_10 + y_2 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 3 and 4 vectors as columns */
    public void transform_10_by_3_4() {
        double t = x_3 * x_10 + x_4 * y_10;
        y_10=y_3 * x_10 + y_4 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 3 and 5 vectors as columns */
    public void transform_10_by_3_5() {
        double t = x_3 * x_10 + x_5 * y_10;
        y_10=y_3 * x_10 + y_5 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 3 and 6 vectors as columns */
    public void transform_10_by_3_6() {
        double t = x_3 * x_10 + x_6 * y_10;
        y_10=y_3 * x_10 + y_6 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 3 and 7 vectors as columns */
    public void transform_10_by_3_7() {
        double t = x_3 * x_10 + x_7 * y_10;
        y_10=y_3 * x_10 + y_7 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 3 and 8 vectors as columns */
    public void transform_10_by_3_8() {
        double t = x_3 * x_10 + x_8 * y_10;
        y_10=y_3 * x_10 + y_8 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 3 and 9 vectors as columns */
    public void transform_10_by_3_9() {
        double t = x_3 * x_10 + x_9 * y_10;
        y_10=y_3 * x_10 + y_9 * y_10;
        x_10 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 3 and 10 vectors as columns */
    public void transform_0_by_3_10() {
        double t = x_3 * x_0 + x_10 * y_0;
        y_0=y_3 * x_0 + y_10 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 3 and 10 vectors as columns */
    public void transform_1_by_3_10() {
        double t = x_3 * x_1 + x_10 * y_1;
        y_1=y_3 * x_1 + y_10 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 3 and 10 vectors as columns */
    public void transform_2_by_3_10() {
        double t = x_3 * x_2 + x_10 * y_2;
        y_2=y_3 * x_2 + y_10 * y_2;
        x_2 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 3 and 10 vectors as columns */
    public void transform_4_by_3_10() {
        double t = x_3 * x_4 + x_10 * y_4;
        y_4=y_3 * x_4 + y_10 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 3 and 10 vectors as columns */
    public void transform_5_by_3_10() {
        double t = x_3 * x_5 + x_10 * y_5;
        y_5=y_3 * x_5 + y_10 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 3 and 10 vectors as columns */
    public void transform_6_by_3_10() {
        double t = x_3 * x_6 + x_10 * y_6;
        y_6=y_3 * x_6 + y_10 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 3 and 10 vectors as columns */
    public void transform_7_by_3_10() {
        double t = x_3 * x_7 + x_10 * y_7;
        y_7=y_3 * x_7 + y_10 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 3 and 10 vectors as columns */
    public void transform_8_by_3_10() {
        double t = x_3 * x_8 + x_10 * y_8;
        y_8=y_3 * x_8 + y_10 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 3 and 10 vectors as columns */
    public void transform_9_by_3_10() {
        double t = x_3 * x_9 + x_10 * y_9;
        y_9=y_3 * x_9 + y_10 * y_9;
        x_9 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 4 and 0 vectors as columns */
    public void transform_10_by_4_0() {
        double t = x_4 * x_10 + x_0 * y_10;
        y_10=y_4 * x_10 + y_0 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 4 and 1 vectors as columns */
    public void transform_10_by_4_1() {
        double t = x_4 * x_10 + x_1 * y_10;
        y_10=y_4 * x_10 + y_1 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 4 and 2 vectors as columns */
    public void transform_10_by_4_2() {
        double t = x_4 * x_10 + x_2 * y_10;
        y_10=y_4 * x_10 + y_2 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 4 and 3 vectors as columns */
    public void transform_10_by_4_3() {
        double t = x_4 * x_10 + x_3 * y_10;
        y_10=y_4 * x_10 + y_3 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 4 and 5 vectors as columns */
    public void transform_10_by_4_5() {
        double t = x_4 * x_10 + x_5 * y_10;
        y_10=y_4 * x_10 + y_5 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 4 and 6 vectors as columns */
    public void transform_10_by_4_6() {
        double t = x_4 * x_10 + x_6 * y_10;
        y_10=y_4 * x_10 + y_6 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 4 and 7 vectors as columns */
    public void transform_10_by_4_7() {
        double t = x_4 * x_10 + x_7 * y_10;
        y_10=y_4 * x_10 + y_7 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 4 and 8 vectors as columns */
    public void transform_10_by_4_8() {
        double t = x_4 * x_10 + x_8 * y_10;
        y_10=y_4 * x_10 + y_8 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 4 and 9 vectors as columns */
    public void transform_10_by_4_9() {
        double t = x_4 * x_10 + x_9 * y_10;
        y_10=y_4 * x_10 + y_9 * y_10;
        x_10 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 4 and 10 vectors as columns */
    public void transform_0_by_4_10() {
        double t = x_4 * x_0 + x_10 * y_0;
        y_0=y_4 * x_0 + y_10 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 4 and 10 vectors as columns */
    public void transform_1_by_4_10() {
        double t = x_4 * x_1 + x_10 * y_1;
        y_1=y_4 * x_1 + y_10 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 4 and 10 vectors as columns */
    public void transform_2_by_4_10() {
        double t = x_4 * x_2 + x_10 * y_2;
        y_2=y_4 * x_2 + y_10 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 4 and 10 vectors as columns */
    public void transform_3_by_4_10() {
        double t = x_4 * x_3 + x_10 * y_3;
        y_3=y_4 * x_3 + y_10 * y_3;
        x_3 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 4 and 10 vectors as columns */
    public void transform_5_by_4_10() {
        double t = x_4 * x_5 + x_10 * y_5;
        y_5=y_4 * x_5 + y_10 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 4 and 10 vectors as columns */
    public void transform_6_by_4_10() {
        double t = x_4 * x_6 + x_10 * y_6;
        y_6=y_4 * x_6 + y_10 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 4 and 10 vectors as columns */
    public void transform_7_by_4_10() {
        double t = x_4 * x_7 + x_10 * y_7;
        y_7=y_4 * x_7 + y_10 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 4 and 10 vectors as columns */
    public void transform_8_by_4_10() {
        double t = x_4 * x_8 + x_10 * y_8;
        y_8=y_4 * x_8 + y_10 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 4 and 10 vectors as columns */
    public void transform_9_by_4_10() {
        double t = x_4 * x_9 + x_10 * y_9;
        y_9=y_4 * x_9 + y_10 * y_9;
        x_9 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 5 and 0 vectors as columns */
    public void transform_10_by_5_0() {
        double t = x_5 * x_10 + x_0 * y_10;
        y_10=y_5 * x_10 + y_0 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 5 and 1 vectors as columns */
    public void transform_10_by_5_1() {
        double t = x_5 * x_10 + x_1 * y_10;
        y_10=y_5 * x_10 + y_1 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 5 and 2 vectors as columns */
    public void transform_10_by_5_2() {
        double t = x_5 * x_10 + x_2 * y_10;
        y_10=y_5 * x_10 + y_2 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 5 and 3 vectors as columns */
    public void transform_10_by_5_3() {
        double t = x_5 * x_10 + x_3 * y_10;
        y_10=y_5 * x_10 + y_3 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 5 and 4 vectors as columns */
    public void transform_10_by_5_4() {
        double t = x_5 * x_10 + x_4 * y_10;
        y_10=y_5 * x_10 + y_4 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 5 and 6 vectors as columns */
    public void transform_10_by_5_6() {
        double t = x_5 * x_10 + x_6 * y_10;
        y_10=y_5 * x_10 + y_6 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 5 and 7 vectors as columns */
    public void transform_10_by_5_7() {
        double t = x_5 * x_10 + x_7 * y_10;
        y_10=y_5 * x_10 + y_7 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 5 and 8 vectors as columns */
    public void transform_10_by_5_8() {
        double t = x_5 * x_10 + x_8 * y_10;
        y_10=y_5 * x_10 + y_8 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 5 and 9 vectors as columns */
    public void transform_10_by_5_9() {
        double t = x_5 * x_10 + x_9 * y_10;
        y_10=y_5 * x_10 + y_9 * y_10;
        x_10 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 5 and 10 vectors as columns */
    public void transform_0_by_5_10() {
        double t = x_5 * x_0 + x_10 * y_0;
        y_0=y_5 * x_0 + y_10 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 5 and 10 vectors as columns */
    public void transform_1_by_5_10() {
        double t = x_5 * x_1 + x_10 * y_1;
        y_1=y_5 * x_1 + y_10 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 5 and 10 vectors as columns */
    public void transform_2_by_5_10() {
        double t = x_5 * x_2 + x_10 * y_2;
        y_2=y_5 * x_2 + y_10 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 5 and 10 vectors as columns */
    public void transform_3_by_5_10() {
        double t = x_5 * x_3 + x_10 * y_3;
        y_3=y_5 * x_3 + y_10 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 5 and 10 vectors as columns */
    public void transform_4_by_5_10() {
        double t = x_5 * x_4 + x_10 * y_4;
        y_4=y_5 * x_4 + y_10 * y_4;
        x_4 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 5 and 10 vectors as columns */
    public void transform_6_by_5_10() {
        double t = x_5 * x_6 + x_10 * y_6;
        y_6=y_5 * x_6 + y_10 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 5 and 10 vectors as columns */
    public void transform_7_by_5_10() {
        double t = x_5 * x_7 + x_10 * y_7;
        y_7=y_5 * x_7 + y_10 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 5 and 10 vectors as columns */
    public void transform_8_by_5_10() {
        double t = x_5 * x_8 + x_10 * y_8;
        y_8=y_5 * x_8 + y_10 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 5 and 10 vectors as columns */
    public void transform_9_by_5_10() {
        double t = x_5 * x_9 + x_10 * y_9;
        y_9=y_5 * x_9 + y_10 * y_9;
        x_9 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 6 and 0 vectors as columns */
    public void transform_10_by_6_0() {
        double t = x_6 * x_10 + x_0 * y_10;
        y_10=y_6 * x_10 + y_0 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 6 and 1 vectors as columns */
    public void transform_10_by_6_1() {
        double t = x_6 * x_10 + x_1 * y_10;
        y_10=y_6 * x_10 + y_1 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 6 and 2 vectors as columns */
    public void transform_10_by_6_2() {
        double t = x_6 * x_10 + x_2 * y_10;
        y_10=y_6 * x_10 + y_2 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 6 and 3 vectors as columns */
    public void transform_10_by_6_3() {
        double t = x_6 * x_10 + x_3 * y_10;
        y_10=y_6 * x_10 + y_3 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 6 and 4 vectors as columns */
    public void transform_10_by_6_4() {
        double t = x_6 * x_10 + x_4 * y_10;
        y_10=y_6 * x_10 + y_4 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 6 and 5 vectors as columns */
    public void transform_10_by_6_5() {
        double t = x_6 * x_10 + x_5 * y_10;
        y_10=y_6 * x_10 + y_5 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 6 and 7 vectors as columns */
    public void transform_10_by_6_7() {
        double t = x_6 * x_10 + x_7 * y_10;
        y_10=y_6 * x_10 + y_7 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 6 and 8 vectors as columns */
    public void transform_10_by_6_8() {
        double t = x_6 * x_10 + x_8 * y_10;
        y_10=y_6 * x_10 + y_8 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 6 and 9 vectors as columns */
    public void transform_10_by_6_9() {
        double t = x_6 * x_10 + x_9 * y_10;
        y_10=y_6 * x_10 + y_9 * y_10;
        x_10 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 6 and 10 vectors as columns */
    public void transform_0_by_6_10() {
        double t = x_6 * x_0 + x_10 * y_0;
        y_0=y_6 * x_0 + y_10 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 6 and 10 vectors as columns */
    public void transform_1_by_6_10() {
        double t = x_6 * x_1 + x_10 * y_1;
        y_1=y_6 * x_1 + y_10 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 6 and 10 vectors as columns */
    public void transform_2_by_6_10() {
        double t = x_6 * x_2 + x_10 * y_2;
        y_2=y_6 * x_2 + y_10 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 6 and 10 vectors as columns */
    public void transform_3_by_6_10() {
        double t = x_6 * x_3 + x_10 * y_3;
        y_3=y_6 * x_3 + y_10 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 6 and 10 vectors as columns */
    public void transform_4_by_6_10() {
        double t = x_6 * x_4 + x_10 * y_4;
        y_4=y_6 * x_4 + y_10 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 6 and 10 vectors as columns */
    public void transform_5_by_6_10() {
        double t = x_6 * x_5 + x_10 * y_5;
        y_5=y_6 * x_5 + y_10 * y_5;
        x_5 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 6 and 10 vectors as columns */
    public void transform_7_by_6_10() {
        double t = x_6 * x_7 + x_10 * y_7;
        y_7=y_6 * x_7 + y_10 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 6 and 10 vectors as columns */
    public void transform_8_by_6_10() {
        double t = x_6 * x_8 + x_10 * y_8;
        y_8=y_6 * x_8 + y_10 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 6 and 10 vectors as columns */
    public void transform_9_by_6_10() {
        double t = x_6 * x_9 + x_10 * y_9;
        y_9=y_6 * x_9 + y_10 * y_9;
        x_9 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 7 and 0 vectors as columns */
    public void transform_10_by_7_0() {
        double t = x_7 * x_10 + x_0 * y_10;
        y_10=y_7 * x_10 + y_0 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 7 and 1 vectors as columns */
    public void transform_10_by_7_1() {
        double t = x_7 * x_10 + x_1 * y_10;
        y_10=y_7 * x_10 + y_1 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 7 and 2 vectors as columns */
    public void transform_10_by_7_2() {
        double t = x_7 * x_10 + x_2 * y_10;
        y_10=y_7 * x_10 + y_2 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 7 and 3 vectors as columns */
    public void transform_10_by_7_3() {
        double t = x_7 * x_10 + x_3 * y_10;
        y_10=y_7 * x_10 + y_3 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 7 and 4 vectors as columns */
    public void transform_10_by_7_4() {
        double t = x_7 * x_10 + x_4 * y_10;
        y_10=y_7 * x_10 + y_4 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 7 and 5 vectors as columns */
    public void transform_10_by_7_5() {
        double t = x_7 * x_10 + x_5 * y_10;
        y_10=y_7 * x_10 + y_5 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 7 and 6 vectors as columns */
    public void transform_10_by_7_6() {
        double t = x_7 * x_10 + x_6 * y_10;
        y_10=y_7 * x_10 + y_6 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 7 and 8 vectors as columns */
    public void transform_10_by_7_8() {
        double t = x_7 * x_10 + x_8 * y_10;
        y_10=y_7 * x_10 + y_8 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 7 and 9 vectors as columns */
    public void transform_10_by_7_9() {
        double t = x_7 * x_10 + x_9 * y_10;
        y_10=y_7 * x_10 + y_9 * y_10;
        x_10 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 7 and 10 vectors as columns */
    public void transform_0_by_7_10() {
        double t = x_7 * x_0 + x_10 * y_0;
        y_0=y_7 * x_0 + y_10 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 7 and 10 vectors as columns */
    public void transform_1_by_7_10() {
        double t = x_7 * x_1 + x_10 * y_1;
        y_1=y_7 * x_1 + y_10 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 7 and 10 vectors as columns */
    public void transform_2_by_7_10() {
        double t = x_7 * x_2 + x_10 * y_2;
        y_2=y_7 * x_2 + y_10 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 7 and 10 vectors as columns */
    public void transform_3_by_7_10() {
        double t = x_7 * x_3 + x_10 * y_3;
        y_3=y_7 * x_3 + y_10 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 7 and 10 vectors as columns */
    public void transform_4_by_7_10() {
        double t = x_7 * x_4 + x_10 * y_4;
        y_4=y_7 * x_4 + y_10 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 7 and 10 vectors as columns */
    public void transform_5_by_7_10() {
        double t = x_7 * x_5 + x_10 * y_5;
        y_5=y_7 * x_5 + y_10 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 7 and 10 vectors as columns */
    public void transform_6_by_7_10() {
        double t = x_7 * x_6 + x_10 * y_6;
        y_6=y_7 * x_6 + y_10 * y_6;
        x_6 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 7 and 10 vectors as columns */
    public void transform_8_by_7_10() {
        double t = x_7 * x_8 + x_10 * y_8;
        y_8=y_7 * x_8 + y_10 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 7 and 10 vectors as columns */
    public void transform_9_by_7_10() {
        double t = x_7 * x_9 + x_10 * y_9;
        y_9=y_7 * x_9 + y_10 * y_9;
        x_9 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 8 and 0 vectors as columns */
    public void transform_10_by_8_0() {
        double t = x_8 * x_10 + x_0 * y_10;
        y_10=y_8 * x_10 + y_0 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 8 and 1 vectors as columns */
    public void transform_10_by_8_1() {
        double t = x_8 * x_10 + x_1 * y_10;
        y_10=y_8 * x_10 + y_1 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 8 and 2 vectors as columns */
    public void transform_10_by_8_2() {
        double t = x_8 * x_10 + x_2 * y_10;
        y_10=y_8 * x_10 + y_2 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 8 and 3 vectors as columns */
    public void transform_10_by_8_3() {
        double t = x_8 * x_10 + x_3 * y_10;
        y_10=y_8 * x_10 + y_3 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 8 and 4 vectors as columns */
    public void transform_10_by_8_4() {
        double t = x_8 * x_10 + x_4 * y_10;
        y_10=y_8 * x_10 + y_4 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 8 and 5 vectors as columns */
    public void transform_10_by_8_5() {
        double t = x_8 * x_10 + x_5 * y_10;
        y_10=y_8 * x_10 + y_5 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 8 and 6 vectors as columns */
    public void transform_10_by_8_6() {
        double t = x_8 * x_10 + x_6 * y_10;
        y_10=y_8 * x_10 + y_6 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 8 and 7 vectors as columns */
    public void transform_10_by_8_7() {
        double t = x_8 * x_10 + x_7 * y_10;
        y_10=y_8 * x_10 + y_7 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 8 and 9 vectors as columns */
    public void transform_10_by_8_9() {
        double t = x_8 * x_10 + x_9 * y_10;
        y_10=y_8 * x_10 + y_9 * y_10;
        x_10 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 8 and 10 vectors as columns */
    public void transform_0_by_8_10() {
        double t = x_8 * x_0 + x_10 * y_0;
        y_0=y_8 * x_0 + y_10 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 8 and 10 vectors as columns */
    public void transform_1_by_8_10() {
        double t = x_8 * x_1 + x_10 * y_1;
        y_1=y_8 * x_1 + y_10 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 8 and 10 vectors as columns */
    public void transform_2_by_8_10() {
        double t = x_8 * x_2 + x_10 * y_2;
        y_2=y_8 * x_2 + y_10 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 8 and 10 vectors as columns */
    public void transform_3_by_8_10() {
        double t = x_8 * x_3 + x_10 * y_3;
        y_3=y_8 * x_3 + y_10 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 8 and 10 vectors as columns */
    public void transform_4_by_8_10() {
        double t = x_8 * x_4 + x_10 * y_4;
        y_4=y_8 * x_4 + y_10 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 8 and 10 vectors as columns */
    public void transform_5_by_8_10() {
        double t = x_8 * x_5 + x_10 * y_5;
        y_5=y_8 * x_5 + y_10 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 8 and 10 vectors as columns */
    public void transform_6_by_8_10() {
        double t = x_8 * x_6 + x_10 * y_6;
        y_6=y_8 * x_6 + y_10 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 8 and 10 vectors as columns */
    public void transform_7_by_8_10() {
        double t = x_8 * x_7 + x_10 * y_7;
        y_7=y_8 * x_7 + y_10 * y_7;
        x_7 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 8 and 10 vectors as columns */
    public void transform_9_by_8_10() {
        double t = x_8 * x_9 + x_10 * y_9;
        y_9=y_8 * x_9 + y_10 * y_9;
        x_9 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 9 and 0 vectors as columns */
    public void transform_10_by_9_0() {
        double t = x_9 * x_10 + x_0 * y_10;
        y_10=y_9 * x_10 + y_0 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 9 and 1 vectors as columns */
    public void transform_10_by_9_1() {
        double t = x_9 * x_10 + x_1 * y_10;
        y_10=y_9 * x_10 + y_1 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 9 and 2 vectors as columns */
    public void transform_10_by_9_2() {
        double t = x_9 * x_10 + x_2 * y_10;
        y_10=y_9 * x_10 + y_2 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 9 and 3 vectors as columns */
    public void transform_10_by_9_3() {
        double t = x_9 * x_10 + x_3 * y_10;
        y_10=y_9 * x_10 + y_3 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 9 and 4 vectors as columns */
    public void transform_10_by_9_4() {
        double t = x_9 * x_10 + x_4 * y_10;
        y_10=y_9 * x_10 + y_4 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 9 and 5 vectors as columns */
    public void transform_10_by_9_5() {
        double t = x_9 * x_10 + x_5 * y_10;
        y_10=y_9 * x_10 + y_5 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 9 and 6 vectors as columns */
    public void transform_10_by_9_6() {
        double t = x_9 * x_10 + x_6 * y_10;
        y_10=y_9 * x_10 + y_6 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 9 and 7 vectors as columns */
    public void transform_10_by_9_7() {
        double t = x_9 * x_10 + x_7 * y_10;
        y_10=y_9 * x_10 + y_7 * y_10;
        x_10 = t;
    }

    /** transform the 10 vector by the matrixed formed by the 9 and 8 vectors as columns */
    public void transform_10_by_9_8() {
        double t = x_9 * x_10 + x_8 * y_10;
        y_10=y_9 * x_10 + y_8 * y_10;
        x_10 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 9 and 10 vectors as columns */
    public void transform_0_by_9_10() {
        double t = x_9 * x_0 + x_10 * y_0;
        y_0=y_9 * x_0 + y_10 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 9 and 10 vectors as columns */
    public void transform_1_by_9_10() {
        double t = x_9 * x_1 + x_10 * y_1;
        y_1=y_9 * x_1 + y_10 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 9 and 10 vectors as columns */
    public void transform_2_by_9_10() {
        double t = x_9 * x_2 + x_10 * y_2;
        y_2=y_9 * x_2 + y_10 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 9 and 10 vectors as columns */
    public void transform_3_by_9_10() {
        double t = x_9 * x_3 + x_10 * y_3;
        y_3=y_9 * x_3 + y_10 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 9 and 10 vectors as columns */
    public void transform_4_by_9_10() {
        double t = x_9 * x_4 + x_10 * y_4;
        y_4=y_9 * x_4 + y_10 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 9 and 10 vectors as columns */
    public void transform_5_by_9_10() {
        double t = x_9 * x_5 + x_10 * y_5;
        y_5=y_9 * x_5 + y_10 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 9 and 10 vectors as columns */
    public void transform_6_by_9_10() {
        double t = x_9 * x_6 + x_10 * y_6;
        y_6=y_9 * x_6 + y_10 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 9 and 10 vectors as columns */
    public void transform_7_by_9_10() {
        double t = x_9 * x_7 + x_10 * y_7;
        y_7=y_9 * x_7 + y_10 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 9 and 10 vectors as columns */
    public void transform_8_by_9_10() {
        double t = x_9 * x_8 + x_10 * y_8;
        y_8=y_9 * x_8 + y_10 * y_8;
        x_8 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 10 and 0 vectors as columns */
    public void transform_1_by_10_0() {
        double t = x_10 * x_1 + x_0 * y_1;
        y_1=y_10 * x_1 + y_0 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 10 and 0 vectors as columns */
    public void transform_2_by_10_0() {
        double t = x_10 * x_2 + x_0 * y_2;
        y_2=y_10 * x_2 + y_0 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 10 and 0 vectors as columns */
    public void transform_3_by_10_0() {
        double t = x_10 * x_3 + x_0 * y_3;
        y_3=y_10 * x_3 + y_0 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 10 and 0 vectors as columns */
    public void transform_4_by_10_0() {
        double t = x_10 * x_4 + x_0 * y_4;
        y_4=y_10 * x_4 + y_0 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 10 and 0 vectors as columns */
    public void transform_5_by_10_0() {
        double t = x_10 * x_5 + x_0 * y_5;
        y_5=y_10 * x_5 + y_0 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 10 and 0 vectors as columns */
    public void transform_6_by_10_0() {
        double t = x_10 * x_6 + x_0 * y_6;
        y_6=y_10 * x_6 + y_0 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 10 and 0 vectors as columns */
    public void transform_7_by_10_0() {
        double t = x_10 * x_7 + x_0 * y_7;
        y_7=y_10 * x_7 + y_0 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 10 and 0 vectors as columns */
    public void transform_8_by_10_0() {
        double t = x_10 * x_8 + x_0 * y_8;
        y_8=y_10 * x_8 + y_0 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 10 and 0 vectors as columns */
    public void transform_9_by_10_0() {
        double t = x_10 * x_9 + x_0 * y_9;
        y_9=y_10 * x_9 + y_0 * y_9;
        x_9 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 10 and 1 vectors as columns */
    public void transform_0_by_10_1() {
        double t = x_10 * x_0 + x_1 * y_0;
        y_0=y_10 * x_0 + y_1 * y_0;
        x_0 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 10 and 1 vectors as columns */
    public void transform_2_by_10_1() {
        double t = x_10 * x_2 + x_1 * y_2;
        y_2=y_10 * x_2 + y_1 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 10 and 1 vectors as columns */
    public void transform_3_by_10_1() {
        double t = x_10 * x_3 + x_1 * y_3;
        y_3=y_10 * x_3 + y_1 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 10 and 1 vectors as columns */
    public void transform_4_by_10_1() {
        double t = x_10 * x_4 + x_1 * y_4;
        y_4=y_10 * x_4 + y_1 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 10 and 1 vectors as columns */
    public void transform_5_by_10_1() {
        double t = x_10 * x_5 + x_1 * y_5;
        y_5=y_10 * x_5 + y_1 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 10 and 1 vectors as columns */
    public void transform_6_by_10_1() {
        double t = x_10 * x_6 + x_1 * y_6;
        y_6=y_10 * x_6 + y_1 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 10 and 1 vectors as columns */
    public void transform_7_by_10_1() {
        double t = x_10 * x_7 + x_1 * y_7;
        y_7=y_10 * x_7 + y_1 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 10 and 1 vectors as columns */
    public void transform_8_by_10_1() {
        double t = x_10 * x_8 + x_1 * y_8;
        y_8=y_10 * x_8 + y_1 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 10 and 1 vectors as columns */
    public void transform_9_by_10_1() {
        double t = x_10 * x_9 + x_1 * y_9;
        y_9=y_10 * x_9 + y_1 * y_9;
        x_9 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 10 and 2 vectors as columns */
    public void transform_0_by_10_2() {
        double t = x_10 * x_0 + x_2 * y_0;
        y_0=y_10 * x_0 + y_2 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 10 and 2 vectors as columns */
    public void transform_1_by_10_2() {
        double t = x_10 * x_1 + x_2 * y_1;
        y_1=y_10 * x_1 + y_2 * y_1;
        x_1 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 10 and 2 vectors as columns */
    public void transform_3_by_10_2() {
        double t = x_10 * x_3 + x_2 * y_3;
        y_3=y_10 * x_3 + y_2 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 10 and 2 vectors as columns */
    public void transform_4_by_10_2() {
        double t = x_10 * x_4 + x_2 * y_4;
        y_4=y_10 * x_4 + y_2 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 10 and 2 vectors as columns */
    public void transform_5_by_10_2() {
        double t = x_10 * x_5 + x_2 * y_5;
        y_5=y_10 * x_5 + y_2 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 10 and 2 vectors as columns */
    public void transform_6_by_10_2() {
        double t = x_10 * x_6 + x_2 * y_6;
        y_6=y_10 * x_6 + y_2 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 10 and 2 vectors as columns */
    public void transform_7_by_10_2() {
        double t = x_10 * x_7 + x_2 * y_7;
        y_7=y_10 * x_7 + y_2 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 10 and 2 vectors as columns */
    public void transform_8_by_10_2() {
        double t = x_10 * x_8 + x_2 * y_8;
        y_8=y_10 * x_8 + y_2 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 10 and 2 vectors as columns */
    public void transform_9_by_10_2() {
        double t = x_10 * x_9 + x_2 * y_9;
        y_9=y_10 * x_9 + y_2 * y_9;
        x_9 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 10 and 3 vectors as columns */
    public void transform_0_by_10_3() {
        double t = x_10 * x_0 + x_3 * y_0;
        y_0=y_10 * x_0 + y_3 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 10 and 3 vectors as columns */
    public void transform_1_by_10_3() {
        double t = x_10 * x_1 + x_3 * y_1;
        y_1=y_10 * x_1 + y_3 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 10 and 3 vectors as columns */
    public void transform_2_by_10_3() {
        double t = x_10 * x_2 + x_3 * y_2;
        y_2=y_10 * x_2 + y_3 * y_2;
        x_2 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 10 and 3 vectors as columns */
    public void transform_4_by_10_3() {
        double t = x_10 * x_4 + x_3 * y_4;
        y_4=y_10 * x_4 + y_3 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 10 and 3 vectors as columns */
    public void transform_5_by_10_3() {
        double t = x_10 * x_5 + x_3 * y_5;
        y_5=y_10 * x_5 + y_3 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 10 and 3 vectors as columns */
    public void transform_6_by_10_3() {
        double t = x_10 * x_6 + x_3 * y_6;
        y_6=y_10 * x_6 + y_3 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 10 and 3 vectors as columns */
    public void transform_7_by_10_3() {
        double t = x_10 * x_7 + x_3 * y_7;
        y_7=y_10 * x_7 + y_3 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 10 and 3 vectors as columns */
    public void transform_8_by_10_3() {
        double t = x_10 * x_8 + x_3 * y_8;
        y_8=y_10 * x_8 + y_3 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 10 and 3 vectors as columns */
    public void transform_9_by_10_3() {
        double t = x_10 * x_9 + x_3 * y_9;
        y_9=y_10 * x_9 + y_3 * y_9;
        x_9 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 10 and 4 vectors as columns */
    public void transform_0_by_10_4() {
        double t = x_10 * x_0 + x_4 * y_0;
        y_0=y_10 * x_0 + y_4 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 10 and 4 vectors as columns */
    public void transform_1_by_10_4() {
        double t = x_10 * x_1 + x_4 * y_1;
        y_1=y_10 * x_1 + y_4 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 10 and 4 vectors as columns */
    public void transform_2_by_10_4() {
        double t = x_10 * x_2 + x_4 * y_2;
        y_2=y_10 * x_2 + y_4 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 10 and 4 vectors as columns */
    public void transform_3_by_10_4() {
        double t = x_10 * x_3 + x_4 * y_3;
        y_3=y_10 * x_3 + y_4 * y_3;
        x_3 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 10 and 4 vectors as columns */
    public void transform_5_by_10_4() {
        double t = x_10 * x_5 + x_4 * y_5;
        y_5=y_10 * x_5 + y_4 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 10 and 4 vectors as columns */
    public void transform_6_by_10_4() {
        double t = x_10 * x_6 + x_4 * y_6;
        y_6=y_10 * x_6 + y_4 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 10 and 4 vectors as columns */
    public void transform_7_by_10_4() {
        double t = x_10 * x_7 + x_4 * y_7;
        y_7=y_10 * x_7 + y_4 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 10 and 4 vectors as columns */
    public void transform_8_by_10_4() {
        double t = x_10 * x_8 + x_4 * y_8;
        y_8=y_10 * x_8 + y_4 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 10 and 4 vectors as columns */
    public void transform_9_by_10_4() {
        double t = x_10 * x_9 + x_4 * y_9;
        y_9=y_10 * x_9 + y_4 * y_9;
        x_9 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 10 and 5 vectors as columns */
    public void transform_0_by_10_5() {
        double t = x_10 * x_0 + x_5 * y_0;
        y_0=y_10 * x_0 + y_5 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 10 and 5 vectors as columns */
    public void transform_1_by_10_5() {
        double t = x_10 * x_1 + x_5 * y_1;
        y_1=y_10 * x_1 + y_5 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 10 and 5 vectors as columns */
    public void transform_2_by_10_5() {
        double t = x_10 * x_2 + x_5 * y_2;
        y_2=y_10 * x_2 + y_5 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 10 and 5 vectors as columns */
    public void transform_3_by_10_5() {
        double t = x_10 * x_3 + x_5 * y_3;
        y_3=y_10 * x_3 + y_5 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 10 and 5 vectors as columns */
    public void transform_4_by_10_5() {
        double t = x_10 * x_4 + x_5 * y_4;
        y_4=y_10 * x_4 + y_5 * y_4;
        x_4 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 10 and 5 vectors as columns */
    public void transform_6_by_10_5() {
        double t = x_10 * x_6 + x_5 * y_6;
        y_6=y_10 * x_6 + y_5 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 10 and 5 vectors as columns */
    public void transform_7_by_10_5() {
        double t = x_10 * x_7 + x_5 * y_7;
        y_7=y_10 * x_7 + y_5 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 10 and 5 vectors as columns */
    public void transform_8_by_10_5() {
        double t = x_10 * x_8 + x_5 * y_8;
        y_8=y_10 * x_8 + y_5 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 10 and 5 vectors as columns */
    public void transform_9_by_10_5() {
        double t = x_10 * x_9 + x_5 * y_9;
        y_9=y_10 * x_9 + y_5 * y_9;
        x_9 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 10 and 6 vectors as columns */
    public void transform_0_by_10_6() {
        double t = x_10 * x_0 + x_6 * y_0;
        y_0=y_10 * x_0 + y_6 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 10 and 6 vectors as columns */
    public void transform_1_by_10_6() {
        double t = x_10 * x_1 + x_6 * y_1;
        y_1=y_10 * x_1 + y_6 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 10 and 6 vectors as columns */
    public void transform_2_by_10_6() {
        double t = x_10 * x_2 + x_6 * y_2;
        y_2=y_10 * x_2 + y_6 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 10 and 6 vectors as columns */
    public void transform_3_by_10_6() {
        double t = x_10 * x_3 + x_6 * y_3;
        y_3=y_10 * x_3 + y_6 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 10 and 6 vectors as columns */
    public void transform_4_by_10_6() {
        double t = x_10 * x_4 + x_6 * y_4;
        y_4=y_10 * x_4 + y_6 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 10 and 6 vectors as columns */
    public void transform_5_by_10_6() {
        double t = x_10 * x_5 + x_6 * y_5;
        y_5=y_10 * x_5 + y_6 * y_5;
        x_5 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 10 and 6 vectors as columns */
    public void transform_7_by_10_6() {
        double t = x_10 * x_7 + x_6 * y_7;
        y_7=y_10 * x_7 + y_6 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 10 and 6 vectors as columns */
    public void transform_8_by_10_6() {
        double t = x_10 * x_8 + x_6 * y_8;
        y_8=y_10 * x_8 + y_6 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 10 and 6 vectors as columns */
    public void transform_9_by_10_6() {
        double t = x_10 * x_9 + x_6 * y_9;
        y_9=y_10 * x_9 + y_6 * y_9;
        x_9 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 10 and 7 vectors as columns */
    public void transform_0_by_10_7() {
        double t = x_10 * x_0 + x_7 * y_0;
        y_0=y_10 * x_0 + y_7 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 10 and 7 vectors as columns */
    public void transform_1_by_10_7() {
        double t = x_10 * x_1 + x_7 * y_1;
        y_1=y_10 * x_1 + y_7 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 10 and 7 vectors as columns */
    public void transform_2_by_10_7() {
        double t = x_10 * x_2 + x_7 * y_2;
        y_2=y_10 * x_2 + y_7 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 10 and 7 vectors as columns */
    public void transform_3_by_10_7() {
        double t = x_10 * x_3 + x_7 * y_3;
        y_3=y_10 * x_3 + y_7 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 10 and 7 vectors as columns */
    public void transform_4_by_10_7() {
        double t = x_10 * x_4 + x_7 * y_4;
        y_4=y_10 * x_4 + y_7 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 10 and 7 vectors as columns */
    public void transform_5_by_10_7() {
        double t = x_10 * x_5 + x_7 * y_5;
        y_5=y_10 * x_5 + y_7 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 10 and 7 vectors as columns */
    public void transform_6_by_10_7() {
        double t = x_10 * x_6 + x_7 * y_6;
        y_6=y_10 * x_6 + y_7 * y_6;
        x_6 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 10 and 7 vectors as columns */
    public void transform_8_by_10_7() {
        double t = x_10 * x_8 + x_7 * y_8;
        y_8=y_10 * x_8 + y_7 * y_8;
        x_8 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 10 and 7 vectors as columns */
    public void transform_9_by_10_7() {
        double t = x_10 * x_9 + x_7 * y_9;
        y_9=y_10 * x_9 + y_7 * y_9;
        x_9 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 10 and 8 vectors as columns */
    public void transform_0_by_10_8() {
        double t = x_10 * x_0 + x_8 * y_0;
        y_0=y_10 * x_0 + y_8 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 10 and 8 vectors as columns */
    public void transform_1_by_10_8() {
        double t = x_10 * x_1 + x_8 * y_1;
        y_1=y_10 * x_1 + y_8 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 10 and 8 vectors as columns */
    public void transform_2_by_10_8() {
        double t = x_10 * x_2 + x_8 * y_2;
        y_2=y_10 * x_2 + y_8 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 10 and 8 vectors as columns */
    public void transform_3_by_10_8() {
        double t = x_10 * x_3 + x_8 * y_3;
        y_3=y_10 * x_3 + y_8 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 10 and 8 vectors as columns */
    public void transform_4_by_10_8() {
        double t = x_10 * x_4 + x_8 * y_4;
        y_4=y_10 * x_4 + y_8 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 10 and 8 vectors as columns */
    public void transform_5_by_10_8() {
        double t = x_10 * x_5 + x_8 * y_5;
        y_5=y_10 * x_5 + y_8 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 10 and 8 vectors as columns */
    public void transform_6_by_10_8() {
        double t = x_10 * x_6 + x_8 * y_6;
        y_6=y_10 * x_6 + y_8 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 10 and 8 vectors as columns */
    public void transform_7_by_10_8() {
        double t = x_10 * x_7 + x_8 * y_7;
        y_7=y_10 * x_7 + y_8 * y_7;
        x_7 = t;
    }

    /** transform the 9 vector by the matrixed formed by the 10 and 8 vectors as columns */
    public void transform_9_by_10_8() {
        double t = x_10 * x_9 + x_8 * y_9;
        y_9=y_10 * x_9 + y_8 * y_9;
        x_9 = t;
    }

    /** transform the 0 vector by the matrixed formed by the 10 and 9 vectors as columns */
    public void transform_0_by_10_9() {
        double t = x_10 * x_0 + x_9 * y_0;
        y_0=y_10 * x_0 + y_9 * y_0;
        x_0 = t;
    }

    /** transform the 1 vector by the matrixed formed by the 10 and 9 vectors as columns */
    public void transform_1_by_10_9() {
        double t = x_10 * x_1 + x_9 * y_1;
        y_1=y_10 * x_1 + y_9 * y_1;
        x_1 = t;
    }

    /** transform the 2 vector by the matrixed formed by the 10 and 9 vectors as columns */
    public void transform_2_by_10_9() {
        double t = x_10 * x_2 + x_9 * y_2;
        y_2=y_10 * x_2 + y_9 * y_2;
        x_2 = t;
    }

    /** transform the 3 vector by the matrixed formed by the 10 and 9 vectors as columns */
    public void transform_3_by_10_9() {
        double t = x_10 * x_3 + x_9 * y_3;
        y_3=y_10 * x_3 + y_9 * y_3;
        x_3 = t;
    }

    /** transform the 4 vector by the matrixed formed by the 10 and 9 vectors as columns */
    public void transform_4_by_10_9() {
        double t = x_10 * x_4 + x_9 * y_4;
        y_4=y_10 * x_4 + y_9 * y_4;
        x_4 = t;
    }

    /** transform the 5 vector by the matrixed formed by the 10 and 9 vectors as columns */
    public void transform_5_by_10_9() {
        double t = x_10 * x_5 + x_9 * y_5;
        y_5=y_10 * x_5 + y_9 * y_5;
        x_5 = t;
    }

    /** transform the 6 vector by the matrixed formed by the 10 and 9 vectors as columns */
    public void transform_6_by_10_9() {
        double t = x_10 * x_6 + x_9 * y_6;
        y_6=y_10 * x_6 + y_9 * y_6;
        x_6 = t;
    }

    /** transform the 7 vector by the matrixed formed by the 10 and 9 vectors as columns */
    public void transform_7_by_10_9() {
        double t = x_10 * x_7 + x_9 * y_7;
        y_7=y_10 * x_7 + y_9 * y_7;
        x_7 = t;
    }

    /** transform the 8 vector by the matrixed formed by the 10 and 9 vectors as columns */
    public void transform_8_by_10_9() {
        double t = x_10 * x_8 + x_9 * y_8;
        y_8=y_10 * x_8 + y_9 * y_8;
        x_8 = t;
    }

    /** invert the 2x2 matrix formed by vector 0 and vector 10 where the vectors are columns */
    public boolean invert_0_10() {
        double t =x_0;
        double invdet = x_0*y_10-y_0*x_10;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_0 *= -1 * invdet;
        x_0 *= y_10 * invdet;
        y_10 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 1 and vector 10 where the vectors are columns */
    public boolean invert_1_10() {
        double t =x_1;
        double invdet = x_1*y_10-y_1*x_10;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_1 *= -1 * invdet;
        x_1 *= y_10 * invdet;
        y_10 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 2 and vector 10 where the vectors are columns */
    public boolean invert_2_10() {
        double t =x_2;
        double invdet = x_2*y_10-y_2*x_10;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_2 *= -1 * invdet;
        x_2 *= y_10 * invdet;
        y_10 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 3 and vector 10 where the vectors are columns */
    public boolean invert_3_10() {
        double t =x_3;
        double invdet = x_3*y_10-y_3*x_10;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_3 *= -1 * invdet;
        x_3 *= y_10 * invdet;
        y_10 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 4 and vector 10 where the vectors are columns */
    public boolean invert_4_10() {
        double t =x_4;
        double invdet = x_4*y_10-y_4*x_10;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_4 *= -1 * invdet;
        x_4 *= y_10 * invdet;
        y_10 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 5 and vector 10 where the vectors are columns */
    public boolean invert_5_10() {
        double t =x_5;
        double invdet = x_5*y_10-y_5*x_10;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_5 *= -1 * invdet;
        x_5 *= y_10 * invdet;
        y_10 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 6 and vector 10 where the vectors are columns */
    public boolean invert_6_10() {
        double t =x_6;
        double invdet = x_6*y_10-y_6*x_10;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_6 *= -1 * invdet;
        x_6 *= y_10 * invdet;
        y_10 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 7 and vector 10 where the vectors are columns */
    public boolean invert_7_10() {
        double t =x_7;
        double invdet = x_7*y_10-y_7*x_10;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_7 *= -1 * invdet;
        x_7 *= y_10 * invdet;
        y_10 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 8 and vector 10 where the vectors are columns */
    public boolean invert_8_10() {
        double t =x_8;
        double invdet = x_8*y_10-y_8*x_10;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_8 *= -1 * invdet;
        x_8 *= y_10 * invdet;
        y_10 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 9 and vector 10 where the vectors are columns */
    public boolean invert_9_10() {
        double t =x_9;
        double invdet = x_9*y_10-y_9*x_10;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_10 *= -1 * invdet;
        y_9 *= -1 * invdet;
        x_9 *= y_10 * invdet;
        y_10 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 0 where the vectors are columns */
    public boolean invert_10_0() {
        double t =x_10;
        double invdet = x_10*y_0-y_10*x_0;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_0 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 *= y_0 * invdet;
        y_0 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 1 where the vectors are columns */
    public boolean invert_10_1() {
        double t =x_10;
        double invdet = x_10*y_1-y_10*x_1;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_1 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 *= y_1 * invdet;
        y_1 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 2 where the vectors are columns */
    public boolean invert_10_2() {
        double t =x_10;
        double invdet = x_10*y_2-y_10*x_2;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_2 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 *= y_2 * invdet;
        y_2 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 3 where the vectors are columns */
    public boolean invert_10_3() {
        double t =x_10;
        double invdet = x_10*y_3-y_10*x_3;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_3 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 *= y_3 * invdet;
        y_3 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 4 where the vectors are columns */
    public boolean invert_10_4() {
        double t =x_10;
        double invdet = x_10*y_4-y_10*x_4;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_4 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 *= y_4 * invdet;
        y_4 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 5 where the vectors are columns */
    public boolean invert_10_5() {
        double t =x_10;
        double invdet = x_10*y_5-y_10*x_5;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_5 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 *= y_5 * invdet;
        y_5 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 6 where the vectors are columns */
    public boolean invert_10_6() {
        double t =x_10;
        double invdet = x_10*y_6-y_10*x_6;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_6 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 *= y_6 * invdet;
        y_6 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 7 where the vectors are columns */
    public boolean invert_10_7() {
        double t =x_10;
        double invdet = x_10*y_7-y_10*x_7;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_7 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 *= y_7 * invdet;
        y_7 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 8 where the vectors are columns */
    public boolean invert_10_8() {
        double t =x_10;
        double invdet = x_10*y_8-y_10*x_8;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_8 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 *= y_8 * invdet;
        y_8 *= t * invdet;
        return true;
    }

    /** invert the 2x2 matrix formed by vector 10 and vector 9 where the vectors are columns */
    public boolean invert_10_9() {
        double t =x_10;
        double invdet = x_10*y_9-y_10*x_9;
        if(Math.abs(invdet) < ZERO_LIMIT) return false;
        invdet = 1.0 / invdet;
        x_9 *= -1 * invdet;
        y_10 *= -1 * invdet;
        x_10 *= y_9 * invdet;
        y_9 *= t * invdet;
        return true;
    }

    /** is the 10-vector the origin */
    public boolean isZero_10() {
        double d = 0.0;
        d += x_10*x_10;
        d += y_10*y_10;
        if(Math.abs(d) < ZERO_LIMIT) return true;
        return false;
    }
}
