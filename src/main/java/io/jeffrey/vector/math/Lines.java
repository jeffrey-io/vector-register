package io.jeffrey.vector.math;

import io.jeffrey.vector.VectorRegister2;
import io.jeffrey.vector.VectorRegister3;

/**
 * Easy math around dealing with lines
 * 
 * @author jeffrey
 */
public class Lines {
    /**
     * are the three vectors colinear when written as a line [V0],[V1],V[2]
     * 
     * @param reg
     *            the register banks
     * @param resultIfZeroLengthInvolved
     *            if either the vectors touch each other (you either have a problem with your data, or you want to return true)
     * @return are the three vectors colinear
     */
    public static boolean colinear_Destructive(VectorRegister3 reg, boolean resultIfZeroLengthInvolved) {
        reg.sub_0_from_1();
        reg.sub_0_from_2();
        if (!reg.normalize_1()) {
            return resultIfZeroLengthInvolved;
        }
        if (!reg.normalize_2()) {
            return resultIfZeroLengthInvolved;
        }
        return Math.abs(1 - reg.dot_1_2()) < VectorRegister2.ZERO_LIMIT;
    }

    /**
     * [V0] ------------[V0']-------------- [V1] 
     *                    |
     *                    |
     *                  [V2]
     * 
     * Find the distance between the given vector 2 and the line formed by vectors 0 and 1.
     * 
     * @param reg
     *            the register bank
     * @return return the distance from [V2] and [V0'] where [V0']
     */
    public static double minimalDistanceV2toLineSegmentV0V1_Destructive(VectorRegister3 reg) {
        reg.sub_0_from_1();
        reg.sub_0_from_2();
        if (reg.is_1_zero())
            return -1;
        double len = reg.length_1();
        reg.div_1_by(len);
        double lambda = reg.dot_1_2();
        if (lambda < 0) {
            lambda = 0;
        } else if (lambda > len) {
            lambda = len;
        }
        reg.mult_1_by(lambda);
        reg.add_1_to_0();
        reg.sub_1_from_2();
        return reg.length_2();
    }
    
    /**
     * ---------[V0] ------------[V0']-------------- [V1]----------- 
     *                             |
     *                             |
     *                           [V2]
     * 
     * Find the distance between the given vector 2 and the line formed by vectors 0 and 1.
     * 
     * @param reg
     *            the register bank
     * @return return the distance from [V2] and [V0'] where [V0']
     */
    public static double minimalDistanceV2toLineContainingV0V1_Destructive(VectorRegister3 reg) {
        reg.sub_0_from_1();
        reg.sub_0_from_2();
        if (!reg.normalize_1()) {
            return -1;
        }
        double lambda = reg.dot_1_2();
        reg.mult_1_by(lambda);
        reg.add_1_to_0();
        reg.sub_1_from_2();
        return reg.length_2();
    }
}
