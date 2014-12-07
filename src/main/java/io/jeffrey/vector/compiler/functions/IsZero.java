package io.jeffrey.vector.compiler.functions;

import java.io.PrintStream;
import java.util.HashSet;

import io.jeffrey.vector.compiler.VectorSourcePrintStream;

public class IsZero extends VectorSourcePrintStream {
    public IsZero(PrintStream out, int N, HashSet<String> definedFunctions) {
        super(out, N, definedFunctions);
    }

    @Override
    protected void writeSource() {
        // TODO: make suck less
        for (int k = 0; k < N; k++) {
            if (start("is_", s(k), "_zero")) {
                println();
                tab();
                println("/** is the " + k + "-vector the origin */");
                println("public boolean is_", s(k), "_zero() {");
                tab();
                println("double d = 0.0;");
                println("d += ", atX(k), " * ", atX(k), ";");
                println("d += ", atY(k), " * ", atY(k), ";");
                println("if (Math.abs(d) < ZERO_LIMIT)");
                tab();
                println("return true;");
                untab();
                println("return false;");
                untab();
                println("}");
                untab();
            }
        }
    }

    @Override
    protected void writeTest() {
        for (int k = 0; k < N; k++) {
            if (startTest("is_zero_" + k)) {
                createNewVector("x", N);
                println("x.set_", s(k), "(3,5);");
                println("assertEquals(3, x.x_", s(k), ");");
                println("assertEquals(5, x.y_", s(k), ");");
                println("Assert.assertFalse(x.is_", s(k), "_zero());");

                println("x.set_", s(k), "(0,5);");
                println("assertEquals(0, x.x_", s(k), ");");
                println("assertEquals(5, x.y_", s(k), ");");
                println("Assert.assertFalse(x.is_", s(k), "_zero());");

                println("x.set_", s(k), "(3,0);");
                println("assertEquals(3, x.x_", s(k), ");");
                println("assertEquals(0, x.y_", s(k), ");");
                println("Assert.assertFalse(x.is_", s(k), "_zero());");

                println("x.set_", s(k), "(0,0);");
                println("assertEquals(0, x.x_", s(k), ");");
                println("assertEquals(0, x.y_", s(k), ");");
                println("Assert.assertTrue(x.is_", s(k), "_zero());");
                endTest();
            }
        }
    }
}
