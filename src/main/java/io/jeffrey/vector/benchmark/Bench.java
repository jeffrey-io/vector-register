package io.jeffrey.vector.benchmark;

public class Bench {

    public static class ImmutableVector2D {
        public final double x;
        public final double y;

        public ImmutableVector2D(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Vector Register Benchmark");
    }
}
