package io.jeffrey.vector.benchmark;

import io.jeffrey.vector.VectorRegister3;

public class Bench {

    private static int N = 25 * 1000 * 1000;

    private static class ImmutableVector2D {
        public final double x;
        public final double y;

        public ImmutableVector2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

    }

    private static ImmutableVector2D add(ImmutableVector2D a, ImmutableVector2D b) {
        return new ImmutableVector2D(a.x + b.x, a.y + b.y);
    }

    public static double cleanVersion() {
        double d = 0.0;
        for (int k = 0; k < N; k++) {
            ImmutableVector2D A = new ImmutableVector2D(k / 4.0, k / 2.0);
            ImmutableVector2D B = new ImmutableVector2D(k / 3.0, k / 5.0);
            d += add(A, B).x;
        }
        return d;
    }

    private static double registerVersion() {
        VectorRegister3 reg = new VectorRegister3();
        double d = 0.0;
        for (int k = 0; k < N; k++) {
            reg.set_0(k / 4.0, k / 3.0);
            reg.set_1(k / 3.0, k / 5.0);
            reg.add_1_to_0();
            d += reg.x_0;
        }
        return d;
    }

    private static double baseLine() {
        double temp = 0;
        double d = 0.0;
        for (int k = 0; k < N; k++) {
            temp = k / 4.0;
            temp += k / 3.0;
            d += temp;
        }
        return d;
    }

    private static double measureBaseline() {
        int delta = 0;
        for (int k = 0; k < 25; k++) {
            long start = System.currentTimeMillis();
            baseLine();
            delta += System.currentTimeMillis() - start;
        }
        return delta / 25.0;
    }

    private static double measureClean() {
        int delta = 0;
        for (int k = 0; k < 25; k++) {
            long start = System.currentTimeMillis();
            cleanVersion();
            delta += System.currentTimeMillis() - start;
        }
        return delta / 25.0;
    }

    private static double measureRegister() {
        int delta = 0;
        for (int k = 0; k < 25; k++) {
            long start = System.currentTimeMillis();
            registerVersion();
            delta += System.currentTimeMillis() - start;
        }
        return delta / 25.0;
    }

    public static void main(String[] args) {
        System.out.println("Vector Register Benchmark");
        System.out.println("-------------------------");
        for (int k = 0; k < 10; k++) {
            baseLine();
            cleanVersion();
            registerVersion();
        }

        double msBase = measureBaseline();
        double msClean = measureClean();
        double msRegister = measureRegister();
        System.out.println("base:" + msBase);
        System.out.println("clean:" + msClean);
        System.out.println("register:" + msRegister);
    }
}
