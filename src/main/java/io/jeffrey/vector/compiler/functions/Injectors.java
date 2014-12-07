package io.jeffrey.vector.compiler.functions;

import java.io.PrintStream;
import java.util.HashSet;

import io.jeffrey.vector.compiler.VectorSourcePrintStream;

public class Injectors extends VectorSourcePrintStream {
    public Injectors(PrintStream out, int N, HashSet<String> definedFunctions) {
        super(out, N, definedFunctions);
    }

    @Override
    protected void writeSource() {
        for (int k = 0; k < N; k++) {
            if (start("inject", s(k))) {
                println();
                tab();
                println("/** inject the given input starting at the given offset into the " + k + "-vector */");
                println("public void inject_", s(k), "(final double[] input, final int offset) {");
                tab();
                println(atX(k), " = input[offset + 0];");
                println(atY(k), " = input[offset + 1];");
                untab();
                println("}");
                untab();
            }
        }
    }

    @Override
    protected void writeTest() {
        for (int k = 0; k < N; k++) {
            if (startTest("inject_" + k)) {
                createNewVector("x", N);
                println("double[] data = new double[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};");
                println("x.inject_", s(k), "(data, 0);");
                println("assertEquals(0, x.x_", s(k), ");");
                println("assertEquals(1, x.y_", s(k), ");");
                println("x.inject_", s(k), "(data, 6);");
                println("assertEquals(6, x.x_", s(k), ");");
                println("assertEquals(7, x.y_", s(k), ");");
                println("x.inject_", s(k), "(data, 8);");
                println("assertEquals(8, x.x_", s(k), ");");
                println("assertEquals(9, x.y_", s(k), ");");
                endTest();
            }
        }
    }
}
