package io.jeffrey.vector.math;

import io.jeffrey.vector.CommonVectorTestingBase;
import io.jeffrey.vector.VectorRegister3;

import org.junit.Test;

public class LinesTest extends CommonVectorTestingBase {

    @Test
    public void testScenario1Segment() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(5, 5);
        reg.set_1(10, 10);
        reg.set_2(7.5 + 2, 7.5 - 2);

        double distance = Lines.minimalDistanceV2toLineSegmentV0V1_Destructive(reg);
        assertEquals(Math.sqrt(2 * 2 + 2 * 2), distance);
        assertEquals(7.5, reg.x_0);
        assertEquals(7.5, reg.y_0);
    }

    @Test
    public void testScenario1Line() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(5, 5);
        reg.set_1(10, 10);
        reg.set_2(7.5 + 2, 7.5 - 2);

        double distance = Lines.minimalDistanceV2toLineContainingV0V1_Destructive(reg);
        assertEquals(Math.sqrt(2 * 2 + 2 * 2), distance);
        assertEquals(7.5, reg.x_0);
        assertEquals(7.5, reg.y_0);
    }

    @Test
    public void testScenario2Segment() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(0, 0);
        reg.set_1(10, 0);
        reg.set_2(5, 4);

        double distance = Lines.minimalDistanceV2toLineSegmentV0V1_Destructive(reg);
        assertEquals(4, distance);
        assertEquals(5, reg.x_0);
        assertEquals(0, reg.y_0);
    }

    @Test
    public void testScenario2Line() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(0, 0);
        reg.set_1(10, 0);
        reg.set_2(5, 4);

        double distance = Lines.minimalDistanceV2toLineContainingV0V1_Destructive(reg);
        assertEquals(4, distance);
        assertEquals(5, reg.x_0);
        assertEquals(0, reg.y_0);
    }

    @Test
    public void testScenario3Segment() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(0, 0);
        reg.set_1(0, 10);
        reg.set_2(4, 5);

        double distance = Lines.minimalDistanceV2toLineSegmentV0V1_Destructive(reg);
        assertEquals(4, distance);
        assertEquals(0, reg.x_0);
        assertEquals(5, reg.y_0);
    }

    @Test
    public void testScenario3Line() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(0, 0);
        reg.set_1(0, 10);
        reg.set_2(4, 5);

        double distance = Lines.minimalDistanceV2toLineContainingV0V1_Destructive(reg);
        assertEquals(4, distance);
        assertEquals(0, reg.x_0);
        assertEquals(5, reg.y_0);
    }

    @Test
    public void testEndCap() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(0, 0);
        reg.set_1(0, 10);
        reg.set_2(5, 20);

        double distance = Lines.minimalDistanceV2toLineSegmentV0V1_Destructive(reg);
        assertEquals(Math.sqrt(10 * 10 + 5 * 5), distance);
        assertEquals(0, reg.x_0);
        assertEquals(10, reg.y_0);
    }

    @Test
    public void testNoEndCapLine() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(0, 0);
        reg.set_1(0, 10);
        reg.set_2(5, 20);

        double distance = Lines.minimalDistanceV2toLineContainingV0V1_Destructive(reg);
        assertEquals(Math.sqrt(5 * 5), distance);
        assertEquals(0, reg.x_0);
        assertEquals(20, reg.y_0);
    }

    @Test
    public void testNoStartCapLine() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(0, 0);
        reg.set_1(0, 10);
        reg.set_2(-5, -10);

        double distance = Lines.minimalDistanceV2toLineContainingV0V1_Destructive(reg);
        assertEquals(Math.sqrt(5 * 5), distance);
        assertEquals(0, reg.x_0);
        assertEquals(-10, reg.y_0);
    }

    @Test
    public void testStartCap() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(0, 0);
        reg.set_1(0, 10);
        reg.set_2(-5, -10);

        double distance = Lines.minimalDistanceV2toLineSegmentV0V1_Destructive(reg);
        assertEquals(Math.sqrt(10 * 10 + 5 * 5), distance);
        assertEquals(0, reg.x_0);
        assertEquals(0, reg.y_0);
    }

    @Test
    public void testUnableToComplySegment() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(0, 0);
        reg.set_1(0, 0);
        reg.set_2(-5, -10);

        double distance = Lines.minimalDistanceV2toLineSegmentV0V1_Destructive(reg);
        assertEquals(-1, distance);
    }

    @Test
    public void testUnableToComplyLine() {
        VectorRegister3 reg = new VectorRegister3();
        reg.set_0(0, 0);
        reg.set_1(0, 0);
        reg.set_2(-5, -10);

        double distance = Lines.minimalDistanceV2toLineContainingV0V1_Destructive(reg);
        assertEquals(-1, distance);
    }
}
